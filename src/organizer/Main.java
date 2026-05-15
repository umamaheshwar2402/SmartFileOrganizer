package organizer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Smart File Organizer ====");

        System.out.print("Enter folder path: ");

        String path = scanner.nextLine();

        FileOrganizer organizer = new FileOrganizer();

        organizer.organize(path);

        scanner.close();
    }
}