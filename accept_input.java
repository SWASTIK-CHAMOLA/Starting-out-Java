// scanner is an object that allows us to accept user input in Java
import java.util.Scanner;

public class accept_user_input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name"); //input will be in new line
        String name = scanner.nextLine(); // allows us to take spaces between String

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("What is your gpa");
        double GPA = scanner.nextDouble();

        System.out.println("Are you a student? (True/False)");
        boolean status = scanner.nextBoolean();
        System.out.println("Hello " + name + " welcome to Java");
        System.out.println("YOU are "+ age+ " years old");
        System.out.println("Your GPA is "+GPA);
        System.out.println("Student: "+ status);

        if(status){
            System.out.println("you are enrolled as a student");
        }
        else {
            System.out.println("you are not enrolled as a student");
        }

        // COMMON ISSUES IN JAVA

        System.out.print("Enter your age: ");
        int a = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("You are " + a + " years old");
        System.out.println("You like the color " + color);

        scanner.close();

        scanner.close();

    }
}
