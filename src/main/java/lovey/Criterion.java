package lovey;

public class Criterion implements Scoreable {
  private Answer answer;
  private int score;

  public Criterion(Answer answer) {
    this.answer = answer;
  }

  public Answer getAnswer() { return this.answer; }

  public void setScore(int score) { this.score = score; }
  public int getScore() { return this.score; }
}
