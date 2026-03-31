import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputTerm;
        String inputDef;

        HashMap<String, String> flashcards = new HashMap<String, String>();

        System.out.println("Please enter the first term.");
        inputTerm = scanner.nextLine();

        System.out.println("Please enter the first definition.");
        inputDef = scanner.nextLine();

        flashcards.put(inputTerm, inputDef);

        System.out.println(flashcards);

    }
}
