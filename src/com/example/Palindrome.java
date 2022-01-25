package com.example;

public class Palindrome {
    public static void main (String[] args) {
        String f = "bob";
        //f.replace("bob");

        String reverse = "";
        for(int i = f.length() - 1; i >= 0; i--) {
            reverse += f.charAt(i);
            System.out.println(reverse);
        }
    }



}
