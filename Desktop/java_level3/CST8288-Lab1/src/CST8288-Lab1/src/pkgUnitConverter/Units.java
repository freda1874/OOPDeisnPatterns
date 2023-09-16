
/*Student Name: Lei Luo 
Student Number:041068533
SCourse & Section #: 23S_CST8288_031
Declaration:This is my own original work and is free from Plagiarism.
 */
package pkgUnitConverter;

/**
 * The Units interface defines the contract for unit conversion classes. Classes
 * implementing this interface should provide an implementation for the
 * {@code convert} method to perform a specific unit conversion.
 *
 * @author Lei Luo
 * @version 2.0
 * @see UnitConverter
 * @since 1.0
 */
public interface Units {
    /**
     *  Converts the given number based on the specific conversion algorithm. 
     * 
     * @param num The number to be converted. * 
     * @return The converted number as per the specific unit conversion.
     */
    double convert(double num);
}
