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
package DesignPattern.Memento;

public class DietInfo
{
    String personName;
    int dayNumber;
    int weight;

    public DietInfo(String personName, int dayNumber, int weight)
    {
        this.personName = personName;
        this.dayNumber = dayNumber;
        this.weight = weight;
    }

    @Override
    public String toString()
    {
        return "Name: " + personName + ", day number: " + dayNumber + ", weight: " + weight;
    }

    public void setDayNumberAndWeight(int dayNumber, int weight)
    {
        this.dayNumber = dayNumber;
        this.weight = weight;
    }

    public Memento save()
    {
        return new Memento(personName, dayNumber, weight);
    }

    public void restore(Object objMemento)
    {
        Memento memento = (Memento) objMemento;
        personName = memento.mementoPersonName;
        dayNumber = memento.mementoDayNumber;
        weight = memento.mementoWeight;
    }

    // memento - object that stores the saved state of the originator
    private class Memento
    {
        String mementoPersonName;
        int mementoDayNumber;
        int mementoWeight;

        public Memento(String personName, int dayNumber, int weight)
        {
            mementoPersonName = personName;
            mementoDayNumber = dayNumber;
            mementoWeight = weight;
        }
    }
}
