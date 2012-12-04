seq(webSettings :_*)

name := "cloudmusic"

autoScalaLibrary := false

port in container.Configuration := 8080

libraryDependencies ++= Seq(
  "org.mortbay.jetty" % "jetty" % "6.1.26" % "container",
  "org.mortbay.jetty" % "jsp-2.1-jetty" % "6.1.26" % "container",
  "org.mortbay.jetty" % "servlet-api" % "2.5.20110712" % "provided",
  "net.java.dev.jets3t" % "jets3t" % "0.9.0",
  "net.sf.json-lib" % "json-lib" % "2.4" classifier "jdk15",
  "commons-fileupload" % "commons-fileupload" % "1.2.2",
/*
 * The following aren't explicitly needed, but we'll pull them in because
 * they're newer than those pulled in transitively.
 */
  "org.mortbay.jetty" % "servlet-api" % "2.5.20110712" % "container",
  "org.apache.httpcomponents" % "httpclient" % "4.2.2",
  "org.apache.httpcomponents" % "httpcore" % "4.2.3",
  "commons-lang" % "commons-lang" % "2.6"
)
