# Real world event log test
#mvn test -q -Dtest=MinerTest#testDetailIncident -Djub.xml.file=results/ltlminer/testDetailIncident.xml

#mvn test -q -Dtest=TLQCTest#testDetailIncident -Djub.xml.file=results/tlqc/testDetailIncident.xml


#mvn test -q -Dtest=MinerTest#testFinancial -Djub.xml.file=results/ltlminer/testFinancial.xml
#mvn test -q -Dtest=TLQCTest#testFinancial -Djub.xml.file=results/tlqc/testFinancial.xml

#mvn test -q -Dtest=MinerTest#testHospital -Djub.xml.file=results/ltlminer/testHospital.xml
#mvn test -q -Dtest=TLQCTest#testHospital -Djub.xml.file=results/tlqc/testHospital.xml


#mvn test -q -Dtest=BPI2015#test4 -Djub.xml.file=results/ltlminer/test4.xml
#mvn test -q -Dtest=BPI2015#test4t -Djub.xml.file=results/tlqc/test4.xml
mvn test -q -Dtest=MinerTest#testBPI2013 -Djub.xml.file=results/ltlminer/BPI2013.xml
#mvn test -q -Dtest=TLQCTest#testBPI2013 -Djub.xml.file=results/tlqc/BPI2013.xml
