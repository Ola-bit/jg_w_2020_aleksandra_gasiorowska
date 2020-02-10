package lv.javaguru.homework;

import java.util.Random;

//Ok, tik ieliec atbilstošā package
public class RandomNumbersServiceTest {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int generateValue = randomGenerator.nextInt(101);
        int generateValue2 = randomGenerator.nextInt(101);
        int generateValue3 = randomGenerator.nextInt(101);

        System.out.println(generateValue);
        System.out.println(generateValue2);
        System.out.println(generateValue3);

        //summu lābāk saglabāt atsevišķā mainīgajā un tad to izvadīt
        //tā programma kļūst vieglāk lasāma
        System.out.println(generateValue + generateValue2 + generateValue3);
    }
}
