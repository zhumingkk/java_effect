package chapter_2.constructor;

/**
 * Builder 模式
 * @author zhu_ming
 * @since v_1.0 2020-11-12
 */
public class NutritionFactsExt  {

  private final int serviceSize;     // required
  private final int serviceThings;   // required

  private final int fat;            // optional
  private final int sodium;         // optional
  private final String  name;       // optional
  private final String option;      // optional

  public NutritionFactsExt(Builder builder) {
    this.serviceSize = builder.serviceSize;
    this.serviceThings = builder.serviceThings;
    this.fat = builder.fat;
    this.sodium = builder.sodium;
    this.name = builder.name;
    this.option = builder.option;
  }

  public static class Builder implements chapter_2.constructor.Builder<NutritionFactsExt>  {
    private final int serviceSize;     // required
    private final int serviceThings;   // required

    private int fat;            // optional
    private  int sodium;         // optional
    private  String  name;       // optional
    private  String option;      // optional


    public Builder(int serviceSize, int serviceThings) {
      this.serviceSize = serviceSize;
      this.serviceThings = serviceThings;
    }

    public Builder fat(int val) {
      this.fat = val;
      return this;
    }

    public Builder sodium(int val) {
      this.sodium = sodium;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder option(String option) {
      this.option = option;
      return this;
    }

    @Override
    public NutritionFactsExt build() {
      return new NutritionFactsExt(this);
    }

  }

  public static void main(String[] args) {
    NutritionFactsExt ext = new Builder(1,20)
        .fat(30)
        .name("张三")
        .option("optional")
        .sodium(40).build();
  }
}
