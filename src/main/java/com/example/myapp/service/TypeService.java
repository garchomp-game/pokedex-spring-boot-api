package com.example.myapp.service;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.example.myapp.property.type.ListBase;
import com.example.myapp.property.type.TypeBase;
import com.example.myapp.property.type.TypeList;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class TypeService {
  private TypeBase typeBase;
  private ListBase listBase;

  public TypeService() throws IOException {
    File typeJson = new ClassPathResource("pokedex/type/type.json")
    .getFile();
    File listJson = new ClassPathResource("pokedex/type/list.json")
    .getFile();
    ObjectMapper mapper = new ObjectMapper();
    this.typeBase = mapper.readValue(typeJson, TypeBase.class);
    this.listBase = mapper.readValue(listJson, ListBase.class);
  }

  public LinkedHashMap<String, String> getInfo() {
    LinkedHashMap<String, String> result;
    result = new LinkedHashMap<>();
    result.put("version", this.typeBase.getVersion());
    result.put("update", this.typeBase.getUpdate());
    return result;
  }

  public LinkedHashMap<String, TypeList> getTypeList() {
    return this.typeBase.getType();
  }

  public LinkedHashMap<String, String> getListInfo() {
    LinkedHashMap<String, String> result;
    result = new LinkedHashMap<>();
    result.put("version", this.listBase.getVersion());
    result.put("update", this.listBase.getUpdate());
    return result;
  }

  public List<String> getType() {
    return this.listBase.getType();
  }
}
