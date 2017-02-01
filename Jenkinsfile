node {
	// Mark the code checkout 'stage'....
	stage 'Checkout'
	
	// Get some code from a GitHub repository
	git 'https://github.com/florisjanssens/j2ee-rest-jersey-jetty-tomcat-maven-jenkinsfile.git'
	
	// Get the maven tool.
	// ** NOTE: This 'M3' maven tool must be configured
	// **       in the global configuration.           
	def mvnHome = tool 'M3'
	
	// Unit Tests
	// Mark the code build 'stage'....
	stage 'Unit Tests'
	// Run the maven build
	sh "${mvnHome}/bin/mvn -Dmaven.test.failure.ignore clean test"
	
	// Integration Tests
	// Mark the code build 'stage'....
	stage 'Integration Tests'
	// Run the maven build
	sh "${mvnHome}/bin/mvn -Dmaven.test.failure.ignore clean integration-test"
	
	// Mark the code build 'stage'....
	stage 'Package'
	// Run the maven build
	sh "${mvnHome}/bin/mvn -Dmaven.test.failure.ignore clean package"
	//step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])
	
	stage 'Release To Manual Test'
	input 'Deploy to local Tomcat?'
	
	stage 'Deploy To Manual Test'
	sh 'rm /opt/tomcat/webapps/restful.war'
	sh 'cp target/*.war restful.war'
	sh 'cp restful.war /opt/tomcat/webapps'
}