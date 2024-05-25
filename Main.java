import java.util.ArrayList;
import java.util.HashMap;



public class Main {

    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook(new HashMap<>());

        User Anna = new User("Anna", new ArrayList<>());
        User Bob = new User("Bob", new ArrayList<>());
        User Robert = new User("Robert", new ArrayList<>());

        Anna.addNumbers(111L);
        Anna.addNumbers(222L);
        Anna.addNumbers(888L);
        Anna.addNumbers(999L);
        Anna.addNumbers(100L);

        Bob.addNumbers(333L);

        Robert.addNumbers(444L);
        Robert.addNumbers(555L);
        Robert.addNumbers(666L);
        Robert.addNumbers(777L);

        phonebook.addPhone(Anna, Anna.getNumbers());
        phonebook.addPhone(Bob, Bob.getNumbers());
        phonebook.addPhone(Robert, Robert.getNumbers());

        phonebook.removePhone(Robert, 666L);

        System.out.println(phonebook.printAll());

    }
}