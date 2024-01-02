package org.paperless.tesseract.services.impl;

import org.paperless.tesseract.config.RabbitMQConfig;
import org.paperless.tesseract.services.OcrService;
import org.paperless.tesseract.services.SearchIndexService;
import org.paperless.tesseract.services.dto.DocumentDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.OffsetDateTime;

@Component
@Slf4j
public class TesseractOcrService implements OcrService {
    //private final StorageService storageService;
  //  private final SearchIndexService searchIndexService;

 //   private final String tesseractData;

/*  @Autowired
    public TesseractOcrService(StorageService storageService, SearchIndexService searchIndexService, @Value("${tesseract.data}") String tessData) {
        this.storageService = storageService;
        this.searchIndexService = searchIndexService;
        this.tesseractData = tessData;
    }*/

    @Override
    @RabbitListener(queues = RabbitMQConfig.OCR_QUEUE_NAME)
    public void processMessage(String message,  @Header(RabbitMQConfig.DOCUMENT_STORAGE_PATH_PROPERTY_NAME) String storagePath) throws JsonProcessingException {
        log.info("Received Message: " + message);

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.registerModule(new JsonNullableModule());

        // fetch document data
        DocumentDTO document = mapper.readValue( message, DocumentDTO.class);
        log.debug("Received Document: " + document);
        log.debug("Received Document storage path: " + storagePath);

        // fetch document file
  /*      var doc = storageService.loadAsResource(storagePath);   // TODO: use StorageService via HTTP REST-Call
        if ( doc==null || !doc.exists() )
            throw new StorageFileNotFoundException(storagePath);

        // do OCR recognition
        try (var is = doc.getInputStream()) {
            File tempFile = createTempFile(storagePath, is);
            String result = doOCR(tempFile);
            log.info(result);

            document.setContent( JsonNullable.of(result));
            document.setModified(OffsetDateTime.now());

        } catch (TesseractException | IOException e) {
            log.error(e.getMessage());
        }

        // do ElasticSearch indexing
        try {
            searchIndexService.indexDocument(document);
        } catch (IOException e) {
            log.error(e.getMessage());
        }*/
    }

  /*  public String doOCR(File tempFile) throws TesseractException {
        var tesseract = new Tesseract();
        tesseract.setDatapath(tesseractData);
        return tesseract.doOCR(tempFile);
    }*/

    public static File createTempFile(String storagePath, InputStream is) throws IOException {
        File tempFile = File.createTempFile(StringUtils.getFilename(storagePath), "." + StringUtils.getFilenameExtension(storagePath));
        tempFile.deleteOnExit();
        try (FileOutputStream out = new FileOutputStream(tempFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = is.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);  //copy it to file system
            }
        }
        return tempFile;
    }


}

