package lv.javaguru.homework;

class Circle {

    double radius1;
    public double getRadius1() {
        return radius1;
    }

    double radius2;
    public double getRadius2() {
        return radius2;
    }

    public void setRadius1(double radius1) {
        this.radius1 = radius1;
    }

    public void setRadius2(double radius2) {
        this.radius2 = radius2;
    }


    double calculateArea() {
        return 3.14 * radius1 * radius2;
    }

}
