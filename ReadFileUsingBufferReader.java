package com.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingBufferReader {
public static void main(String[] args) throws FileNotFoundException {
	File f = new File("test1.txt");
	FileReader fr = new FileReader(f);
	BufferedReader br = new BufferedReader(fr);
	StringBuffer sb = new StringBuffer();  
    String line;  
try {
    while ((line = br.readLine()) != null) {  
        sb.append(line);  
        sb.append("\n");  
    }  

    fr.close();  

    System.out.println("Contents of File:");  
    System.out.println(sb.toString());  
} catch (IOException e) {  
    e.printStackTrace(); 
}
}
}