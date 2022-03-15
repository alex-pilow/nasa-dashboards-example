package com.nasa.mock.nasadashboards.service;

import com.nasa.mock.nasadashboards.models.AverageInMeters;
import java.time.LocalDate;

public interface MeteorStatistics {

  AverageInMeters getDiameter(LocalDate localDate);
}
