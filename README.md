# j2ee-rest-jersey-jetty-tomcat-maven-jenkinsfile
Proving ground for J2EE 7 RESTful web services. Jersey will provide grunt for REST. Jetty local development but Tomcat for Integration testing. Maven build framework with Jenkins organising. If that is not enough then SonarQube and Jacoco for code coverage

# Development 

## Compile and run on Jetty for local development

	mvn clean test jetty:run

NOTE: For hot reload to work, Eclipse->Project->Build Automatically should be enabled

## URLS

-   <http://localhost:9998/app/hello>
-   [Default index page](http://localhost:9998/)

# Intergration Testing
 
## Build War for Tomcat hot deployment 

	mvn clean package

## Deploy

 TODO for now manual copy into webapps folder of running tomcat instance

## URLS

-   <http://localhost:8080/RESTful/app/hello>
-   [Default index page](http://localhost:8080/RESTful/)

# Resources

-   [Java Platform, Enterprise Edition (Java EE) 7 - RESTful Web Services with JAX-RS](https://docs.oracle.com/javaee/7/tutorial/jaxrs.htm#GIEPU)
-   [Jersey, 2.23.1](https://jersey.java.net/download.html)
-   [Apache Tomcat, 8.5.x](http://tomcat.apache.org/download-80.cgi)
-   [Apache Maven, 3.3.9](https://maven.apache.org/download.cgi)

# References & Research

## REST Jersy

-   <https://www.ibm.com/developerworks/library/wa-aj-tomcat>
-   <http://www.vogella.com/tutorials/REST/article.html>
-   <https://jersey.java.net/documentation/latest/modules-and-dependencies.html>
-   <https://jersey.java.net/documentation/latest/deployment.html#deployment.servlet>

## REST Jersy Examples

-   <https://github.com/jersey/jersey/tree/master/examples/servlet3-webapp>
-   <https://github.com/jersey/jersey/blob/master/examples/java8-webapp>

## REST file upload

-   <https://javatutorial.net/java-file-upload-rest-service>
-   <https://jersey.java.net/documentation/latest/user-guide.html#multipart>
-   <http://howtodoinjava.com/jersey/jersey-file-upload-example>
-   <http://www.mkyong.com/webservices/jax-rs/file-upload-example-in-jersey>

## Tomcat 

-   <http://maven.apache.org/guides/introduction/introduction-to-the-pom.html#Available_Variables>

## Jenkins

-   <https://wiki.jenkins-ci.org/display/JENKINS/Starting+and+Accessing+Jenkins>
-   <https://jenkins.io/doc/pipeline>
-   <https://jenkins.io/doc/pipeline/jenkinsfile>
-   <https://jenkins.io/doc/pipeline/steps>
-   [Pipeline Syntax Snippet Generator](http://localhost:9090/pipeline-syntax)

## Jenkins - Tools

-   <https://git-scm.com/downloads>
-   Maven

