package com.nasa.mock.nasadashboards.service;

import com.nasa.mock.nasadashboards.client.MeteorStatisticsClient;
import com.nasa.mock.nasadashboards.models.AverageInMeters;
import com.nasa.mock.nasadashboards.models.MeteorStatisticsResponse;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MeteorStatisticsService implements MeteorStatistics {

  @Autowired
  @Qualifier("open-feign")
  MeteorStatisticsClient meteorStatisticsClient;

  @Override
  public AverageInMeters getDiameter(LocalDate localDate) {
    AverageInMeters averageInMeters = new AverageInMeters();

    MeteorStatisticsResponse meteorStatisticsByDate = meteorStatisticsClient.getMeteorStatisticsByDate();

    List<Double> average = meteorStatisticsByDate.getNearEarthObjects().getSelectedDay().stream()
        .map(obj -> (obj.getEstimatedDiameter().getEstimatedDiameter().getEstimatedDiameterMin() +
            obj.getEstimatedDiameter().getEstimatedDiameter().getEstimatedDiameterMin()) / 2)
        .collect(Collectors.toList());

    averageInMeters.setAverageInMeters(average);

    return averageInMeters;
  }
}
