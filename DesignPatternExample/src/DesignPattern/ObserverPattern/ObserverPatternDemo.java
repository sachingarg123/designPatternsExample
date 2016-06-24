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
package DesignPattern.ObserverPattern;

public class ObserverPatternDemo
{
    public static void main(String arg[])
    {
        WeatherCustomer1 observer1 = new WeatherCustomer1();
        WeatherCustomer2 observer2 = new WeatherCustomer2();
        WeatherSubjectImpl notifier = new WeatherSubjectImpl(27);
        notifier.addObservers(observer1);
        notifier.addObservers(observer2);
        notifier.setTemeparature(30);

    }
}
