package com.jetbrains;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class LineSorter
{
    public LineSorter()
    {

    }

    public void reverse(String inputFile, String sortedOutputFile)
    {
        TreeSet<String> lines = new TreeSet<String>();
        File textFile = new File(inputFile);
        BufferedReader br = null;
        BufferedWriter bw = null;
        try
        {
            br = new BufferedReader(new FileReader(textFile));
            String line = "";
            while ((line = br.readLine()) != null)
            {
                lines.add(line);
            }
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            if (br != null)
            {
                try
                {
                    br.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }

        try
        {
            bw = new BufferedWriter(new FileWriter(sortedOutputFile));
            for(String s : lines)
            {
                bw.write((s) + "\n");
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            if(bw != null)
            {
                try
                {
                    bw.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }


    }
}
