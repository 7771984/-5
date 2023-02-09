// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.List;

public class Задание_1 {
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook("Романов");
        findInPhoneBook("Никифоров");
        findInPhoneBook("Алексеев");
    }

    public static void addInPhoneBook() {
        phoneBook.put("Романов", List.of("+7(905)158-22-35", "+7(841)324-48-78"));
        phoneBook.put("Никифоров", List.of("+7(910)748-77-89", "+7(456)123-54-98"));
        phoneBook.put("Алексеев",List.of("+7(486)485-25-63", "+7(477)486-25-96"));

    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}