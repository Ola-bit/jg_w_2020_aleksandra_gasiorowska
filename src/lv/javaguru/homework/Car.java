package lv.javaguru.homework;

import java.awt.Color;

//klase veidojam tā, lai lauki(mainīgie) būtu definēti visi viens zem otra kā piermie un tad tikai visas metodes
public class Car {

    //laukam ir jābūt inkapsulētam - private
    String color;
    public String getColor() {
        return color;
    }

    //laukam ir jābūt inkapsulētam - private
    String brand;
    public String getBrand() {
        return brand;
    }

    //laukam ir jābūt inkapsulētam - private
    int year;
    public int getYear() {
        return year;
    }
//lieka atsarpe

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

}; //nav nepieciešams ";"
