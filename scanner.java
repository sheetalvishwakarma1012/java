import java.util.Scanner;
public class scanner 
{
    public static void main(String w[])
    {
        System.out.println("taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum= a+b;
        System.out.println("sum of number");
        System.out.println(sum);
    }
    
}