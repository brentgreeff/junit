package lovey;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

public class CriterionTest {

  @Test
  public void hasAnswer() {
    Criterion c = new Criterion( new Answer("Q", "A") );
    assertThat(
      c.getAnswer().getQuestionText(), equalTo("Q")
    );
  }

  @Test
  public void hasScore() {
    Criterion c = new Criterion( new Answer("Q", "A") );

    c.setScore(4);

    assertThat(
      c.getScore(), equalTo(4)
    );
  }
}
