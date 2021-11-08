package be.intecbrussel.exercises;

public enum Day {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private boolean weekDay;

    Day(boolean weekDay) {
        this.weekDay = weekDay;
    }

    public boolean isWeekDay() {
        return weekDay;
    }

    @Override
    public String toString() {
        return "Day{" +
                "weekDay=" + weekDay +
                "} ";
    }
}
