
class F1 extends Car {
    public F1(String name, int currentGear) {
        super(name, currentGear);
    }

    public void accelerate(double rate) {
        currentSpeed += rate;
        if (currentSpeed > 200) {
            changeGear(2); // Example logic for changing gear
        }
    }
}
