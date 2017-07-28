package com.zlf.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;
@Component
public class Listener {
	@KafkaListener(group="test-group",topicPartitions={@TopicPartition(topic="test5",partitionOffsets=@PartitionOffset(partition="0",relativeToCurrent="true",initialOffset="0"))})
	public void listen(String record) {
        System.out.println(record);
    }
	
	
	
	
//	public void listen(ConsumerRecord<?, ?> record) {
//        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
//        if (kafkaMessage.isPresent()) {
//            Object message = kafkaMessage.get();
//            System.out.println("listen1 " + message);
//        }
//    }
}
