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

public class FlyWeightDemo
{

    static String[] colors =
    { "Red", "White", "Blue", "Black", "Violet" };

    private static String getRandomColor()
    {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX()
    {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY()
    {
        return (int) (Math.random() * 100);
    }

    public static void main(String arg[])
    {

        for (int i = 0; i < 20; i++)
        {
            Circle circle = (Circle) FlyWeightFactory.getColor(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }

    }
}
