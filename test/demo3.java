import java.util.Scanner;
public class demo3
{
    public static int add(int a,int b)
    {
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args)
    {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数");
        num1 = sc.nextInt();
        System.out.println("输入第二个数");
        num2 = sc.nextInt();
        int num = add(num1,num2);
        if(num >= 200){
            System.out.println("大于200");
        }else {
            System.out.println("小于200");
        }

    }
}
