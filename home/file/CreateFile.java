import java.io.File; // import file class
import java.io.IOException; // Import IOException to handle errors


public class CreateFile{
	public static void main(String []args){
		try{
			File myObj = new File("name.txt");//create a file object 
			if (myObj.createNewFile()) { // Try to create the file
				System.out.println("File created: " + myObj.getName());
			}else{
				System.out.println("File alredy exists!");
			};
		}catch(IOException e){
			System.out.println("An error occurred!");
			e.printStackTrace();
		};
	}
}