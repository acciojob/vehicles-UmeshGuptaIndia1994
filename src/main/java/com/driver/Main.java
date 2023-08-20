/* By Umesh Gupta */

public class Main {
    public static void main(String[] args) {
        // Example usage

        Car car = new Car("Toyota", 1);
        car.changeSpeed(60, 45);
        System.out.println("Car Name: " + car.name);
        System.out.println("Current Speed: " + car.currentSpeed);
        System.out.println("Current Gear: " + car.currentGear);

        F1 f1 = new F1("Mercedes", 1);
        f1.accelerate(120);
        System.out.println("F1 Name: " + f1.name);
        System.out.println("Current Speed: " + f1.currentSpeed);
        System.out.println("Current Gear: " + f1.currentGear);

        Boat boat = new Boat("Speedy", 10);
        System.out.println("Boat Name: " + boat.getVehicleName());
        System.out.println("Boat Capacity: " + boat.getVehicleCapacity());
    }
}
