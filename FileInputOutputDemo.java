package com.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputDemo{
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("test1.txt");
		String s = "This is file input/outputdemo";
		byte b[] = s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("file written sucesfully");
		//...........FileoutputStream
		
		FileInputStream fis = new FileInputStream("test1.txt");
//		byte [] allBytes= new byte[fis.available()];
//		fis.read();
		
//		byte[] a = fis.readAllBytes();
//		 fis.read(allBytes);
		int i;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
	      fis.close();
	//..............FileInputStream
	}
	
}
