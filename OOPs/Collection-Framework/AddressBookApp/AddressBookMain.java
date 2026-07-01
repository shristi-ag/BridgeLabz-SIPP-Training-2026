package AddressBookApp;

import java.util.*;

public class AddressBookMain {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> map = new HashMap<>();
    static HashSet<String> phones = new HashSet<>();

    public static void addContact(String name, String phone, String email) {

        if (phones.contains(phone)) {
            System.out.println("Duplicate Phone Number");
            return;
        }

        Contact c = new Contact(name, phone, email);

        contacts.add(c);
        map.put(name, c);
        phones.add(phone);
    }

    public static void search(String name) {

        Contact c = map.get(name);

        if (c != null)
            System.out.println(c.name + " " + c.phone + " " + c.email);
        else
            System.out.println("Contact Not Found");
    }

    public static void delete(String name) {

        Contact c = map.remove(name);

        if (c != null) {
            contacts.remove(c);
            phones.remove(c.phone);
            System.out.println("Deleted");
        }
    }

    public static void display() {

        Collections.sort(contacts, (a, b) -> a.name.compareToIgnoreCase(b.name));

        for (Contact c : contacts)
            System.out.println(c.name + " " + c.phone + " " + c.email);
    }

    public static void main(String[] args) {

        addContact("Shristi","9876543210","s@gmail.com");
        addContact("Aman","9999999999","a@gmail.com");

        search("Shristi");

        delete("Aman");

        display();
    }
}