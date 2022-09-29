package com.ThurstdayLabTest;
import java.util.Scanner;

public class Placement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students placed in CSE: ");
		int CSE = sc.nextInt();
		System.out.print("Enter the number of students placed in ECE: ");
		int ECE = sc.nextInt();
		System.out.print("Enter the number of students placed in MECH: ");
		int MECH = sc.nextInt();
		
		if(CSE == ECE && ECE == MECH && MECH == CSE) {
			System.out.println("No Department has got highest placement, all are equal");
		}
		else if(CSE >= 0 && ECE >=0 && MECH >=0){
			if(CSE > ECE && CSE > MECH) {
				System.out.println("Highest Placement: CSE");
			}
			else if(ECE > MECH && ECE > CSE) {
				System.out.println("Highest Placement: ECE");
			}
			else if(MECH > CSE && MECH > ECE) {
				System.out.println("Highest Placement: MECH");
			}
			else if(CSE == ECE) {
				System.out.println("Highest Placement: CSE & ECE");
			}
			if(CSE == MECH) {
				System.out.println("Highest Placement: CSE & MECH");
			}
			if(ECE == MECH) {
				System.out.println("Highest Placement: ECE & MECH");
			}
		}
		else {
			System.out.println("Invalid Input");
		}
		

	}

}

