package lovey;

import java.util.*;

public class Profile {
  private Map<String,Answer> answers = new HashMap<>();
  private int score;
  private String name;

  public Profile(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void add(Answer answer) {
    answers.put(answer.getQuestionText(), answer);
  }

  public Answer getLatestAnswer() {
    return this.answers.get("How large is the universe");
  }
}
