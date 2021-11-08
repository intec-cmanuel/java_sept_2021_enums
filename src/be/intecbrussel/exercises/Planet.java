package be.intecbrussel.exercises;

public enum Planet {
    MERCURY(3.3 * Math.pow(10, 23), 5.6 * Math.pow(10,6)),
    VENUS(4.87 * Math.pow(10,24), 10.8 * Math.pow(10,6)),
    EARTH(5.98 * Math.pow(10,24), 14.9 * Math.pow(10,6)),
    MARS(6.42 * Math.pow(10,23), 22.7 * Math.pow(10,6)),
    JUPITER(1.8 * Math.pow(10,27), 77.8 * Math.pow(10,6)),
    SATURN(5.6 * Math.pow(10,26), 14.3 * Math.pow(10,7)),
    URANUS(8.6 * Math.pow(10,25), 28.7 * Math.pow(10,7)),
    NEPTUNE(10.2 * Math.pow(10,25), 44.9 * Math.pow(10,7)),
    PLUTO(1.309 * Math.pow(10,22), 5.9 * Math.pow(10,9)),
    INTEC(2.4 * Math.pow(10,15), 14.9 * Math.pow(10,6) - 20);

    private final double mass;
    private final double distanceSun;

    Planet(double mass, double distanceSun) {
        this.mass = mass;
        this.distanceSun = distanceSun;
    }

    public double getMass(){
        return mass;
    }

    public double getDistanceSun(){
        return distanceSun;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "mass=" + mass +
                ", distanceSun=" + distanceSun +
                "} " + super.toString();
    }
}
