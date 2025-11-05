package org.example.banqueservice;

import org.example.banqueservice.configuration.RsaKeys;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeys.class)
public class BanqueServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BanqueServiceApplication.class, args);
    }

}
