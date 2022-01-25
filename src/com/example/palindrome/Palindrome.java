package com.example.palindrome;


    public class Palindrome {
        public static void main (String[] args) {
            String f = "bob";


            String reverse = "";
            for(int i = f.length() - 1; i >= 0; i--) {
                reverse += f.charAt(i);
                System.out.println(reverse);

            }
            boolean palindrome = true;
            for(int i = 0; i < f.length(); i++) {
                if (f.charAt(i) != reverse.charAt(i)) {
                    palindrome = false;

                }
                if(palindrome) {
                    System.out.println("palindrome");
                }else {
                    System.out.println("not a palindrome");
                }
            }
        }



    }


