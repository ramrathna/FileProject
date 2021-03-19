import java.io.FileWriter;
import java.io.IOException;

public class file_write {
	public static void main(String[] args) {
		try {
			FileWriter nav=new FileWriter("D:\\naveen\\prasad.txt");
			nav.write("Naveen Prasad is very good boy.");
			nav.close();
			System.out.println("successfully wrote on the file");
		}
		catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}


}
