# Real world event log test
mvn test -q -Dtest=MinerTest#testDetailIncident -Djub.xml.file=results/ltlminer/testDetailIncident.xml

mvn test -q -Dtest=TLQCTest#testDetailIncident -Djub.xml.file=results/tlqc/testDetailIncident.xml


