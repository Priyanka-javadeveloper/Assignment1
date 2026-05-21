package com.files;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class CreatingFileWithScanner  {
public static void main(String[] args) {
	try {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter file name:");
	String name = sc.nextLine();
	FileOutputStream fos = new FileOutputStream(name, true);
	System.out.println("enter file content");
	String str = sc.nextLine();
	byte[] b = str.getBytes();
	fos.write(b);
	fos.flush();
	fos.close();
	}catch(Exception e ) {
		e.printStackTrace();
	}
}
}