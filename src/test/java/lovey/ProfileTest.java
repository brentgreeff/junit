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

  @Test
  public void hasAnswers() {
    Profile p = new Profile("Q");

    String q = "How large is the universe";
    p.add(new Answer(q, "Very"));

    assertThat(
      p.getLatestAnswer().getQuestionText(), equalTo(q)
    );
  }
}
