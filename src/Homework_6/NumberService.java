package Homework_6;

public class NumberService {
    public int sumInRange( int number1, int number2 ) {

        int i, sum = 0;

        //this could be shortened, no need to repeat
        //if you move loop in a separate method abd pass parameters for calculation
        //then you can cal the same method just swaping those two numbers depending on that which is bigger
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
            //just return one of "number1"
            //no need for loop
            for (i = number1; i == number2; i++) {
                sum = number1;
            }
            return sum;
        }
    }

    public int getEvenNumberCount( int number1, int number2 ) {

        int i, even = 0;

        //this could be shortened, no need to repeat
        //if you move loop in a separate method abd pass parameters for calculation
        //then you can cal the same method just swaping those two numbers depending on that which is bigger
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
            //change this to "else", this way you can eliminate last return statement
        } else if (number1 == number2){
            //here loop is not needed
            //as you shoul return only:
//            return number1 % 2 == 0;
            for (i = number1; i == number2; i++) {
                if (i % 2 == 0)
                even = 1;
            }
            return even;

            //this part logicaly is not possible
        } else {
        for (i = number1; i == number2; i++) {
//            if (i % 2 == 1)
                even = 0;
        }
        return even;
    }


    }
};


