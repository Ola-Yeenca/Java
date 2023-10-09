import java.util.Scanner;

public class Loops {
    public static void  main (String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        String input = "";
        // implementing for loops
        for (i = 1; i < 5; i++) {
            System.out.println("Loop counter: " + i);
        }
        // while loops
        while (!input.equals("quit")) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("quit")) {
                break;
            }
            System.out.println(input);
        }
        // do-while loops
        do {
            System.out.print("Input: ");
            input = scanner.next().toUpperCase();
            System.out.println(input);
        } while (!input.equalsIgnoreCase("quit"));
        // break and continue statement in a loop
        while (true) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("jump"))
                continue;
            if (input.equals("quit")) {
                break;
            }
            System.out.println(input);
        }
        // for-each loop
        String[] names = {"Ola Yinka", "Sori", "Pablo", "Luiz", "Vivi", "Daniela"};
        for (int j = 0; j < 6; j++) {
            System.out.println(names[j]);
        }
        for (String name : names
             ) {
            System.out.println(name);
        }
    }
}
