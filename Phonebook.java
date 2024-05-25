import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class Phonebook {
    private HashMap<User, ArrayList<Long>> phonebook;

    
    public Phonebook(HashMap<User, ArrayList<Long>> phonebook){
        this.phonebook = phonebook;
    }


    public void addPhone(User name, ArrayList<Long> phoneNum){
        phonebook.put(name, phoneNum);
    }
    

    public ArrayList<User> printAll(){
        ArrayList<User> array = new ArrayList<>();
        for (User user : phonebook.keySet()) {
            array.add(user); 
        }
        Collections.sort(array);

        return array;
    }


    public void removePhone(User name, Long phoneNum){
        int index = phonebook.get(name).indexOf(phoneNum);
        ArrayList<Long> array = new ArrayList<>();
        array = phonebook.get(name);
        array.remove(index);
        phonebook.put(name, array);

    }


    public ArrayList<ArrayList<Long>> getAllPhone(){
        ArrayList<ArrayList<Long>> array = new ArrayList<>(phonebook.values());
        return array;
    }


}

