import java.util.Scanner;

public class if_statments {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String Name;
        System.out.println("Enter your name: ");
        Name = scanner.nextLine();

        int age;
        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        if(Name.isEmpty()){
            System.out.println("\uD83D\uDE21\uD83D\uDE21\uD83D\uDE21 You did not enter your name \uD83D\uDE21 \uD83D\uDE21 \uD83D\uDE21");
        }
        else{
            System.out.println("Welcome "+Name+ "!");
        }

        if( age <= 18){
            System.out.println(Name+ " are going to become an adult");

        }
        else if (age>18){
            System.out.println(Name+" are an adult");
        }
        else{
            System.out.println(Name+" are 18 years old");
        }


    }
}
