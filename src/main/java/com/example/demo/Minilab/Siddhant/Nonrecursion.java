package com.example.demo.Minilab.Siddhant;

import java.io.IOException;

public class Nonrecursion {

    int num1 = 0;
    int num2 = 12;

    public Nonrecursion(int number1, int number2){
        this.num1 = number1;
        this.num2 = number2;

    }

    public static int normal(int a, int b){


        int gcf = 1;
        if(a<b){
            for(int i = 1; i <= a; i++){
                if(a%i == 0 && b%i == 0){
                    gcf = i;
                }
                else{
                    continue;
                }
            }

        }
        else if(b <= a){
            for(int i = 1; i <=b; i++){
                if(a%i == 0 && b%i == 0){
                    gcf = i;
                }
                else{
                    continue;
                }
            }
        }

        return gcf;

    }



    public static void main(String[] args) throws IOException {
        Nonrecursion.normal(4,4);
    }


}
