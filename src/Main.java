import java.util.HashMap;
import java.util.Map;

public class Main {

    public static String setText() {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String textLowerCase = text.toLowerCase();
        return textLowerCase.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        char[] letters = setText().toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < letters.length; i++) {
            char symbol = setText().charAt(i);
            if (!map.containsKey(symbol)) {
                map.put(symbol, 1);
            } else {
                int value = map.get(symbol);
                value++;
                map.put(symbol, value);
            }
        }
        int maxValue = -1;
        int minValue = Integer.MAX_VALUE;

        for (int value : map.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
            if (value < minValue) {
                minValue = value;
            }
        }
        for (Map.Entry<Character, Integer> kv : map.entrySet()) {
            if (kv.getValue() == maxValue) {
                System.out.println("В данном тексте буква " + kv.getKey() + " используется чаще всего. Она встретилась нам " + kv.getValue() + " раз.");
            }
            if (kv.getValue() == minValue) {
                System.out.println("В данном тексте буква " + kv.getKey() + " используется реже всего. Она встретилась нам " + kv.getValue() + " раз.");
            }
        }
    }
}
