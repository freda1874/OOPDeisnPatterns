/*Student Name: Lei Luo 
Student Number:041068533
SCourse & Section #: 23S_CST8288_031
Declaration:This is my own original work and is free from Plagiarism.
 */
package pkgUnitConverter;

/**
 * CFconverter is a class that provides functionality to convert temperatures
 * from Celsius to Fahrenheit.
 *
 * @author Lei Luo
 * @version 2.0
 * @see UnitConverter
 * @see Units
 * @since 1.0
 */
public class CFconverter implements Units {

    /**
     * * Conversion factor for converting Celsius to Fahrenheit.
     */
    private final double convFactor = 1.8;
    /**
     * * Conversion origin for converting Celsius to Fahrenheit.
     */
    private final double convOrigin = 32.0;

    /**
     * Converts a given temperature from Celsius to Fahrenheit.
     *
     * @param celsius The temperature in Celsius to be converted.
     *
     * @return The equivalent temperature in Fahrenheit.
     */
    @Override
    public double convert(double celsius) {
        return celsius * convFactor + convOrigin;
    }
}
