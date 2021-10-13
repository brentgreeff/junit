package lovey;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

public class CriteriaTest {

  @Test
  public void hasArithmeticMean() {
    Criteria c = new Criteria();
    c.add(new Criterion(
      new Answer("Q", "A"),
      Weight.Important
    ));

    assertThat(
      c.arithmeticMean(), equalTo(0)
    );
  }
}
