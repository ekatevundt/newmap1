import java.util.HashMap;
import java.util.Map;

public class Main {
    public static final String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
            " Ut enim ad minim veniam, quis nostrud exercitation ullamco " +
            "laboris nisi ut aliquip ex ea commodo consequat. " +
            "Duis aute irure dolor in reprehenderit in voluptate velit esse " +
            "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, " +
            "sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> newMap = new HashMap<>();
        for (int i = 0; i < lorem.length(); i++) {
            if (Character.isLetter(lorem.charAt(i))) {
                char tmp = lorem.charAt(i);
                if (!newMap.containsKey(tmp)) {
                    newMap.put(tmp, 1);

                } else {
                    int number = newMap.get(tmp);
                    number++;
                    newMap.put(tmp, number);
                }

            }
        }
        System.out.println(newMap);
        int maxNum = 0;
        int minNum = 2;
        for (int j : newMap.values()) {
            if (j > maxNum)
                maxNum = j;
        }
        for (int t : newMap.values()) {
            if (t < minNum)
                minNum = t;
        }
        System.out.println("Maximum value is: " + maxNum + " Minimum value is: " + minNum);

    }

}