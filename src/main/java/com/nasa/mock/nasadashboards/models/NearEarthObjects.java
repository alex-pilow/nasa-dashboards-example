package com.nasa.mock.nasadashboards.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NearEarthObjects {

  @JsonProperty("2015-09-08")
  private List<NearEarthObject> selectedDay;
}

