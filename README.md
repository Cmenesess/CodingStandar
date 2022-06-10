# Coding Standards

## Objectives

- Use Checkstyle as a code quality metric tool to detect and enforce Java coding standards.
- Obtain a html report with the different detected issues in the code using Maven.

## Requirements
- Java 8 or newer JRE/JDK
- Eclipse IDE for Java Developers >= 2019-09 R (4.13.0)
- Git
## Introduction
Checkstyle is an open-source tool that enforces coding conventions and best practice rules for
Java code. It automates the process of checking Java code to spare humans of this boring (but
important) task. This makes it ideal for projects that want to enforce a coding standard. [1]
Checkstyle can check many aspects of your source code. It can find class design problems, method
design problems. It also can check code layout, formatting issues and generate project-wide
reports that summarize the breaches found. Checkstyle provides many checks that you can apply
to your source code.

Annotations
- Block Checks
- Class Design
- Coding
- Headers
- Imports
- Javadoc Comments
- Metrics
- Miscellaneous
- Modifiers
- Naming Conventions
- Regexp
- Size Violations
- Whitespace


## Workshop description

In this activity we add modules to our XML configuration file as:
- Javadoc Method
- Method Name with a property to match names that begin with a lower-case letter, followed by letters, digits, and underscores
- Whitespace After with a property to check for whitespace only after COMMA and
SEMI tokens. 

Then we generate a report and correct any errors/warnings.

## Members
- Claudia Sofía Asanza Romero 
- Carlos Humberto Meneses Murillo 
- Yiam Oswaldo Rodríguez Delgado 
- Luis Alfredo Rodríguez Chávez 
- Joel Alejandro Alvarado Jiménez 
- Miguel Angel Licea Cespedes 
