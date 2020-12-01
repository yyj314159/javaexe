public class demo6 {
    public static void main(String[] args){

    }
}

//父类中某一共性方法，子类有各自不同的实现方法，那么该方法就需要加abstract；
//抽象类不能创建对象,子类没有重写父类中的抽象方法，该子类还是抽象类；抽象类一定是父类；有构造方法；
//abstract不能和final同时使用；static(可以通过类名调用)；private修饰的方法不能被重写
abstract class Shape
{
    abstract public double getArea();
}
class Cir extends Shape
{
    private double r;
    Cir(){};
    Cir(double r){
       this.r = r;
    }
    public double getArea(){
        return 3.14*r*r;
    }
}
class Rec extends Shape
{
    private double l;
    private  double w;
    Rec(){};
    Rec(double l, double w){
        this.l = l;
        this.w = w;
    };
    public double getArea(){
        return l*w;
    }
}
