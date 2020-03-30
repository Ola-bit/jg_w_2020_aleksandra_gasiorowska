package homework8;

import java.util.Objects;

//use "ctrl + alt + l"
public class TruckCar extends Machine {

    protected double height;

    public TruckCar( String brand, int speed, int price, double height ) {
        super(brand, speed, price);
        this.height = height;
    }

    public void changeHeight(double height){
        this.height = height;
    }

    @Override
    public String toString() {
        return "TruckCar{" +
                "height=" + height +
                ", brand='" + brand + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TruckCar truckCar = (TruckCar) o;
        return Double.compare(truckCar.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }
}
