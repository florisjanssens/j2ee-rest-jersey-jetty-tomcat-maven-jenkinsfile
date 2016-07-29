# j2ee-rest-jersey-jetty-tomcat-maven-jenkinsfile
Proving ground for J2EE 7 RESTful web services. Jersey will provide grunt for REST. Jetty local development but Tomcat for Integration testing. Maven build framework with Jenkins organising. If that is not enough then SonarQube and Jacoco for code coverage.

* If you just want to play with and extend the JAX-RS REST hello world example then install [Developer Tools](#developer), download sources and go have fun
* If you want to have fun with [Jenkins 2.x Pipeline](https://jenkins.io/doc/pipeline) then install [Deployment Pipeline)[deployment-pipeline] tools. 
* If you want to have fun with [Jenkinsfile](https://jenkins.io/doc/pipeline/jenkinsfile) then you need:
  * to fork this repository
  * the Developer tools
  * the Deployment tools 

This plaground was setup in **July 2016** 

# Development 
## Compile and run on Jetty for local development

	mvn clean compile jetty:run

NOTE: For hot reload to work, 'Eclipse->Project->Build Automatically' should be enabled

## URLS

-   <http://localhost:9998/app/hello>
-   [Default index page](http://localhost:9998/)

# Intergration Testing
## Build War for Tomcat hot deployment 

	mvn clean package

## Deployment to Intergration Test - i.e. standalone Tomcat
### Manual

Copy war into webapps folder of running tomcat instance

## URLS

-   <http://localhost:8080/RESTful/app/hello>
-   [Default index page](http://localhost:8080/RESTful/)

## Developer

-   [JDK 8u91](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
-   [Github Desktop](https://desktop.github.com/)
-   [Java Platform, Enterprise Edition (Java EE) 7 - RESTful Web Services with JAX-RS](https://docs.oracle.com/javaee/7/tutorial/jaxrs.htm#GIEPU)
-   [Jersey, 2.23.1](https://jersey.java.net/download.html)
-   [Apache Maven, 3.3.9](https://maven.apache.org/download.cgi)
-   [Eclipse - Java EE Developers, Neon](https://www.eclipse.org/downloads/eclipse-packages/)

# Deployment Pipeline

The following tools are used in my hello world deployment pipeline:

-   [JDK 8u91](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
-   [Git Client](https://git-scm.com/downloads)
-   [Apache Tomcat, 8.5.4](http://tomcat.apache.org/download-80.cgi)
-   [Jenkins, 2.15](https://jenkins.io/)
-   [Nexus, 3.01](http://www.sonatype.com/download-oss-sonatype)
-   [SonarQube, 5.6.1](http://www.sonarqube.org/downloads/)

Applications use their default ports hence are available on:

-   [Tomcat](http://localhost:8080)
-   [Jenkins](http://localhost:9090)
-   [Nexus](http://localhost:8081)
-   [SonarQube](http://localhost:9000)

Applications are used **as is** except for Jenkins which needs to be informed of where [tools are located](http://localhost:9090/configureTools):

* JDK
* Maven
  ** Use **M3** as maven client name 
* Git Client

I use the following [launcher scripts](tree/master/src/site/resources) 

-   F:\Apps\Nexus\NexusRunner.cmd
-   F:\Apps\SonarQube\sonarqube-5.6.1\bin\windows-x86-64\StartSonar.bat
-   F:\Apps\Tomcat\TomcatRunner.cmd
-   F:\Apps\Jenkins\JenkinsRunner.cmd

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

* https://wiki.jenkins-ci.org/display/JENKINS/Starting+and+Accessing+Jenkins

-   <https://jenkins.io/doc/pipeline>
-   <https://jenkins.io/doc/pipeline/jenkinsfile>
-   <https://jenkins.io/doc/pipeline/steps>
-   [Pipeline Syntax Snippet Generator](http://localhost:9090/pipeline-syntax)

## SonarQube

-   <http://docs.sonarqube.org/display/SCAN/Analyzing+with+SonarQube+Scanner+for+Maven>

## Markdown

* https://guides.github.com/pdfs/markdown-cheatsheet-online.pdf
