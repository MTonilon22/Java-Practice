import java.util.Scanner;
public class HelloWorld {
    public static void main (String args[]){
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Any Word: ");
        int x = sc.nextInt();
        
        System.out.println(x);
        sc.close();
    }
    
}