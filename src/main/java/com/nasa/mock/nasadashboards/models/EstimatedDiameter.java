package com.nasa.mock.nasadashboards.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstimatedDiameter {

  @JsonProperty("estimated_diameter_max")
  private double estimatedDiameterMax;
  @JsonProperty("estimated_diameter_min")
  private double estimatedDiameterMin;
}
