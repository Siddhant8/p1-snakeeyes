package com.example.demo;

public class FibonacciSequence {


    //set totalIndex to a parameter, call the first one as 0 in method call
    public int fibonacci (int iterations, int previous, int totalIndex){ //int previous is to fetch the previous value.

        if (iterations == 0){ //Be VERY careful here... this is your base case. If a glitch happens, check here.
            return totalIndex; //<-- the base case belongs at the top always.
        }

        int addition; //initialize here for concision

        if (totalIndex == 0){ //MUST set this to totalIndex ==0 so that once totalIndex increases by 1, this case never reoccurs
            addition = 1; //To get the addition going. The first number should always be 0. When written, the first call of fibonacci should be (n, 0) where totalIndex == 0
        } else {
            addition = previous; //Add the previous value per the Fibonacci sequence
        }

        previous = totalIndex; //MUST place here so that totalIndex isn't overwritten yet
        totalIndex = totalIndex + addition;

        //Optimize memory by erasing unused variables afterwards

        return fibonacci(iterations - 1, previous, totalIndex); //Use "previous" as both a field and input to minimize memory used up by newly initialized variables

        //If iterations == 2 I should get 0 (totalIndex == 0, iterations == 2 becomes 1) --> totalIndex == 1 (iterations == 1 becomes 0)--> 1 (iterations == 0 becomes -1) return 1
    }
}
