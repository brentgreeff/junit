package lovey;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

public class ProfileTest {

  @Test
  public void init() {
    Profile p = new Profile("Brent");
    assertThat(p.getName(), equalTo("Brent"));
  }
}
