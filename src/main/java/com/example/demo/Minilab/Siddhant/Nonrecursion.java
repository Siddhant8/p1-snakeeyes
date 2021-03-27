package com.example.demo.Minilab.Siddhant;

import java.io.IOException;

public class Nonrecursion {

    int num1 = 0;
    int num2 = 12;

    public Nonrecursion(int number1){
        this.num1 = number1;
        this.num2 = num2;

    }

    public int normal(){


        int gcf = 1;
        if(num1<num2){
            for(int i = 1; i <= num1; i++){
                if(num1%i == 0 && num2%i == 0){
                    gcf = i;
                }
                else{
                    continue;
                }
            }

        }
        else if(num2 <= num1){
            for(int i = 1; i <=num2; i++){
                if(num1%i == 0 && num2%i == 0){
                    gcf = i;
                }
                else{
                    continue;
                }
            }
        }

        return gcf;

    }

    public static int driver(int test) throws IOException {
        Nonrecursion cases = new Nonrecursion(test);
        int y = cases.normal();
        return y;
    }
    public static void main(String[] args) throws IOException {
        Nonrecursion.driver(4);
    }


}
