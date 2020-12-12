package com.cloud.order.config;

import com.cloud.order.interceptor.FeignBasicAuthRequestInterceptor;
import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;

public class FeignConfig {
    @Bean
    public Logger.Level Logger() {
        return Logger.Level.FULL;
    }

    @Bean
    public FeignBasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new FeignBasicAuthRequestInterceptor();
    }

    @Bean
    public Request.Options options() {
        return new Request.Options(5000, 10000);
    }
}
