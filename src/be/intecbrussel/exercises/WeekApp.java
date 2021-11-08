package be.intecbrussel.exercises;

public class WeekApp {
    public static void main(String[] args) {

        Day[] listOfDays = Day.values();
        for (Day d : listOfDays) {
            System.out.println("name: " + d.name());
            System.out.println("ordinal: " + d.ordinal());
            System.out.println(d);
        }

    }
}
