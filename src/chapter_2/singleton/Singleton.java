package chapter_2.singleton;

/**
 * 枚举单例模式
 */
public enum Singleton {
  INSTANCE;

  public Singleton getInstance(){
    return INSTANCE;
  }

  public void doSomeThing(){
    System.out.println("operation is harder");
  }


  public static void main(String[] args) {
    Singleton singleton1 = Singleton.INSTANCE.getInstance();
    Singleton singleton2 = Singleton.INSTANCE.getInstance();
    System.out.println("正常情况下，实例化两个实例是否相同："+(singleton1==singleton2));

    singleton1.doSomeThing();
  }
}
