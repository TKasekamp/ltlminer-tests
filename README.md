# ltlminer-tests
LTLMiner and TLQC performance tests

Use `run-test.sh` to run performance tests. All tests will be started with a separate command so that the result files will be in different files. This is because the tests will take a really long time and I don't want to lose the results.

`run-detail-test.sh` will run the test for a real-life log. It will be a long test.

`run-ltlminer-query-test.sh` and `run-tlqc-query-test.sh` will test individual query performance for a standard log. 

### Results
Tests in the ltlminer and tlqc folders were run on a Windows server. Tests in ltlminer-query and tlqc-query folders were run on a relatively powerful PC. 
