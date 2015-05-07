# Every query tested separately
mvn test -q -Dtest=QueryTest#testInit -Djub.xml.file=results/ltlminer-query/testInit.xml
mvn test -q -Dtest=QueryTest#testExistence -Djub.xml.file=results/ltlminer-query/testExistence.xml
mvn test -q -Dtest=QueryTest#testAbsence2 -Djub.xml.file=results/ltlminer-query/testAbsence2.xml
mvn test -q -Dtest=QueryTest#testCoExistence -Djub.xml.file=results/ltlminer-query/testCoExistence.xml
mvn test -q -Dtest=QueryTest#testRespondedExistence -Djub.xml.file=results/ltlminer-query/testRespondedExistence.xml
mvn test -q -Dtest=QueryTest#testResponse -Djub.xml.file=results/ltlminer-query/testResponse.xml
mvn test -q -Dtest=QueryTest#testPrecedence -Djub.xml.file=results/ltlminer-query/testPrecedence.xml
mvn test -q -Dtest=QueryTest#testSuccession -Djub.xml.file=results/ltlminer-query/testSuccession.xml
mvn test -q -Dtest=QueryTest#testAlternateResponse -Djub.xml.file=results/ltlminer-query/testAlternateResponse.xml
mvn test -q -Dtest=QueryTest#testAlternatePrecedence -Djub.xml.file=results/ltlminer-query/testAlternatePrecedence.xml
mvn test -q -Dtest=QueryTest#testAlternateSuccession -Djub.xml.file=results/ltlminer-query/testAlternateSuccession.xml
mvn test -q -Dtest=QueryTest#testChainResponse -Djub.xml.file=results/ltlminer-query/testChainResponse.xml
mvn test -q -Dtest=QueryTest#testChainPrecedence -Djub.xml.file=results/ltlminer-query/testChainPrecedence.xml
mvn test -q -Dtest=QueryTest#testChainSuccession -Djub.xml.file=results/ltlminer-query/testChainSuccession.xml
mvn test -q -Dtest=QueryTest#testNotCoExistence -Djub.xml.file=results/ltlminer-query/testNotCoExistence.xml
mvn test -q -Dtest=QueryTest#testNotSuccession -Djub.xml.file=results/ltlminer-query/testNotSuccession.xml
mvn test -q -Dtest=QueryTest#testNotChainSuccession -Djub.xml.file=results/ltlminer-query/testNotChainSuccession.xml




