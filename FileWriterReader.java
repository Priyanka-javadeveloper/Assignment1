package com.files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriterReader {
public static void main(String[] args) throws IOException {
FileWriter fw = new FileWriter("test2.txt");
String s = "This is writer demo";
fw.write(s);
fw.flush();
fw.close();

FileReader fr = new FileReader("test2.txt");
int i;
while((i=fr.read())!=-1) {
	System.out.print((char)i);
}
fr.close();
}
}


