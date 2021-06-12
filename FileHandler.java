package SimpliLearn.HarshDedhia;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler {
	static File file = null;
	static String path = "D:\\aasdferq\\SimpliLearn\\Harsh_Dedhia\\LockedMe";
	//static String path = "D:\\Eclipse and Workspace\\WorkSpace\\LockedMe";
	static Scanner in = new Scanner(System.in);
	
	public static void sortedFileOutput() throws IOException {
		file = new File(path);
		String[] unsorted = file.list();
		int n = unsorted.length;
		String temp;
		for(int i = 0; i< n; i++) {
			for(int j = 0; j < n -(i+1); j++ ) {
				if(unsorted[j].compareTo(unsorted[j+1]) > 0) {
					temp = unsorted[j];
					unsorted[j] = unsorted[j+1];
					unsorted[j+1] = temp;
				}
			}
		} 
		n = 0;
		for (String fileName:unsorted) {
			System.out.println(" "+ ++n + ". " +fileName);
		}
		System.out.println("#-------------------------------------#");
	}
	
	public static void addNewFile(String str) throws IOException {
		String name = str;
		file = new File(path+"\\"+name);
		boolean result = file.createNewFile();
		if(result) {System.out.println(" File has been created!");}
		else {System.out.println(" File aleady exists!");}
		System.out.println("#-------------------------------------#");
		file = null;
	}
	
	public static void searchFile(String str) throws IOException {
		file = new File(path);
		for(String fileName:file.list()) {
			if(fileName.contains(str)) {int i = 0;System.out.println(" "+ ++i + ". " + fileName);}
		}
		System.out.println("#-------------------------------------#");
		file = null;
	}
	
	public static void deleteFile(String str) throws IOException {
		//String name = in.nextLine();
		file = new File(path+"\\"+str);
		boolean result = file.delete();
		if(result) {System.out.println(" File exists!");} 
		else {System.out.println(" File does not exist!");}
		System.out.println("#-------------------------------------#");
		file = null;
	}
	
	public static void stop() {
		in.close();
		file = null;
	}
	
	public static void changePath(String pathName) {
		path = pathName;
	}
}
