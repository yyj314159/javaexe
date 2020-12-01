//多态的好处：提高了程序的拓展性，如何使用子类的特有功能
public class demo8
{
    public static void main(String[] args){
        Animal cat = new Cat(); //多态来了,自动的向上转型
        cat.eat();
        Cat mao = (Cat) cat;//向下转型，可以调用猫的方法
        mao.Fun();
        System.out.println(mao == cat);//居然是相等的
        System.out.println(mao instanceof Cat);
        System.out.println(mao instanceof Animal);
        System.out.println(cat instanceof Cat);
        System.out.println(cat instanceof Animal);
        Animal dog = new Dog(); //多态来了
        dog.eat();


    }
}
abstract class Animal
{
    public abstract void eat();
}
class Cat extends Animal
{
    public void eat()
    {
        System.out.println("猫吃鱼");
    }
    public void Fun()
    {
        System.out.println("猫捉老鼠");
    }
}

class Dog extends Animal
{
    public void eat()
    {
        System.out.println("狗吃骨头");
    }
    public void Fun()
    {
        System.out.println("狗拿耗子");
    }
}