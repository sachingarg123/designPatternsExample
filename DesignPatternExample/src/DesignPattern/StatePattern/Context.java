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

public class Context
{
    public State state;

    Context(State state)
    {
        this.state = state;
    }

    public void setState(State state)
    {
        this.state = state;
    }

    public void doAction()
    {
        state.doAction();
    }

}
