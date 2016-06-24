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
package DesignPatterns.FlyWeight;

import java.util.HashMap;

public class FlyWeightFactory
{

    private static final HashMap<String, Circle> circleMap = new HashMap<>();

    public static Shape getColor(String color)
    {
        Circle circle = circleMap.get(color);

        if (circle == null)
        {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating Circle Object" + circle);
        }
        return circle;
    }
}
