package com.jetbrains.sharedlogic;

public class XML implements Appender
{
    private PrintWriterWrapper file;

    public XML(String fileName)
    {
        file = new PrintWriterWrapper(fileName);
    }

    public void close()
    {
        file.close();
    }

    @Override
    public void addLine(String line)
    {
        file.append("<!--" + line + "-->");
        file.flush();
    }
}
