public class ExperimentalRemoteControlCar implements RemoteControlCar {
    int units;

    public void drive() {
        units += 20;
    }

    public int getDistanceTravelled() {
        return units;
    }
}
