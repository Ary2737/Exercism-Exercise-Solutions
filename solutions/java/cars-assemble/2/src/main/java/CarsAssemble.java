public class CarsAssemble {

    // Variable to specify cars produced at slowest speed
    private static final int DEFAULT_CARS_PRODUCED = 221;

    public double productionRatePerHour(int speed) {

        if(speed == 0) return 0.0;

        // First get the sucess rate of assembly speed
        double successRate = getSpeedSuccessRate(speed);

        // Answer = (221 * speed) * getSpeedSuccessRate(speed)

        return (DEFAULT_CARS_PRODUCED * speed) * successRate;

    }

    public int workingItemsPerMinute(int speed) {
        // Get the no. of cars produced per hour
        double carsProducedPerHour = productionRatePerHour(speed);

        // Explicit cast from double to int
        return (int) carsProducedPerHour/60;

    }

    /**
     * Gets the successful production rate from the assembly speed
     * @param speed int assembly speed from 1-10
     * @return double between 0.0-1.0 representing % of successful production
     */

    public double getSpeedSuccessRate(double speed) {

        double sucessRate = 0.0;

        // First check if speed is between 1-10
        if(speed >= 1 && speed <= 10) {
            if (speed <= 4) {
                sucessRate = 1;
            } else if (speed <= 8) {
                sucessRate = 0.9;
            } else if (speed == 9) {
                sucessRate = 0.8;
            } else {
                sucessRate = 0.77;
            }
        }

        return sucessRate;

    }
}
