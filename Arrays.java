
import java.util.Scanner;
public class Arrays{
    public static void main (String [] args){
Scanner sc = new Scanner(System.in);
        String email [] = new String[2];
        int password [] = new int[2];
        String username [] = new String[2];

        email[0] = "mtonilon17@gmail.com";
        email[1] = "leannikkomonzon@143.com";
        
        password[0] = 123456;
        password[1] = 7890;

        username[0] = "mtonilon";
        username[1] = "leanlean";
        
        System.out.print("Please Enter a number: ");
        int i = sc.nextInt();
        

        if(i == 0){
            System.out.println(email[0]);
            System.out.println(password[0]);
            System.out.println(username[0]);
        }
        else if (i == 1){
            System.out.println(email[1]);
            System.out.println(password[1]);
            System.out.println(username[1]);
        }
        sc.close();
    }   

}