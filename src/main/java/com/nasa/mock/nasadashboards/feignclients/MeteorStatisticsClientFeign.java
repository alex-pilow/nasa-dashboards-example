package com.nasa.mock.nasadashboards.feignclients;

import com.nasa.mock.nasadashboards.models.MeteorStatisticsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
    value = "meteor-statistics",
    url = "${NASA_ENDPOINT}"
)
public interface MeteorStatisticsClientFeign {

  @GetMapping
  MeteorStatisticsResponse getMeteors();
}
