package org.paperless.tesseract.services;

import org.paperless.tesseract.config.RabbitMQConfig;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

public interface OcrService {
    @RabbitListener(queues = RabbitMQConfig.OCR_QUEUE_NAME)
    void processMessage(String message, String storagePath) throws  JsonProcessingException;
}

