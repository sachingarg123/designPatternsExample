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

public class Circle implements Shape
{

    private final String color;
    private int x;
    private int y;
    private int radius;

    /**
     * @param parX the x to set
     */
    public void setX(int parX)
    {
        x = parX;
    }

    /**
     * @param parY the y to set
     */
    public void setY(int parY)
    {
        y = parY;
    }

    /**
     * @param parRadius the radius to set
     */
    public void setRadius(int parRadius)
    {
        radius = parRadius;
    }

    public Circle(String color)
    {
        this.color = color;
    }

    @Override
    public void draw()
    {
        System.out.println("Circle: Draw()[Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }

}
