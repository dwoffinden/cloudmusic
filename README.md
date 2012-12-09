Distributed Systems Sample Code
===============================

This is an improved version of the Distributed Systems sample code. It builds
with SBT, actually deploys to Personal Tomcat correctly and reads credentials
from s3credentials.properties. Pull requests are welcome for improvements but
obviously not for implemented solutions.

SBT
---

First, grab [SBT](http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html).

You can deploy the project to a local server by typing `container:start` at the
`sbt` prompt. This will launch a jetty instance that will persist as long as
the sbt shell is open, with the page accessable from http://localhost:55580
(the port can be changed in `build.sbt`).

You can create a `.war` file by running `sbt package`, which is ready for
deployment to tomcat etc. (see below).

There exist plugins for SBT to generate projects for
[Eclipse](https://github.com/typesafehub/sbteclipse),
[Netbeans](https://github.com/remeniuk/sbt-netbeans-plugin) and
[Intellij](https://github.com/mpeltonen/sbt-idea) if you so desire.

I highly recommend that you change the credentials in
`src/main/resources/org/bigdatapro/service/s3credentials.properties`
to a new account, as the default account gets really slow as more people use it.

Deployment
----------
On a lab machine/shell, run `mktomcat7 TOMCATDIR`. This produces a personal
Tomcat directory called TOMCATDIR and you can change the port by editing
`conf/server.xml` and changing the value in the Connector tag lower down,
NOT in the Server tag.

When you want to deploy a new version:

1. Create the WAR file with `sbt package`.
2. `mv target/scala*/cloudmusic*.war TOMCATDIR/webapps/cloudmusic.war`.
3. In TOMCATDIR run `tomcat7 run`.

An example http request would be http://localhost:59999/cloudmusic/MusicManagementService?action=fetchplaylists
