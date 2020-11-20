package jdk8;

import com.sun.deploy.util.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/**
 * @author zhu_ming
 * @since v_1.0 2020-11-20
 */
public class JDK8 {

  static List<Vehicle> vehicles = new ArrayList<>();

  static {
    vehicles.add(new Vehicle("KPTSOA1K67P081452", "17620411498", "9420", 1, 4.5, "11111111111"));
    vehicles.add(new Vehicle("KPTCOB1K18P057071", "15073030945", "张玲", 2, 1.4, "222222222222"));
    vehicles
        .add(new Vehicle("KPTS0A1K87P080237", "19645871598", "sanri1993", 1, 3.0, "333333333333"));
    vehicles.add(new Vehicle("KNAJC526975740490", "15879146974", "李种", 1, 3.9, "444444444444"));
    vehicles.add(new Vehicle("KNAJC521395884849", "13520184976", "袁绍", 2, 4.9, "555555555"));
  }

  public static void main(String[] args) {
    /**
     * 存在的 Java8 定义的函数式接口
     */
//    List<String> strings = Arrays.asList("a", "b", "c");
//    strings.forEach(System.out::println);

// Function<T,R> T 作为输入，返回的 R 作为输出
//    Function<String,String> ret =str->str.concat(" word");
//    System.out.println(ret.apply("hello"));

//    UnaryOperator<T> 是 Function 的变种 ，输入输出者是 T
// UnaryOperator<String>  uet = str->str.concat(" xx");
//    System.out.println(uet.apply("那是的阿斯达阿斯达s "));

    // 判断输入值是否为偶数示例
//    Predicate<Integer> predicate = x->x%2==0;
//    predicate.and(x->x+1==5);
//    System.out.println(predicate.test(4));
//    predicate.or(x->x+1==5);
//    System.out.println(predicate.test(2));

    // Consumer<T> T 作为输入 ，没有输出   无返回值
//    Consumer<String> consumer1 = e-> System.out.println("姓名 " + e);
//    Consumer<String> consumer2 = e-> System.out.printf("年龄 %s" , e);
//    consumer1.accept("张三");
//    consumer2.accept( "22" );
//    consumer1.andThen(consumer2);

    // Supplier<R> 没有输入 , R 作为输出   无输入
//    Supplier<String> supplier = ()-> "nihao";
//    System.out.println(supplier.get());

    //  两个 T 作为输入 ，T 同样是输出
//    BinaryOperator<Integer> binaryOperator =(x,y) ->x>y?x:y;
//    System.out.println(binaryOperator.apply(3,5));

    /**
     * 方法引用
     */
    //  构造器引用 Class::new
//    Car car1 = Car.create(Car::new);
//    Car car2 = Car.create(Car::new);
//    List<Car> cars = Arrays.asList(car1, car2);
//    // 静态方法引用 Class::static_method
//    cars.forEach(Car::xiaofei);
    // 类的成员方法的引用 Class::method

    // 自定义重复注解
//    for (Token token: UserToken.class.getAnnotationsByType(Token.class)){
//      System.out.println(token.value());
//    }

    // 更好类型推断
  //    final Value<String> value = new Value<>();
  //    String defaultStr = value.getOrdefault(null, Value.defaultValue());
  //    System.out.println(defaultStr);

   // forEach 遍历Collection 数据
//    vehicles.forEach(System.out::println);
   //  forEach 遍历 Map 数据
//    Map<String,Integer> map = new HashMap<>();
//    map.put("a",1);map.put("b",2);map.put("c",3);
//
//    map.forEach((k,v) -> System.out.println("健 " + k + "值" + v));

    // filter 数据过滤
//    List<Vehicle> collect = vehicles.stream().filter(e -> e.getScore() >= 3)
//        .collect(Collectors.toList());
//    System.out.println("过滤评分大于等于3的车辆集合 " + collect);

    // 取出所有的车架号列表
//    List<String> list = vehicles.stream().map(Vehicle::getVin).collect(Collectors.toList());
//    System.out.println("取出所有的车架号列表 " + list);



    // groupBy 按照某个属性进行分组
    Map<Integer, List<Vehicle>> maps = vehicles.stream()
        .collect(Collectors.groupingBy(Vehicle::getCompanyId));
    List<Vehicle> vehicles_one = maps.get(1);
    List<Vehicle> vehicles_two = maps.get(2);
    System.out.printf("id为1的长度大小=>%s ,集合是 =>%s",  maps.get(1).size(),vehicles_one.toString());
    System.out.printf("id为2的长度大小=>%s ,集合是 =>%s",  maps.get(2).size(),vehicles_two.toString());
  }
}
