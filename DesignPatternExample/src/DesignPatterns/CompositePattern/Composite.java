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
package DesignPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component
{

    List<Component> components = new ArrayList<Component>();

    @Override
    public void sayHello()
    {
        for (Component component : components)
        {
            component.sayHello();
        }
    }

    @Override
    public void sayGoodBye()
    {
        for (Component component : components)
        {
            component.sayGoodBye();
        }
    }

    public void add(Component component)
    {
        components.add(component);
    }

    public Component getComponent(int index)
    {
        return components.get(index);
    }

    public List<Component> getComponents()
    {
        return components;
    }

}
