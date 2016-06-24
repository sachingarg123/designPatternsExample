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

public class ChainPatternDemo
{
    private static AbstractLogger getChainOfLogger()
    {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String arg[])
    {
        AbstractLogger loggerChain = getChainOfLogger();
        loggerChain.logMessage(AbstractLogger.INFO, "This is the Log");

        loggerChain.logMessage(AbstractLogger.DEBUG, "This is the Log");

        loggerChain.logMessage(AbstractLogger.ERROR, "This is the Log");
    }
}
