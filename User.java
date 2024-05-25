import java.util.ArrayList;


public class User implements Comparable<User>{
    private String name;
    private ArrayList<Long> numbers;

    
    public User(String name, ArrayList<Long> numbers){
        this.name = name;
        this.numbers = numbers;
    }


    public String getName(){
        return name;
    }


    public ArrayList<Long> getNumbers(){
        return numbers;
    }


    public void setNumbers(ArrayList<Long> numbers){
        this.numbers = numbers;
    }


    public void addNumbers(Long number){
        ArrayList<Long> array = new ArrayList<>();
        array = getNumbers();
        array.add(number);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name == user.name;
    }


    @Override
    public int hashCode() {
        return name.hashCode();
    }


    @Override
    public int compareTo(User o) {
        return this.getNumbers().size() - o.getNumbers().size();
    }


    @Override
    public String toString() {
        return name + " : " + numbers;
    }

    
}
