package com.company;

public class Main
{

    public static void main(String[] args)
    {
        //Part 1
        final int a = 8;
        int answer = 1;
        for (int k = 1; k <= a; k++)
        {
            answer = answer * 3;
        }
        System.out.println(answer);

        //Part 2
        final int a2 = 10;
        int answer2 = 1;
        int b = 3;
        for (int l = 1; l <= a2; l++)
        {
            answer2 = answer2 * b;
        }
        System.out.println(answer2);
    }
}
