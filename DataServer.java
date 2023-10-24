package org.example;

import java.util.ArrayList;
import java.util.List;

public class DataServer {
    static class Contact {
        private String name;
        private String address;
        private String phoneNumber;

        public Contact(String name, String address, String phoneNumber) {
            this.name = name;
            this.address = address;
            this.phoneNumber = phoneNumber;
        }

        // Getters and setters

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }

    static class PersonalAddressBook {
        private List<Main.Contact> contacts;

        public PersonalAddressBook() {
            contacts = new ArrayList<>();
        }

        public void addContact(Main.Contact contact) {
            contacts.add(contact);
            System.out.println("Contact added: " + contact.getName());
        }

        public void updateContact(String name, Main.Contact updatedContact) {
            for (int i = 0; i < contacts.size(); i++) {
                if (contacts.get(i).getName().equalsIgnoreCase(name)) {
                    contacts.set(i, updatedContact);
                    System.out.println("Contact updated: " + updatedContact.getName());
                    return;
                }
            }
            System.out.println("Contact not found: " + name);
        }

        public void deleteContact(String name) {
            for (int i = 0; i < contacts.size(); i++) {
                if (contacts.get(i).getName().equalsIgnoreCase(name)) {
                    Main.Contact deletedContact = contacts.remove(i);
                    System.out.println("Contact deleted: " + deletedContact.getName());
                    return;
                }
            }
            System.out.println("Contact not found: " + name);
        }

        public void displayContacts() {
            System.out.println("Contacts in Address Book:");
            for (Main.Contact contact : contacts) {
                System.out.println(contact.getName() + " | " + contact.getAddress() + " | " + contact.getPhoneNumber());
            }
        }
    }
}
