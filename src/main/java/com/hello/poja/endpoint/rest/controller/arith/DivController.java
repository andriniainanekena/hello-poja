package com.hello.poja.endpoint.rest.controller.arith;

import com.hello.poja.PojaGenerated;
import com.hello.poja.service.arith.DivService;
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
public class DivController {
  private final DivService divService;

  @GetMapping("/div")
  public ResponseEntity<?> div(@RequestParam double a, @RequestParam double b) {
    try {
      double value = divService.div(a, b);

      Map<String, String> map = new HashMap<>();
      map.put("result", "Division of " + a + " by " + b + " is " + value);

      return ResponseEntity.status(HttpStatus.OK).body(map);
    } catch (IllegalArgumentException e) {
      Map<String, String> map = new HashMap<>();
      map.put("error", e.getMessage());
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(map);
    }
  }
}
