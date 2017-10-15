package com.corejava.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[]args) throws IOException, ClassNotFoundException {
		Student s1 = new Student("1","Vimal");
		
		OutputStream out =  new  FileOutputStream("E:/Vimal.dat");
		ObjectOutputStream Objout =  new ObjectOutputStream(out);
		Objout.writeObject(s1);
		
		out.close();
		Objout.close();
		
		System.out.println("Object Saved");
	}

}


