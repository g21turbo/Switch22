
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("value is 1 \n");
        } else if (value == 2) {
            System.out.println("value is 2 \n");
        } else {
            System.out.println("was not 1 or 2 \n");
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String action = scanner.nextLine();
        switch (action) {
            case "az" -> System.out.println("You chose az \n");
            case "b" -> System.out.println("You chose b \n");
            case "c" -> System.out.println("You chose c \n");
            case "d" -> System.out.println("You chose d \n");
            case "e" -> System.out.println("You chose e \n");
            case "f" -> System.out.println("You chose f \n");
            case "g", "h", "i", "j" -> {
                System.out.println("You chose g, h, i, or j \n");
                System.out.println("The letter is: " + action +"\n");
            }
            default -> System.out.println("Chosen character not listed\n");
        }


        String month  = "OCTOBER";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter\n");

        char alpha  = 'e';
        System.out.println(alpha + " in NATO code is " + getNatoAlpha(alpha));
    }



    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> "bad";
        };
    }


    public static String getNatoAlpha(char character) {
        return switch (character) {
            case 'A' -> "Alpha";
            case 'B' -> "Bravo";
            case 'C' -> "Charlie";
            case 'D' -> "Delta";
            case 'E' -> "Echo";
            default -> "bad";
        };
    }
}
