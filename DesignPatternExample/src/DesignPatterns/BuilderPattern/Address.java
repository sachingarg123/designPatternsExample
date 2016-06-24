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
package DesignPatterns.BuilderPattern;

public final class Address
{
    private final String protocol;
    private final String url;
    private final int port;
    private final String path;
    private final String description;

    /**
     * @param parAddressBuilder
     */
    private Address(AddressBuilder addressBuilder)
    {
        this.protocol = addressBuilder.protocol;
        this.url = addressBuilder.url;
        this.port = addressBuilder.port;
        this.path = addressBuilder.path;
        this.description = addressBuilder.description;
    }

    /**
     * @return the protocol
     */
    public String getProtocol()
    {
        return protocol;
    }

    /**
     * @return the url
     */
    public String getUrl()
    {
        return url;
    }

    /**
     * @return the port
     */
    public int getPort()
    {
        return port;
    }

    /**
     * @return the path
     */
    public String getPath()
    {
        return path;
    }

    /**
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    public static AddressBuilder newBuilder()
    {
        return new AddressBuilder();
    }

    public static class AddressBuilder
    {
        private String protocol;
        private String url;
        private int port;
        private String path;
        private String description;

        public AddressBuilder protocol(String protocol)
        {
            this.protocol = protocol;
            return this;
        }

        public AddressBuilder url(String url)
        {
            this.url = url;
            return this;
        }

        public AddressBuilder port(int port)
        {
            this.port = port;
            return this;
        }

        public AddressBuilder path(String path)
        {
            this.path = path;
            return this;
        }

        public AddressBuilder description(String description)
        {
            this.description = description;
            return this;
        }

        public Address build()
        {
            return new Address(this);
        }

    }

    public static void main(String arg[])
    {
        Address address = Address.newBuilder().port(80).build();
        System.out.println(address.getPort());
    }
}
