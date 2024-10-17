package Jasshwanth.file;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;


public class FileHandling {

	public static void main(String[] args) throws IOException {
		File f =new File("C:\\javafile\\resume.txt");//here we can giving path of file creating.
		//now here we creating file
		System.out.println(f.createNewFile());
		//here  we can check  the file already is there or not.
		System.out.println(f.exists());
		//here we can delete the file .
		System.out.println(f.delete());
		System.out.println(f.canWrite());
		System.out.println(f.setWritable(true));
		System.out.println(f.mkdir());//it create the only one floder
		System.out.println(f.mkdirs());//it can create the sub files.
		//here we check the file if exists then deleting it then again creating new file. 
		if(f.exists());
		f.delete();
		f.createNewFile();
//		File f = new File("C:\\Program Files");
		////here  we can give the floder full path then it show the all sub files  of path.
//		System.out.println(Arrays.toString(f.listFiles()));
		
//		System.out.println(new Date(f.lastModified())); //it print the time and date and year.
	}

}
