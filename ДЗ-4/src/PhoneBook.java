import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<String> lastNames;
    private ArrayList<Integer> phoneNumbers;

    public PhoneBook() {
        lastNames = new ArrayList<>();
        phoneNumbers = new ArrayList<>();
    }

    public void add(String lastName, Integer phoneNumber) {
        lastNames.add(lastName);
        phoneNumbers.add(phoneNumber);
    }

    public ArrayList<Integer> get(String lastName) {
        ArrayList<Integer> rez = new ArrayList<>();
        for (int i = 0; i < lastNames.size(); i++) {
            if (lastNames.get(i).equals(lastName)) rez.add(phoneNumbers.get(i));
        }
        return rez;
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", 12345);
        phoneBook.add("Петров", 23456);
        phoneBook.add("Иванов", 34567);
        phoneBook.add("Сидоров", 45678);

        System.out.println("Результат поиска номеров телефона по фамилии \"Иванов\": " + phoneBook.get("Иванов"));
    }
}
