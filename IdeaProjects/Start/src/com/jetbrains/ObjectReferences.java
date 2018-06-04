package com.jetbrains;

public class ObjectReferences
{
    private final int cantChangeThis = 0;
    public ObjectReferences()
    {

    }

    public void changeValues(int intByVal, StringBuilder strByRef, int int_in)
    {
        intByVal = 44444;
        strByRef.append(" It changed!");
        // cantChangeThis = int_in;
    }

    public int getCantChangeThis()
    {
        return cantChangeThis;
    }
}

