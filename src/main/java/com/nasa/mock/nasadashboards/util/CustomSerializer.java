package com.nasa.mock.nasadashboards.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

public class CustomSerializer extends JsonSerializer<Object> {

  @Override
  public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider)
      throws IOException, JsonProcessingException {
    jgen.writeStartObject();
    jgen.writeObjectField(value.getClass().getName(), value);
    jgen.writeEndObject();
  }
}