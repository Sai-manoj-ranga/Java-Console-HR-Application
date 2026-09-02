package com.consolebasedapplication;

import java.util.Arrays;
import java.util.Scanner;

public class Naukari_hr_Interaction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Naukri !!!");
		System.out.println("-----------------------------------");
		System.out.println("Please provide the details..");
		System.out.println();
		System.out.print("What is your name? ");
		String name = sc.nextLine();
		System.out.println("Happy to have you here Mr." + name);
		System.out.print("What is the Highest Qualification? ");
		String qualification = sc.nextLine();
		if (qualification.equalsIgnoreCase("B.TECH") || qualification.equalsIgnoreCase("M.TECH")) {
			System.out.println("Tell the Skills you are more familiar with?");
			String skills[] = new String[6];
			for (int i = 0; i < 6; i++) {
				skills[i] = sc.next();
			}
			if (Arrays.asList(skills).contains("Java") && Arrays.asList(skills).contains("React")
					&& Arrays.asList(skills).contains("SQL")) {
				System.out.println("Your Qualification matches to the job profile");
				System.out.print("How many years of experience? ");
				int experience = sc.nextInt();
				if (experience >= 0 && experience <= 4) {
					System.out.print("What is your current location? ");
					String loc = sc.next();
					if (loc.equalsIgnoreCase("Banglore") || loc.equalsIgnoreCase("Hyderabad")) {
						System.out.println("What is your current salary?");
						double current = sc.nextDouble();
						if (current >= 1000000) {
							System.out.println("The Job does not suits you as we are providing 1000000 per annum");
						} else {
							System.out.println("What is your salary Expectation? ");
							double sal = sc.nextDouble();
							if (sal >= 300000 && sal <= 1000000) {
								System.out.println("we are ok with it");
								System.out.println("What is your notice period?");
								int np = sc.nextInt();
								if (np >= 0 && np <= 15) {
									System.out.println("Congratulations we will mail the offer letter");
									System.out.println("The total pay and the information documents");
								} else {
									System.out.println("Sorry we are looking for immediate Joiners");
								}
							} else if (sal > 1000000) {
								System.out.println(
										"As per Company Standards we can only provide you a 1000000 per annum ");
							} else {
								System.out.println("You are not upto the mark");
								System.out.println("Explain why you choose the salary as expected");
								System.out.println("Sorry we are looking for more skills");
							}
						}
					} else {
						System.out.println("Are you willing to relocate? ");
						String relocate = sc.next();
						if (relocate.equalsIgnoreCase("yes") || relocate.equalsIgnoreCase("ok")) {
							System.out.println("What is your salary Expectation? ");
							double sal1 = sc.nextDouble();
							if (sal1 >= 300000 && sal1 <= 1000000) {
								System.out.println(" we are ok with it");
								System.out.println("What is your notice period?");
								int np = sc.nextInt();
								if (np >= 0 && np <= 15) {
									System.out.println("Congratulations we will mail the offer letter");
									System.out.println("The total pay and the information documents");
								} else {
									System.out.println("Sorry we are looking for immediate Joiners");
								}
							} else if (sal1 > 1000000) {
								System.out.println(
										"As per Company Standards we can only provide you a 1000000 per annum ");
							} else {
								System.out.println("You are not upto the mark");
								System.out.println("Explain why you choose the salary as expected");
								System.out.println("Sorry we are looking for more skills");
							}
						} else {
							System.out.println("Sorry ,The job role requires reloaction");
						}
					}
				} else if (experience > 4) {
					System.out.println("Sorry We the job doesn't matches with your profile");
					System.out.println("We request you to apply for the jobs based on your experience");
				} else {
					System.out.println("Invalid Experience");
				}
			}
			else {
				System.out.println("The Skills doesn't match to the job role");
			}
		} else {
			System.out.println("Sorry ,we regret to inform you that you are not shortlisted");
		}

	}

}
