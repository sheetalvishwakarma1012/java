import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.IOException;

public class getter {
    public static void main(String[] args) {
        Scanner passwordScanner = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = passwordScanner.nextLine();
        
        switch (password) {
            case "y": // Correct password to hide the folder
                Path folderToHide = Paths.get("C:/Users/jay97/OneDrive/Desktop/sheetal1");
                try {
                    Files.setAttribute(folderToHide, "dos:hidden", true);
                    //System.out.println("Folder hidden successfully.");
                } 
                catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "n":
                Scanner passcodeScanner = new Scanner(System.in);
                System.out.println("Enter passcode: ");
                int passcode = passcodeScanner.nextInt();
        
                switch (passcode) {
                    case 1014: // Correct passcode to reveal the folder
                        Path hiddenFolder = Paths.get("C:/Users/jay97/OneDrive/Desktop/sheetal1");
                        try {
                            Files.setAttribute(hiddenFolder, "dos:hidden", false);
                            //System.out.println("Folder revealed successfully.");
                        } 
                        catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    default:
                        //System.out.println("Invalid passcode. Folder remains hidden.");
                        break;
                }
                break;
            default:
                //System.out.println("Invalid password.");
                break;
        }
    }
}









// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;
// import java.util.Scanner;
// import java.io.IOException;

// public class getter {
//     public static void main(String[] args) {
//         Scanner passwordScanner = new Scanner(System.in);
//         System.out.println("Enter password: ");
//         String password = passwordScanner.nextLine();
        
//         switch (password) {
//             case "y": // Correct password to hide the folder
//                 Path folderToHide = Paths.get("C:/Users/jay97/OneDrive/Desktop/sheetal1");
//                 try {
//                     Files.setAttribute(folderToHide, "dos:hidden", true);
//                     //System.out.println("Folder hidden successfully.");
//                 } catch (IOException e) {
//                     e.printStackTrace();
//                 }
//                 break;
//             case "n":
//             Scanner passcodeScanner = new Scanner(System.in);
//             System.out.println("Enter passcode: ");
//             int passcode = passcodeScanner.nextInt();
    
//             switch (passcode) {
//                 case 1014: // Correct passcode to reveal the folder
//                     Path hiddenFolder = Paths.get("C:/Users/jay97/OneDrive/Desktop/sheetal1");
//                     try {
//                         Files.setAttribute(hiddenFolder, "dos:hidden", false);
//                         //System.out.println("Folder revealed successfully.");
//                     } catch (IOException e) {
//                         e.printStackTrace();
//                     }
//                     break;
//                 default:
//                     System.out.println("");
//                     break;
//             }

//             default:
//                 System.out.println("");
//                 break;
//         }
//         // if (password=="n") {
        
//         // }

        
//     }









// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;
// import java.util.Scanner;
// import java.io.IOException;

// public class getter {
//     public static void main(String[] args) {
//         Path folderToHide = Paths.get("C:/Users/jay97/OneDrive/Desktop/sheetal1");
//         try {
//             Files.setAttribute(folderToHide, "dos:hidden", true);
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//         switch (hiddenFolder) {
//             case 1014:
//             Scanner sc = new Scanner(System.in);
//             hiddenFolder = sc.nextInt();
//             System.out.println("enter passcode😊");
//             Path hiddenFolder = Paths.get("C:/Users/jay97/OneDrive/Desktop/sheetal1");
//             try {
//                 Files.setAttribute(hiddenFolder, "dos:hidden", false);
//             } catch (IOException e) {
//                 e.printStackTrace();
//             }
//                 break;
        
//             default:
//                 break;
//         }
        
//     }
// }











// import java.util.Scanner;

// class clg {
//     private int erp = 33;
//     private String password = "password123"; // Sample password

//     public int getErp(String inputPassword) {
//         if (validatePassword(inputPassword)) {
//             return erp;
//         } else {
//             System.out.println("Incorrect password. Access denied.");
//             return -1; // Or any other value indicating access denied
//         }
//     }

//     public void setErp(int n, String inputPassword) {
//         if (validatePassword(inputPassword)) {
//             erp = n;
//             System.out.println("ERP updated successfully.");
//         } else {
//             System.out.println("Incorrect password. Access denied. ERP not updated.");
//         }
//     }

//     private boolean validatePassword(String inputPassword) {
//         return inputPassword.equals(password);
//     }
// }

// public class gettr {
//     public static void main(String[] args) {
//         clg obj = new clg();

//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter password: ");
//         String password = scanner.nextLine();

//         // Accessing ERP value
//         int erpValue = obj.getErp(password);
//         if (erpValue != -1) {
//             System.out.println("ERP=" + erpValue);
//         }

//         // Updating ERP value
//         System.out.print("Enter new ERP: ");
//         int newErp = scanner.nextInt();
//         System.out.print("Enter password to update ERP: ");
//         password = scanner.next();
//         obj.setErp(newErp, password);
//     }
// }







// import java.util.Scanner;

// class clg{
//     private int erp=33;
//     public int getErp(){
//         return erp;
//     }
//     public void setErp(int n){
//         if (n==erp) {
//         System.out.println("enter erp=");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
            
//         }

        
//     }
// }
// /**
//  * gettr
//  */
// public class gettr {

//     public static void main(String[] args) {
//         clg obj = new clg();
//         System.out.println("ERP=" + obj.getErp());
//         obj.setErp(n);
//         System.out.println("new ERP=" + obj.getErp());
//     }
// }







// class sheetal{
//     private int number = 10;
//     //constractor
//     sheetal(){
//         System.out.println("called");
//     }
    
//     public int getNumber(){
//         return number;
//     }

//     public void setNumber(int num){
//         number = num;
//     }
// }

// public class gettr {

//     public static void main(String[] args) {
//         sheetal hello;  //constrator called
//         sheetal obj = new sheetal();
//         //System.out.println(obj.getNumber());    //getter
//     }    
// }
