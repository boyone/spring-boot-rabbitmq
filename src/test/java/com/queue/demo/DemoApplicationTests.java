package com.queue.demo;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void send() {
		ConnectionFactory factory = new CachingConnectionFactory("localhost");
		RabbitTemplate rabbitTemplate = new RabbitTemplate(factory);
		rabbitTemplate.convertAndSend("hello", "Hello");
	}

}
