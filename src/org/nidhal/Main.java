package org.nidhal;

import java.util.*;

/**
 * 
 * @author Nidhal Messaoudi
 * @date 12/7/2021
 * @copyright © 2021. All rights are reserved.
 * 
 */
public class Main {
	private static final Scanner SCANNER = new Scanner(System.in);
	private static int choice;
	private static double finalScore;
	
	public static void main(String[] args) {
		boolean quit = false;
		System.out.println("This application provides the opportunity for "
				+ "the tunisians \nwho successfully passed the BAC exam "
				+ "to calculate \ntheir score (Formule Globale).");
		printOptions();
		while (!quit) {
			System.out.print("Enter your choice: ");
			if (SCANNER.hasNextInt()) {				
				choice = SCANNER.nextInt();
				SCANNER.nextLine();
			} else {
				tryAgain();
				continue;
			}
			switch (choice) {
				case 0:
					printOptions();
					break;
				case 1:
					if (!getMathScore()) continue;
					System.out.println("Your final score (Bac Math) is " + 
							String.format("%.2f", finalScore));
					break;
				case 2:
					if (!getSienceScore()) continue;
					System.out.println("Your final score (Bac Science) is " +
							String.format("%.2f", finalScore));
					break;
				case 3:
					if (!getTechScore()) continue;
					System.out.println("Your final score (Bac Technology) is " +
							String.format("%.2f", finalScore));
					break;
				case 4:
					if (!getInfoScore()) continue;
					System.out.println("Your final score (Bac Info) is " +
							String.format("%.2f", finalScore));
					break;
				case 5:
					if (!getLettreScore()) continue;
					System.out.println("Your final score (Bac Lettre) is " +
							String.format("%.2f", finalScore));
					break;
				case 6:
					if (!getEcoScore()) continue;
					System.out.println("Your final score (Bac Eco) is " +
							String.format("%.2f", finalScore));
					break;
				case 7:
					if (!getSportScore()) continue;
					System.out.println("Your final score (Bac Sport) is " +
							String.format("%.2f", finalScore));
					break;
				case 8:
					System.out.println("Closing the program...");
					quit = true;
					break;
			}
		}
	}
	
	private static void printOptions() {
		System.out.println("So, press: ");
		System.out.println("\t0 - To print the options again.");
		ArrayList<String> options = new ArrayList<>();
		options.addAll(Arrays.asList("Math", "Science", "Tech", "Info",
				"Lettre","Eco", "Sport"));
		for (String option : options) {
			System.out.println("\t" + (options.indexOf(option) + 1) +
					" - To get your Bac " + option + " score.");
		}
		System.out.println("\t8 - To close the program.");
	}
	
	private static boolean getMathScore() {
		ArrayList<String> subjects = new ArrayList<>();
		subjects.addAll(Arrays.asList("moyenne générale", "note de Math", 
				"note de Physique", "note de Science", "note de Francais",
				 "note d'Englais"));
		ArrayList<Double> marks = new ArrayList<>();
		for (String subject : subjects) {
			System.out.print("Type your \"" + subject + "\": ");
			if (!SCANNER.hasNextDouble()) {
				tryAgain();
				return false;
			}
			marks.add(SCANNER.nextDouble());
			SCANNER.nextLine();
		}
		finalScore = new CalcMathScore(
				marks.get(0),
				marks.get(1),
				marks.get(2),
				marks.get(3),
				marks.get(4),
				marks.get(5)
				).getScore();
		return true;
	}
	
	private static boolean getSienceScore() {
		ArrayList<String> subjects = new ArrayList<>();
		subjects.addAll(Arrays.asList("moyenne générale", "note de Math", 
				"note de Physique", "note de Science", "note de Francais",
				 "note d'Englais"));
		ArrayList<Double> marks = new ArrayList<>();
		for (String subject : subjects) {
			System.out.print("Type your \"" + subject + "\": ");
			if (!SCANNER.hasNextDouble()) {
				tryAgain();
				return false;
			}
			marks.add(SCANNER.nextDouble());
			SCANNER.nextLine();
		}
		finalScore = new CalcSienceScore(
				marks.get(0),
				marks.get(1),
				marks.get(2),
				marks.get(3),
				marks.get(4),
				marks.get(5)
				).getScore();
		return true;
	}
	
