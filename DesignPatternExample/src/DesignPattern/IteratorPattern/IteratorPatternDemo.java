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
package DesignPattern.IteratorPattern;

import java.util.Iterator;

public class IteratorPatternDemo
{
    public static void main(String arg[])
    {
        Item i1 = new Item("spaghetti", 7.50f);
        Item i2 = new Item("hamburger", 6.00f);
        Item i3 = new Item("chicken sandwich", 6.50f);
        Menu<Item> menu = new Menu<Item>();
        menu.addItems(i1);
        menu.addItems(i2);
        menu.addItems(i3);

        System.out.println("Displaying Menu:");
        Iterator<Item> iterator = menu.iterator();
        while (iterator.hasNext())
        {
            Item item = iterator.next();
            System.out.println(item);
        }

        System.out.println("\nRemoving last item returned");
        iterator.remove();

        System.out.println("\nDisplaying Menu:");
        iterator = menu.iterator();
        while (iterator.hasNext())
        {
            Item item = iterator.next();
            System.out.println(item);
        }
    }
}
