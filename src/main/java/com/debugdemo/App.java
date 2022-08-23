package com.debugdemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 1, 2, 0};

        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += 1 / input[i];            
        }

        System.out.println(sum);
    }
}
