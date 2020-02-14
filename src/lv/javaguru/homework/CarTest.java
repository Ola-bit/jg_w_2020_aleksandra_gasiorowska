package lv.javaguru.homework;

//Ok
public class CarTest {

    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("White");
        car.setBrand("Tesla");
        car.setYear(2018);

        System.out.println(car.color +" " + car.brand +" " + "produced in " + car.year);

    }
};


