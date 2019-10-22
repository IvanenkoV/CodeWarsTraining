import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> buffer = new ArrayList<>();
        int count;

        for (int i = 0; i < elements.length; i++) {
            count = Collections.frequency(buffer, elements[i]);
            if (count < maxOccurrences) {
                buffer.add(elements[i]);
            }
        }

        int[] result = new int[buffer.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = buffer.get(i).intValue();
        }



        return result;
    }
}
