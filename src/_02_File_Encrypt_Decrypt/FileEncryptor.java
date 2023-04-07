package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class FileEncryptor {
	public static void main(String[] args) {
		
	
	/*
	 * Encryption is the process of encoding a message or information
	 * in such a way that only authorized parties can access it and
	 * those who are not authorized cannot.
	 *
	 * A simple shift cipher works by shifting the letters of a message
	 * down based on a key. If our key is 4 then:
	 * 
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 * 
	 * becomes:
	 *
	 * e f g h i j k l m n o p q r s t u v w x y z a b c d
	 * 
	 * "Hello World" changes to "Lipps Asvph"
	 *
	 * Create a program that takes a message and a key from the user.
	 * Use the key to shift each letter in the users input and save the final result to a file.
	 */

	String msg = JOptionPane.showInputDialog("Enter a message: ");
	String strkey = JOptionPane.showInputDialog("Enter a key: ");
	 String shiftedMessage = "";
	int key = Integer.parseInt(strkey);
	for (int i = 0; i < msg.length(); i++) {
		 char c = msg.charAt(i);
		 char shiftedChar = (char) (c + key);
		 shiftedMessage += shiftedChar;
	}
	
	try {
		 FileWriter writer = new FileWriter("encrypted");
	     writer.write(shiftedMessage);
	     writer.close();
	     System.out.println(shiftedMessage + " saved into a file");
	}catch(IOException e){
		System.out.println("error");
	}
	
}
	 
}




//if (shiftedChar > 'z') {
//shiftedChar = (char) (shiftedChar - 26);
//} else if (shiftedChar < 'a') {
//shiftedChar = (char) (shiftedChar + 26);
//}