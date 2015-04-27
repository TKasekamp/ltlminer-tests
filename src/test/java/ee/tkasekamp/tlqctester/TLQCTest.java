package ee.tkasekamp.tlqctester;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

import com.carrotsearch.junitbenchmarks.AbstractBenchmark;
import com.carrotsearch.junitbenchmarks.BenchmarkOptions;

public class TLQCTest extends AbstractBenchmark {

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testExercise1() throws IOException {
		String logPath = "\"C:\\Users\\Tonis\\git\\ltlminer-tests\\src\\test\\resources\\exercise1.xes\"";
		int counter = testHelper(logPath);
		assertEquals(295, counter - 1);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt100len15a20() throws IOException {
		String logPath = "\"C:\\Users\\Administrator\\dev\\logs\\logt100len15a20.xes\"";
		int counter = testHelper(logPath);
		assertNotEquals(1, counter);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt200len15a20() throws IOException {
		String logPath = "\"C:\\Users\\Administrator\\dev\\logs\\logt200len15a20.xes\"";
		int counter = testHelper(logPath);
		assertNotEquals(1, counter);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt500len15a20() throws IOException {
		String logPath = "\"C:\\Users\\Administrator\\dev\\logs\\logt500len15a20.xes\"";
		int counter = testHelper(logPath);
		assertNotEquals(1, counter);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt700len15a20() throws IOException {
		String logPath = "\"C:\\Users\\Administrator\\dev\\logs\\logt700len15a20.xes\"";
		int counter = testHelper(logPath);
		assertNotEquals(1, counter);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt1000len15a20() throws IOException {
		String logPath = "\"C:\\Users\\Administrator\\dev\\logs\\logt1000len15a20.xes\"";
		int counter = testHelper(logPath);
		assertNotEquals(1, counter);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt2000len15a20() throws IOException {
		String logPath = "\"C:\\Users\\Administrator\\dev\\logs\\logt2000len15a20.xes\"";
		int counter = testHelper(logPath);
		assertNotEquals(1, counter);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt5000len15a20() throws IOException {
		String logPath = "\"C:\\Users\\Administrator\\dev\\logs\\logt5000len15a20.xes\"";
		int counter = testHelper(logPath);
		assertNotEquals(1, counter);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt7000len15a20() throws IOException {
		String logPath = "\"C:\\Users\\Administrator\\dev\\logs\\logt7000len15a20.xes\"";
		int counter = testHelper(logPath);
		assertNotEquals(1, counter);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt1000len5a20() throws IOException {
		String logPath = "\"C:\\Users\\Administrator\\dev\\logs\\logt1000len5a20.xes\"";
		int counter = testHelper(logPath);
		assertNotEquals(1, counter);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt1000len10a20() throws IOException {
		String logPath = "\"C:\\Users\\Administrator\\dev\\logs\\logt1000len10a20.xes\"";
		int counter = testHelper(logPath);
		assertNotEquals(1, counter);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt1000len20a20() throws IOException {
		String logPath = "\"C:\\Users\\Administrator\\dev\\logs\\logt1000len20a20.xes\"";
		int counter = testHelper(logPath);
		assertNotEquals(1, counter);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt1000len25a20() throws IOException {
		String logPath = "\"C:\\Users\\Administrator\\dev\\logs\\logt1000len25a20.xes\"";
		int counter = testHelper(logPath);
		assertNotEquals(1, counter);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt1000len30a20() throws IOException {
		String logPath = "\"C:\\Users\\Administrator\\dev\\logs\\logt1000len30a20.xes\"";
		int counter = testHelper(logPath);
		assertNotEquals(1, counter);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt1000len15a5() throws IOException {
		String logPath = "\"C:\\Users\\Administrator\\dev\\logs\\logt1000len15a5.xes\"";
		int counter = testHelper(logPath);
		assertNotEquals(1, counter);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt1000len15a10() throws IOException {
		String logPath = "\"C:\\Users\\Administrator\\dev\\logs\\logt1000len15a10.xes\"";
		int counter = testHelper(logPath);
		assertNotEquals(1, counter);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt1000len15a30() throws IOException {
		String logPath = "\"C:\\Users\\Administrator\\dev\\logs\\logt1000len15a30.xes\"";
		int counter = testHelper(logPath);
		assertNotEquals(1, counter);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt1000len15a40() throws IOException {
		String logPath = "\"C:\\Users\\Administrator\\dev\\logs\\logt1000len15a40.xes\"";
		int counter = testHelper(logPath);
		assertNotEquals(1, counter);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt1000len15a50() throws IOException {
		String logPath = "\"C:\\Users\\Administrator\\dev\\logs\\logt1000len15a50.xes\"";
		int counter = testHelper(logPath);
		assertNotEquals(1, counter);
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
