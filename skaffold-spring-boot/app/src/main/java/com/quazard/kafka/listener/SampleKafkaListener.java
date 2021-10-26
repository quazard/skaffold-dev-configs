package com.quazard.kafka.listener;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.function.Function;

@Component
public class SampleKafkaListener {

    @Bean
    public Function<Flux<String>, Flux<String>> sampleConsume() {
        return data -> data.doOnNext(System.err::println);
    }

}
