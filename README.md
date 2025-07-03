# Robust Java Starter Archetype.

Maven archetype to generate a Java project with [SpotBugs](https://spotbugs.github.io), [Checkstyle](https://checkstyle.sourceforge.io), and [PMD](https://pmd.github.io) already integrated so you can leverage these tools while shipping code to your customers.

# Using the Archetype.
Use [robust-java-starter-archetype](https://central.sonatype.com/artifact/com.calebjosue/robust-java-starter-archetype) by means of invoking one of the the following commands from the command line.

`mvn archetype:generate -DarchetypeGroupId=com.calebjosue -DarchetypeArtifactId=robust-java-starter-archetype -DartifactVersion=1.0.0`

You can save some typing by using `mvn archetype:generate -Dfilter=com.calebjosue:robust-java-starter-archetype`

In both cases you will be prompted to enter some information related to your project, you know the drill.

This [YouTube video](https://www.youtube.com/watch?v=kJeTFEmbHxg) uses IntelliJ IDEA for demonstration purposes.

Thanks for stopping by.
