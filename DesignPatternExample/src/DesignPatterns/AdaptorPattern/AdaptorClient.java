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
package DesignPatterns.AdaptorPattern;

public class AdaptorClient
{

    public static void main(String arg[])
    {

        //First ways of implementing Adaptor using Composition
        double tempInC = 37;
        double tempInF = 105;
        TempClassAdaptor temp1 = new TempClassAdaptor();

        temp1.setTempInC(tempInC);
        System.out.println(temp1.getTempInC());
        temp1.setTempInF(tempInF);
        System.out.println(temp1.getTempInF());
        System.out.println(temp1.getTempInC());

        //Second ways of implementing Adaptor using interface
        TemperatureClassAdaptor2 tempAdaptor = new TemperatureClassAdaptor2();
        tempAdaptor.setTempInC(tempInC);
        System.out.println(tempAdaptor.getTempInC());
        tempAdaptor.setTempInF(tempInF);
        System.out.println(tempAdaptor.getTempInF());
        System.out.println(tempAdaptor.getTempInC());

    }
}
