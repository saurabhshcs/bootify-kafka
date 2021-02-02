package com.techsharezone.bootify.kafka.service;

/*
 * @created 02/02/2021 -22:56
 * @project bootify-kafka
 * @author  saurabhshcs
 */

import com.techsharezone.bootify.kafka.common.AppConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafKaConsumerService {

    @KafkaListener(topics = AppConstants.TOPIC_NAME, groupId = AppConstants.GROUP_ID)
    public void consume(final String message) {
        log.info("Message received: {}", message);
    }

}
