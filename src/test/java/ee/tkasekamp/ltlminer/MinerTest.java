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
	static LTLMiner miner;
	static XLog log;

	@BeforeClass
	public static void setUp() throws Exception {
		miner = new LTLMiner(false);
		log = XLogReader.openLog("src/test/resources/exercise1.xes");
		FormulaUtil.readFormulas();

	}

	@BenchmarkOptions(benchmarkRounds = 3, warmupRounds = 0)
	@Test
	public void testExercise1() {
		ArrayList<RuleModel> result = miner.mineAll(log, FormulaUtil.formulas,
				0.0);
		assertEquals(295, result.size());
	}

}
