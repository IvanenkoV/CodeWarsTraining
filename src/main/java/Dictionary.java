import java.util.Arrays;

public class Dictionary {

    private final String[] words;

    public Dictionary(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String to) {

        System.out.println(Arrays.toString(words));
        System.out.println(to);

        int [] arraySimilarity = new int[words.length];
        int  similarity;
        for (int i = 0; i < words.length; i ++){
             similarity = 0;
            String separateWord = words[i];
            for (int j = 0;  j < to.length(); j ++){

                for (int k = 0; k < separateWord.length(); ){


                    if (to.charAt(j) == separateWord.charAt(k))
                    {
                        similarity++;
                        separateWord = separateWord.replaceFirst(String.valueOf( separateWord.charAt(k)), "");
                        break;
                    }
                    k ++;
                }

            }
            arraySimilarity[i] = similarity;
        }
        System.out.println(Arrays.toString(arraySimilarity));


        return null;
    }
}