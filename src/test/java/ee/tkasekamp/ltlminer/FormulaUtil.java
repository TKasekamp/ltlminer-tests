package ee.tkasekamp.ltlminer;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class reads in the LTL formulas used for performance testing. The rules
 * are from "User-Guided Discovery of Declarative Process Models"
 * 
 * @author TKasekamp
 *
 */
public class FormulaUtil {
	public static String[] formulas;

	public static void readFormulas() {
		// Spliting at ";" because formulas are separated by this.
		formulas = readFormula("src/test/resources/ltlminer/testFormulas.txt")
				.split("(?<=;)");

		// The last element is an empty string
		formulas = Arrays.copyOf(formulas, formulas.length - 1);
	}

	private static String readFormula(String path) {
		String formulaText = "";

		InputStreamReader reader;
		try {
			reader = new InputStreamReader(new FileInputStream(path), "UTF-8");
			BufferedReader scanner = new BufferedReader(reader);
			String line;
			while ((line = scanner.readLine()) != null) {
				formulaText += line;

			}
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return formulaText;
	}

}
