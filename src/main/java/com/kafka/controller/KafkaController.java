package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.service.KafkaService;

@RestController
public class KafkaController {

	@Autowired
	KafkaService kafkaService;
	
	@RequestMapping(value = "/producer/{message}", method = RequestMethod.GET)
	public String producer(@PathVariable("message") String message) {
		kafkaService.send(message);

		return "Message sent to the Kafka Topic HelloWorld Successfully";
	}
	
	@GetMapping("/webs")
    public String welcome() {
        return "hi";
    }
	
}
