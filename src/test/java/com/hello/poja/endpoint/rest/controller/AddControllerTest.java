package com.hello.poja.endpoint.rest.controller.arith;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.hello.poja.service.arith.AddService;
import org.junit.jupiter.api.Test;

public class AddControllerTest {

  @Test
  void should_add_two_numbers() {
    AddService service = new AddService();
    AddController controller = new AddController(service);

    var response = controller.add(2, 3);

    assertEquals(200, response.getStatusCode().value());
  }
}
