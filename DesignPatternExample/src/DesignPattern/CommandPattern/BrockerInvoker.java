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
package DesignPattern.CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class BrockerInvoker
{
    private final List<CommandOrder> command = new ArrayList<>();

    public void takeOrder(CommandOrder order)
    {
        command.add(order);
    }

    public void placeOrders()
    {

        for (CommandOrder order : command)
        {
            order.execute();
        }
        command.clear();
    }

}
