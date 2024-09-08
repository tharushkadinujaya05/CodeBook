import java.util.Scanner; // Import the Scanner class
public class UserInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("What is ur name?"); 
        String name = scanner.nextLine(); // Read user input
        System.out.println("How old are you?");
        int age = scanner.nextInt(); // Read user input

        System.out.println("Hello "+ name+" You are"+age+" Years old"); // Output user input
        scanner.close(); // closing scanner object
    }
}
