package chapter_2.constructor;

/**
 * 重叠构造器模式
 * @author zhu_ming
 * @since v_1.0 2020-11-12
 */
public class NutritionFacts {
  private final int serviceSize;     // required
  private final int serviceThings;   // required

  private final int fat;            // optional
  private final int sodium;         // optional
  private final String  name;       // optional
  private final String option;      // optional

  public NutritionFacts(int serviceSize, int serviceThings) {
   this(serviceSize,serviceThings,0);
  }

  public NutritionFacts(int serviceSize, int serviceThings, int fat) {
    this(serviceSize,serviceThings,fat,0);
  }

  public NutritionFacts(int serviceSize, int serviceThings, int fat, int sodium) {
    this(serviceSize,serviceThings,fat,sodium, null);
  }

  public NutritionFacts(int serviceSize, int serviceThings, int fat, int sodium, String  name) {
    this(serviceSize,serviceThings,fat,sodium, name,null);
  }

  public NutritionFacts(int serviceSize, int serviceThings, int fat, int sodium, String name, String option) {
    this.serviceSize = serviceSize;
    this.serviceThings = serviceThings;
    this.fat = fat;
    this.sodium = sodium;
    this.name = name;
    this.option = option;
  }
}
