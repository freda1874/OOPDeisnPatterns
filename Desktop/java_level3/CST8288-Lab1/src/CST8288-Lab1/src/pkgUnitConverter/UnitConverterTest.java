/*Student Name: Lei Luo 
Student Number:041068533
SCourse & Section #: 23S_CST8288_031
Declaration:This is my own original work and is free from Plagiarism.
 */
package pkgUnitConverter;

/**
 * simple class to test 2 classes for converting Fahrenheit to Celsius and the
 * reverse
 *
 * @author Lei Luo
 * @version 2.0
 * @see Units
 * @since 1.0
 */
public class UnitConverterTest {

    /**
     * starting ponit of the program
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        UnitConverter uc = new UnitConverter();
        System.out.println(uc.convertUnit(15.2));

        FCconverter FtoC = new FCconverter();
        uc.setUnit(FtoC);
        System.out.printf("%5.2f in Fahrenheit is %5.2f Celsius\n", 70.0, uc.convertUnit(70.0));

        CFconverter CtoF = new CFconverter();
        uc.setUnit(CtoF);
        System.out.printf("%5.2f in Celsius is %5.2f Fahrenheit\n", 20.0, uc.convertUnit(20.0));

        CMtoINConverter cmtoIN = new CMtoINConverter();
        uc.setUnit(cmtoIN);
        System.out.printf("%5.2f in Centimeters is %5.2f inches \n", 100.0, uc.convertUnit(100.0));

        INtoCMConverter intoCM = new INtoCMConverter();
        uc.setUnit(intoCM);
        System.out.printf("%5.2f in inches is %5.2f Centimeters \n", 100.0, uc.convertUnit(100.0));

    }

}
