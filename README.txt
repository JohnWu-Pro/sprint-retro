0. Prerequisites (To accomplish the following tasks)
====================================================
. JDK 1.6.0 (or later) has been installed and configured (e.g. JAVA_HOME)
. Apache Maven 2.2.1 (or later) has been installed and configured (e.g. <proxy /> if applicable)
. Tomcat 7.0.x (or later) has been installed
. (Optional) A decent text editor has been installed (no, not the MS Notepad), such as Notepad++, UltraEdit
. IE, Firefox, or Chrome has been installed



1. Setup Instructions
=====================
1.0 Setup Assumptions
---------------------
. $PRJ_ROOT_DIR is the directory holds this README.txt.
. $CATALINA_HOME is the Tomcat 7.0 *installation* directory
. $CATALINA_BASE is the Tomcat 7.0 *instance* directory


1.1 Setup the Project
---------------------
#. COMMAND: cd $PRJ_ROOT_DIR/project-pom
#. COMMAND: mvn clean install



2. Build Instructions
=====================
NOTE: Assume section 1.1 have been completed successfully.
#. COMMAND: cd $PRJ_ROOT_DIR/aggregator
#. COMMAND: mvn clean package



3. Deployment Instructions
==========================



4. Design Assumptions
=====================
