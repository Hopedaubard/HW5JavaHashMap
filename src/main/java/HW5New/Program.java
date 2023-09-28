package HW5New;

import java.lang.reflect.Array;
import java.util.*;

public class Program {
    public static void main (String[] args) {
        Map<String, HashSet<Integer>> bookPhone = new HashMap<>();
        addPhoneNumber("Ivanov", 1237, bookPhone);
        addPhoneNumber("Ivanov", 1237, bookPhone);
        addPhoneNumber("Ivanov", 123444, bookPhone);
        addPhoneNumber("Ilyin", 17287897, bookPhone);
        addPhoneNumber("Ilyin", 14553346, bookPhone);
        addPhoneNumber("Petrov", 546585, bookPhone);
        addPhoneNumber("Sidorov", 8956477, bookPhone);
        addPhoneNumber("Sidorov", 89564772, bookPhone);
        addPhoneNumber("Ivanov", 12356233, bookPhone);
        addPhoneNumber("Petrov", 787897, bookPhone);
        addPhoneNumber("Petrov", 1787897, bookPhone);
        addPhoneNumber("Kotov", 564783, bookPhone);
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> hashContainsKeys = new ArrayList<>();
        hashContainsKeys.addAll(bookPhone.keySet());
        int max = 0;
        for (int i = 0; i < bookPhone.size(); i++) {
            max += bookPhone.get(hashContainsKeys.get(i)).size();
        }
//        System.out.println(max);
        int countAdds = 0;
        for (int j = 0; j < max; j++) {
            for (int i = 0; i < hashContainsKeys.size(); i++) {
                if (bookPhone.get(hashContainsKeys.get(i)).size() == max-countAdds){
                    result.add(hashContainsKeys.get(i) + Arrays.toString(new HashSet[]{bookPhone.get(hashContainsKeys.get(i))}));
                }
            }
            countAdds++;
        }
        printNumBook(bookPhone);
        System.out.println();
//        System.out.println(countAdds);
//        System.out.println(max);
//        System.out.println(result.size());
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
    public static void addPhoneNumber (String keyMap, int value, Map<String, HashSet<Integer>>map) {
        if (map.containsKey(keyMap)){
            map.get(keyMap).add(value);
        }
        else {
            HashSet<Integer> newArr = new HashSet<>();
            newArr.add(value);
            map.put(keyMap, newArr);
        }
    }
    public static void printNumBook (Map<String, HashSet<Integer>>map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
}

