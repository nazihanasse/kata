package com.sg.kata.configurations;

import com.sg.kata.core.WithdrawalService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WithdrawalServiceConfiguration {

    @Bean
    WithdrawalService withdrawalService() {
        return new WithdrawalService();
    }
}
