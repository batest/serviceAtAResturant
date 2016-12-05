package batest.edu.clarkson.ee242;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 
 */


public class Restaurant {
	public static void main(String args[]){
/*		System.out.println("Please enter a file name:");
			try{
				InputStreamReader inputStreamReader = new InputStreamReader( System.in);
				BufferedReader bufferedReader = new BufferedReader (inputStreamReader);
				String inLine;
				do{
					inLine= bufferedReader.readLine();
					System.out.println(inLine);
				} while (!inLine.equals( "DONE"));
				bufferedReader.close();
			} catch (IOException ioe){
				System.err.println("IO Exception occurred!");
				}
			}*/
		String file = "C:/Users/Troy Bates/Downloads/general.txt";
		try{
			BufferedReader bufferedReader = new BufferedReader ( new FileReader ( file));
			String nextLine;
			int count=0;
				while ((nextLine = bufferedReader.readLine()) != null){
					if (count <1){
						int numOfWaiters = Integer.parseInt(nextLine);
						System.out.println(numOfWaiters);
					}
					else{
					System.out.println(nextLine);
					}
					count++;
				}
			bufferedReader.close();
		}catch (FileNotFoundException fnfe){
			System.err.println("File Does not exist!");
			}
		catch (IOException ioe){
			System.err.println("IO Exception occurred!");
		}
	}
}