public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double base = speed * 221;

        if (speed < 5) {
            return base;
        }
        if (speed < 9) {
            return 0.9 * base;
        }
        if (speed < 10) {
            return 0.8 * base;
        }
        return 0.77 * base;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed) / 60.0);
    }
}
