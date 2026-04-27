import java.util.HashMap;
import java.util.Scanner;

public class FlashcardDeck {
    Scanner scanner = new Scanner(System.in);
    HashMap<String, String> flashcards = new HashMap<String, String>();

    public void addFlashcard() {
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
    }

    public void removeFlashcard() {
        System.out.println("Enter the term you want to remove:");
        String removeTerm = scanner.nextLine();

        if (flashcards.containsKey(removeTerm)) {
            flashcards.remove(removeTerm);
            System.out.println("Flashcard removed!");
        } else {
            System.out.println("Term not found.");
        }
    }

    public void quizOnFlashcards() {
        
        if(flashcards.isEmpty()) {
            System.out.println("No flashcards exist");
        }
        
        for(String term : flashcards.keySet()) {
            System.out.println("What is the definition of: " + term);
            scanner.nextLine();

            System.out.println("Definition: " + flashcards.get(term));
        }
    }
}
