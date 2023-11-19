package org.paperless.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Value("${rabbitmq.endpoint}")
    private String endpoint;

    @Value("${rabbitmq.username}")
    private String username;

    @Value("${rabbitmq.password}")
    private String password;

    public static final String EXCHANGE = "";

    public static final String OCR_DOCUMENT_IN_QUEUE_NAME = "ORC_DOCUMENT_IN";
    public static final String OCR_DOCUMENT_OUT_QUEUE_NAME = "ORC_DOCUMENT_OUT";

    @Bean
    public Queue ocrDocumentInQueue() {
        return new Queue(OCR_DOCUMENT_IN_QUEUE_NAME, false);
    }

    @Bean
    public Queue ocrDocumentOutQueue() { return new Queue(OCR_DOCUMENT_OUT_QUEUE_NAME, false); }


    @Bean
    public ConnectionFactory rabbitMQConnectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory(endpoint);
        connectionFactory.setUsername(username);
        connectionFactory.setPassword(password);
        return connectionFactory;
    }

    @Bean
    public RabbitTemplate rabbitTemplate() {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(rabbitMQConnectionFactory());
        rabbitTemplate.setDefaultReceiveQueue(OCR_DOCUMENT_IN_QUEUE_NAME);
        return rabbitTemplate;
    }
}