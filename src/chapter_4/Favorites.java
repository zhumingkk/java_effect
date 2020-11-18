package chapter_4;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhu_ming
 * @since v_1.0 2020-11-18
 */
public class Favorites {
  private Map<Class<?>,Object> map =new HashMap<>();

  public <T> void put(Class<T> cls,T instance){
    map.put(cls,cls.cast(instance));
  };

  public <T> T get(Class<T> cls){
      return cls.cast(map.get(cls));
  };
}
