/*
* This program is a Vehicle class.
*
* @author  Malcolm Tompkins
* @version 1.0
* @since   2021-01-02
*/

/**
 * Vehicle.
 */
public class Vehicle {
    /**
    * Speed variable.
    */
    private int speed;

    /**
    * MaxSpeed variable.
    */
    private int maxSpeed;

    /**
    * Colour variable.
    */
    private String colour;

    /**
    * Constructor.
    *
    * @param startColour colour
    * @param topSpeed speed
    */
    public Vehicle(final String startColour, final int topSpeed) {
        this.colour = startColour;
        this.maxSpeed = topSpeed;
        this.speed = 0;
    }

    /**
    * Getter.
    *
    * @return good
    */
    public int getSpeed() {
        return this.speed;
    }

    /**
    * Getter.
    *
    * @return good
    */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
    * Getter.
    *
    * @return good
    */
    public String getColour() {
        return this.colour;
    }

    /**
    * Setter.
    *
    * @param newSpeed good
    */
    public void setSpeed(final int newSpeed) {
        this.speed = newSpeed;
    }

    /**
    * Setter.
    *
    * @param newColour good
    */
    public void setColour(final String newColour) {
        this.colour = newColour;
    }

    /**
    * Print all.
    */
    public void status() {
        System.out.println("Speed: " + speed + "\nMaxSpeed: " + maxSpeed
                           + "\nColour: " + colour);
    }

    /**
    * Accelerate.
    *
    * @param unitsOfAccel number of units of acceleration
    */
    public void accelerate(final int unitsOfAccel) {
        this.speed += unitsOfAccel;
        if (this.speed > maxSpeed) {
            this.speed = maxSpeed;
        }
    }

    /**
    * Break.
    *
    * @param unitsOfDecel amount of units vehicle decelerates
    */
    public void breake(final int unitsOfDecel) {
        this.speed -= unitsOfDecel;
        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}
