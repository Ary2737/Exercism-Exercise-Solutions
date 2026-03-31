public class JedliksToyCar {

    // Instance variables representing battery percentage + distance
    private int batteryPercentage = 100;
    private int distance = 0;

    // Contant to determine distance drain 
    private static final int DISTANCE_PER_DRIVE = 20;

    public static JedliksToyCar buy() {return new JedliksToyCar();}

    public String distanceDisplay() {
        if(distance == 0) {
            return "Driven 0 meters";
        } else {
            return "Driven " + distance + " meters";
        }
    }

    public String batteryDisplay() {
        if(batteryPercentage == 0) {
            return "Battery empty";
        } else {
            return "Battery at " + batteryPercentage + "%";
        }
    }

    public void drive() {
        // If the battery % is 0, don't update battery nor distance
        if(batteryPercentage > 0) {
            distance += DISTANCE_PER_DRIVE;
            batteryPercentage -= 1;
        }

    }
}
