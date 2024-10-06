package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${task1.queue}")
    private String task1Queue;

    @Value("${task1.cron}")
    private String task1Cron;

    @Value("${task2.queue}")
    private String task2Queue;

    @Value("${task2.cron}")
    private String task2Cron;

    @Value("${task3.queue}")
    private String task3Queue;

    @Value("${task3.cron}")
    private String task3Cron;

    @Scheduled(cron = "${task1.cron}")
    public void sendTask1Message() {
        System.out.println("Sending message to " + task1Queue + ": Your Task 1 message here");
        jmsTemplate.convertAndSend(task1Queue, "Your Task 1 message here");
    }

    @Scheduled(cron = "${task2.cron}")
    public void sendTask2Message() {
        System.out.println("Sending message to " + task2Queue + ": Your Task 2 message here");
        jmsTemplate.convertAndSend(task2Queue, "Your Task 2 message here");
    }

    @Scheduled(cron = "${task3.cron}")
    public void sendTask3Message() {
        System.out.println("Sending message to " + task3Queue + ": Your Task 3 message here");
        jmsTemplate.convertAndSend(task3Queue, "Your Task 3 message here");
    }
}
