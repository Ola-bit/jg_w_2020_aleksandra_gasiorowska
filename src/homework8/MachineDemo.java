package homework8;

public class MachineDemo {

    public static void main( String[] args ) {
        Machine machine = new Machine("Alfa Romeo", 80, 100);
        Bus bus = new Bus("Solaris", 120, 100, null);
        bus.changeColor("Blue");
        PassengerCar passengerCar = new PassengerCar("Alfa Romeo", 80, 100, 20, null);
        passengerCar.color = "Blue";
        TruckCar truckCar = new TruckCar("FIAT", 80, 150, 3.5);

        //use braces
        if (bus.speed < 100) bus.accelerate();
        else bus.decelerate();

        //use braces
        if (machine.speed > 20) machine.accelerate();
        else machine.decelerate();

        System.out.println(machine);
        System.out.println(bus);
        System.out.println(passengerCar);
        System.out.println(truckCar);

        System.out.println(machine.brand.equals(passengerCar.brand));
        System.out.println(bus.color.equals(passengerCar.color));

        //Try to create to cars, which will be equals

//do not leave commented code
//        Machine[] myMachines = {bus, passengerCar, truckCar};
//
//        for(Machine Machine: myMachines) {
//            System.out.println(machine);
//        }

    }}
