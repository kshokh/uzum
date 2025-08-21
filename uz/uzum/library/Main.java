package uz.uzum.library;

import java.util.Scanner;

/**
 * @author Shohjahon
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manage manage = new Manage();

        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. All Books");
            System.out.println("3. Get Book by ID");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            switch (scanner.nextLine()) {
                case "1" -> {
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Author: ");
                    String author = scanner.nextLine();
                    manage.add(title, author);
                }
                case "2" -> manage.list();
                case "3" -> {
                    int id = Integer.parseInt(scanner.nextLine());
                    manage.get(id);
                }
                case "4" -> {
                    int id = Integer.parseInt(scanner.nextLine());
                    manage.delete(id);
                }
                case "5" -> {
                    return;
                }
                default -> System.out.println("Invalid");
            }
        }
    }
}
