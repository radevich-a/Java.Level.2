import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> list = createArrayWord();
        System.out.println(list);

        Set<String> uniqueArray = new HashSet<>(list);
        System.out.println(uniqueArray);

        countDouble(list);

        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.add("Ivanov","88001000101");
        telephoneDirectory.add("Ivanov", "88001009090");

        telephoneDirectory.get("Ivanov");


    }

    public static void countDouble(List<String> list){
            HashMap<String, Integer> hashMap = new HashMap<>();
            int count = 0;
            for (String i : list){
                if (hashMap.get(i) == null) {
                    count = 1;
                    hashMap.put(i, count);
                } else {
                    hashMap.put(i, count+1);
                }
            }
            System.out.println(hashMap);
        }


    public static List<String> createArrayWord(){
        List <String> arrayWord = new ArrayList<>();
        arrayWord.add("computer");
        arrayWord.add("laptop");
        arrayWord.add("internet");
        arrayWord.add("internet");
        arrayWord.add("java");
        arrayWord.add("computer");
        arrayWord.add("class");
        arrayWord.add("true");
        arrayWord.add("string");
        arrayWord.add("laptop");

        return arrayWord;
    }
}
