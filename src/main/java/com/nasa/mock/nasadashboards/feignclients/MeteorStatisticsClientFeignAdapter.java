package com.nasa.mock.nasadashboards.feignclients;

import com.nasa.mock.nasadashboards.client.MeteorStatisticsClient;
import com.nasa.mock.nasadashboards.models.MeteorStatisticsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("open-feign")
public class MeteorStatisticsClientFeignAdapter implements MeteorStatisticsClient {

  @Autowired
  MeteorStatisticsClientFeign meteorStatisticsClient;

  @Override
  public MeteorStatisticsResponse getMeteorStatisticsByDate() {
    return meteorStatisticsClient.getMeteors();
  }
}
