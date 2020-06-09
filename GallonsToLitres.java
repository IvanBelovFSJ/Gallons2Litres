import java.text.DecimalFormat;
import java.util.Scanner;     // use Scanner class for console input 
 
public class GallonsToLitres
{
  
static final double GAL2LT = 3.78541;   // conversion factor: 1 gall ~= 3.78541 liter  
// Source for decimal formatting:
// https://mkyong.com/java/java-display-double-in-2-decimal-points
private static DecimalFormat decimalHelper = new DecimalFormat("#.##");

public static void main (String[] args)     

{         
  @SuppressWarnings("resource")
Scanner scan = new Scanner (System.in);   // attach to System.in        
  double inputGallons = 0.0;    // hold gallons value provided by user         
  double resultLitres = 0.0;    // hold calculated liters value
  
  System.out.println ("Enter Gallons to converter:");
  
  inputGallons = scan.nextDouble();        // get gallons from user                  
  
  resultLitres = inputGallons * GAL2LT;    // conversion formula
  
  System.out.print   ("Converted: " + inputGallons + " gal" + " = ");
  
  System.out.println (decimalHelper.format(resultLitres) + " litre(s)");    // display result
  System.out.println ("\nThe app has closed.");
}// end of main() 
}// end of class