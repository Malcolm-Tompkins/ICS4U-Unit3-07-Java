/*
* This program test vehicle class.
*
* @author  Malcolm Tompkins
* @version 1.0
* @since   2021-12-22
*/

/**
 * Main.
 */
final class Main {
    /**
    * Constant.
    */
    public static final int ONE_THOUSAND = 1000;

    /**
     * Prevent instantiation
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        final Bike bmx = new Bike("Red", FOURTY);

        System.out.println("Created Bmx bike.\nStatus:\n");
        bmx.status();

        System.out.println("\nAccelerating 1000 units...");
        bmx.accelerate(ONE_THOUSAND);
        bmx.status();

        System.out.println("\nRing bell:");
        bmx.ringBell();

        final Truck bigTruck = new Truck("Grey", 200, "HGC-3456F");

        System.out.println("Created a Truck.\nStatus:\n");
        bigTruck.status();

        System.out.println("\nAccelerating 1000 units..");
        bigTruck.accelerate(ONE_THOUSAND);

        bigTruck.status();
        System.out.println("\nDone.");
    }
}
