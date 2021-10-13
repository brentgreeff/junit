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

  @Test
  public void matches() {
    Profile p = new Profile("M");
    p.add( new Answer("Q", "Unique") );

    Criteria c = new Criteria();
    c.add(new Criterion(
      new Answer("Q", "Diff"),
      Weight.Important
    ));

    assertTrue(
      p.matches(c)
    );
  }
}
