package homework8;


import java.util.Objects;

//Ok
//use "ctrl + alt + l"
public class Bus extends Machine {

    protected String color;

    public Bus( String brand, int speed, int price, String color) {
        super(brand, speed, price);
    }

    public void changeColor(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "color='" + color + '\'' +
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
        Bus bus = (Bus) o;
        return Objects.equals(color, bus.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }
}
