package homework7;

import java.util.Random;

public class ArrayService {

    public int[] create( int size ) {
        return new int[size];
    }


    public void fillArrayWithRandomNumbers( int[] array ) {
        Random random = new Random(); //as Random object is reusable, it could be moved to service class as a field.
        // So it  will be initialized only once, when ArraysService object is created
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }

    public void printArrayToConsole( int[] array ) {
        for (int i = 0; i < array.length; i++) { // use for-each loop - avoid this old construction
            System.out.print(array[i] + " | ");
        }
        System.out.println();
    }


    //this method have bug, please fix it
    public int sum( int[] array ) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = +array[i];
        }
        return sum;
    }
};
