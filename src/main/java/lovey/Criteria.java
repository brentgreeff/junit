package lovey;

import java.util.*;

public class Criteria implements Iterable<Criterion> {

  private List<Criterion> criteria = new ArrayList<>();

  @Override
  public Iterator<Criterion> iterator() {
    return criteria.iterator();
  }

  public void add(Criterion criterion) {

  }

  public int arithmeticMean() {
    return 0;
  }
}
