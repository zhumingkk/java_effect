package chapter_2;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhu_ming
 * @since v_1.0 2020-11-12
 */
public class Services {

  private static final Map<String, Provider> providers = new ConcurrentHashMap<>();
  private static final String DEFAULT_PROVIDER = "<def>";

  private Services() {
  }

  public static void registerDefaultProvider(Provider p) {
    registerProvider(DEFAULT_PROVIDER, p);
  }

  // provider register api
  private static void registerProvider(String name, Provider p) {
    providers.put(name, p);
  }

  public static Service newInstance() {
    return newInstance(DEFAULT_PROVIDER);
  }

  // service access api
  public static Service newInstance(String name) {
    Provider p = providers.get(name);
    if (Objects.isNull(p)) {
      throw new IllegalArgumentException("no provider register with name :" + name);
    }
    return p.newService();
  }


}
