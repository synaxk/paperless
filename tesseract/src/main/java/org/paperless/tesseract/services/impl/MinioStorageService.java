package org.paperless.tesseract.services.impl;


import io.minio.GetObjectArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import org.paperless.tesseract.services.StorageException;
import org.paperless.tesseract.services.StorageFileNotFoundException;
import org.paperless.tesseract.services.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

@Service
@Slf4j
public class MinioStorageService implements StorageService {

    private final String url;
    private final String user;
    private final String password;
    private final String bucket;
    private final Path rootLocation;

    private MinioClient minioClient;

    @Autowired
    public MinioStorageService(@Value("${miniostorage.url}") String url,
                               @Value("${miniostorage.user}") String user,
                               @Value("${miniostorage.password}") String password,
                               @Value("${miniostorage.bucket}") String bucket,
                               @Value("${miniostorage.path}") String path) {
        this.url = url;
        this.user = user;
        this.password = password;
        this.bucket = bucket;
        this.rootLocation = Paths.get(path);
    }

    @Override
    public void init() {
        minioClient =
                MinioClient.builder()
                        .endpoint(url)
                        .credentials(user, password)
                        .build();
        // create the bucket on the minio-storage
        try {
            minioClient.makeBucket(
                    MakeBucketArgs
                            .builder()
                            .bucket(bucket)
                            .build());
        } catch (Exception e) {
            // QUICKFIX, ignored when the BUCKET is already existing.
        }

        try {
            Files.createDirectories(rootLocation);
        }
        catch (IOException e) {
            throw new StorageException("Could create temp directory", e);
        }
    }

    @Override
    public void store(MultipartFile file) {
        try {
            if (file.isEmpty()) {
                throw new StorageException("Failed to store empty file.");
            }
            try (InputStream inputStream = file.getInputStream()) {
                minioClient.putObject(PutObjectArgs
                        .builder()
                        .bucket(bucket)
                        .object(file.getOriginalFilename())
                        .stream(inputStream, file.getSize(), -1 ).build());
            }
        } catch (Exception e) {
            throw new StorageException("Failed to store file.", e);
        }
    }

    @Override
    public Stream<Path> loadAll() {
        return null;
    }

    @Override
    public Path load(String filename) {
        try (InputStream stream =
                     minioClient.getObject(GetObjectArgs
                             .builder()
                             .bucket(bucket)
                             .object(filename)
                             .build())) {
            // Read the stream
            Path outputPath = Path.of(rootLocation.toString(), filename);
            Files.copy(
                    stream,
                    outputPath,
                    StandardCopyOption.REPLACE_EXISTING);
            return outputPath;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Resource loadAsResource(String filename) {
        try {
            Path file = load(filename);
            Resource resource = new UrlResource(file.toUri());
            if (resource.exists() || resource.isReadable()) {
                return resource;
            }
            else {
                throw new StorageFileNotFoundException(
                        "Could not read file: " + filename);

            }
        }
        catch (MalformedURLException e) {
            throw new StorageFileNotFoundException("Could not read file: " + filename, e);
        }
    }

    @Override
    public void deleteAll() {
        // TODO: Delete in MinIO

        // Delete tmp directory
        FileSystemUtils.deleteRecursively(rootLocation.toFile());
    }
}
