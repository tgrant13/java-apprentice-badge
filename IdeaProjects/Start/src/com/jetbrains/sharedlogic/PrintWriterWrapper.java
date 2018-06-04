package com.jetbrains.sharedlogic;

import javax.imageio.IIOException;
import java.io.*;

public class PrintWriterWrapper
{
    private PrintWriter pw;

    public PrintWriterWrapper(String fileName)
    {
        try
        {
            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public void append(String line)
    {
        pw.write(line);
        pw.write("\n");
    }

    public void flush()
    {
        pw.flush();
    }

    public void close()
    {
        pw.close();
    }
}
