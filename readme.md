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

Applied bruntonspall/appengine-objectify-scala.g8 in my-test-apps
```