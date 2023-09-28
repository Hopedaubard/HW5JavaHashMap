package HWPackage;

//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре
//повторяющиеся имена с разными телефонами, их необходимо
//считать, как одного человека с разными телефонами.
//Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

        while (hashMap.size() < 3) {
            System.out.println("Введите имя абонента (либо q для выхода): ");
            String name = sc.nextLine();
            if (name.equals("q")){
                System.out.println(hashMap);
                break;
            }
            else {
                ArrayList<String> numbers = new ArrayList<>();
                System.out.println("Введите номер абонента: ");
                String number = sc.nextLine();
                if (hashMap.containsKey(name)) {
//                    numbers.clear();
                    numbers = hashMap.get(name);
                    for (int i = 0; i < hashMap.get(name).size(); i++) {
                        if (numbers.get(i).equals(number)) {
                            System.out.println("Этот номер уже существует!");
                            break;
                        }
                        else {
                            numbers.add(number);
                            hashMap.put(name, numbers);
//                    hashMap.merge(name, number, (o, n) -> o + " " + n);
                        }
                    }
                }
                else {
//                    numbers.clear();
//                    numbers = hashMap.get(name);
                    numbers.add(number);
                    hashMap.put(name, numbers);
                }
            }
            System.out.println(hashMap);
//            hashMap.forEach();
            ArrayList<String> result = new ArrayList<>();
//            result =

            System.out.println(hashMap);

        }
    }
}
