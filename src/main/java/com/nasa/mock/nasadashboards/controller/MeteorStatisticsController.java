package com.nasa.mock.nasadashboards.controller;

import com.nasa.mock.nasadashboards.models.AverageInMeters;
import com.nasa.mock.nasadashboards.service.MeteorStatisticsService;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeteorStatisticsController {

  @Autowired
  MeteorStatisticsService meteorStatisticsService;

  @GetMapping("/meteors/{date}")
  public ResponseEntity<AverageInMeters> getProms(@PathVariable("date") String date) {
    return new ResponseEntity<>(
        meteorStatisticsService.getDiameter(LocalDate.parse(date)), HttpStatus.OK);
  }
}
