package modul.modul3.Antarmuka.percobaan5;

interface Hockey extends Sports{
    public void homeGoalScored(int points);
    public void visitingGoalScored(int points);
    public void endOfPeriod(int period);
    public void overtimePeriod(int ot);
}
