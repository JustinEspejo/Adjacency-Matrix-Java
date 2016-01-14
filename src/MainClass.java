//Justin Espejo
//Project 2 CS323
// Adjacency Matrixs

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class MainClass {

	private static BufferedReader br;

	public static void main(String args[]){
		String name = "";
			if(args == null || args.length == 0) System.out.println("You did not enter the name of the file.");
			else {
				try {
					name = readFile(args[0]);
					System.out.println(name);
				} catch (IOException e) {
					System.out.println("That File Does NOT Exist!!!");
				}
			}

		Matrix m = new Matrix(Integer.parseInt(name));
		try 
		{
			printtoTxt(m.getVertices());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 


	}
	
	private static void printtoTxt(String m) throws FileNotFoundException{
		PrintWriter pw1 = new PrintWriter(new File("Output.txt"));
		pw1.print(m);
		pw1.close();
	}
	
	private static String readFile(String fileName) throws IOException {

		br = new BufferedReader(new FileReader(fileName));
		String line = br.readLine();
		return line;
	}
	
}
