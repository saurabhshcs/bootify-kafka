package com.techsharezone.bootify.kafka.service;

/*
 * @created 02/02/2021 -22:41
 * @project bootify-kafka
 * @author  saurabhshcs
 */

import com.techsharezone.bootify.kafka.common.AppConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafKaProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(final String message) {
        log.info("Sending message: {} to kafka_topic: {}", message, AppConstants.TOPIC_NAME);
        this.kafkaTemplate.send(AppConstants.TOPIC_NAME, message);
    }

}
