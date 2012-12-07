seq(webSettings :_*)

name := "cloudmusic"

javacOptions ++= Seq(
    "-source", "1.6",
    "-target", "1.6",
    "-Xlint:deprecation")

autoScalaLibrary := false

port in container.Configuration := 55580

libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.8.v20121106" % "container",
  "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "container",
  "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "provided",
  "net.java.dev.jets3t" % "jets3t" % "0.9.0",
  "net.sf.json-lib" % "json-lib" % "2.4" classifier "jdk15",
  "commons-fileupload" % "commons-fileupload" % "1.2.2",
/*
 * The following aren't explicitly needed, but we'll pull them in because
 * they're newer than those pulled in transitively.
 */
  "org.apache.httpcomponents" % "httpclient" % "4.2.2",
  "org.apache.httpcomponents" % "httpcore" % "4.2.3",
  "commons-lang" % "commons-lang" % "2.6"
)
