package com.techsharezone.bootify.kafka.config;

/*
 * @created 27/01/2021 -23:43
 * @project bootify-kafka
 * @author  saurabhshcs
 */

import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {

    @Value(value = "{$kafka.bootsrapAddress}")
    private String bootStrapAddress;

    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootStrapAddress);
        return new KafkaAdmin(configs);
    }

    @Bean
    public NewTopic topic1() {
        return new NewTopic("techsharezone", 1, (short) 1);
    }
}
