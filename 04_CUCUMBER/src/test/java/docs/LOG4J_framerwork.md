log4j is a reliable, fast and flexible logging framework (APIs) written in Java, which is distributed under the Apache Software License. log4j is a popular logging package written in Java. log4j has been ported to the C, C++, C#, Perl, Python, Ruby, and Eiffel languages.


This tutorial has been prepared for beginners to help them understand the basic functionality of log4J logging framework.

log4j is highly configurable through external configuration files at runtime. It views the logging process in terms of levels of priorities and offers mechanisms to direct logging information to a great variety of destinations, such as a database, file, console, UNIX Syslog, etc.

## log4j has three main components:

1) loggers: Responsible for capturing logging information.

2) appenders: Responsible for publishing logging information to various preferred destinations.

3) layouts: Responsible for formatting logging information in different styles.

# log4j Features
1) It is thread-safe.

2) It is optimized for speed.

3) It is based on a named logger hierarchy.

4) It supports multiple output appenders per logger.

5) It supports internationalization.

6) It is not restricted to a predefined set of facilities.

7) Logging behavior can be set at runtime using a configuration file.

8) It is designed to handle Java Exceptions from the start.

9) It uses multiple levels, namely ALL, TRACE, DEBUG, INFO, WARN, ERROR and FATAL.

10) The format of the log output can be easily changed by extending the Layout class.

11) The target of the log output as well as the writing strategy can be altered by implementations of the Appender interface.

12) It is fail-stop. However, although it certainly strives to ensure delivery, log4j does not guarantee that each log statement will be delivered to its destination.

# Pros and Cons of Logging
Logging is an important component of the software development. A well-written logging code offers quick debugging, easy maintenance, and structured storage of an application's runtime information.

Logging does have its drawbacks also. It can slow down an application. If too verbose, it can cause scrolling blindness. To alleviate these concerns, log4j is designed to be reliable, fast and extensible.

Since logging is rarely the main focus of an application, the log4j API strives to be simple to understand and to use.

log4j API package is distributed under the Apache Software License, a full-fledged open source license certified by the open source initiative.

The latest log4j version, including full-source code, class files and documentation can be found at http://logging.apache.org/log4j/.

To install log4j on your system, download apache-log4j-x.x.x.tar.gz from the specified URL and follow the steps give below.

## Step 1

Unzip and untar the downloaded file in /usr/local/ directory as follows:
```
$ gunzip apache-log4j-1.2.15.tar.gz
$ tar -xvf apache-log4j-1.2.15.tar
apache-log4j-1.2.15/tests/input/
apache-log4j-1.2.15/tests/input/xml/
apache-log4j-1.2.15/tests/src/
apache-log4j-1.2.15/tests/src/java/
apache-log4j-1.2.15/tests/src/java/org/
.......................................
```
While untarring, it would create a directory hierarchy with a name apache-log4j-x.x.x as follows:
```
-rw-r--r--  1 root root   3565 2007-08-25 00:09 BUILD-INFO.txt
-rw-r--r--  1 root root   2607 2007-08-25 00:09 build.properties.sample
-rw-r--r--  1 root root  32619 2007-08-25 00:09 build.xml
drwxr-xr-x 14 root root   4096 2010-02-04 14:09 contribs
drwxr-xr-x  5 root root   4096 2010-02-04 14:09 examples
-rw-r--r--  1 root root   2752 2007-08-25 00:09 INSTALL
-rw-r--r--  1 root root   4787 2007-08-25 00:09 KEYS
-rw-r--r--  1 root root  11366 2007-08-25 00:09 LICENSE
-rw-r--r--  1 root root 391834 2007-08-25 00:29 log4j-1.2.15.jar
-rw-r--r--  1 root root    160 2007-08-25 00:09 NOTICE
-rwxr-xr-x  1 root root  10240 2007-08-25 00:27 NTEventLogAppender.dll
-rw-r--r--  1 root root  17780 2007-08-25 00:09 pom.xml
drwxr-xr-x  7 root root   4096 2007-08-25 00:13 site
drwxr-xr-x  8 root root   4096 2010-02-04 14:08 src
drwxr-xr-x  6 root root   4096 2010-02-04 14:09 tests
```

## Step 2
This step is optional and depends on what features you are going to use from log4j framework. If you already have following packages installed on your machine then it is fine, otherwise you need to install them to make log4j work.

- JavaMail API: The e-mail based logging feature in log4j requires the Java Mail API (mail.jar) to be installed on your machine from glassfish.dev.

- JavaBeans Activation Framework: The Java Mail API will also require that the JavaBeans Activation Framework (activation.jar) be installed on your machine from http://java.sun.com/products/javabeans/jaf/index.jsp.

- Java Message Service: The JMS-compatible features of log4j will require that both JMS and Java Naming and Directory Interface JNDI be installed on your machine from http://java.sun.com/products/jms.

- XML Parser: You need a JAXP-compatible XML parser to use log4j. Make sure you have Xerces.jar installed on your machine from http://xerces.apache.org/xerces-j/install.html.

## Step 3
Now you need to set up the CLASSPATH and PATH variables appropriately. Here we are going to set it just for the log4j.x.x.x.jar file.
```
$ pwd
/usr/local/apache-log4j-1.2.15
$ export CLASSPATH=$CLASSPATH:/usr/local/apache-log4j-1.2.15/log4j-1.2.15.jar
$ export PATH=$PATH:/usr/local/apache-log4j-1.2.15/
```

log4j API follows a layered architecture where each layer provides different objects to perform different tasks. This layered architecture makes the design flexible and easy to extend in future.

There are two types of objects available with log4j framework.

- Core Objects: These are mandatory objects of the framework. They are required to use the framework.

- Support Objects: These are optional objects of the framework. They support core objects to perform additional but important tasks.

# Core Objects
Core objects include the following types of objects −

### Logger Object
The top-level layer is the Logger which provides the Logger object. The Logger object is responsible for capturing logging information and they are stored in a namespace hierarchy.

### Layout Object
The layout layer provides objects which are used to format logging information in different styles. It provides support to appender objects before publishing logging information.

Layout objects play an important role in publishing logging information in a way that is human-readable and reusable.

###Appender Object
This is a lower-level layer which provides Appender objects. The Appender object is responsible for publishing logging information to various preferred destinations such as a database, file, console, UNIX Syslog, etc.

### Support Objects
There are other important objects in the log4j framework that play a vital role in the logging framework:

### Level Object
The Level object defines the granularity and priority of any logging information. There are seven levels of logging defined within the API: OFF, DEBUG, INFO, ERROR, WARN, FATAL, and ALL.

### Filter Object
The Filter object is used to analyze logging information and make further decisions on whether that information should be logged or not.

An Appender objects can have several Filter objects associated with them. If logging information is passed to a particular Appender object, all the Filter objects associated with that Appender need to approve the logging information before it can be published to the attached destination.