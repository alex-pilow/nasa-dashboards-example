package com.nasa.mock.nasadashboards.models;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AverageInMeters {

  private List<Double> averageInMeters;
}
