import java.util.Scanner;

class ifelse {
    public static void main(String[] args) {
        System.out.println("enter two number");
        Scanner sc = new Scanner(System.in);
        // Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int year = sc.nextInt();
        System.out.println(age);
        System.out.println(year);
        int total = age + year;
        System.out.println(total);

        int a = 10;
        if (a == 11) {
            System.out.println("i am 11");
        } else {
            System.out.println("i am not 11");
        }
    }
}

class ifelse {
    public static void main(String[] args) {
        int a = 10;
        if (a == 11)
            System.out.println("i am 11");
        else
            System.out.println("i am not 11");
    }

}
