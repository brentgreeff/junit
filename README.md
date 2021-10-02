# junit
learning Java through JUnit

### General dev setup

Install JDK 8 from Oracle - https://www.oracle.com/java/technologies/downloads/#java8

Download Maven: https://maven.apache.org/download.cgi

Add to path: `export PATH="/Users/brent/apache-maven-3.8.2/bin:$PATH"`

new to Maven? - https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

`mvn archetype:generate -DgroupId=lovey -DartifactId=junit -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false`

`export JAVA_HOME="/Library/Java/JavaVirtualMachines/jdk1.8.0_301.jdk/Contents/Home/"`

`mvn package` - to download jars and create project structure.

`mvn -Dtest=lovey.ScoreCollectionTest test` - to run a single test.

http://maven.apache.org/surefire/maven-surefire-plugin/examples/single-test.html

### Guard - TDD

`bundle install` - to get the `listen` gem.

`./guard.rb` - to start watching your files. - [save] a test to run it automatically. - [save] a class and the corresponding test will be run.
