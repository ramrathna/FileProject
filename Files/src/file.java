
import java.io.File;
import java.io.IOException;
public class file {
	public static void main(String[] args) {
		try {
			File nav=new File("D:\\naveen\\prasad.txt");
			if(nav.createNewFile()){
				System.out.println("File has been successfully created " + nav.getName());
			}
			else {
				System.out.println("File already exists.");
			}
		}
		catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

}
