package com.zlf.kafka;

import java.util.Optional;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

public class Receiver {
	
    @KafkaListener(topics = {"test7"})
    public void listen(ConsumerRecord<?, ?> record) {
    	Optional<?> kafkaMessage = Optional.ofNullable(record.value());
    	if (kafkaMessage.isPresent()) {
    		Object message = kafkaMessage.get();
    		System.out.println("listen1 " + message);
    	}
    }
}
