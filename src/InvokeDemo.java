/**
 * @ClassName InvokeDemo
 * @Description TODO
 * @Author 60343
 * @Date 2019/5/6 9:33
 */
public class InvokeDemo {
  public static void main(String[] args) throws IllegalAccessException, InstantiationException {
    // "正射"获取Foo类对象
    Foo f = new Foo();
    // 反射获取Foo类对象    3种方式
    // 方式一 任何一个类都有一个隐式的静态成员变量 class
    Class f1 = Foo.class;
    // 方式二 已知该类的对象,通过 getClass()
    Class f2 = f.getClass();
    // 方式三 已知该类的类路径,通过 Class.forName(),可能抛出ClassNotFoundException
    Class f3 = null;//com.xxx.Foo
    try {
      f3 = Class.forName("Foo");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    // f1 f2 f3 都是 Class 类的类类型
    System.out.println(f1==f2);//true
    System.out.println(f2==f3);//true
    //f1 f2 f3 创建对象,可能抛出InstantiationException or IllegalAccessException
    Foo foo1 = (Foo)f1.newInstance(); // 调用无参构造
    Foo foo2 = (Foo)f2.newInstance(); // 调用无参构造
    Foo foo3 = (Foo)f3.newInstance(); // 调用无参构造
  }
}
