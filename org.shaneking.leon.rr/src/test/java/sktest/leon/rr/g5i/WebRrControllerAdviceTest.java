package sktest.leon.rr.g5i;

import org.junit.jupiter.api.Test;
import org.shaneking.leon.test.SKSpringMvcUnit;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class WebRrControllerAdviceTest extends SKSpringMvcUnit {

  @Test
  void zero() throws Exception {
    assertNotNull(performJJ("/exception/zero"));
  }

  @Test
  void resp() throws Exception {
    assertNotNull(performJJ("/exception/resp"));
  }
}