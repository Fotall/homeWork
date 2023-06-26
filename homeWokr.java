import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

        /** Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре
 будут повторяющиеся имена с разными телефонами, их необходимо считать,
  как одного человека с разными телефонами. Вывод должен быть отсортирован
   по убыванию числа телефонов. */

public class homeWokr {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        addPhone(map, "ivan", "123");
        addPhone(map, "ivan", "345");
        addPhone(map, "Yana", "666");
        System.out.println(map);
    }
    private static void addPhone(HashMap<String, ArrayList<String>> map, String name, String phone) {
        map.putIfAbsent(name, new ArrayList<>());
        map.get(name).add(phone);
        }   
}
