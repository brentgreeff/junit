package lovey;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

public class QuestionTest {

  @Test
  public void hasQuestionText() {
    String[] choices = {"Y", "N"};
    Question q = new Question(1, "Q", choices);

    assertThat(
      q.getText(), equalTo("Q")
    );
  }
}
