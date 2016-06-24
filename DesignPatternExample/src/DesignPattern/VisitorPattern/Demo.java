//**********************************************************************
// Copyright (c) 2016 Telefonaktiebolaget LM Ericsson, Sweden.
// All rights reserved.
// The Copyright to the computer program(s) herein is the property of
// Telefonaktiebolaget LM Ericsson, Sweden.
// The program(s) may be used and/or copied with the written permission
// from Telefonaktiebolaget LM Ericsson or in accordance with the terms
// and conditions stipulated in the agreement/contract under which the
// program(s) have been supplied.
// **********************************************************************
package DesignPattern.VisitorPattern;

public class Demo
{

    public static void main(String arg[])
    {
        TwoElement two1 = new TwoElement(3, 3);
        TwoElement two2 = new TwoElement(2, 7);
        ThreeElement three1 = new ThreeElement(3, 4, 5);

        NumberVisitor sumVisitor = new SumVisitor();
        two1.accept(sumVisitor);
        two2.accept(sumVisitor);
        three1.accept(sumVisitor);

        TotalSumVisitor totalSumVisitor = new TotalSumVisitor();
        two1.accept(totalSumVisitor);
        two2.accept(totalSumVisitor);
        three1.accept(totalSumVisitor);
        System.out.println("Total Sum is" + totalSumVisitor.getTotalSum());
    }

}
