package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import
 org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Scheduled(fixedRate = 5000) // Send every 5 seconds
    public void sendMessage() {
        jmsTemplate.convertAndSend("your-queue-name", "Your message here");
    }
}
