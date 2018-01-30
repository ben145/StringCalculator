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
            if (numbers.charAt(i) == ',')
                justOne = false;
        }
        if (justOne)
            return Integer.parseInt(numbers);
        else {
            int commaIndex = 0;
            for (int i = 0; i < numbers.length(); i++) {
                if (numbers.charAt(i) == ',')
                    commaIndex = i;
            }
            int s1 = Integer.parseInt(numbers.substring(0, commaIndex));
            int s2 = Integer.parseInt(numbers.substring(commaIndex+1, numbers.length()));
            return s1 + s2;
        }
    }
}