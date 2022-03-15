package com.nasa.mock.nasadashboards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableFeignClients
public class NasaDashboardsApplication {

  @Bean
  public WebClient.Builder getWebClientBuilder() {
    return WebClient.builder();
  }

  public static void main(String[] args) {
    SpringApplication.run(NasaDashboardsApplication.class, args);
  }
}
