
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        int incrementToday = birdsPerDay[birdsPerDay.length-1] ++;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) if (birds == 0) return true;

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int nDaysTotal = 0;

        if (numberOfDays >= birdsPerDay.length) {
            for (int i = 0; i < birdsPerDay.length; i++) {
                nDaysTotal += birdsPerDay[i];
            }
        } else {
            for (int i = 0; i < numberOfDays; i++) {
                nDaysTotal += birdsPerDay[i];
            }
        }
        return nDaysTotal;
    }

    public int getBusyDays() {
        int totalBusyDays = 0;
        for(int i = 0; i < birdsPerDay.length; i++){
            if(birdsPerDay[i] >= 5) totalBusyDays++;
        }
        return totalBusyDays;
    }
}
