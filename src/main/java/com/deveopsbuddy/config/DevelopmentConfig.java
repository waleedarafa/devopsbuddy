package com.deveopsbuddy.config;

import com.deveopsbuddy.backend.service.EmailService;
import com.deveopsbuddy.backend.service.MockEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Administrator on 4/16/2017.
 */
@Configuration
@Profile("dev")
@PropertySource("file:///${user.home}/devopsbuddy/application-dev.properties")
public class DevelopmentConfig {

    @Bean
    public EmailService emailService() {
        return new MockEmailService();
    }
}
