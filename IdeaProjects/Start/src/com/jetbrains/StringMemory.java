package com.jetbrains;

import java.util.ArrayList;

public class StringMemory
{
    public StringMemory()
    {

    }

    public long checkMemory()
    {
        ArrayList<String> pushItToTheLimit = new ArrayList<String>();
        long chars = 0;
        try
        {
            while (true)
            {
                String temp = "aaaaa";
                pushItToTheLimit.add(temp);
                chars += 5;
                if(false) break; // LEGITIMATELY NO POINT TO THIS LINE OTHER THAN A STYLE WARNING :)
            }
        }
        catch(OutOfMemoryError e)
        {
            return chars;
        }
        return chars;
    }
}
