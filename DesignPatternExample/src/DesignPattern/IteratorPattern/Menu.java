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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu<E>
{
    public List<E> menuItems;

    public Menu()
    {
        menuItems = new ArrayList<E>();
    }

    public void addItems(E item)
    {
        menuItems.add(item);
    }

    public Iterator<E> iterator()
    {
        return new Menuiterator();
    }

    class Menuiterator implements Iterator<E>
    {
        int currentIndex = 0;

        @Override
        public boolean hasNext()
        {
            if (currentIndex >= menuItems.size())
            {
                return false;
            }
            else
            {
                return true;
            }
        }

        @Override
        public E next()
        {
            return menuItems.get(currentIndex++);
        }

        @Override
        public void remove()
        {

            menuItems.remove(--currentIndex);
        }

    }
}
