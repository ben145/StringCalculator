package StringCalculator;

/**
 * Created by Ben on 1/29/2018.
 */
public class StringCalculatorImpl implements StringCalculator {

    @Override
    public int Add(String numbers) {
        if (numbers.length() < 1)
            return 0;
        boolean justOne = true;
        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) == ',' || numbers.charAt(i) == '\n')
                justOne = false;
        }
        if (justOne)
            return Integer.parseInt(numbers);
        else {
            int commaIndex = -1;
            int sum = 0;
            for (int i = 0; i < numbers.length(); i++) {
                if (numbers.charAt(i) == ',' || numbers.charAt(i) == '\n') {
                    sum += Integer.parseInt(numbers.substring(commaIndex + 1, i));
                    commaIndex = i;
                }
                else if (i == numbers.length() - 1)
                    sum += Integer.parseInt(numbers.substring(commaIndex + 1, numbers.length()));
            }
            return sum;
        }
    }
}