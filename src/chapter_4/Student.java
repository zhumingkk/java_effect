package chapter_4;

import java.util.List;

/**
 * @author zhu_ming
 * @since v_1.0 2020-11-17
 */
public class Student extends Person{
  private String school;

  public Student(String name, int age) {
    super(name, age);
  }

  public Student(String name, int age, String school) {
    super(name, age);
    this.school = school;
  }

  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public static void printStu(List<? extends Person> list){
    list.forEach(System.out::println);
  }

  @Override
  public String toString() {
    return "Student{" +
        "school='" + school +
        "name='" + super.getName() + '\'' +
            ", age=" + super.getAge()+
            '}';
  }
}
