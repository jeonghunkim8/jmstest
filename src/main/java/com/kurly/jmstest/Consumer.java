package com.kurly.jmstest;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(destination = "sample.queue")
    public void receiveQueue(KurlyMessage message) {
        System.out.println(message.getId() + ", "+ message.getName());
    }

}