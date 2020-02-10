package lv.javaguru.homework;

//ieliec atbilstošā package
class Circle { //klasei nepiciešams vards public priekšā

    double radius1; //mainīgajam trūkst private
    public double getRadius1() {
        return radius1;
    }

    //šeit pietiktu tik ar vienu radiusu, jo rinķim tak ir tikai viens raduius
    double radius2; //mainīgajam trūkst private
    public double getRadius2() {
        return radius2;
    }

    public void setRadius1(double radius1) {
        this.radius1 = radius1;
    }

    public void setRadius2(double radius2) {
        this.radius2 = radius2;
    }

//lieka atstarpe
    //šeit aprēķinā varēja izmantot vienu un to pašu mainīgo
    //return 3.14 * radius * radius;
    double calculateArea() {
        return 3.14 * radius1 * radius2;
    }

}
