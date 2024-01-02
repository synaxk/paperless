# Fetching latest version of Java
FROM amazoncorretto:17-alpine-jdk as build

# Set the working directory to /app
WORKDIR /app

# Install Maven (if not already installed)
RUN apk --no-cache add maven

# Copy the application source code into the container
COPY .. /app


# Build the application
RUN mvn package -DskipTests


# OpenJDK 17 Image based on Debian
FROM openjdk:17-bullseye

# Update the package list and install tesseract-ocr
RUN apt-get update && \
    apt-get install -y tesseract-ocr && \
    rm -rf /var/lib/apt/lists/*

# Download the English language package for Tesseract
RUN mkdir -p /usr/share/tesseract-ocr/4.00/tessdata
ADD https://github.com/tesseract-ocr/tessdata_best/raw/main/eng.traineddata /usr/share/tesseract-ocr/4.00/tessdata/

# Verify Tesseract installation
RUN tesseract --version && \
    tesseract --list-langs

COPY --from=build /app/target/tesseract-0.0.1-SNAPSHOT.jar ocr.java

ENTRYPOINT ["java","-jar","ocr.java"]