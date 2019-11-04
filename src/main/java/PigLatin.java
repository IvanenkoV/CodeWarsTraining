import java.util.Arrays;

public class PigLatin {
    public static String pigIt(String str) {
        // Write code here
        System.out.println(str);
        String resultString = "";
        String[] stringArray = str.split(" ");;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].startsWith("!"))   {resultString += stringArray[i]; continue;}
            if (stringArray[i] != "[^\\s\\w]")
                stringArray[i] = stringArray[i].substring(1) + stringArray[i].charAt(0) + "ay ";
            System.out.println(stringArray[i]);

            resultString += stringArray[i];
            if (i == stringArray.length -1) resultString = resultString.substring(0, resultString.length() -1);
        }
        System.out.println(Arrays.toString(stringArray));
        System.out.println(resultString);

        return resultString;
    }
}
//stringArray[i] != "." && stringArray[i] != "," && stringArray[i] != "!" && stringArray[i] != "-"
//        && stringArray[i] != "[" && stringArray[i] != "]" && stringArray[i] != "{" && stringArray[i] != "}" &&