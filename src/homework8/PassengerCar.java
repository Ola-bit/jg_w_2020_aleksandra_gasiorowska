package homework8;

import java.util.Objects;

//use "ctrl + alt + l"
public class PassengerCar extends Machine {

    protected int amount;
    public String color;

    public PassengerCar( String brand, int speed, int price, int amount, String color) { //"color" is not set to a field
        super(brand, speed, price);
        this.amount = amount;

    }

    public void changeAmount(int amount){
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "amount=" + amount +
                ", color='" + color + '\'' +
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
        PassengerCar that = (PassengerCar) o;
        return amount == that.amount &&
                Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), amount, color);
    }
}
