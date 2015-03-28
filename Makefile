my-main:
	mvn exec:java -Dexec.mainClass=camelcoredemo.TimerMain -Dexec.args='-t'

test:
	mvn exec:java -Dexec.mainClass=org.apache.camel.main.Main -Dexec.args='-r camelcoredemo.TimerRouteBuilder'
