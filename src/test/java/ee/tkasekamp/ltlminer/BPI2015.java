package ee.tkasekamp.ltlminer;

import static org.junit.Assert.assertNotEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.deckfour.xes.model.XLog;
import org.junit.Test;
import org.processmining.plugins.ltlchecker.RuleModel;

import com.carrotsearch.junitbenchmarks.AbstractBenchmark;
import com.carrotsearch.junitbenchmarks.BenchmarkOptions;

import ee.tkasekamp.ltlminer.util.XLogReader;

public class BPI2015 extends AbstractBenchmark {

	@BenchmarkOptions(benchmarkRounds = 1, warmupRounds = 0)
	@Test
	public void test1() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("C:/Users/Tonis/Downloads/logs/BPIC15_1.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, init(), 0.0);
		assertNotEquals(0, result.size());
		System.out.println(result.size());
	}

	@BenchmarkOptions(benchmarkRounds = 1, warmupRounds = 0)
	@Test
	public void test2() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("C:/Users/Tonis/Downloads/logs/BPIC15_2.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, init(), 0.0);
		assertNotEquals(0, result.size());
		System.out.println(result.size());
	}

	@BenchmarkOptions(benchmarkRounds = 1, warmupRounds = 0)
	@Test
	public void test3() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("C:/Users/Tonis/Downloads/logs/BPIC15_3.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, init(), 0.0);
		assertNotEquals(0, result.size());
		System.out.println(result.size());
	}

	@BenchmarkOptions(benchmarkRounds = 1, warmupRounds = 0)
	@Test
	public void test4() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("C:/Users/Tonis/Downloads/logs/BPIC15_4.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, init(), 0.0);
		assertNotEquals(0, result.size());
		System.out.println(result.size());
		// for (RuleModel ruleModel : result) {
		// System.out.println(ruleModel.getCoverage() + " " +
		// ruleModel.getLtlRule());
		// }
	}

	@BenchmarkOptions(benchmarkRounds = 1, warmupRounds = 0)
	@Test
	public void test4t() throws Exception {
		String logPath = "\"C:\\Users\\Tonis\\Downloads\\logs\\BPIC15_4.xes\"";
		int counter = testHelper(logPath);
		assertNotEquals(1, counter);

		System.out.println(counter - 1);
	}

	@BenchmarkOptions(benchmarkRounds = 1, warmupRounds = 0)
	@Test
	public void test5() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("C:/Users/Tonis/Downloads/logs/BPIC15_5.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, init(), 0.0);
		assertNotEquals(0, result.size());
		System.out.println(result.size());
	}

	private String init() {
		return "formula rule4( A: activity , B: activity ) :=  { co-existence or (F?x) <-> (F?y)}"
				+ "	(<>(activity == A) <-> <>(activity == B));";
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
