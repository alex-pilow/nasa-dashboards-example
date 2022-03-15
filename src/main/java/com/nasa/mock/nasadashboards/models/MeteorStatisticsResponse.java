package com.nasa.mock.nasadashboards.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MeteorStatisticsResponse {

  @JsonProperty("near_earth_objects")
  private NearEarthObjects nearEarthObjects;
}
