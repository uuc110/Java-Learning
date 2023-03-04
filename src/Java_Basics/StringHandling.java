// Created by Sourabh Kushwah Batch-> IT-2 on 03-03-2023.
// Question-> Consider the following list of countries and their capitals.
/* india -> Delhi
 * Japan -> Tokyo
 * Ital -> Rome
 * England -> London
 * Russia -> Moscow
 * France -> Paris
 * Create an interactive program that will accept the name of a Country as input and display te corresponding
 * Capital and vice versa. Design the program so that it execute repeatedly until the word 'Quit" is entered as input
 */


package Java_Basics;

import java.util.Scanner;

public class StringHandling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String Country;
        while (true) {
            Country = in.nextLine();
            if (Country.equalsIgnoreCase("quit")) {
                break;
            } else {
                switch (Country) {
                    case "India" -> System.out.println(" -> Delhi");
                    case "Japan" -> System.out.println(" -> Tokyo");
                    case "Italy" -> System.out.println(" -> England");
                    case "Russia" -> System.out.println(" -> Moscow");
                    case "France" -> System.out.println(" -> Paris");
                    default -> System.out.println("Note: First Letter should be capital.");
                }
            }
        }
    }
}
