/*import java.util.Scanner;

class star{
    public static void main(String arg[]){
        /*System.out.println("enter the value");
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        
        System.out.println(X);
        for(int a=1;a<=X;a++)
        {
           // System.out.println();
            for(int b=X;b>=a;b--)
            {
                System.out.print(" "); 
            }
            for(int b=1;b<=a;b++){
            System.out.print("* ");
            }
            System.out.println();

        }
       


    }

}
*/
/*class computer{
    public void playmusic() {
        System.out.println("music playing");
    }
    public String getMeAPen(int cost)
    {
        if(cost>=10)
        return "Pen";
        else 
        return "nothing";
    }
}
public class star{
    public static void main(String[] args) {
        computer obj = new computer();
        obj.playmusic();
        String str = obj.getMeAPen (10);
        System.out.println(str);
    }
}*/
class computer{
    public void playmusic(){
        System.out.println("music playing");
    }
    public String getMePen(int cost){
        return "Pen";
    }
}
class star{
    public static void main(String[] args) {
        computer obj = new computer();
        obj.playmusic();
        String str = obj.getMePen (10);
        System.out.println(str);
    }
}