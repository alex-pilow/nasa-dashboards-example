package com.nasa.mock.nasadashboards.client;

import com.nasa.mock.nasadashboards.models.MeteorStatisticsResponse;
import com.nasa.mock.nasadashboards.util.Endpoints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component("web-client")
public class MeteorStatisticsClientImpl implements MeteorStatisticsClient {

  @Autowired
  private WebClient.Builder webClient;

  @Autowired
  Endpoints endpoints;

  @Override
  public MeteorStatisticsResponse getMeteorStatisticsByDate() {
    return webClient
        .build()
        .get()
        .uri(endpoints.getNasaEndpoint())
        .retrieve()
        .bodyToMono(MeteorStatisticsResponse.class)
        .block();
  }
}
