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
package DesignPatterns.mediatorPattern;

public class MediatorPatternClient
{
    public static void main(String arg[])
    {

        Mediator mediator = new Mediator();
        Buyer swBuyer = new SwedishBuyer(mediator, "krona");
        Buyer frBuyer = new FrenchBuyer(mediator, "euros");
        AmericanSeller americanSeller = new AmericanSeller(mediator, 100);
        DollarConverter dollarConverter = new DollarConverter(mediator);
        if (swBuyer.attempToBid(250f))
        {
            System.out.println("Got the deal by Swedish Team");
        }
        else if (frBuyer.attempToBid(100f))
        {
            System.out.println("Got the deal by french Team");
        }

    }
}
