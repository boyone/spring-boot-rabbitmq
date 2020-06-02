package com.queue.demo.receiver;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@RabbitListener(queues = "hello")
public class HelloReceiver {

    @Qualifier("hola")
    @Autowired
    private Queue queue;

    @Autowired
    private RabbitTemplate template;

    @RabbitHandler
    public void receive(String in) {
        System.out.println(" [x] Received '" + in + "'");

        template.convertAndSend(queue.getName(), in + " 01");
    }
}
