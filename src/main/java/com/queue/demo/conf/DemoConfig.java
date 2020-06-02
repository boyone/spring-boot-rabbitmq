package com.queue.demo.conf;

import com.queue.demo.receiver.HolaReceiver;
import com.queue.demo.sender.HelloSender;
import com.queue.demo.receiver.HelloReceiver;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile({"tut1", "hello-world"})
@Configuration
public class DemoConfig {

    @Bean(name = "hello")
    public Queue hello() {
        return new Queue("hello");
    }

    @Bean(name = "hola")
    public Queue hola() {
        return new Queue("hola");
    }

    @Profile("receiver")
    @Bean
    public HelloReceiver receiver() {
        return new HelloReceiver();
    }

    @Profile("receiver2")
    @Bean
    public HolaReceiver holaReceiver() {
        return new HolaReceiver();
    }

    @Profile("sender")
    @Bean
    public HelloSender sender() {
        return new HelloSender();
    }
}
