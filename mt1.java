import java.util.Scanner;

class demo1{
    void fun1() throws Exception
    {
        System.out.println("Addition task started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        int num = num1 + num2;
        System.out.println(num);
    }
}

class demo2{
    void fun2() throws Exception
    {
        System.out.println("Character Printing Started");
        for(int i = 0; i <= 15; i++){
            System.out.println(i);
        }
    }
}


public class mt1 {
    public static void main(String args[]) throws Exception
    {
        demo1 d1 = new demo1();
        demo2 d2 = new demo2();
        d1.fun1();
        d2.fun2();
    }
}
