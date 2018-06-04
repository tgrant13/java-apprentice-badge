package com.jetbrains.sharedlogic;

public class TXT implements Appender
{
    PrintWriterWrapper file;
    public TXT(String fileName)
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
        file.append(line);
        file.flush();
    }
}
