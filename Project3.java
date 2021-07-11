/*
 * Project 3
 * CS 2261 Summer 2021 UMSL
 * Author: Illia Arzamastsev
 * 
 * Base64 is one of several encoding schemes used to encode binary data in a text based representation (ASCII) using a radix-64 representation. Although there are several other variants among them Base16 and Base32, it is Base64 which is the most prevalent and popular. The need for Base64 arose during the advent of email. During which time folks began to speculate with the possibility of using attachments with things like images, videos or other binary data. Since STMP (Simple Mail Transfer Protocol) only supported 7-bit ASCII characters within the messages, there was a need to be able to encode this binary data and convert it into a format that was universally supported without having to affect the current infrastructure of email servers and the SMTP protocol.
 * For this project, we will be using the org.apache.commons.codec.binary.Base64 class from the Apache Commons Codec library.  So you will need to pull that dependency into your pom.xml file.
 * Create a class that does two things:
 * Decode and print out: SSBsb3ZlIG15IENNUCBTQ0kgMjI2MSBjbGFzcyBzbyBtdWNoLCBJIHdpc2ggSSBjb3VsZCBiZSBqdXN0IGFzIGNvb2wgYXMgbXkgcHJvZmVzc29y
 * Takes in a string and Encodes that string then prints to standard output.
 * */

import java.util.Base64;
import java.util.Scanner;

public class Project3 {
	//Main method
	public static void main(String[] args) {
		String encodedMessage = "SSBsb3ZlIG15IENNUCBTQ0kgMjI2MSBjbGFzcyBzbyBtdWNoLCBJIHdpc2ggSSBjb3VsZCBiZSBqdXN0IGFzIGNvb2wgYXMgbXkgcHJvZmVzc29y";
		//Decode the message
		byte[] decodedMessage = Base64.getDecoder().decode(encodedMessage);
		
		//Convert to string
		String decodedString = new String(decodedMessage);
		//Print out the decoded string
		System.out.println(decodedString);
		
		//Ask user to enter new string
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter string to encode : ");
	    
		String input = scanner.nextLine();
	    //encode the message
		encodedMessage = Base64.getEncoder().encodeToString(input.getBytes());
		System.out.println("Encoded string is : "+encodedMessage);	
	}
}
