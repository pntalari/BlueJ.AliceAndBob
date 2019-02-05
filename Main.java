/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args )
    {
     Scanner read = new Scanner(System.in);
     System.out.println("Enter your Kool name: ");
     String input = read.nextLine();
     
     if (input.equals("Alice") || input.equals("Bob"))
       System.out.println("Hello " + input + ".Welcome to my world!");
     else
        System.out.println("I dont know whoever you are, Sorry!");

    }
}
