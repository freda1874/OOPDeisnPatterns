/*Student Name: Lei Luo 
Student Number:041068533
SCourse & Section #: 23S_CST8288_031
Declaration:This is my own original work and is free from Plagiarism.
 */
package pkgUnitConverter;

/**
 * The CMtoINConverter class implements the Units interface to provide a
 * strategy for converting centimeters to inches.
 * <p>
 * The conversion from centimeters to inches is done by dividing the length
 * value by 2.54.
 *
 * @author Lei Luo
 * @version 2.0
 * @see Units
 * @since 1.0  *
 */
public class CMtoINConverter implements Units {

    /**
     * The conversion factor for converting centimeters to inches.
     */
    private final double convFactor = 2.54;

    /**
     * Converts the given number from centimeters to inches.
     *
     * @param cm The length in centimeters.
     * @return The equivalent length in inches.
     */
    @Override
    public double convert(double cm) {
        return cm / convFactor;
    }
}
