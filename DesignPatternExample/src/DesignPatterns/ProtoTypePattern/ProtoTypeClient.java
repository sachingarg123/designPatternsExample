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

public class ProtoTypeClient
{

    public static void main(String arg[])
    {

        Person person = new Person("Sachin");
        Animal animal = new Animal("Dog");
        Person person2 = (Person) person.doClone();
        Animal animal2 = (Animal) animal.doClone();
        System.out.println("Person1 is" + person);
        System.out.println("Person2 is" + person2);
        System.out.println("animal is" + animal);
        System.out.println("animal2 is" + animal2);

    }
}
