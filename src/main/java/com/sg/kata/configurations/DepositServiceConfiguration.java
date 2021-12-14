package com.sg.kata.configurations;

import com.sg.kata.core.DepositService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DepositServiceConfiguration {

    @Bean
    DepositService depositService() {
        return new DepositService();
    }
}
