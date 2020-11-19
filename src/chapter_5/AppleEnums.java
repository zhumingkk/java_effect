package chapter_5;

import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public enum AppleEnums {
  RED_APPLE(1, "红苹果"), GREE_APPLE(2, "绿苹果");

  private Integer index;

  private String des;


  AppleEnums(int index, String des) {
    this.index = index;
    this.des = des;
  }

  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public String getDes() {
    return des;
  }

  public void setDes(String des) {
    this.des = des;
  }

  // 通过index得到des
  public static String getDes(Integer index) {
    String des = "index不存在";
    AppleEnums[] values = AppleEnums.values();
    for (AppleEnums appleEnums : values) {
      if (Objects.equals(appleEnums.getIndex(), index)) {
        des = appleEnums.getDes();
        break;
      }
    }

    return des;
  }

  // 通过des得到index
  public static Integer getIndex(String des) {
    Integer index = null;
    AppleEnums[] values = AppleEnums.values();
    for (AppleEnums appleEnums : values) {
      if (Objects.equals(appleEnums.getDes(), des)) {
        index = appleEnums.getIndex();
        break;
      }
    }

    return index;
  }

  // 通过index得到Apple
  public static AppleEnums getAppleByIndex(Integer index) {
    AppleEnums[] values = AppleEnums.values();
    for (AppleEnums appleEnums : values) {
      if (Objects.equals(appleEnums.getIndex(), index)) {
        return appleEnums;
      }
    }
    return null;

  }

  @Override
  public String toString() {
    return "AppleEnums{" +
        "index=" + index +
        ", des='" + des + '\'' +
        "} " + super.toString();
  }


  public static void main(String[] args) {
//    AppleEnums [] apples = AppleEnums.values();
//    for(AppleEnums apple: apples){
//      System.out.println("index" + apple.getIndex());
//      System.out.println("des" + apple.getDes());
//      System.out.println("toString" + apple.toString());
//    }

//    String des = AppleEnums.getDes(1);
//    System.out.println(des);
//
//    Integer index = AppleEnums.getIndex("红苹果");
//    System.out.println(index);
//
//    AppleEnums appleByIndex = AppleEnums.getAppleByIndex(2);
//    System.out.println(appleByIndex.toString());

//    AppleEnums.getAppleSwitch(1);

//    AppleEnums red_apple = AppleEnums.valueOf("RED_APPLE");
//    System.out.println(red_apple.toString());

    Map<AppleEnums, String> map = new EnumMap<AppleEnums, String>(AppleEnums.class);

    //put方法
    map.put(AppleEnums.GREE_APPLE, "绿的苹果没熟");
    map.put(AppleEnums.RED_APPLE, "红的已经熟了");

//    System.out.println(map.containsKey(AppleEnums.GREE_APPLE));
//    System.out.println(map.containsValue("GREE_APPLE"));

    for (String str : map.values()) {
      System.out.println(str);
    }

    for (AppleEnums appele : map.keySet()) {
      System.out.println(appele);
    }

    for (Entry<AppleEnums, String> entry : map.entrySet()){
      System.out.println(entry.getKey().toString()  + "\t" + entry.getValue());
    }


  }

  private static void getAppleSwitch(Integer index) {
    AppleEnums appleEnumsByIndex = AppleEnums.getAppleByIndex(index);
    switch (appleEnumsByIndex) {
      case RED_APPLE:
        System.out.println("选择了红苹果");
        break;
      case GREE_APPLE:
        System.out.println("选择了绿苹果");
        break;
      default:
        System.out.println("无苹果选择");
        break;
    }


  }
}
