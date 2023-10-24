package org.example;

import java.util.Scanner;

public class Broswer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main.PersonalAddressBook addressBook = new Main.PersonalAddressBook();

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add contact");
            System.out.println("2. Update contact");
            System.out.println("3. Delete contact");
            System.out.println("4. Display contacts");
            System.out.println("5. Exit");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (option) {
                case 1:
                    System.out.println("Enter contact name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter contact address:");
                    String address = scanner.nextLine();
                    System.out.println("Enter contact phone number:");
                    String phoneNumber = scanner.nextLine();
                    Main.Contact newContact = new Main.Contact(name, address, phoneNumber);
                    addressBook.addContact(newContact);
                    break;
                case 2:
                    System.out.println("Enter contact name to update:");
                    String contactName = scanner.nextLine();
                    System.out.println("Enter updated contact address:");
                    String updatedAddress = scanner.nextLine();
                    System.out.println("Enter updated contact phone number:");
                    String updatedPhoneNumber = scanner.nextLine();
                    Main.Contact updatedContact = new Main.Contact(contactName, updatedAddress, updatedPhoneNumber);
                    addressBook.updateContact(contactName, updatedContact);
                    break;
                case 3:
                    System.out.println("Enter contact name to delete:");
                    String deleteName = scanner.nextLine();
                    addressBook.deleteContact(deleteName);
                    break;
                case 4:
                    addressBook.displayContacts();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
