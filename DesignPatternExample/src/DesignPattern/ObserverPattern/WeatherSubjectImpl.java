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

import java.util.ArrayList;
import java.util.List;

public class WeatherSubjectImpl implements WeatherSubject
{

    private final List<WeatherObserver> weatherObsList = new ArrayList<>();
    int temperature;

    public WeatherSubjectImpl(int temperature)
    {
        this.temperature = temperature;
    }

    @Override
    public void addObservers(WeatherObserver parObserver)
    {
        weatherObsList.add(parObserver);

    }

    @Override
    public void removeObserver(WeatherObserver parObserver)
    {
        weatherObsList.remove(parObserver);

    }

    @Override
    public void notifyObservers()
    {
        for (WeatherObserver weatherObserver : weatherObsList)
        {
            weatherObserver.doUpdate(this.temperature);
        }
    }

    public void setTemeparature(int temp)
    {
        System.out.println("Setting new Temprature" + temp);
        this.temperature = temp;
        notifyObservers();

    }
}
