import java.util.Scanner;

public class Main {    
    public static void main(String[] args) {
        FlashcardDeck function = new FlashcardDeck();
        
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter number of what you would like to do.");
            System.out.println("1. Add a flashcard\n2. Remove a flashcard\n3. Quiz on flashcards\n4. Exit");

            String userChoice = scanner.nextLine();

            if(userChoice.equals("1")) {
                function.addFlashcard();
            }
            else if(userChoice.equals("2")){
                function.removeFlashcard();
            }
            else if(userChoice.equals("3")){
                function.quizOnFlashcards();
            }
            else if(userChoice.equals("4")){
                break;
            }
            else {
                System.out.println("Unrecognized entry, please try again.");
            }
        }
    }
}
    

