package com.example.myapp.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.example.myapp.property.translate.TransLateBase;
import com.example.myapp.property.translate.Translate;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class TranslateService {
  private TransLateBase transLateBase;
  public TranslateService() throws IOException {
    InputStream translateJson = new ClassPathResource("pokedex/translate/translate.json")
    .getInputStream();
    ObjectMapper mapper = new ObjectMapper();
    this.transLateBase = mapper.readValue(translateJson, TransLateBase.class);
  }

  public LinkedHashMap<String, String> getInfo() {
    LinkedHashMap<String, String> result;
    result = new LinkedHashMap<>();
    result.put("version", this.transLateBase.getVersion());
    result.put("update", String.valueOf(this.transLateBase.getUpdate()));
    return result;
  }

  public List<Translate> getTranslate() {
    return this.transLateBase.getTranslate();
  }
}
