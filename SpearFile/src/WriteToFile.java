import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) {
		try {
		FileWriter myWriter = new FileWriter("bob.txt");
		myWriter.write("Completeing this assingment for professor Spear");
		myWriter.close();
		System.out.println("Successfully Wrote To The File");
	} catch (IOException e) {
		System.out.println("404 ERROR NOT FOUND");
		e.printStackTrace();
		}
	}
}