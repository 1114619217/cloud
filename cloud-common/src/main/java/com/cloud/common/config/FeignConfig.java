package com.cloud.common.config;

import com.cloud.common.interceptor.FeignBasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;

public class FeignConfig {
/*    @Bean
    public Logger.Level Logger() {
        return Logger.Level.FULL;
    }*/

    @Bean
    public FeignBasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new FeignBasicAuthRequestInterceptor();
    }
/*
    @Bean
    public Request.Options options() {
        return new Request.Options();
    }*/
}
