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

public class Mediator
{
    SwedishBuyer swBuyer;
    FrenchBuyer frBuyer;
    AmericanSeller americanSeller;
    DollarConverter dollarConverter;

    public Mediator()
    {

    }

    public void registerSwedishBuyer(SwedishBuyer swBuyer)
    {
        this.swBuyer = swBuyer;
    }

    public void registerFrenchBuyer(FrenchBuyer frBuyer)
    {
        this.frBuyer = frBuyer;
    }

    public void registerAmericaSeller(AmericanSeller americanSeller)
    {
        this.americanSeller = americanSeller;
    }

    public void registerDollarConverter(DollarConverter dollarConverter)
    {
        this.dollarConverter = dollarConverter;
    }

    public boolean placeToBid(float bid, String unitOfCurrency)
    {
        float dollars = dollarConverter.convertCurrencyToDollars(bid, unitOfCurrency);
        return americanSeller.isBidAccepted(dollars);
    }
}
