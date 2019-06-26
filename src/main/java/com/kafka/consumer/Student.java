package com.kafka.consumer;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Student {
    int id ;
    String name ;
    String dep;
}
