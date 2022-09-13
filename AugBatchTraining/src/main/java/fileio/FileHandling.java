package fileio;

import java.io.File;
import java.io.FileReader;

public class FileHandling {
	
	public static void main(String[] args) throws Exception{
		
		File  file= new  File("src/main/resources/local/abc.txt"); //fileObject
		
		//file.createNewFile(); // file.createNewFile();
		
		
		FileReader fileReader= new FileReader(file);
		int x=fileReader.read();
		while(x!=-1) {
			System.out.print((char)x);
			x=fileReader.read();

					
		}
		
		// 
	//file.mkdir();
		
		System.out.println("File is created..!!");
	}

}
