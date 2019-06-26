package com.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "string_msg", groupId = "testGroup", containerFactory = "kafkaListenerContainerFactory")
    public void listenString(String message) {
        log.info("Received Messasge in group testGroup: " + message);
    }

    @KafkaListener(topics = "jsonTopic" , containerFactory = "jsonConcurrentKafkaListenerContainer")
    public void listenJson(Student message) {
        log.info("Received Messasge in group user_json : " + message);
    }

    @KafkaListener(topics = "jsonTopic" , containerFactory = "jsonConcurrentKafkaListenerContainer")
    public void listenJson1(Student message) {
        log.info("Received Messasge in group user_json1 : " + message);
    }

    @KafkaListener(topics = "jsonTopic" , containerFactory = "jsonConcurrentKafkaListenerContainer")
    public void listenJson2(Student message) {
        log.info("Received Messasge in group user_json2 : " + message);
    }



}
