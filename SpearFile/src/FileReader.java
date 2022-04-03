import java.io.File;
import java.io.IOException;

public class FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File myObj = new File("bob.txt");
		try {
			if(myObj.createNewFile()) {
				System.out.println("File Created: " + myObj.getName());
			}else {
				System.out.println("File already exsits");
			}
		} catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}

	}

}



