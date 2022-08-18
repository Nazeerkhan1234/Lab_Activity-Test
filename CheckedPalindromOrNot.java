package com.test;
import java.util.*;
public class CheckedPalindromOrNot {

	  public static boolean isPalindrome(String str) {
		    int i = 0, j = str.length() - 1;
		    while (i < j) {
		      if (str.charAt(i) != str.charAt(j)) {
		        return false;
		      }
		      i++;
		      j--;
		    }
		    return true;
		  }
   
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a string");
    String str = scn.next();
     boolean flag =isPalindrome(str);
     if(flag == true) {
    	 System.out.println("String is palindrom");
     }else {
    	 System.out.println("String is not  palindrom");
     }
    scn.close();
  }

}




                        
                 
