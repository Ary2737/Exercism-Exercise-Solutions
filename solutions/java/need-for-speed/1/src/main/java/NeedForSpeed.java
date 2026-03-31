class NeedForSpeed {

    // Instance variables
    private int speed;
    private int batteryDrain;
    private int driveDistance;
    private int batteryPercentage;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;

        // Default every time new car is made
        driveDistance = 0;
        batteryPercentage = 100; 

    }

    public boolean batteryDrained() {
        return batteryPercentage < batteryDrain;
    }

    

    public int distanceDriven() {
        return driveDistance;
    }

    public void drive() {
        // Only run if the battery isn't 0% and greater than its drain
        if(!(batteryDrained()) && batteryPercentage >=  batteryDrain) {
            driveDistance += speed;
            batteryPercentage -= batteryDrain; // Decrement batteryPercentage by batteryDrain
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    // Getters
    public int getSpeed() { return speed;}
    public int getBatteryDrain() { return batteryDrain;}
    public int getBatteryPercentage() { return batteryPercentage;}



}

class RaceTrack {
    // Instance variable
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {

        // Get attributes of car object 
        int carSpeed = car.getSpeed();
        int carDrain = car.getBatteryDrain();
        

        // Get the maximum distance the car can drive on a full charge
        int maximumDistance = carSpeed * (100/carDrain);

        // See if it covers the track's distance
        return maximumDistance >= distance;
    }
}
