package com.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataUsingScanner {
public static void main(String[] args) throws FileNotFoundException {
	File f = new File("test1.txt");
	try {
		Scanner sc = new Scanner(f) ;
		while (sc.hasNextLine()) {
			String data= sc.nextLine();
			System.out.println(data);
		}
			sc.close();
		}catch(FileNotFoundException e) {
			System.out.println("unexpected error");
		}
		
	}
}

