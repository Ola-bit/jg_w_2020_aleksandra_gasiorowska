package Homework_6;

public class NumberService {
    public int sumInRange( int number1, int number2 ) {

        int i, sum = 0;

        if (number1 < number2) {
            for (i = number1; i <= number2; i++) {
                sum = sum + i;
            }
            return sum;
        } else if (number1 > number2) {
            for (i = number1; i >= number2; i--) {
                sum = sum + i;
            }
            return sum;
        } else {
            for (i = number1; i == number2; i++) {
                sum = number1;
            }
            return sum;
        }
    }

    public int getEvenNumberCount( int number1, int number2 ) {

        int i, even = 0;

        if (number1 < number2) {
            for (i = number1; i <= number2; i++) {
                if (i % 2 == 1)
                    continue;
                even++;
            }
            return even;

        } else if (number1 > number2) {
            for (i = number1; i >= number2; i--) {
                if (i % 2 == 1)
                    continue;
                even++;
            }
            return even;
        } else if (number1 == number2){
            for (i = number1; i == number2; i++) {
                if (i % 2 == 0)
                even = 1;
            }
            return even;

        } else {
        for (i = number1; i == number2; i++) {
//            if (i % 2 == 1)
                even = 0;
        }
        return even;
    }


    }
};


