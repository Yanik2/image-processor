package com.imageanalysis.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class ImageProcessorConfiguration {

    @Bean
    public RestClient restClient(@Value("${persistent.service.address}") String persistentUrl) {
        return RestClient.builder().baseUrl(persistentUrl).build();
    }
}
