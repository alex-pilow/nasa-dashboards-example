package com.nasa.mock.nasadashboards.client;

import com.nasa.mock.nasadashboards.models.MeteorStatisticsResponse;

public interface MeteorStatisticsClient {

  MeteorStatisticsResponse getMeteorStatisticsByDate();
}
