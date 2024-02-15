package com.annuairealex.phonebook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PhoneBook {
	public static Scanner sc = null;
	public static final String URL_BOOK_FILE_PATH = "C:\\Users\\The Flying Sharks\\Desktop\\Travail ALEX webDevelopper\\Formation JAVA\\phonebook.txt";

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		String userLastName = getUserInput("write lastname");
		String userFirstName = getUserInput("write firstname");
		String userPhoneNumber = getUserInput("write phone");

		Contact newContact = new Contact(userFirstName, userLastName,
				userPhoneNumber);

		System.out.println(newContact.toString());

		File phoneBookFile = getOrCreatePhoneBookFile(
				URL_BOOK_FILE_PATH);

		addContactToFile(newContact, phoneBookFile);

		sc.close();
	}

	private static void addContactToFile(Contact newContact, File phoneBookFile) {
		try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(phoneBookFile, true))) {

			fileWriter.append(newContact.toString() + '\n');
			fileWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static File getOrCreatePhoneBookFile(String phoneBookkFilePath) {
		File phoneBookFile = new File(phoneBookkFilePath);

		if (phoneBookFile.exists()) {
			return phoneBookFile;
		}

		try {
			phoneBookFile.createNewFile();
			System.out.println("fichier créé " + phoneBookFile);
			return phoneBookFile;
		} catch (IOException e) {

			e.printStackTrace();
		}
		return null;
	}

	public static String getUserInput(String userRequest) {
		System.out.println(userRequest);
		return sc.nextLine();
	}
}
