package de.exxcellent.challenge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Calculation {

	// read the CSV File and transform it into an array
	public String[][] readFile(String filepath) {
		String value = new String("");
		ArrayList<String> readInto = new ArrayList<String>();
		try {

			BufferedReader reader = new BufferedReader(new FileReader(filepath));

			do {
				value = reader.readLine();
				readInto.add(value);

			} while (value != null);

			reader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		String[][] data = new String[readInto.size() - 1][readInto.get(0).split(",").length];

		for (int a = 0; a < readInto.size() - 1; a++) {
			for (int b = 0; b < readInto.get(0).split(",").length; b++) {
				data[a][b] = readInto.get(a).split(",")[b];

			}
		}
		return data;
	}

	// Calculate the minimum absolute Difference between two columns
	public String MinDifference(int col1, int col2, String[][] data) {

		double[] diff;
		double min = 1000;
		int index = 0;
		// get the difference
		diff = new double[data.length];
		for (int c = 1; c < data.length; c++) {
			try {
				diff[c - 1] = Double.valueOf(data[c][col1]) - Double.valueOf(data[c][col2]);

			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

		}
		// compare the difference until the lowest value is found
		for (int d = 0; d < diff.length - 1; d++) {
			if (Math.abs(diff[d]) < Math.abs(min)) {
				min = diff[d];
				index = d;
			}

		}
		return data[index + 1][0];

	}
}
