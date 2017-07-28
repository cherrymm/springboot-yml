package com.zlf.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/kafka")
public class KafkaController {
	@Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

	@RequestMapping("/send")
    public void test() {
    	 kafkaTemplate.send("test5","kafkakafka£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡£¡");
    }
}
