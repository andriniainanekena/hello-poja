package com.hello.poja.service.arith;

import com.hello.poja.PojaGenerated;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@PojaGenerated
@Service
@AllArgsConstructor
public class DivService {

  public double div(@NonNull double a, @NonNull double b) {
    if (b == 0.0d) {
      throw new IllegalArgumentException("Division by zero");
    }
    return a / b;
  }
}
