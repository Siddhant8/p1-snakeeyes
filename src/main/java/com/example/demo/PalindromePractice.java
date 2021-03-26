package com.example.demo;

public class PalindromePractice {

    //Need a way to recursively check if a string is a palindrome

    public boolean stringInput(String tester){

        //Will need string length as our base case.
        //Dictionaries for databases?

        //Need to add a lowercase-inator. Need to add a space eliminator.

        int length = tester.length() - 1; //saves number of characters - 1 to get highest index
        //need a way to eliminate spaces
        //Ugh practice is practice. It doesn't matter if he already coded it because he didn't walk through it with us, nor am I copy-pasting his stuff

        int midLength;
        midLength = length/2; //If length == 4 (because a five letter word has 0,1,2,3,4), then midLength == 2

        if (length%2 != 0){ //EVEN numbered words have an odd max index because it starts at 0. I.e a four letter word is 0,1,2,3.

            return evenReverseChecker(tester, midLength, midLength + 1); //OLD comment: first division divides by two and rounds down. Then add one to get the center. 5/2 + 1 = 3.

        } else {

            return oddReverseChecker(tester, length, midLength); //If the indices are even

        }


    }

    //Recursion of repeated checking
    //Make two recursions: one for an odd-numbered string and one for an even-numbered string

    public boolean oddReverseChecker(String pali, int iterations, int middle){ //middle is the midLength, where the
        if (pali.charAt(iterations) == pali.charAt(middle)){ //iterations will decrease to 0, and iterations should be the "middle" of the word.
            return true; //If it gets to 0 iterations without any false checks, then you have a palindrome
            //My base case
        }

        if (pali.charAt(iterations) == pali.charAt(middle - (iterations - middle))){ //What does this math mean?
            // It's a way to get the char on the other "side" of the string, past the middle character.
            //So if we have length = 9 and middle = 4 (4 - 0 = 4 and 9 -5 = 4 difference of 5 indices), then the other "side" of index 8 (remember, 0-8 is nine indices) is 0
            //Because 8-4 = 4, and 4 - 4 = 0. You go equal counts "outward" from 4 (middle out)

            return oddReverseChecker(pali, iterations - 1, middle);

        } else {
            return false;
        }
    }

    public boolean evenReverseChecker(String pali, int rightIteration, int leftIteration){ //left iteration == middle (because integers round down and the index is lower so it's to the left of the word)
        //rightIteration == leftIteration + 1 because it's the adjacent character. The next index.

        if (pali.charAt(rightIteration) == pali.charAt(0)){
            return true;
        }

        if (pali.charAt(rightIteration) == pali.charAt(leftIteration)){
            return evenReverseChecker(pali, rightIteration + 1, leftIteration - 1);
            //By adding one to rightIteration and subtracting one from leftIteration, the string is checked going outward from the middle.
        } else{
            return false;
        }

    }


}
