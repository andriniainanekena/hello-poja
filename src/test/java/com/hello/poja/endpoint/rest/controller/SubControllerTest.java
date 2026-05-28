package com.hello.poja.endpoint.rest.controller.arith;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.hello.poja.service.arith.SubService;
import org.junit.jupiter.api.Test;

public class SubControllerTest {

  @Test
  void should_subtract_two_numbers() {
    SubService service = new SubService();
    SubController controller = new SubController(service);

    var response = controller.sub(10, 4);

    assertEquals(200, response.getStatusCode().value());
  }
}
