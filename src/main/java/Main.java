import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> flashcards = new HashMap<String, String>();

        while(true) {
            System.out.println("Please enter term");
            String inputTerm = scanner.nextLine();

            System.out.println("Please enter the definition for " + inputTerm);
            String inputDef = scanner.nextLine();

            flashcards.put(inputTerm, inputDef);

            System.out.println("Would you like to enter another flashcard?\nEnter 'y' to continue, or 'n' to quit");
            String cont = scanner.nextLine();

            if(cont.equals("n")) {
                break;
            }
        }
        System.out.println("Would you like to remove a flashcard? (y/n)");
        String removeChoice = scanner.nextLine();

        if (removeChoice.equals("y")) {
            System.out.println("Enter the term you want to remove:");
            String removeTerm = scanner.nextLine();

            if (flashcards.containsKey(removeTerm)) {
                flashcards.remove(removeTerm);
                System.out.println("Flashcard removed!");
            } else {
                System.out.println("Term not found.");
            }
        }

        System.out.println(flashcards);
    }
}
    

