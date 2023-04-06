package _01_File_Recorder;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileRecorder {
	// Create a program that takes a message from the user and saves it to a file.
	public static void main(String[] args) {
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	        try {
	            // Get message from user
	            System.out.print("Enter a message: ");
	            String message = reader.readLine();

	            // Create a FileWriter to write to the file
	            FileWriter writer = new FileWriter("message.txt");

	            // Write message to file
	            writer.write(message);

	            // Close the FileWriter
	            writer.close();

	            System.out.println("Message saved to file.");

	        } catch (IOException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	    }
	}

