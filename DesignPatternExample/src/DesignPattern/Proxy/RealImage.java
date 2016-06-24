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
package DesignPattern.Proxy;

public class RealImage implements Image
{
    private final String fileName;

    public RealImage(String fileName)
    {
        this.fileName = fileName;
        loadFromDisk(fileName);

    }

    @Override
    public void display()
    {
        System.out.println("Loaded image is" + fileName);

    }

    public void loadFromDisk(String fileName)
    {
        System.out.println("Loading from Disk" + fileName);
    }

}
