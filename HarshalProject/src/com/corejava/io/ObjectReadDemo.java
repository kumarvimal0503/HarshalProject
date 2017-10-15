package com.corejava.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ObjectReadDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		InputStream in = new FileInputStream("E:/Vimal.dat");

		ObjectInputStream ObjIn = new ObjectInputStream(in);

		Student student = (Student)ObjIn.readObject();

		System.out.println("Name: "+student.name);
		
		ObjIn.close();
	}

}
