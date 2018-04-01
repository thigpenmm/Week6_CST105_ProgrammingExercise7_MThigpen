/**Program: ProgEx7 Program
 *File: ProgEx7.java
 *Summary: Prints palindromic prime integers to the console.
 *Author: Mercedes Thigpen
 *Date: March 28, 2018
 **/
package progex7;


public class ProgEx7 {//begin program exercise 7

    /**
     * @param args
     */
 public static void main(String args[]) {//main method 
//identifying the variables
    int prime; 
    int n; 
    int reversed;
    boolean isPrime;
    
    for (int number = 1; number <= 100000; number++) {//performing a search for integers less than or equal to 100,000
    isPrime = true;
    
    if (number >= 2) { //performing a search for numbers greater than 2
    for(int i = 2; i <= (number/2) ; i++){//loop to determine if an integer is only divisible by itself and 1
    if((number % i) == 0)
    isPrime = false;
 }
    if (isPrime) { //determining if a number is a palindrome using integers identified as prime
    n = number;
    reversed = 0;
    while (n != 0) {
    prime = n % 10;
    reversed = (reversed * 10) + prime;
    n /= 10;
 }
    if (number == reversed) { //if the integer is reversed and reads the same, it is a palindromic prime
    System.out.print(number + " ");//the palindromic prime integers are printed to the console
 }
    }
        }
 }
 System.out.println();
 } 
}