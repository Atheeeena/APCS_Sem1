class StepTracker {
    private int active;
    private double avg;
    private int totalSteps;
    private int minActive;
    private int daysRecorded;
    public StepTracker(int a) {
        active = 0;
        avg = 0.0;
        totalSteps = 0;
        minActive = a;
    }
    
    public int activeDays() {
        return active;
    }
    public double averageSteps() {
        avg = totalSteps/daysRecorded;
        return avg;
    }
    public void addDailySteps(int b) {
        totalSteps += b;
        daysRecorded++;
        if (b >=  minActive) {
            active++;
        }
    }
}