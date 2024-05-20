class Human {
    private int age;
    private String name;

    public Human() {
        System.out.println("in constructor");
        int age = 12;
        String name = "Sheetal";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class sv {
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getName);
        System.out.println(obj.getName() + ":" + obj.setName());
    }
}

// import java.util.Scanner;

// class clg{
// private int erp=33;
// public int getErp(){
// return erp;
// }
// public void setErp(int n){
// if (n==erp) {
// System.out.println("enter erp=");
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// }

// }
// }
// /**
// * gettr
// */
// public class gettr {

// public static void main(String[] args) {
// clg obj = new clg();
// System.out.println("ERP=" + obj.getErp());
// obj.setErp(n);
// System.out.println("new ERP=" + obj.getErp());
// }
// }

// class sheetal{
// private int number = 10;
// //constractor
// sheetal(){
// System.out.println("called");
// }

// public int getNumber(){
// return number;
// }

// public void setNumber(int num){
// number = num;
// }
// }

// public class gettr {

// public static void main(String[] args) {
// sheetal hello; //constrator called
// sheetal obj = new sheetal();
// //System.out.println(obj.getNumber()); //getter
// }
// }

// import java.util.Scanner;
// class met{
// private String oldname;
// public String getName(){

// return oldname;
// }
// public void setName(String n){

// Scanner sc =new Scanner(System.in);
// System.out.println("enter old name");
// oldname = sc.nextLine();
// //oldname = n;
// //n = name;
// }
// }
// public class metod {

// public static void main(String[] args) {
// met obj = new met();
// System.out.println("name" + " " + obj.getName());
// System.out.println("enter new name " + " " );
// Scanner sc = new Scanner(System.in);
// String newname = sc.nextLine();
// obj.setName(newname);
// System.out.println("newname" + " " + obj.getName());

// }
// }

// import java.util.Scanner;

// class Met {
// private String oldname;

// public String getName() {
// return oldname;
// }

// public void setName(String n) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter old name:");
// oldname = sc.nextLine();
// }
// }

// public class metod {
// public static void main(String[] args) {
// Met obj = new Met();
// System.out.println("Name: " + obj.getName());
// System.out.println("Enter new name:");
// Scanner sc = new Scanner(System.in);
// String newname = sc.nextLine();
// obj.setName(newname);
// System.out.println("New Name: " + obj.getName());
// }
// }