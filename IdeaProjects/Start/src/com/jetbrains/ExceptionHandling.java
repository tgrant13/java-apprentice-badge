package com.jetbrains;

import java.io.FileNotFoundException;

public class ExceptionHandling
{
    public ExceptionHandling()
    {

    }

    public void checkForExceptions()
    {
        // THIS TYPE OF EXCEPTION IS CHECKED FOR BEFORE COMPILE TIME
        try
        {
            throw new FileNotFoundException("Throwing FILENOTFOUNDEXCEPTION: checked");
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        // RUNTIME EXCEPTIONS ARE UNCHECKED AT COMPILE TIME - DISCOVERED WHILE RUNNING THE PROGRAM
        try
        {
            throw new RuntimeException("Throwing RUNTIMEEXCEPTION: unchecked");
        }
        catch (RuntimeException e)
        {
           System.out.println(e.getMessage());
        }

        try
        {
            throw new Error("Throwing ERROR");
        }
        catch(Error e)
        {
            System.out.println(e.getMessage());
        }
    }
}
