package com.hello.poja.endpoint.rest.controller.arith;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.hello.poja.service.arith.DivService;
import org.junit.jupiter.api.Test;

public class DivControllerTest {

  @Test
  void should_divide_two_numbers() {
    DivService service = new DivService();
    DivController controller = new DivController(service);

    var response = controller.div(10, 2);

    assertEquals(200, response.getStatusCode().value());
  }

  @Test
  void should_return_bad_request_when_dividing_by_zero() {
    DivService service = new DivService();
    DivController controller = new DivController(service);

    var response = controller.div(10, 0);

    assertEquals(400, response.getStatusCode().value());
  }
}
