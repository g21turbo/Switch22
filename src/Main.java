
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("value is 1 \n");
        } else if (value == 2) {
            System.out.println("value is 2 \n");
        }else {
            System.out.println("was not 1 or 2 \n");
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String action = scanner.nextLine();
        switch (action) {
            case "az" -> System.out.println("You chose az");
            case "b" -> System.out.println("You chose b");
            case "c" -> System.out.println("You chose c");
            case "d" -> System.out.println("You chose d");
            case "e" -> System.out.println("You chose e");
            case "f" -> System.out.println("You chose f");
            case "g", "h", "i", "j" -> {
                System.out.println("You chose g, h, i, or j");
                System.out.println("The letter is: " + action);
            }
            default -> System.out.println("Chosen character not listed");
        }
    }
}
