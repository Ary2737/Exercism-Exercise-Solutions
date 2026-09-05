

class ProductionRemoteControlCar implements RemoteControlCar,Comparable<ProductionRemoteControlCar> {

    int distanceTravelled;
    int numberOfVictories;

    @Override
    public void drive() {
        distanceTravelled += 10;
    }

    @Override
    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
          return this.numberOfVictories - numberOfVictories;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }
}
