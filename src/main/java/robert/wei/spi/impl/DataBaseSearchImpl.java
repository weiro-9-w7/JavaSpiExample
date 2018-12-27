package robert.wei.spi.impl;

import java.util.Collections;
import java.util.List;
import robert.wei.spi.Search;

public class DataBaseSearchImpl implements Search {

  public List search(String keyword) {
    System.out.println("it's db search");
    return Collections.EMPTY_LIST;
  }
}
