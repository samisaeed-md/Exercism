public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double carsPerHour = speed * 221;
        double successRate = 0;

        if (speed >= 5 && speed <= 8) {
            successRate += 0.9;
        } else if (speed == 9) {
            successRate += 0.8;
        } else if (speed == 10) {
            successRate += 0.77;
        } else {
            successRate += 1;
        }
        return carsPerHour * successRate;
    }

    public int workingItemsPerMinute(int speed) {
        double successRate = 0;

        if (speed >= 5 && speed <= 8) {
            successRate += 0.9;
        } else if (speed == 9) {
            successRate += 0.8;
        } else if (speed == 10) {
            successRate += 0.77;
        } else {
            successRate += 1;
        }
        return (int)((double) (speed * 221) / 60 * successRate);
    }
}
