package com.springcoding.springboot.user.scheduler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableScheduling
public class ConfigRefreshScheduler {

    @Value("$server.port")
    private String serviceId;

    @Scheduled(cron = "0 0/15 * * * *")
    public void refreshConfig(){

        //TODO - Call localhost /actuator/refresh end point
    }

}
