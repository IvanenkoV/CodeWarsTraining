public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        char[] string1 = str1.toCharArray();
        char[] string2 = str2.toCharArray();
        int counter = 0;
        for (int i = 0; i < string2.length; i++) {

            for (int j = 0; j < string1.length; j++) {

                if (string2[i] == string1[j]) {
                    counter++;
                    string1[j] = '0';
                    break;
                }
            }
        }

        if (string2.length - counter == 0) return true;
        else return false;
    }
}