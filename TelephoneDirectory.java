import java.util.*;

public class TelephoneDirectory {
    private Map<String, Set<String>> telephoneDirectory;


    public TelephoneDirectory() {
        this.telephoneDirectory = new HashMap<>();
    }
    public void add(String surmane, String number){
        if (telephoneDirectory.containsKey(surmane)){
            telephoneDirectory.get(surmane).add(number);
        } else {
            Set<String> numbers = new HashSet<>();
            numbers.add(number);
            telephoneDirectory.put(surmane,numbers);
        }
    }

    public Set<String> get(String surname){

        return telephoneDirectory.get(surname);
    }


}
