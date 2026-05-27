package com.hello.poja.endpoint.rest.controller.arith;

import com.hello.poja.PojaGenerated;
import com.hello.poja.service.arith.SubService;
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
public class SubController {
  private final SubService subService;

  @GetMapping("/sub")
  public ResponseEntity<?> sub(@RequestParam double a, @RequestParam double b) {
    double value = subService.sub(a, b);

    Map<String, String> map = new HashMap<>();
    map.put("result", "Subtraction of " + b + " from " + a + " is " + value);

    return ResponseEntity.status(HttpStatus.OK).body(map);
  }
}
