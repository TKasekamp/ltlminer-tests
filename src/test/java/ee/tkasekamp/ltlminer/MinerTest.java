package ee.tkasekamp.ltlminer;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.deckfour.xes.model.XLog;
import org.junit.BeforeClass;
import org.junit.Test;
import org.processmining.plugins.ltlchecker.RuleModel;

import com.carrotsearch.junitbenchmarks.AbstractBenchmark;
import com.carrotsearch.junitbenchmarks.BenchmarkOptions;

import ee.tkasekamp.ltlminer.FormulaUtil;
import ee.tkasekamp.ltlminer.util.XLogReader;

public class MinerTest extends AbstractBenchmark {

	@BeforeClass
	public static void setUp() throws Exception {
		FormulaUtil.readFormulas();
	}

	// Test for testing tests
	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testExercise1() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader.openLog("src/test/resources/exercise1.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, FormulaUtil.formulas,
				0.0);
		assertEquals(295, result.size());
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testFinancial() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("C:/Users/Administrator/dev/logs/financial_log.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, FormulaUtil.formulas,
				0.0);
		assertNotEquals(0, result.size());
	}
	
	// Trace number changes 100 - 7000
	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt100len15a20() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("C:/Users/Administrator/dev/logs/logt100len15a20.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, FormulaUtil.formulas,
				0.0);
		assertNotEquals(0, result.size());
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt200len15a20() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("C:/Users/Administrator/dev/logs/logt200len15a20.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, FormulaUtil.formulas,
				0.0);
		assertNotEquals(0, result.size());
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt500len15a20() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("C:/Users/Administrator/dev/logs/logt500len15a20.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, FormulaUtil.formulas,
				0.0);
		assertNotEquals(0, result.size());
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt700len15a20() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("C:/Users/Administrator/dev/logs/logt700len15a20.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, FormulaUtil.formulas,
				0.0);
		assertNotEquals(0, result.size());
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt1000len15a20() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("C:/Users/Administrator/dev/logs/logt1000len15a20.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, FormulaUtil.formulas,
				0.0);
		assertNotEquals(0, result.size());
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt2000len15a20() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("C:/Users/Administrator/dev/logs/logt2000len15a20.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, FormulaUtil.formulas,
				0.0);
		assertNotEquals(0, result.size());
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt5000len15a20() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("C:/Users/Administrator/dev/logs/logt5000len15a20.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, FormulaUtil.formulas,
				0.0);
		assertNotEquals(0, result.size());
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt7000len15a20() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("C:/Users/Administrator/dev/logs/logt7000len15a20.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, FormulaUtil.formulas,
				0.0);
		assertNotEquals(0, result.size());
	}

	// Trace lenght changes 5 - 30
	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt1000len5a20() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("C:/Users/Administrator/dev/logs/logt1000len5a20.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, FormulaUtil.formulas,
				0.0);
		assertNotEquals(0, result.size());
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt1000len10a20() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("C:/Users/Administrator/dev/logs/logt1000len10a20.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, FormulaUtil.formulas,
				0.0);
		assertNotEquals(0, result.size());
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt1000len20a20() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("C:/Users/Administrator/dev/logs/logt1000len20a20.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, FormulaUtil.formulas,
				0.0);
		assertNotEquals(0, result.size());
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt1000len25a20() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("C:/Users/Administrator/dev/logs/logt1000len25a20.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, FormulaUtil.formulas,
				0.0);
		assertNotEquals(0, result.size());
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt1000len30a20() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("C:/Users/Administrator/dev/logs/logt1000len30a20.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, FormulaUtil.formulas,
				0.0);
		assertNotEquals(0, result.size());
	}

	// Alphabet change 5 - 50
	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt1000len15a5() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("C:/Users/Administrator/dev/logs/logt1000len15a5.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, FormulaUtil.formulas,
				0.0);
		assertNotEquals(0, result.size());
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt1000len15a10() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("C:/Users/Administrator/dev/logs/logt1000len15a10.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, FormulaUtil.formulas,
				0.0);
		assertNotEquals(0, result.size());
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt1000len15a30() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("C:/Users/Administrator/dev/logs/logt1000len15a30.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, FormulaUtil.formulas,
				0.0);
		assertNotEquals(0, result.size());
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt1000len15a40() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("C:/Users/Administrator/dev/logs/logt1000len15a40.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, FormulaUtil.formulas,
				0.0);
		assertNotEquals(0, result.size());
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testlogt1000len15a50() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("C:/Users/Administrator/dev/logs/logt1000len15a50.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, FormulaUtil.formulas,
				0.0);
		assertNotEquals(0, result.size());
	}
	
	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testDetailIncident() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader.openLog("C:/Users/Administrator/dev/logs/DetailIncidentActivity.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, FormulaUtil.formulas,
				0.0);
		assertNotEquals(0, result.size());
	}

}
