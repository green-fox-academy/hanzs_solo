package week_02.ExpressionsAndControlFlow.Variables;

import java.text.DecimalFormat;

public class BMI {
  public static void main(String[] args) {

    double massInKg = 81.2;
    double heightInM = 1.78;

    // Print the Body mass index (BMI) based on these values

    double bmiFormula = massInKg / Math.pow(heightInM, 2);

    System.out.println(bmiFormula);


    // -----------

    //Rounding to two decimals
    DecimalFormat df = new DecimalFormat("###.##");

    System.out.println(df.format(bmiFormula));

  }
}
