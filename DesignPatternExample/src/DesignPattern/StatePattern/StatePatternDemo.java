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
package DesignPattern.StatePattern;

public class StatePatternDemo
{
    public static void main(String arg[])
    {
        State startState = new StartState();
        State stopState = new StopState();
        Context context = new Context(startState);
        context.doAction();
        context.setState(stopState);
        context.doAction();
    }
}
