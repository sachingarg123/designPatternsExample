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
package DesignPattern.ChainOfResp;

public abstract class AbstractLogger
{
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    //next element in chain or responsibility
    protected AbstractLogger nextLogger;

    abstract protected void write(String message);

    public void setNextLogger(AbstractLogger nextLogger)
    {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message)
    {
        if (this.level <= level)
        {
            write(message);
        }
        if (nextLogger != null)
        {
            nextLogger.logMessage(level, message);
        }
    }

}