	private static boolean getTechScore() {
		ArrayList<String> subjects = new ArrayList<>();
		subjects.addAll(Arrays.asList("moyenne générale", "note de Math", 
				"note de Physique", "note de Francais", "note d'Englais",
				"note de Tech"));
		ArrayList<Double> marks = new ArrayList<>();
		for (String subject : subjects) {
			System.out.print("Type your \"" + subject + "\": ");
			if (!SCANNER.hasNextDouble()) {
				tryAgain();
				return false;
			}
			marks.add(SCANNER.nextDouble());
			SCANNER.nextLine();
		}
		finalScore = new CalcTechScore(
				marks.get(0),
				marks.get(1),
				marks.get(2),
				marks.get(3),
				marks.get(4),
				marks.get(5)
				).getScore();
		return true;
	}
	
	private static boolean getInfoScore() {
		ArrayList<String> subjects = new ArrayList<>();
		subjects.addAll(Arrays.asList("moyenne générale", "note de Math", 
				"note de Physique", "note de Francais",
				 "note d'Englais", "note d'Algorithme",
				 "note de Technologies d'information et communication", 
				 "note de Base données"));
		ArrayList<Double> marks = new ArrayList<>();
		for (String subject : subjects) {
			System.out.print("Type your \"" + subject + "\": ");
			if (!SCANNER.hasNextDouble()) {
				tryAgain();
				return false;
			}
			marks.add(SCANNER.nextDouble());
			SCANNER.nextLine();
		}
		finalScore = new CalcInfoScore(
				marks.get(0),
				marks.get(1),
				marks.get(2),
				marks.get(3),
				marks.get(4),
				marks.get(5),
				marks.get(6),
				marks.get(7)
				).getScore();
		return true;
	}
	
	private static boolean getLettreScore() {
		ArrayList<String> subjects = new ArrayList<>();
		subjects.addAll(Arrays.asList("moyenne générale",
				"note de Francais", "note d'Englais",
				"note d'Arabe", "note de philosophie",
				"note d'Histoire et Géo"));
		ArrayList<Double> marks = new ArrayList<>();
		for (String subject : subjects) {
			System.out.print("Type your \"" + subject + "\": ");
			if (!SCANNER.hasNextDouble()) {
				tryAgain();
				return false;
			}
			marks.add(SCANNER.nextDouble());
			SCANNER.nextLine();
		}
		finalScore = new CalcLettreScore(
				marks.get(0),
				marks.get(1),
				marks.get(2),
				marks.get(3),
				marks.get(4),
				marks.get(5)
				).getScore();
		return true;
	}
	
	private static boolean getEcoScore() {
		ArrayList<String> subjects = new ArrayList<>();
		subjects.addAll(Arrays.asList("moyenne générale",
				"note de Francais", "note d'Englais",
				"note d'Eco", "note de Gestion",
				"note d'Histoire et Géo", "note de Math"));
		ArrayList<Double> marks = new ArrayList<>();
		for (String subject : subjects) {
			System.out.print("Type your \"" + subject + "\": ");
			if (!SCANNER.hasNextDouble()) {
				tryAgain();
				return false;
			}
			marks.add(SCANNER.nextDouble());
			SCANNER.nextLine();
		}
		finalScore = new CalcEcoScore(
				marks.get(0),
				marks.get(1),
				marks.get(2),
				marks.get(3),
				marks.get(4),
				marks.get(5),
				marks.get(6)
				).getScore();
		return true;
	}
	
	private static boolean getSportScore() {
		ArrayList<String> subjects = new ArrayList<>();
		subjects.addAll(Arrays.asList("moyenne générale", "note de Math", 
				"note de Physique", "note de Science",
				"note de Spécialité sportive", "note de sport",
				"note de philosophie", "note de francais",
				"note d'englais"));
		ArrayList<Double> marks = new ArrayList<>();
		for (String subject : subjects) {
			System.out.print("Type your \"" + subject + "\": ");
			if (!SCANNER.hasNextDouble()) {
				tryAgain();
				return false;
			}
			marks.add(SCANNER.nextDouble());
			SCANNER.nextLine();
		}
		finalScore = new CalcSportScore(
				marks.get(0),
				marks.get(1),
				marks.get(2),
				marks.get(3),
				marks.get(4),
				marks.get(5),
				marks.get(6),
				marks.get(7),
				marks.get(8)
				).getScore();
		return true;
	}
	
	private static void tryAgain() {
		SCANNER.nextLine();
		choice = -1;
		System.out.println("Invalid input! Try again");
	}
}
