package thinkinginjava.chapter03.exercise04;

class Speed {

    static final String METER = "m";
    static final String KILOMETER = "km";
    static final String SECOND = "s";
    static final String HOUR = "h";

    static void calc(int distance, String distanceUnit, int time, String timeUnit) {
        float speed;

        System.out.println(distance + distanceUnit + " in " + time + timeUnit + " =");
        float seconds;
        float meters;

        // Convert to meters
        if (distanceUnit.equals(KILOMETER)) {
            meters = distance * 1000;
        } else {
            meters = distance;
        }

        // Convert to seconds
        if (timeUnit.equals(HOUR)) {
            seconds = time * 3600;
        } else {
            seconds = time;
        }

        speed = meters / seconds;

        System.out.println("     = " + speed + " m/s");

        System.out.println("     = " + speed / 1000 + " km/s");

        System.out.println("     = " + speed * 3600 + " m/h");

        System.out.println("     = " + speed * 3.600f + " km/h");

        System.out.println();
    }

}
