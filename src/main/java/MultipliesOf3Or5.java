public class MultipliesOf3Or5 {
    public int solution(int number) {
        int amount3 = (number - 1) / 3;
        int amount5 = (number - 1) / 5;
        int amount15 = (number - 1) / 15;

        int sum3 = 0, sum5 = 0, sum15 = 0, result = 0;

        for (int i = 0; i < amount3; i++) {
            sum3 += 3;
            result += sum3;
        }
        for (int i = 0; i < amount5; i++) {
            sum5 += 5;
            result += sum5;
        }
        for (int i = 0; i < amount15; i++) {
            sum15 += 15;
            result -= sum15;
        }
        return result;
    }
}
