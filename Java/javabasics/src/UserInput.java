import java.util.Scanner; 
public class UserInput {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in); // creating scanner object
        System.out.print("What is Your Name : ");
        String name = scanner.nextLine(); // reading string

        System.out.println("How old are you : ");
        int age = scanner.nextInt(); // reading integer
        scanner.nextLine(); // to consume the newline character
        
        System.out.println("What is your favorite food : ");
        String food = scanner.nextLine(); // reading string

        System.out.print("Hello " + name);
        System.out.println(" you are " + age + " years old");
        System.out.println("Your favorite food is " + food);
    }
}
