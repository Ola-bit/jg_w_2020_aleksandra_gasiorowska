package homework7;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

//If you choose to demonstrate usage, then use main method
//If you use JUnit, then please write proper unit cases
class ArrayServiceTest {

    private ArrayService service;

    @BeforeEach
    void setUp() {
        service = new ArrayService();
    }

    @Test
    void newArray() {
        ArrayService array1 = new ArrayService();
        array1.create(10);
        int [] createdArray = new int [10];
        System.out.println(Arrays.toString(createdArray));

        array1.fillArrayWithRandomNumbers(createdArray);
        System.out.println(Arrays.toString(createdArray));

        array1.printArrayToConsole(createdArray);

        array1.sum(createdArray);
        System.out.println(Arrays.toString(createdArray));

    }

    //Sum does not work properly, please check
    @Test
    void shouldSumUpAllArrayElements() {
        int[] array = {10, 20, 30};
        assertEquals(60, service.sum(array));
    }
}


