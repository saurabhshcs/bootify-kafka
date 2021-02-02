package com.techsharezone.bootify.kafka.controller;

/*
 * @created 02/02/2021 -23:01
 * @project bootify-kafka
 * @author  saurabhshcs
 */

import com.techsharezone.bootify.kafka.service.KafKaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/kafka")
public class KafkaProducerController {

    @Autowired
    private final KafKaProducerService service;

    @Autowired
    public KafkaProducerController(final KafKaProducerService service) {
        this.service = service;
    }

    @PostMapping(value = "publish")
    public void sendMessage(@RequestParam("message") String message) {

        this.service.sendMessage(message);
    }
}
