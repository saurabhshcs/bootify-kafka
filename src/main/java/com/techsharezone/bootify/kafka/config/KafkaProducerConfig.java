package com.techsharezone.bootify.kafka.config;

/*
 * @created 27/01/2021 -23:49
 * @project bootify-kafka
 * @author  saurabhshcs
 */

import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaProducerConfig {

//    @Bean
//    public ProducerFactory<String, String> producerFactory(final String bootstrapAddress) {
//
//        Map<String, Object> configsProps = new HashMap<>();
//        configsProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
//        configsProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        configsProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//
//        return new DefaultKafkaProducerFactory<>(configsProps);
//    }
//
//    @Bean
//    public KafkaTemplate<String, String> kafkaTemplate() {
//
//        return new KafkaTemplate<>(producerFactory(""));
//    }
}
