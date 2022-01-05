/*
* This program is a Bike class.
*
* @author  Malcolm Tompkins
* @version 1.0
* @since   2021-12-28
*/

/**
 * Bike.
 */
public class Bike extends Vehicle {
    /**
    * Cadense variable.
    */
    private int cadence;

    /**
    * Constructor.
    *
    * @param initialColour colour
    * @param topSpeed speed
    */
    public Bike(final String initialColour, final int topSpeed) {
        super(initialColour, topSpeed);
        this.cadence = 0;
    }

    /**
    * Getter.
    *
    * @return good
    */
    public int getCadence() {
        return this.cadence;
    }

    /**
    * Setter.
    *
    * @param newCadence good
    */
    public void setCadence(final int newCadence) {
        this.cadence = newCadence;
        super.setSpeed(cadence);
        if (super.getSpeed() > super.getMaxSpeed()) {
            super.setSpeed(super.getMaxSpeed());
        }
    }

    /**
    * Print all.
    */
    public void status() {
        super.status();
        System.out.println("Cadence: " + this.cadence);
    }

    /**
    * Ring bell.
    */
    public void ringBell() {
        System.out.println("\nDing, ding.\n");
    }
}
