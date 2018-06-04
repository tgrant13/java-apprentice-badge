package com.jetbrains.sharedlogic;

public class SharedLogic
{
    public SharedLogic(){}

    public void doSharedLogic()
    {
        TXT txt = new TXT("newTXT.txt");
        txt.addLine("No tags will appear here");
        txt.addLine("Using interface to inherit method");
        txt.close();

        XML xml = new XML("newXML.xml");
        xml.addLine("Here's one generic line");
        xml.addLine("Oh wait! Here's another");
        xml.close();

        StaticTXT s1 = new StaticTXT();
        StaticTXT s2 = new StaticTXT();
        s1.addLine("Adding a line from s1");
        s2.addLine("Adding a line from s2");
        StaticTXT.addStaticLine();
        s1.close();
        s2.close();
    }
}
