public class Kata
{
    public static int TripleDouble(long num1, long num2) {

        String number1 = String.valueOf(num1);
        String number2 = String.valueOf(num2);

        for (int i = 2; i < number1.length(); i++){
            if (number1.charAt(i) == number1.charAt(i - 2) &&  number1.charAt(i-1) == number1.charAt(i) ) {
                for   (int j = 1; j < number2.length(); j++){
                    if (number2.charAt(j) == number2.charAt(j - 1) && number2.charAt(j) == number1.charAt(i))
                        return 1;
                }
            }
        }
        return 0;
    }
}