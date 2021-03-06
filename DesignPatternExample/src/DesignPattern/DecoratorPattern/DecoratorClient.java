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

public class DecoratorClient
{

    public static void main(String arg[])
    {
        Shape rectangle = new Rectangle();
        rectangle.draw();
        RedDecorator redDecorator = new RedDecorator(rectangle);
        redDecorator.draw();
        Shape circle = new Circle();
        circle.draw();
        RedDecorator redDecorator1 = new RedDecorator(circle);
        redDecorator1.draw();
    }
}
