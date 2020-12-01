import java.util.*;
//父类属性和方法重名可以访问，通过super；重写注意事项：静态必须是静态，返回基本类型必须相同，如果不是引用类型，子类返回类型可以是父类方法中子类
//先调用父类的构造方法，再调用子类的构造方法；原因是子类构造方法中默认先加上了super();
//当父类重写了构造函数，子类必须在子类自己的构造函数必须得写，最好父类写无参的构造函数;
public class demo4 {
    public static void main(String[] args)
    {
//        Person4 per = new Person4(10,"lili");
//        System.out.println(per.age+"=="+per.name);
        Son1 son1 = new Son1();
        Son1 son2 = new Son1(13,"jack");

    }
}

class Person4 {
    static int age;
    String name;
    public int num1 = 5;
    Person4(){
        System.out.println("构造函数");
    }
    Person4(int age, String name){  //构造函数实现对象属性的初始化
        this.age = age;
        this.name = name;
        System.out.println("构造函数"+age+"=="+name);
    }

}
class Son1 extends Person4
{
//    int num1 = 10;
    public void Show(){
//        System.out.println(num1+"=="+super.num1);
        System.out.println(num1);
    }
    Son1(){
        super(); //第一行默认就是存在的
        System.out.println("子构造函数");
    }
    Son1(int age, String name){
        super(age,name); //第一行默认就是存在的
    }
}

