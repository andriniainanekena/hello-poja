package com.hello.poja.service.arith;

import com.hello.poja.PojaGenerated;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@PojaGenerated
@Service
@AllArgsConstructor
public class AddService {

  public double add(@NonNull double a, @NonNull double b) {
    return a + b;
  }
}
