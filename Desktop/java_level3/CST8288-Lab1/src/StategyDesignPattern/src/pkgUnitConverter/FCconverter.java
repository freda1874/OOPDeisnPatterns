/*Student Name: Lei Luo 
Student Number:041068533
SCourse & Section #: 23S_CST8288_031
Declaration:This is my own original work and is free from Plagiarism.
*/
package pkgUnitConverter;
/**
 * class to convert Fahrenheit to Celsius
 * @author Lei Luo
 * @version 2.0
 * @see UnitConverter
 * @since 1.0
 * 
 */
public class FCconverter implements Units{
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
	
	/**
	 * @param fahrenheit value in Fahrenheit to be converted
	 * @return equivalent in Celsius
	 */
        @Override
	public double convert(double fahrenheit) {
		return (fahrenheit - convOrigin)/convFactor;
	}
}
