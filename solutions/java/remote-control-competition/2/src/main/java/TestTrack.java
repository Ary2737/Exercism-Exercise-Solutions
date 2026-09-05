import java.util.Collections;
import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        if(car instanceof RemoteControlCar) car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        Collections.sort(cars);
        return cars;
    }
}
