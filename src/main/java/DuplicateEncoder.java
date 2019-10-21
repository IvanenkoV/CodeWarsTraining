import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
    static String encode(String word) {

        String strLower = word.toLowerCase();
        char[] arr = strLower.toCharArray();
        String buffer = new String(strLower);

        // In map will be saved symbols and boolean statement true if there are more then 1 such symbol in the string
        Map<String, Boolean> howManyMap = new HashMap<>();

        // Filling the map
        for (int i = 0; i < buffer.length(); ) {

            if (buffer.indexOf(buffer.charAt(i), i + 1) != -1) {
                howManyMap.put(String.valueOf(buffer.charAt(i)), true);
            } else {
                howManyMap.put(String.valueOf(buffer.charAt(i)), false);
            }
            buffer = buffer.replace(String.valueOf(buffer.charAt(i)), "");
        }
        // Forming of an array with answer
        for (int i = 0; i < arr.length; i++) {
            if (howManyMap.get(String.valueOf(arr[i]))) {
                arr[i] = ')';
            } else arr[i] = '(';
        }
        String result = new String(arr);
        return result;
    }
}
