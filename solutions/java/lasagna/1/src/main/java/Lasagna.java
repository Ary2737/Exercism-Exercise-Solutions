public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public static int expectedMinutesInOven() {
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public static int remainingMinutesInOven(int timeInOven) {
        int totalOvenTime = expectedMinutesInOven();
        int remainingTime = totalOvenTime - timeInOven;

        return remainingTime;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public static int preparationTimeInMinutes(int numOfLayers) {
        int preparationTime = numOfLayers * 2;
        return preparationTime;
    }
    // TODO: define the 'totalTimeInMinutes()' method
   public static int totalTimeInMinutes(int layers, int min) {
        return preparationTimeInMinutes(layers) + min;
    }
}
