package thinkinginjava.chapter05.exercise21_22;

/*
 * Chapter 5. Exercise 21. Difficult - 1/10.
 *
 * Create an enum of the least-valuable six types of paper currency.
 * Loop through the values( ) and print each value and its ordinal( ).
 */

/*
 * Chapter 5. Exercise 22. Difficult - 2/10.
 *
 * Write a switch statement for the enum in the previous example. For each case,
 * output a description of that particular currency.
 */

public class Main {

    enum currency {EUR, USD, GBP, RUB, CNY, JPY}

    public static void main(String[] args) {

        for (currency c : currency.values()) {
            System.out.println(c.toString() + " - ordinal " + c.ordinal());
            System.out.println(description(c));
            System.out.println();
        }
    }

    private static String description(currency c) {
        String description;

        switch (c) {
            case EUR:
                description = "Euro";
                break;
            case USD:
                description = "United States dollar";
                break;
            case GBP:
                description = "Pound sterling";
                break;
            case RUB:
                description = "Russian ruble";
                break;
            case CNY:
                description = "Chinese yuan";
                break;
            case JPY:
                description = "Japanese yen";
                break;
            default:
                description = "";
        }
        return description;
    }
}

/* Out:
 *
 * EUR - ordinal 0
 * Euro
 *
 * USD - ordinal 1
 * United States dollar
 *
 * GBP - ordinal 2
 * Pound sterling
 *
 * RUB - ordinal 3
 * Russian ruble
 *
 * CNY - ordinal 4
 * Chinese yuan
 *
 * JPY - ordinal 5
 * Japanese yen
 *
 */
