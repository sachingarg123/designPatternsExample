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

public class TempClassAdaptor implements TemperatureInfo
{

    CelciusReporter celciusReporter;

    public TempClassAdaptor()
    {
        celciusReporter = new CelciusReporter();
    }

    @Override
    public double getTempInF()
    {
        // TODO Auto-generated method stub
        return cToF(celciusReporter.getTemperature());
    }

    @Override
    public void setTempInF(double parTempInF)
    {
        celciusReporter.setTemperature(fToC(parTempInF));

    }

    @Override
    public double getTempInC()
    {
        // TODO Auto-generated method stub
        return celciusReporter.getTemperature();
    }

    @Override
    public void setTempInC(double parTempInC)
    {
        celciusReporter.setTemperature(parTempInC);

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
