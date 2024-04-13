import java.util.Scanner;
public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
      
      System.out.print("Please Enter First Name: ");
     String firstName = sc.nextLine();
     System.out.print("Please Enter Last Name: ");
     String lastName = sc.nextLine();
     Person per = new Person(firstName, lastName);

     sc.close();
    }
}
