package lovey;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

public class ScoreCollectionTest {

  @Test
  public void meanOfTwoNumbers() {
    ScoreCollection c = new ScoreCollection();
    c.add(() -> 5);
    c.add(() -> 7);

    int result = c.arithmeticMean();

    assertThat(result, equalTo(6));
  }

  // @Test
  public void meanOfEmpty() {
    ScoreCollection c = new ScoreCollection();

    int result = c.arithmeticMean();

    assertThat(result, equalTo(0));
  }
}
