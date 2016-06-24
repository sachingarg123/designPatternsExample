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

public class TemperatureClassAdaptor2 extends CelciusReporter implements TemperatureInfo
{

    @Override
    public double getTempInF()
    {
        // TODO Auto-generated method stub
        return cToF(tempInC);
    }

    @Override
    public void setTempInF(double parTempInF)
    {
        this.tempInC = fToC(parTempInF);

    }

    @Override
    public double getTempInC()
    {
        // TODO Auto-generated method stub
        return tempInC;
    }

    @Override
    public void setTempInC(double parTempInC)
    {
        this.tempInC = parTempInC;

    }

    private double fToC(double f)
    {
        return ((f - 32) * 5 / 9);
    }

    private double cToF(double c)
    {
        return ((c * 9 / 5) + 32);
    }

}
