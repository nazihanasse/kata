package com.sg.kata.configurations;

import com.sg.kata.core.HistoryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HistoryServiceConfiguration {

    @Bean
    HistoryService historyService() {
        return new HistoryService();
    }
}
