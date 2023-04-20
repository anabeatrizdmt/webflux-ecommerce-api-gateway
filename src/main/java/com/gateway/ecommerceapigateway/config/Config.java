package com.gateway.ecommerceapigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public RouteLocator route(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("orders-api", predicateSpec ->
                        predicateSpec.path("/orders/**")
                .uri("http://localhost:8082"))
                .route("catalog-api", predicates ->
                        predicates.path("/catalog/**")
                .uri("http://localhost:8081"))
                .build();
    }
}
