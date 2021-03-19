import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file_read {
	public static void main(String[]args) {
		try {
			File nav=new File("D:\\naveen\\prasad.txt");
			Scanner pra=new Scanner(nav);
			while(pra.hasNextLine()) {
				String data=pra.nextLine();
				System.out.println(data);
			}
			pra.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

}
