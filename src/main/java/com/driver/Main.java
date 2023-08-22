/* By Umesh Gupta */

public class Main {
    public static void main(String[] args) {
        // Example usage
        Car car = new Car("Toyota", 1);
        car.changeSpeed(60, 45);
        
        F1 f1 = new F1("Ferrari", 1);
        f1.accelerate(50);

        Boat boat = new Boat("SpeedBoat", 4);
        String boatName = boat.getVehicleName();
        int boatCapacity = boat.getVehicleCapacity();
        
        System.out.println("Boat Name: " + boatName);
        System.out.println("Boat Capacity: " + boatCapacity);
    }
}
