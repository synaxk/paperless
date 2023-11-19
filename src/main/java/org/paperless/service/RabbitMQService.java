package org.paperless.service;


import org.paperless.configuration.RabbitMQConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService {

    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public RabbitMQService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendToOcrDocumentInQueue(String message) {
        rabbitTemplate.convertAndSend(RabbitMQConfig.OCR_DOCUMENT_IN_QUEUE_NAME, message);
    }
}