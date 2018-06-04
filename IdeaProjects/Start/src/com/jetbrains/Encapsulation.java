package com.jetbrains;

public class Encapsulation
{

    private int privateInt;
    public int publicInt;
    protected int protectedInt;
    int packagePrivateInt;

    public Encapsulation(int priv_in, int pub_in, int prot_in, int pack_in)
    {
        privateInt = priv_in;
        publicInt = pub_in;
        protectedInt = prot_in;
        packagePrivateInt = pack_in;
    }

    public int getPrivateInt()
    {
        return privateInt;
    }

    public void setPrivateInt(int priv_in)
    {
        privateInt = priv_in;
    }
}
