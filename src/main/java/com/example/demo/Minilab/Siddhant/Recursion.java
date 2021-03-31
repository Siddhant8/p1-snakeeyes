package com.example.demo.Minilab.Siddhant;

public class Recursion {

    public static int gcf(int a, int b) {

        int gcf = 0;
        if(a % b == 0){
            return b;


        }

        else{
            int c = a%b;
            return gcf(b, c);


        }

    }

}

