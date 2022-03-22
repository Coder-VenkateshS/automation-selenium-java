package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFiles {
	public static void main(String[] args) throws IOException {	
FileReader fileReader =  new FileReader("C:\\Users\\vinot\\Documents\\iamneo\\neo-java-workspace\\capgemini\\src\\io\\input.txt");
BufferedReader br = new BufferedReader(fileReader);
String line = null;
while((line = br.readLine())!=null)
		System.out.println(line);
	}
}
