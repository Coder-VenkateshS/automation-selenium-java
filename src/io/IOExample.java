package io;

import java.io.File;
import java.io.IOException;

// Stream - a sequence of data in Java, composed of bytes
// IO streams
// System.out
// System.in 
// System.err
// all these 3 streams are integrated with the console
// Output Stream Class - abstract in nature
// void write
// FileInputStream -> Buffered, DataInputStream,PushbackInputStream
// ByteArrayInputStream
// PipedInputStream
// ObjectInputStream
// Getting file inputs in java

public class IOExample {
	public static void main(String[] args) {
		try {
		File file = new File("C:\\Users\\vinot\\Documents\\iamneo\\neo-java-workspace\\capgemini\\src\\io\\input_1.txt");
		String path = file.getAbsolutePath();
		File f = new File("C:\\Users\\vinot\\Documents\\iamneo");
		String filenames[] = f.list();
		for (String filename: filenames) {
			System.out.println(filename);
		}
		System.out.println(path);
		if(file.createNewFile()) {
			System.out.println("New file is create");
		}
		else {
			System.out.println("failed to create a file");
		}
		}catch(IOException ioexception) {
			System.out.println(ioexception);
		}
	}
}
