//程序员有姓名，工号，薪水，工作内容；项目经理有姓名，工号，薪水，工作内容，还有奖金；
public class demo7 {
    public static void main(String[] args){
        Programmer prg = new Programmer("jack","001",3000);
        prg.work();
        Manger man = new Manger("lili","000",12000,3000);
        man.work();
    }
}

abstract class Employee
{
    private String name;
    private String id;
    private double money;
    public Employee(){};
    public Employee(String name,String id,double money){
        this.id = id;
        this.name = name;
        this.money = money;
    }
    public abstract void work();
}
class Programmer extends Employee
{
    public Programmer(){};
    public Programmer(String name,String id,double money){
        super(name,id,money);
    }
    public void work(){
        System.out.println("写代码");
    }
}
class Manger extends Employee
{
    private double bonus;
    public Manger(){};
    public Manger(String name,String id,double money,double bonus){
        super(name,id,money);
        this.bonus = bonus;
    }
    public void work(){
        System.out.println("管理经验");
    }
}


