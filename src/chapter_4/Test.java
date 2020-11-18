package chapter_4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhu_ming
 * @since v_1.0 2020-11-17
 */
public class Test {

  public static void main(String[] args) {
//    List<Person> persons = new ArrayList();
//    persons.add(new Person("AA", 12));
//    persons.add(new Person("BB", 12));
//    persons.add(new Person("CC", 12));
//    Person per = persons.get(0);
//    System.out.println(per.toString());

    List<Student> students = new ArrayList();
    students.add(new Student("AA", 12,"Ã÷µÂ"));
    Student.printStu(students);
  }
}
