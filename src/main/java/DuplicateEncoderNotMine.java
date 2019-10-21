//import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateEncoderNotMine {

        private static final String inputString = "Success";
        public static String encode(String inputString) {
            return calculateNumberofChars(inputString);
        }
        private static String calculateNumberofChars(String inputString) {
            String uncapitalize = StringUtils.uncapitalize(inputString);
            Map<Character, Integer> map = new LinkedHashMap<>();
            char[] chars = uncapitalize.toCharArray();
            for (char ch : chars) {
                map.put(ch, StringUtils.countMatches(uncapitalize,String.valueOf(ch)));
            }
            System.out.println(map.toString());
            String output ="";
            for(char value: chars){
                if(map.get(value)==1){
                    output=output+"(";
                }else {
                    output=output+")";
                }
            }
            System.out.println(output);
            return output;
        }
    }
