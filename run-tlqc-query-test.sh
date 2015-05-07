# Unfortunately there is no easy way to test TLQC one query at a time. So the queries file has to be changed manually before every test.
mvn test -q -Dtest=TLQCQueryTest#testSingleQuery -Djub.xml.file=results/tlqc-query/testNotChainSuccession.xml




