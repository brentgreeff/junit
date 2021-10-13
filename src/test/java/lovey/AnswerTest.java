package lovey;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

public class AnswerTest {

  @Test
  public void hasAnswer() {
    Answer a = new Answer("Q", "A"),
      Weight.Important
    );

    assertThat(
      a.getQuestionText(), equalTo("Q")
    );
  }
}
