package com.example.myapp.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.example.myapp.property.type.ListBase;
import com.example.myapp.property.type.TypeBase;
import com.example.myapp.property.type.TypeList;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;

@Component
@Getter
public class TypeService {
  private TypeBase typeBase;
  private ListBase listBase;

  public TypeService() throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    String typePath = "static/pokedex/type/type.json";
    String listPath = "static/pokedex/type/list.json";
    InputStream typeJson = new ClassPathResource(typePath)
    .getInputStream();
    InputStream listJson = new ClassPathResource(listPath)
    .getInputStream();
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
