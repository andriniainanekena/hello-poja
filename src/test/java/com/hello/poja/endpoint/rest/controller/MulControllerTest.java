package com.hello.poja.endpoint.rest.controller.arith;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.hello.poja.service.arith.MulService;
import org.junit.jupiter.api.Test;

public class MulControllerTest {

  @Test
  void should_multiply_two_numbers() {
    MulService service = new MulService();
    MulController controller = new MulController(service);

    var response = controller.mul(2, 5);

    assertEquals(200, response.getStatusCode().value());
  }
}
