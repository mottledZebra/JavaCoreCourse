import java.util.Arrays;
import java.util.HashMap;

public class Words {
    public static void main(String[] args) {
        String[] strings = {"раз", "два", "три", "четыре", "раз", "два", "раз", "четыре", "два", "три"};

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String string : strings) {
            int n = hashMap.getOrDefault(string, 0);
            hashMap.put(string, ++n);
        }

        System.out.println("Массив " + Arrays.toString(strings));
        System.out.println("Встречаемость уникальных слов в массиве: " + hashMap);
    }
}
