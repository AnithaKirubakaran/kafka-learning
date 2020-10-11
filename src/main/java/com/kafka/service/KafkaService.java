package com.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	String kafkaTopic = "HelloWorld";

	public void send(String message) {
		// TODO Auto-generated method stub
		kafkaTemplate.send(kafkaTopic, message);
	}

}
