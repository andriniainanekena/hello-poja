package com.hello.poja.service;

import com.hello.poja.PojaGenerated;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@PojaGenerated
@Service
@AllArgsConstructor
public class HelloWorldService {

  public String uploadHelloWorldMessage(String name) {
    return "Hello " + name;
  }
}
