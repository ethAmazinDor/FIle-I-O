import java.io.File;

public class GetFileInfo {
	public static void main(String[] args) {
		File myObj = new File("bob.txt");
		if(myObj.exists()) {
			System.out.println("File Name: " + myObj.getName());
			System.out.println("Path: " + myObj.getAbsolutePath());
			System.out.println("File Size: " + myObj.length());
			System.out.println("Last Modified: " + myObj.lastModified());
			
		}else {
			System.out.println("File Not Real");
		}
	}

}
