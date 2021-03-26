package com.example.demo;

public class RepeatedMath {

    //Remember, many operators are just repeated operations of a lesser type... expoents are repeated multiplication which is really repeated addition

    public int exponentiation (int iterations, int value, int repeatValue){ //as in the literal value you are exponentiating
        //Value will repeatedly change until iterations == 1
        //Note: repeat vaue is so that we continuously multiple by the same factor.

        if (iterations == 1){ //Now that I've FINALLY learned recursion, I can think of applications... but as I learn more recursion, I'll learn more applications that I truly wouldn't have efficiently come up with on my own... the value of teaching
            //The base case where iterations == 1 BECAUSE in order to get the proper value, you need only multiple once (i.e a power of 2 is a number multiplied by itself once)
            return value;
        }

        if (iterations == 0){
            return 1; //The base case where iterations is input as 0
        }

        return exponentiation (iterations - 1, value * repeatValue, repeatValue); //<-- A glitch! as value increases, it squares each time!

    }

    public int multiplication (int iterations, int value, int addingValue){
        if (iterations == 1){
            return value;
        }

        if (iterations == 0){
            return 0; //The base case where iterations is input as 0. Anything multiplied by 0 is 0
        }

        return multiplication (iterations - 1, value + addingValue, addingValue);
    }
}