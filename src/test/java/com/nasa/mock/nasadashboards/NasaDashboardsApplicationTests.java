package com.nasa.mock.nasadashboards;

import com.nasa.mock.nasadashboards.client.MeteorStatisticsClientImpl;
import com.nasa.mock.nasadashboards.models.MeteorStatisticsResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NasaDashboardsApplicationTests {

  @Autowired
  MeteorStatisticsClientImpl meteorStatisticsClient;

  @Test
  void tryToGetSomeInformation() {
    MeteorStatisticsResponse meteorStatisticsByDate = meteorStatisticsClient.getMeteorStatisticsByDate();

    System.out.println(meteorStatisticsByDate);

    Assertions.assertTrue(meteorStatisticsByDate != null);
  }
}
