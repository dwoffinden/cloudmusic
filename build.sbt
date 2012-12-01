seq(webSettings :_*)

name := "335-cwk"

version := "1.0.0"

resolvers += "jets3t" at "http://www.jets3t.org/maven2"

libraryDependencies ++= Seq(
  "org.mortbay.jetty" % "jetty" % "6.1.22" % "container",
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "net.java.dev.jets3t" % "jets3t" % "0.9.0",
  "net.sf.json-lib" % "json-lib" % "2.4" classifier "jdk15",
  "org.apache.httpcomponents" % "httpclient" % "4.2.1",
  "org.apache.httpcomponents" % "httpcore" % "4.2.2",
  "com.jamesmurty.utils" % "java-xmlbuilder" % "0.3",
  "commons-lang" % "commons-lang" % "2.6",
  "commons-fileupload" % "commons-fileupload" % "1.2.2"
)
