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
package DesignPatterns.BridgePattern;

public class RedCircle implements DrawAPI
{

    @Override
    public void drawCircle(int parRadius, int parX, int parY)
    {
        System.out.println("Red Circle with details : radius " + parRadius + " , : x =  " + parX + " , : y = " + parY);

    }
}
