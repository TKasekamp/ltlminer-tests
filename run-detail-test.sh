# Real world event log test
#mvn test -q -Dtest=MinerTest#testDetailIncident -Djub.xml.file=results/ltlminer/testDetailIncident.xml

#mvn test -q -Dtest=TLQCTest#testDetailIncident -Djub.xml.file=results/tlqc/testDetailIncident.xml


mvn test -q -Dtest=MinerTest#testFinancial -Djub.xml.file=results/ltlminer/testFinancial.xml
mvn test -q -Dtest=TLQCTest#testFinancial -Djub.xml.file=results/tlqc/testFinancial.xml

