package com.example.myapp.service;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.example.myapp.property.convert.Convert;
import com.example.myapp.property.convert.ConverterItem;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class ConvertService {
  private final Convert convert;

  public ConvertService() throws IOException {
    String jsonPath = "pokedex/convert/local_global_id_converter.json";
    File convertJson = new ClassPathResource(jsonPath)
    .getFile();
    ObjectMapper mapper = new ObjectMapper();
    this.convert = mapper.readValue(convertJson, Convert.class);
  }

  public String getTable(int globalNo) {
    String table = "";

    HashMap<Integer, ConverterItem> itemList = this
    .convert.getLocalGlobalIdConverter();
    for(ConverterItem items : itemList.values()) {
      if(items.getBorder() <= globalNo && items.getTop() >= globalNo) {
        table = items.getTable();
      }
    }
    return table;
  }
}
