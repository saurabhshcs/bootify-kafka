package com.techsharezone.bootify.kafka.controller;

/*
 * @created 02/02/2021 -23:01
 * @project bootify-kafka
 * @author  saurabhshcs
 */

import com.techsharezone.bootify.kafka.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/kafka")
public class KafkaProducerController {

    @Autowired
    private KafkaTemplate<String, User>  kafkaTemplate;

    private static final String TOPIC = "Kafka_Example";

    @GetMapping("/publish/{name}")
    public String post(@PathVariable("name") final String name) {

        kafkaTemplate.send(TOPIC, User.builder().name("sam").build());
        return "Published successfully";
    }
}
