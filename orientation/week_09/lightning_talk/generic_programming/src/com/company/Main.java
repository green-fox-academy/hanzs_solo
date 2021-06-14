package com.company;

import com.company.generics.NumberWizard;
import com.company.generics.VariablePrinter;
import com.company.normal.DoublePrinter;
import com.company.normal.IntegerPrinter;

public class Main {

    public static void main(String[] args) {
        Integer num1 = 5;
        Double num2 = 3.2;
        String text = "adsfgsdag";

        VariablePrinter<Double, String> variablePrinter = new VariablePrinter<>(num2, text);
        variablePrinter.print();

        NumberWizard<Integer> numberWizard = new NumberWizard<>(num1);
        numberWizard.multiplyByTwo();
    }
}
