name := "$name$"

version := "$version$"

organization := "com.example"

scalaVersion := "$scala_version$"

resolvers += "Objectify Repo" at "http://objectify-appengine.googlecode.com/svn/maven"

libraryDependencies ++= Seq(
  "com.googlecode.objectify" % "objectify" % "$objectify_version$",
  "org.scalatra" %% "scalatra" % "$scalatra_version$",
  "javax.persistence" % "persistence-api" % "1.0",
  "com.google.appengine" % "appengine-api-1.0-sdk" % "1.6.2",
  "ch.qos.logback" % "logback-classic" % "0.9.26",
  "com.weiglewilczek.slf4s" %% "slf4s" % "1.0.7",
  "org.scalatest" %% "scalatest" % "1.6.1" % "test",
  "javax.servlet" % "servlet-api" % "2.3" % "provided",
  "org.mortbay.jetty" % "jetty" % "6.1.22" % "container")

seq(appengineSettings: _*)

seq(Twirl.settings: _*)

