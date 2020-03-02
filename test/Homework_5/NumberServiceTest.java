package Homework_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberServiceTest {

    public static void main(String[] args){
        NumberService main = new NumberService();
        System.out.println("rangeSum 20: " + main.sumInRange(20,20));
        System.out.println("rangeSum 9-2: " + main.sumInRange(9,2));
        System.out.println("rangeSum 30-50: " + main.sumInRange(30,50));
        System.out.println("getEvenNumberCount 2-22: " + main.getEvenNumberCount(2,22));
        System.out.println("getEvenNumberCount 3: " + main.getEvenNumberCount(3,3));
        System.out.println("getEvenNumberCount 14: " + main.getEvenNumberCount(14,14));
        System.out.println("getEvenNumberCount 13-3: " + main.getEvenNumberCount(13,3));
    }

}