/* By Umesh Gupta */

interface WaterVehicle {
    String getVehicleName();
    int getVehicleCapacity();
}

class Vehicle {
    String name;
    double currentSpeed;
    double currentDirection;

    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void move(double speed, double direction) {
        currentSpeed = speed;
        currentDirection = direction;
    }

    public void steer(double direction) {
        currentDirection += direction;
    }

    public void stop() {
        currentSpeed = 0;
    }
}
