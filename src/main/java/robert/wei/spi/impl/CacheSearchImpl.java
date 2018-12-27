package robert.wei.spi.impl;

import java.util.Collections;
import java.util.List;
import robert.wei.spi.Search;

public class CacheSearchImpl implements Search {

  public List search(String keyword) {
    System.out.println("It's cache search.");
    return Collections.emptyList();
  }
}
