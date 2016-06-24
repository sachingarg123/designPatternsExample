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
package DesignPatterns.CompositePattern;

public class CompositePatternClient
{

    public static void main(String arg[])
    {
        Leaf leaf1 = new Leaf("Bob");
        Leaf leaf2 = new Leaf("David");
        Leaf leaf3 = new Leaf("Daniel");
        Leaf leaf4 = new Leaf("Duke");
        Composite composite1 = new Composite();
        composite1.add(leaf1);
        composite1.add(leaf2);
        Composite composite2 = new Composite();
        composite2.add(leaf3);
        composite2.add(leaf4);

        Composite composite3 = new Composite();
        composite3.add(composite1);
        composite3.add(composite2);

        composite1.sayHello();
        composite1.sayGoodBye();

        composite2.sayHello();
        composite2.sayGoodBye();

        composite3.sayHello();
        composite3.sayGoodBye();
    }

}
