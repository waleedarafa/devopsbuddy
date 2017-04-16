package com.deveopsbuddy.config;

import com.deveopsbuddy.backend.service.EmailService;
import com.deveopsbuddy.backend.service.SmtpEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Administrator on 4/16/2017.
 */
@Configuration
@Profile("prod")
@PropertySource("file:///${user.home}/devopsbuddy/application-prod.properties")
public class ProductionConfig {

    @Bean
    public EmailService emailService() {
        return new SmtpEmailService();
    }
}
