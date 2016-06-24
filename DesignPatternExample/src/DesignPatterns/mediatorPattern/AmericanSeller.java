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

public class AmericanSeller
{
    Mediator mediator;
    float priceInDollars;

    public AmericanSeller(Mediator mediator, float priceInDollars)
    {
        this.mediator = mediator;
        this.priceInDollars = priceInDollars;
        this.mediator.registerAmericaSeller(this);
    }

    public boolean isBidAccepted(float dollars)
    {
        if (dollars >= priceInDollars)
        {
            System.out.println("Seller accepts the bid of " + dollars + " dollars\n");
            return true;
        }
        else
        {
            System.out.println("Seller rejects the bid of " + dollars + " dollars\n");
            return false;
        }
    }
}
