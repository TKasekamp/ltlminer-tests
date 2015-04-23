package ee.tkasekamp.tlqctester;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

import com.carrotsearch.junitbenchmarks.AbstractBenchmark;
import com.carrotsearch.junitbenchmarks.BenchmarkOptions;

public class TLQCTest extends AbstractBenchmark {

	/**
	 * 
	 * @throws IOException
	 */
	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testExercise1() throws IOException {
		String logPath = "\"C:\\Users\\Tonis\\git\\ltlminer-tests\\src\\test\\resources\\exercise1.xes\"";
		int counter = testHelper(logPath);
		assertEquals(295, counter - 1);
		;
	}

	private int testHelper(String logPath) throws IOException {

		String[] commands = { "cmd.exe", "/c",
				"cd \"src\\test\\resources\\tlqc\" && pickaxe.exe " + logPath };
		ProcessBuilder builder = new ProcessBuilder(commands);
		builder.redirectErrorStream(true);
		Process p = builder.start();
		BufferedReader r = new BufferedReader(new InputStreamReader(
				p.getInputStream()));
		String line;
		int counter = 0;
		while (true) {
			line = r.readLine();
			if (line == null) {
				break;
			}
			// System.out.println(line);
			counter++;
		}
		return counter;
	}
}
