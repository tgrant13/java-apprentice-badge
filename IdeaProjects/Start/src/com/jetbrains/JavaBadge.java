package com.jetbrains;


import com.jetbrains.sharedlogic.SharedLogic;

public class JavaBadge
{
    public enum TestType
    {
        LINESORTER, REVERSEANDSORTER, STRINGMEMORY, OVERLOADCONSTRUCTORS, ENCAPSULATION,
        OBJECTREFERENCES, INSTANCEOF, EXCEPTIONHANDLING, SHAREDLOGIC
    }

    public static void main(String[] args)
    {
        for (TestType TT : TestType.values())
        {
            switch(TT)
            {
                case LINESORTER:
                    doLineSorter();
                    break;

                case REVERSEANDSORTER:
                    doReverseAndSorter();
                    break;

                case STRINGMEMORY:
                    //doStringMemory();
                    break;

                case OVERLOADCONSTRUCTORS:
                    doOverloadConstructors();
                    break;

                case ENCAPSULATION:
                    doEncapsulation();
                    break;

                case OBJECTREFERENCES:
                    doObjectReferences();
                    break;

                case INSTANCEOF:
                    doInstanceOf();
                    break;

                case EXCEPTIONHANDLING:
                    doExceptionHandling();
                    break;

                case SHAREDLOGIC:
                    doSharedLogic();
                    break;
            }

        }
    }

    public static void doLineSorter()
    {
        System.out.println("LINE SORTER\n");
        LineSorter LR = new LineSorter();
        LR.reverse("lorem.txt", "sortedLines.txt");
        System.out.println("Complete! ✓");
    }

    public static void doReverseAndSorter()
    {
        System.out.println("\n REVERSE AND SORT\n");
        ReverseAndSorter RAS = new ReverseAndSorter();
        RAS.reverseAndSort("lorem.txt", "reversedSorted.txt");
        System.out.println("Complete! ✓");
    }

    public static void doStringMemory()
    {
        System.out.println("\nSTRING MEMORY\n");

        StringMemory SM = new StringMemory();
        long charCount = SM.checkMemory();
        System.out.println("TOTAL CHARS: " + charCount);
        System.out.println("Complete! ✓");
    }

    public static void doOverloadConstructors()
    {
        System.out.println("\nOVERLOAD CONSTRUCTORS\n");

        Overload BASE = new Overload();
        Overload same1 = new Overload();
        Overload same2 = new Overload(1, 2);
        Overload diff1 = new Overload(3, 4);
        Overload same3 = new Overload("Real Values");
        Overload diff2 = new Overload("String Cheese");
        Overload chain = new Overload(1);

        BASE.overloadTests(same1, same2, same3, diff1, diff2, chain);
        System.out.println("Complete! ✓");
    }

    public static void doEncapsulation()
    {
        System.out.println("\nENCAPSULATION\n");
        Encapsulation EN = new Encapsulation(1, 2, 3, 4);

        System.out.println("Private Integer: " + EN.getPrivateInt());
        System.out.println("Public Integer: " + EN.publicInt);
        System.out.println("Protected Integer: " + EN.protectedInt);
        System.out.println("Package Private Integer: " + EN.packagePrivateInt);

        // CHANGE THE PRIVATE INTEGER
        EN.setPrivateInt(4);
        System.out.println("New Private Integer: " + EN.getPrivateInt());

        // CHANGE THE PUBLIC, PROTECTED, AND PACKAGE PRIVATE VALUES DIRECTLY
        EN.publicInt = 5;
        EN.protectedInt = 6;
        EN.packagePrivateInt = 7;
        System.out.println("New Public Integer: " + EN.publicInt);
        System.out.println("New Protected Integer: " + EN.protectedInt);
        System.out.println("New Package Private Integer: " + EN.packagePrivateInt);

        System.out.println("Complete! ✓");
    }

    public static void doObjectReferences()
    {
        System.out.println("\nOBJECT REFERENCES\n");
        int intByVal = 10;
        StringBuilder strByRef = new StringBuilder("By Reference!");
        int changeFinalInt = 1200;

        ObjectReferences OR = new ObjectReferences();
        OR.changeValues(intByVal,strByRef,changeFinalInt);

        System.out.println("Primitive by Value After Changing: " + intByVal);
        System.out.println("String by Reference String After Changing: " + strByRef);
        System.out.println("Final Integer After Changing: " + OR.getCantChangeThis());

        System.out.println("Complete! ✓");
    }

    public static void doInstanceOf()
    {
        System.out.println("\nINSTANCEOF AND CASTING\n");
        InstanceOf IO = new InstanceOf();
        IO.validate();

        System.out.println("Complete! ✓");
    }

    public static void doExceptionHandling()
    {
        System.out.println("\nEXCEPTION HANDLING\n");
        ExceptionHandling EH = new ExceptionHandling();
        EH.checkForExceptions();
        System.out.println("Complete! ✓");
    }

    public static void doSharedLogic()
    {
        System.out.println("\nSHARED LOGIC\n");
        SharedLogic SL = new SharedLogic();
        SL.doSharedLogic();
        System.out.println("Complete! ✓");
    }

}
