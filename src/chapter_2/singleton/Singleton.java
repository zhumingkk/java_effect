package chapter_2.singleton;

/**
 * ö�ٵ���ģʽ
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
    System.out.println("��������£�ʵ��������ʵ���Ƿ���ͬ��"+(singleton1==singleton2));

    singleton1.doSomeThing();
  }
}
