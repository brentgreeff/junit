package lovey;

class Question {
  private int id;
  private String text;

  public Question(int id, String text, String[] choices) {
    this.id = id;
    this.text = text;
  }

  public int id() { return id; }
  public String getText() { return text; }
}
