package homework8;

import java.util.Objects;

//Ok
public class Machine {
    protected String brand;
    protected int speed;
    protected int price;

    public Machine (String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;

    }

    public void accelerate(){
        this.speed++;

    }

    public void decelerate(){
        this.speed--;
    }

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Machine machine = (Machine) o;
        return speed == machine.speed &&
                price == machine.price &&
                Objects.equals(brand, machine.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, speed, price);
    }

    @Override
    public String toString() {
        return "Machine{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +'\'' +
                ", price=" + price +
                '}';

    }

}
