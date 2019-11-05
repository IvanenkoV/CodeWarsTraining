import java.util.Arrays;

public class Dictionary {

    private final String[] words;

    public Dictionary(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String to) {

        int[] minimalActions = new int[words.length];
        int[] minimalActionsSorted = new int[words.length];
        String result = "";

        //  Array with minimal moves for each word to compare it with word for search
        for (int i = 0; i < words.length; i++) {
            minimalActions[i] = levenstain(words[i], to);
        }
        System.arraycopy(minimalActions, 0, minimalActionsSorted, 0, minimalActions.length);
        Arrays.sort(minimalActionsSorted);

        for (int i = 0; i < minimalActions.length; i++) {
            if (minimalActions[i] == minimalActionsSorted[0]) result = words[i];
        }

        return result;

        // Levenstain algorithm to find minimal changes between two strings to match them
    }

    public static int levenstain(String str1, String str2) {
        int[] Di_1 = new int[str2.length() + 1];
        int[] Di = new int[str2.length() + 1];

        for (int j = 0; j <= str2.length(); j++) {
            Di[j] = j; // (i == 0)
        }

        for (int i = 1; i <= str1.length(); i++) {
            System.arraycopy(Di, 0, Di_1, 0, Di_1.length);

            Di[0] = i; // (j == 0)
            for (int j = 1; j <= str2.length(); j++) {
                int cost = (str1.charAt(i - 1) != str2.charAt(j - 1)) ? 1 : 0;
                Di[j] = min(
                        Di_1[j] + 1,
                        Di[j - 1] + 1,
                        Di_1[j - 1] + cost
                );
            }
        }

        return Di[Di.length - 1];
    }

    private static int min(int n1, int n2, int n3) {
        return Math.min(Math.min(n1, n2), n3);
    }
}