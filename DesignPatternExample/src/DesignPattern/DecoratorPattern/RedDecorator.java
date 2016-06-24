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
package DesignPattern.DecoratorPattern;

public class RedDecorator extends DecoratorClass
{

    /**
     * @param parShape
     */
    public RedDecorator(Shape parShape)
    {
        super(parShape);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void draw()
    {
        shape.draw();
        setRedBorder(shape);

    }

    private void setRedBorder(Shape decoratedShape)
    {
        System.out.println("Border Color: Red");
    }

}
