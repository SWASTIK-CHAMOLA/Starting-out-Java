import java.util.Scanner;

public class madlib_game {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;
        String noun2;
        String verb2;
        String size;
        String emotion;

        System.out.println("=== THE MOST BORING DAY EVER MAD LIBS ===");
        System.out.println("Create your painfully awkward zoo experience...\n");

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb ending with -ing (action): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter another adjective (feeling): ");
        adjective3 = scanner.nextLine();
        System.out.print("Enter a noun (object): ");
        noun2 = scanner.nextLine();
        System.out.print("Enter a verb (past tense): ");
        verb2 = scanner.nextLine();
        System.out.print("Enter a size (big, small, tiny, huge): ");
        size = scanner.nextLine();
        System.out.print("Enter an emotion: ");
        emotion = scanner.nextLine();

        System.out.println("\n" + "=".repeat(50));
        System.out.println("YOUR PAINFULLY AWKWARD ZOO EXPERIENCE:");
        System.out.println("=".repeat(50));

        System.out.println("So my mom literally FORCED me to go to this " + adjective1 + " zoo today.");
        System.out.println("Like, I didn't want to go anywhere, just wanted to stay at home......");
        System.out.println("Anyway, I'm standing there trying to look cool when this " + noun1 + " shows up.");
        System.out.println("This thing was absolutely " + adjective2 + " and kept " + verb1 + " around like it owned the place.");
        System.out.println("Then it literally grabbed this random " + size + " " + noun2 + " and started " + verb2 + " with it!");
        System.out.println("Everyone around me was freaking out, but honestly? I was just feeling " + adjective3 + ".");
        System.out.println("The whole situation made me feel " + emotion + ", which is pretty much how I be nowadays using IG.");

        System.out.println("\n" + "=".repeat(50));
        System.out.println("Thanks for wasting time with this... I guess. 🙄");
        System.out.println("LOL.........LOL........LOL..........LOL.........");

        scanner.close();
    }
}
