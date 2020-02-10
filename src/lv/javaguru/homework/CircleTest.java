package lv.javaguru.homework;

public class CircleTest {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius1(10.0);
        circle.setRadius2(3.0);

//        Double radius1 = circle.getRadius1();
//        Double radius2 = circle.getRadius2();

        System.out.println(circle.calculateArea());

    }
}