package de.exxcellent.challenge;

/**
 * The entry class for your solution. This class is only aimed as starting point
 * and not intended as baseline for your software design. Read: create your own
 * classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

	/**
	 * This is the main entry method of your program.
	 * 
	 * @param args The CLI arguments passed
	 */
	public static void main(String... args) {

		Calculation c = new Calculation();
		String dayWithSmallestTempSpread = c.MinDifference(1, 2,
				c.readFile("src/main/resources/de/exxcellent/challenge/weather.csv")); // Your day analysis function
																						// call …
		System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

		String teamWithSmallestGoalSpread = c.MinDifference(5, 6,
				c.readFile("src/main/resources/de/exxcellent/challenge/football.csv")); // Your goal analysis function
																						// call …
		System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
	}

}
