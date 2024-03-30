package Map;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZhazMap<Integer, String> map = new ZhazMap<>();

        int choice;
        int key;
        String value;

        System.out.println("Instructions:");
        System.out.println("1 - Add a key-value pair. Provide a key (an Integer value) and a value (a String value).\n\tExample: 1 101 hamburger\n\tNote: Please enter single-word strings only.");
        System.out.println("2 - Get the value for a specific key. Provide the key (an Integer value).\n\tExample: 2 101");
        System.out.println("3 - Remove the value for a specific key. Provide the key (an Integer value).\n\tExample: 3 101");
        System.out.println("4 - Display the contents of the data structure.");
        System.out.println("5 - Exit the program.");

        while(true) {
            System.out.print("\nWhat action would you like to perform?\n");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if(choice == 5) {
                break;
            }

            switch (choice) {
                case 1:
                    key = scanner.nextInt();
                    value = scanner.nextLine();
                    map.put(key, value);
                    break;
                case 2:
                    key = scanner.nextInt();
                    if(map.get(key) == null) {
                        System.out.println("Value: " + map.get(key));
                    } else {
                        // This part assumes that values are Strings XD
                        System.out.println("Value: " + map.get(key).substring(1));
                    }
                    break;

                case 3:
                    key = scanner.nextInt();
                    if(map.get(key) == null) {
                        System.out.println("Value: " + map.remove(key));
                    } else {
                        System.out.println("Removed: " + map.remove(key).substring(1));
                    }
                    break;

                case 4:
                    map.print();
                    break;
                default: System.out.println("Error: The input is not among the available choices!");
            }
        }
    }
}
