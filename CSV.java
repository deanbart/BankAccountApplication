package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class CSV {
	// Read data from CSV file and return as a list
	public static LinkedList<String[]> read(String file) {
		LinkedList<String[]> data = new LinkedList<String[]>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));

			String dataRow = br.readLine();
			while ((dataRow = br.readLine()) != null) {
				String[] dataRecords = dataRow.split(","); // split rows via commas
				data.add(dataRecords);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("COULD NOT FIND FILE");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("COULD NOT READ FILE");
			e.printStackTrace();
		}
		return data;

	}
}
