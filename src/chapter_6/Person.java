package chapter_6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Objects;

/**
 * 序列化和反序列化使用
 * @author zhu_ming
 * @since v_1.0 2020-11-19
 */
public class Person implements Serializable {
  private String name;
  private int age;
  private transient String addres;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Person(String name, int age, String addres) {
    this.name = name;
    this.age = age;
    this.addres = addres;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return age == person.age &&
        Objects.equals(name, person.name);
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", addres='" + addres + '\'' +
        '}';
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  public static void main(String[] args) {
      //  普通序列化 将对象写入到IO流中
      try {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Win10\\Desktop\\object.txt"));
        Person person = new Person("张三",13,"静安区");
        oos.writeObject(person);
      } catch (IOException e) {
        e.printStackTrace();
      }

    try {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Win10\\Desktop\\object.txt"));
        Person brady = (Person) ois.readObject();
        System.out.println(brady);
      } catch (Exception e) {
        e.printStackTrace();
      }


  }
}
