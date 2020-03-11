package homework7;

import java.util.Random;

public class ArrayService {

    public int[] create( int size ) {
        return new int[size];
    }


    public void fillArrayWithRandomNumbers( int[] array ) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }

    public void printArrayToConsole( int[] array ) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
        System.out.println();
    }


    public int sum( int[] array ) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = +array[i];
        }
        return sum;
    }

};




