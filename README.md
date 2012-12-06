Distributed Systems Sample Code
===============================

This is an improved version of the Distributed Systems sample code. This
actually deploys to Personal Tomcat correctly and reads credentials from
s3credentials.properties. Pull requests are welcome for improvements but
obviously not for implemented solutions.

SBT
---

First, grab [SBT](http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html).

You can deploy the project to a running server by:
    $ sbt
    > container:start
And the jetty instance will persist as long as the sbt shell is open, with the page accessable from [localhost:8080](http://localhost:8080).

You can create a `.war` file by running `sbt package`, which is ready for deployment (see below).

There exist plugins for SBT to generate projects for Eclipse, Netbeans and Intellij, just google :)

Deployment
----------
On a lab machine/shell, run `mktomcat7 TOMCATDIR`. This produces a personal
Tomcat directory called tomcatdir and you can change the port by editing conf/server.xml and
changing the value in the Connector tag lower down, NOT in the Server tag.

When you want to deploy a new version:

1. Using SBT create the WAR file, `sbt package`.
2. `mv target/scala_*/cloudmusic*.war TOMCATDIR/webapps`.
3. In tomcatdir run tomcat7 run.

An example http request would be http://localhost:59999/CloudMusic/MusicManagementService?action=fetchplaylists
