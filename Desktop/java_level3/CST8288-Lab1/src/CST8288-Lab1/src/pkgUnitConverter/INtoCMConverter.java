/*Student Name: Lei Luo 
Student Number:041068533
SCourse & Section #: 23S_CST8288_031
Declaration:This is my own original work and is free from Plagiarism.
 */
package pkgUnitConverter;

/**
 * The CMtoINConverter class implements the Units interface to provide a
 * strategy for converting centimeters to inches.
 *
 * @author freda
 *
 */
public class INtoCMConverter implements Units {

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
    public double convert(double in) {
        return in * convFactor;
    }
}
