import java.util.regex.Pattern;

public class PigLatin {
    public static String pigIt(String str) {

        String resultString = "";
        String[] stringArray = str.split(" ");
        ;
        for (int i = 0; i < stringArray.length; i++) {

            // if punctuation
            if (Pattern.matches("\\p{Punct}", stringArray[i])) {
                resultString += stringArray[i] + " ";
                continue;
            } else stringArray[i] = stringArray[i].substring(1) + stringArray[i].charAt(0) + "ay ";

            resultString += stringArray[i];

        }
        resultString = resultString.substring(0, resultString.length() - 1);
        return resultString;
    }
}
