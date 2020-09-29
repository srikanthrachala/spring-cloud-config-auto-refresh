package com.springcoding.springboot.config.listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.bus.event.RefreshRemoteApplicationEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class ConfigurationEventListener {
    private static final Log logger = LogFactory.getLog(ConfigurationEventListener.class);

    @Autowired
    private ObjectMapper objectMapper;

    @Value("${spring.cloud.bus.id}")
    private String serviceId;

    @EventListener
    public void logRefreshRemoteApplicationEvent(RefreshRemoteApplicationEvent event) throws JsonProcessingException {
        logger.info("\nServiceId: " + serviceId +
                "\nRefreshRemoteApplicationEvent Details: " + objectMapper.writeValueAsString(event));
    }

}
