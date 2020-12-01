//final:可以修饰类，方法，变量；不能有子类，不能被重写，



public class demo5 {
    public static void main(String[] args){
        final int num = 5; //局部变量不能被修改
//        num = 6;
    }
    public static void show1(final int a,final int b){
//        a = 99; //局部变量不能被修改
    }
}
final class Test{      //不能再有子类
    final public void show(){ //方法是最终的，不能被重写
        System.out.println("show");
    }
}
class Circle{
    private double r;
    final static double PI = 3.14; //符号常量；提高程序的阅读性
    Circle(double r){
        this.r = r;
    };
    public double getArea(double r){
        return PI*r*r;
    }
}
