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

public class QueryTest extends AbstractBenchmark {

	@BeforeClass
	public static void setUp() throws Exception {
		FormulaUtil.readFormulas();
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testAllTest() throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("src/test/resources/logt1000len15a20.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, FormulaUtil.formulas,
				0.0);
		assertNotEquals(0, result.size());
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testInit() throws Exception {
		int result = testHelper(FormulaUtil.formulas[0]);
		assertEquals(20, result);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testExistence() throws Exception {
		int result = testHelper(FormulaUtil.formulas[1]);
		assertEquals(20, result);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testAbsence2() throws Exception {
		int result = testHelper(FormulaUtil.formulas[2]);
		assertEquals(20, result);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testCoExistence() throws Exception {
		int result = testHelper(FormulaUtil.formulas[3]);
		assertEquals(380, result);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testRespondedExistence() throws Exception {
		int result = testHelper(FormulaUtil.formulas[4]);
		assertEquals(380, result);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testResponse() throws Exception {
		int result = testHelper(FormulaUtil.formulas[5]);
		assertEquals(380, result);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testPrecedence() throws Exception {
		int result = testHelper(FormulaUtil.formulas[6]);
		assertEquals(380, result);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testSuccession() throws Exception {
		int result = testHelper(FormulaUtil.formulas[7]);
		assertEquals(380, result);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testAlternateResponse() throws Exception {
		int result = testHelper(FormulaUtil.formulas[8]);
		assertEquals(380, result);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testAlternatePrecedence() throws Exception {
		int result = testHelper(FormulaUtil.formulas[9]);
		assertEquals(380, result);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testAlternateSuccession() throws Exception {
		int result = testHelper(FormulaUtil.formulas[10]);
		assertEquals(380, result);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testChainResponse() throws Exception {
		int result = testHelper(FormulaUtil.formulas[11]);
		assertEquals(380, result);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testChainPrecedence() throws Exception {
		int result = testHelper(FormulaUtil.formulas[12]);
		assertEquals(380, result);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testChainSuccession() throws Exception {
		int result = testHelper(FormulaUtil.formulas[13]);
		assertEquals(380, result);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testNotCoExistence() throws Exception {
		int result = testHelper(FormulaUtil.formulas[14]);
		assertEquals(380, result);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testNotSuccession() throws Exception {
		int result = testHelper(FormulaUtil.formulas[15]);
		assertEquals(380, result);
	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testNotChainSuccession() throws Exception {
		int result = testHelper(FormulaUtil.formulas[16]);
		assertEquals(380, result);
	}

	private int testHelper(String formula) throws Exception {
		LTLMiner miner = new LTLMiner(false);
		XLog log = XLogReader
				.openLog("src/test/resources/logt1000len15a20.xes");
		ArrayList<RuleModel> result = miner.mineAll(log, formula, 0.0);
		return result.size();
	}

}
