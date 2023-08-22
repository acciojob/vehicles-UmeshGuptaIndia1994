/* By Umesh Gupta */


class Car extends Vehicle {
    int currentGear;

    public Car(String name, int currentGear) {
        super(name);
        this.currentGear = currentGear;
    }

    public void changeGear(int newGear) {
        currentGear = newGear;
    }

    public void changeSpeed(double newSpeed, double newDirection) {
        move(newSpeed, newDirection);
    }
}
