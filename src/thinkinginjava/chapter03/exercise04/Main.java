package thinkinginjava.chapter03.exercise04;

/*
 * Chapter 3. Exercise 4. Difficult - 2/10.
 *
 * Write a program that calculates velocity using a constant distance and a constant time.
 */


public class Main {

    public static void main(String[] args) {

        Speed.calc(60, Speed.KILOMETER, 12, Speed.HOUR);
            /* Out:
             *
             * 60km in 12h =
             *      = 1.3888888 m/s
             *      = 0.0013888888 km/s
             *      = 5000.0 m/h
             *      = 4.9999995 km/h
             */

        Speed.calc(30, Speed.KILOMETER, 2, Speed.SECOND);
            /* Out:
             *
             * 30km in 2s =
             *      = 15000.0 m/s
             *      = 15.0 km/s
             *      = 5.4E7 m/h
             *      = 54000.0 km/h
             */

        Speed.calc(100, Speed.METER, 25, Speed.SECOND);
            /* Out:
             *
             * 100m in 25s =
             *      = 4.0 m/s
             *      = 0.004 km/s
             *      = 14400.0 m/h
             *      = 14.4 km/h
             */

        Speed.calc(10, Speed.METER, 1, Speed.SECOND);
            /* Out:
             *
             * 10m in 1s =
             *      = 10.0 m/s
             *      = 0.01 km/s
             *      = 36000.0 m/h
             *      = 36.0 km/h
             */
    }
}
