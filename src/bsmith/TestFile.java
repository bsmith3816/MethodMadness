package bsmith; //Brandon Smith 9/24/18

import static bsmith.BSmithLib.*;

public class TestFile {

    public static void main(String[] args)
    {
        println("isPalindrome: " + isPalindrome("racecar")); // Tests to see whether racecar is a palindrome - returns true
        println("datestr: " + dateStr("01/08/1999")); // Returns the date in "dd-mm-yyyy" format - returns 08-01-1999
        println("cutOut: " + cutOut("catatonic cat","cat")); // Cuts out the first case of substr from mainstr - returns atonic cat
        println("stringUnion: " + stringUnion("hello","hola","nihao")); // Returns the number of same letters from at least 2 strings - returns 4
        println("sumUpTo: " + sumUpTo(10)); // Returns sum of all the numbers up to num - returns 55
        println("primePrinter -");
        primePrinter(10); // Prints out list of 'num' prime numbers - 2 3 5 7 11 13 17 19 23 29
    }

}
