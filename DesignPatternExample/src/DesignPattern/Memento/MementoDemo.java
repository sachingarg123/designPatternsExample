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
package DesignPattern.Memento;

public class MementoDemo
{
    public static void main(String arg[])
    {
        // caretaker
        DietInfoCareTaker dietInfoCaretaker = new DietInfoCareTaker();

        // originator
        DietInfo dietInfo = new DietInfo("Fred", 1, 100);
        System.out.println(dietInfo);

        System.out.println("Saving state.");
        dietInfoCaretaker.saveState(dietInfo);

        dietInfo.setDayNumberAndWeight(3, 98);
        System.out.println(dietInfo);

        System.out.println("Restoring saved state.");
        dietInfoCaretaker.restoreState(dietInfo);
        System.out.println(dietInfo);
    }
}
