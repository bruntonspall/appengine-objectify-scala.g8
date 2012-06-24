Appengine, Objectify, Scalatra giter8 template
==============================================

> If I could think of a good name I'd use one!

This is a simple g8 template that you can use to build a simple AppEngine webapp that uses

   * [Scalatra](http://www.scalatra.org) for routing
   * [Twirl](https://github.com/spray/twirl) for templating
   * [Objectify](http://code.google.com/p/objectify-appengine) for AppEngine ORM
   * [Google AppEngine](http://appengine.google.com) for hosting

If that matches your requirements, then this is for you.

Because it uses Objectify version 4.0 in order to utilise the easiest scala integration, this is fully experimental until v4 is release.

Lots of bits inspired by [Jorrit Posthuma](http://thoughtsofthree.com/2012/04/scala-objectify4/)

Enjoy

Michael Brunton-Spall

Requirements
------------

  * [Giter8](https://github.com/n8han/giter8/)
  * [SBT 0.11.2 or 0.11.3-2](https://github.com/harrah/xsbt)

Usage
-----

```
(mbrunton-spall@GNM31330 ~/work)% g8 bruntonspall/appengine-objectify-scala.g8

Using Scalatra on Appengine with Objectify to make life simple, try
this project to get started

package [com.example]: co.uk.bruntonspall
name [My Scalatra AppEngine Objectify Project]: My Test App
scalatra_version [2.0.4]:
scala_version [2.9.1]:
objectify_version [4.0a3]:

Applied bruntonspall/appengine-objectify-scala.g8 in my-test-app

(mbrunton-spall@GNM31330 ~/work)% cd my-test-app
(mbrunton-spall@GNM31330 ~/work/my-test-app)% sbt
...
[info] Done updating.
My Scalatra AppEngine Objectify Project > package
[info] Compiling twirl template .../welcome.scala.html to .../welcome.template.scala
[info] Formatting 5 Scala sources {file:/Users/mbrunton-spall/work/appengine-objectify-scala.g8/target/g8/}My Scalatra AppEngine Objectify Project(compile) ...
[info] Reformatted 4 Scala sources {file:/Users/mbrunton-spall/work/appengine-objectify-scala.g8/target/g8/}My Scalatra AppEngine Objectify Project(compile).
[info] Compiling 6 Scala sources to /Users/mbrunton-spall/work/appengine-objectify-scala.g8/target/g8/target/scala-2.9.1/classes...
[info] Packaging /Users/mbrunton-spall/work/appengine-objectify-scala.g8/target/g8/target/scala-2.9.1/my-scalatra-appengine-objectify-project_2.9.1-.war ...
[info] Done packaging.
[success] Total time: 11 s, completed Jun 24, 2012 1:17:46 AM
My Scalatra AppEngine Objectify Project > appengine-dev-server
```
When running an appengine app from scala, you don't use container:start, you use appengine-dev-server.  I pair it with JREBEL and ~package personally, but your millage may vary.
