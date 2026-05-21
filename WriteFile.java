package com.files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
public static void main(String[] args) throws IOException {
	try {
 FileWriter fw = new FileWriter("sum.txt"); 
 fw.write("A named location used to store related information is referred to as a File.");   
 fw.close();   
    System.out.println("Content is successfully wrote to the file."); 

} catch (IOException e) {  
 System.out.println("Unexpected error occurred");  
}
}  
}




