
package HomeWork13;

import java.util.*;


public class Result {

    public static void main(String[] args) {

        System.out.println("Задание 2: Телефонный справочник");

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "123-456");
        phoneBook.add("Петров", "987-654");
        phoneBook.add("Сидоров", "555-555");
        phoneBook.add("Иванов", "111-111");
        phoneBook.add("Сидоров", "222-222");

        System.out.println("Телефон Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Телефон Сидорова: " + phoneBook.get("Сидоров"));
        System.out.println("Телефон Петрова: " + phoneBook.get("Петров"));
        System.out.println("Телефон Николаева: " + phoneBook.get("Николаев"));
    }
}
