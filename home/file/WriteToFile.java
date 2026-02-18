import java.io.FileWriter; // import file write class
import java.io.IOException; // import the IOException class

public class WriteToFile{
	public static void main(String []args){
		try{
			FileWriter myWriter = new FileWriter("name.txt");
			myWriter.write("my name is ashraful pathan!");
			myWriter.close();
			System.out.println("Successfully wrote to the file!");
		}catch(IOException e){
			System.out.println("Error is comming !");
			e.printStackTrace();
		}
	}
}