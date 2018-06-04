package com.jetbrains;

import java.util.Objects;

public class Overload
{
    private int one;
    private int two;
    private int three;
    private int four;

    public Overload()
    {
        one = 1;
        two = 2;
        three = 3;
        four = 4;
    }

    public Overload(int one_in, int two_in)
    {
        one = one_in;
        two = two_in;
        three = 3;
        four = 4;
    }

    public Overload(String isValid)
    {
        if (isValid.equals("Real Values"))
        {
            one = 1;
            two = 2;
            three = 3;
            four = 4;
        }
        else
        {
            one = 10;
            two = -4803;
            three = Integer.MAX_VALUE;
            four = 0;
        }
    }

    public Overload(int one_in)
    {
        this(2, 3, 4);
        one = one_in;
    }

    public Overload(int two_in, int three_in, int four_in)
    {
        two = two_in;
        three = three_in;
        four = four_in;
    }

    public void overloadTests(Overload same1, Overload same2, Overload same3,
                              Overload diff1, Overload diff2, Overload chain)
    {
        // VERIFY THE CONSTRUCTORS SHOULD BE THE SAME WORKED
        if ((same1.equals(same2)) && (same2.equals(same3)))
        {
            System.out.println("Valid overloads worked correctly");
        }
        else
        {
            System.out.println("Something goofed.");
        }

        // ONCE WE KNOW THE OTHERS ARE CORRECT, RULE OUT THE BAD ONES
        if(!(same1.equals(diff1)) && !(same1.equals(diff2)))
        {
            System.out.println("Invalid overloads worked correctly");
        }
        else
        {
            System.out.println("Something goofed again");
        }

        // CHECK OUT THE CONSTRUCTOR CHAINING EXAMPLE
        if(same1.equals(chain))
        {
            System.out.println("Constructor chaining worked!");
        }
        else
        {
            System.out.println("You goofed up your chaining, dude.");
        }
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Overload overload = (Overload) o;
        return one == overload.one &&
                two == overload.two &&
                three == overload.three &&
                four == overload.four;
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(one, two, three, four);
    }
}
