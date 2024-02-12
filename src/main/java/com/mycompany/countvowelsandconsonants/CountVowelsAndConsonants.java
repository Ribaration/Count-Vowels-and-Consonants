/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.countvowelsandconsonants;

/**
 *
 * @author Ribaration
 */
 import java.util.Scanner; // Import the Scanner class from the java.util package for user input

public class CountVowelsAndConsonants {// Define a class named CountVowelsAndConsonants

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        System.out.println("Enter a string: "); // Prompt the user to enter a string
        String input = scanner.nextLine().toLowerCase(); // Read the input string and convert it to lowercase
        scanner.close(); // Close the Scanner object to release system resources

        int vowels = 0; // Initialize a variable to count vowels
        int consonants = 0; // Initialize a variable to count consonants

        for (int i = 0; i < input.length(); i++) { // Iterate through each character of the input string
            char ch = input.charAt(i); // Get the character at the current index
            if (ch >= 'a' && ch <= 'z') { // Check if the character is a letter
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { // Check if the character is a vowel
                    vowels++; // Increment the count of vowels
                } else { // If the character is not a vowel, it's a consonant
                    consonants++; // Increment the count of consonants
                }
            }
        }

        System.out.println("Number of vowels: " + vowels); // Print the count of vowels
        System.out.println("Number of consonants: " + consonants); // Print the count of consonants
    }
}
  
    

