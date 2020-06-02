package com.queue.demo.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = "hola")
public class HolaReceiver {

    @RabbitHandler
    public void receive(String in) {
        System.out.println(" [x] Hola Received '" + in + "'");
    }
}
