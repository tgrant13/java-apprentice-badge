package com.jetbrains.sharedlogic;

public class StaticTXT implements Appender
{
    private static PrintWriterWrapper file = new PrintWriterWrapper("static.txt");

    public StaticTXT(){}

    @Override
    public void addLine(String line)
    {
        file.append(line);
        file.flush();
    }

    public void close()
    {
        file.close();
    }

    public static void addStaticLine()
    {
        file.append("From static method call");
        file.flush();
    }
}
