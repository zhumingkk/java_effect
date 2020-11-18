package chapter_3;

import java.util.Objects;

/**
 * euqals
 *
 * @author zhu_ming
 * @since v_1.0 2020-11-13
 */
public class Person implements Cloneable,Comparable<Person> {

  private String name;

  public Person(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Person)) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(name, person.name);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name);
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        '}';
  }

  @Override
  protected Person clone() {
    try {
      return (Person) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }

  }

  @Override
  public int compareTo(Person o) {
    return this.name.compareTo(o.name);
  }

  public static void main(String[] args) {
    Person a = new Person("a");
    Person b = new Person("a");
//    System.out.println(a.equals(b));
//    System.out.println(a);
    Person clone = a.clone();
    System.out.println(a == clone);
  }
}
