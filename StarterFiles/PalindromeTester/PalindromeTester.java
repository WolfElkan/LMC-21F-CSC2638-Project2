/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentProjects.P2_Stacks.StarterFiles.PalindromeTester;

import StudentProjects.P2_Stacks.StarterFiles.StackArray.*;

/**
 *
 * @author KarinaAssiter
 */
public class PalindromeTester {

    // ************************************************************************
    // Method to test if a string is a Palindrome using a stack
    // 1. Create an ArrayStack that will hold characters (that's given)
    // 2. Loop through string pushing letters or digits onto the stack
    //      HINTS: 
    //        string.charAt(i)  - returns element at position i in string
    //        Character.isLetterOrDigit(ch) - true if ch is letter or digit
    // 3. Loop through characters in the string (again) 
    //       if current string character is letter or digit
    //           pop a character from the stack
    //           convert both characters to lower case and compare them
    //              if they are not the the same, return false     
    // 4. return true
    // ************************************************************************
    
    public boolean isPalindrome(String string) {
        ArrayStack<Character> stringStack = new ArrayStack<>();

        boolean result = true;

        System.out.println("STUB method : replace with your code. ");

        return result;
    }

    public static void main(String[] args) {
        PalindromeTester pt = new PalindromeTester();
        String currentString = "madam";
        if (pt.isPalindrome(currentString)) {
            System.out.println(currentString + " IS a palindrome.");
        } else {
            System.out.println(currentString + " is NOT a palindrome.");
        }

        currentString = "adam";
        if (pt.isPalindrome(currentString)) {
            System.out.println(currentString + " IS a palindrome.");
        } else {
            System.out.println(currentString + " is NOT a palindrome.");
        }

        currentString = "Race car.";
        if (pt.isPalindrome(currentString)) {
            System.out.println(currentString + " IS a palindrome.");
        } else {
            System.out.println(currentString + " is NOT a palindrome.");
        }
    }

    
}
