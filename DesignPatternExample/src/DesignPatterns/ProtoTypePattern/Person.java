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
package DesignPatterns.ProtoTypePattern;

public class Person implements Prototype
{

    String name;

    public Person(String name)
    {
        this.name = name;
    }

    @Override
    public Prototype doClone()
    {
        return new Person(name);
    }

    @Override
    public String toString()
    {
        return "Person name is " + name;

    }

}
