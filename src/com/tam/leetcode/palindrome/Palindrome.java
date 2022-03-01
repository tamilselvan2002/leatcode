package com.tam.leetcode.palindrome;

public class Palindrome {
    public static void main(String[] args) {
        solution sol= new solution ();
        System.out.println(sol.isPalindrome( 121) );

    }
}

class solution {
    public boolean isPalindrome(int x) {
        return reverese(x) == x;
    }
    private int reverese(int n ){
        int  temp = 0;
        for(;n>0;n=n/10){
            temp = temp*10 + n%10;
        }
        return temp;
    }
}


