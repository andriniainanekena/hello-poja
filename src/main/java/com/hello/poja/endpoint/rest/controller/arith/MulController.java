package com.hello.poja.endpoint.rest.controller.arith;

import com.hello.poja.PojaGenerated;
import com.hello.poja.service.arith.MulService;
import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@PojaGenerated
@RestController
@AllArgsConstructor
public class MulController {
  private final MulService mulService;

  @GetMapping("/mul")
  public ResponseEntity<?> mul(@RequestParam double a, @RequestParam double b) {
    double value = mulService.mul(a, b);

    Map<String, String> map = new HashMap<>();
    map.put("result", "Multiplication of " + a + " and " + b + " is " + value);

    return ResponseEntity.status(HttpStatus.OK).body(map);
  }
}
