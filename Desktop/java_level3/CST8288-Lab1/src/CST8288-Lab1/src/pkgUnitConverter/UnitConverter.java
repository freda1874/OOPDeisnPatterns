/*Student Name: Lei Luo 
Student Number:041068533
SCourse & Section #: 23S_CST8288_031
Declaration:This is my own original work and is free from Plagiarism.
*/

package pkgUnitConverter;


/**The UnitConverter class serves as a context for performing unit conversions.
 * It allows clients to set different strategies for conversion by changing the
 * underlying {@code Units} implementation.
 * 
 * @author Lei Luo
 * @version 2.0
 * @see Units
 * @since 1.0
 */
public class UnitConverter {
/** type of units  
 */
    private Units newUnit;
     
    /**
     * Default constructor initializes the converter with CFconverter strategy.
     */
     public UnitConverter() {
        newUnit = new CFconverter();
    }
    

    /**
     * Converts the given number based on the current unit conversion strategy.
     * 
     * @param num The number to be converted.
     * @return The converted number as per the current unit conversion strategy.
     */
    public double convertUnit(double num) {
     return   newUnit.convert(num);
         
    }

    ;
   
     /**
     * Sets a new strategy for unit conversion.
     * 
     * @param unit The new unit conversion strategy.
     */
    public void setUnit(Units unit) {
        newUnit = unit;
    }

;
}
