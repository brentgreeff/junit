package lovey;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

public class CriterionTest {

  @Test
  public void hasAnswer() {
    Criterion c = new Criterion(
      new Answer("Q", "A"),
      Weight.Important
    );
    assertThat(
      c.getAnswer().getQuestionText(), equalTo("Q")
    );
  }

  @Test
  public void hasWeight() {
    Criterion c = new Criterion(
      new Answer("Q", "A"),
      Weight.Important
    );

    assertThat(
      c.getWeight(),
      equalTo(Weight.Important)
    );
  }

  @Test
  public void hasScore() {
    Criterion c = new Criterion(
      new Answer("Q", "A"),
      Weight.Important
    );

    c.setScore(4);

    assertThat(
      c.getScore(), equalTo(4)
    );
  }
}
