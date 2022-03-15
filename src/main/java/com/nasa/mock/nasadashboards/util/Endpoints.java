package com.nasa.mock.nasadashboards.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Endpoints {
 
  private String nasaEndpoint;
}
