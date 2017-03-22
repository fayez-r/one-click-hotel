[![Build Status](https://travis-ci.org/alrafeea/one-click-hotel.svg?branch=master)](https://travis-ci.org/alrafeea/one-click-hotel)

# README

One Click Hotel (https://one-click-hotel.herokuapp.com) is a simple web site to reserve hotels online, it uses data from Expedia (www.expedia.com) to provide information about hotels and their offers in order to provide best deal for users.

## Requirements

1. Java 1.8 installed, for help see https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html
2. Tomcat 8 installed, for help see https://tomcat.apache.org/tomcat-8.0-doc/setup.html
3. Git installed, for help see https://git-scm.com/book/en/v2/Getting-Started-Installing-Git
4. Maven installed, for help see https://maven.apache.org/install.html


## Application Setup

1. Create new directory in local machine
2. Open command line and switch to that directory
3. Use git command "git clone https://github.com/alrafeea/one-click-hotel.git" to clone project into local folder


## Application Build

1. Use command line to switch to the project directory
2. Execute command "mvn install" to install artifacts into the local repository 


## Run using App Runner

1. Use command line to switch to the project directory
2. execute command "java -jar target/dependency/webapp-runner.jar target/*.war", it should be run on "http://localhost:8080"


## Run on Tomcat

1. Copy the war file "one-click-hotel*.war" from the "target" folder to the "webapps" folder inside %TOMCAT_HOME%
2. Rename war file into "one-click-hotel.war"
3. Start Tomcat, the site should be run on "http://localhost:8080/one-click-hotel"
