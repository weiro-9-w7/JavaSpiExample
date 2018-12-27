package robert.wei.spi;

import java.util.ServiceLoader;

public class SearchFactory {

  public static Search getSearch(){
    ServiceLoader<Search> serviceLoader = ServiceLoader.load(Search.class);

    if(serviceLoader.iterator().hasNext()){
      return serviceLoader.iterator().next();
    }

    return null;
  }

  public static void main(String[] args) {
    SearchFactory.getSearch().search("Hello");
  }
}
