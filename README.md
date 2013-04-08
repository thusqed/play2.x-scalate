# play2-scalate

### About

A very simple [play 2.1](http://www.playframework.org) plugin for using scalate templates as view rendering in play 2.0.

For more information, see [Scalate](http://scalate.fusesource.org/)


Tested scalate templates :

* [mustache](http://mustache.github.com/)
* [scaml](http://scalate.fusesource.org/documentation/scaml-reference.html)
* [jade](http://jade-lang.com/)


### How to use this plugin

* Clone this repository  

```
git clone git://github.com/thusqed/play2.x-scalate.git
```
* Build and publish the plugin to your local repository 

```
cd play2-scalate/project-code
play
// In the play console, type :
publish-local
```
* Add the following lines to the dependencies in your own project :

```
// In your project/Build.scala :
val appDependencies = Seq(
	"play2-scalate" %% "play2-scalate" % "0.1-SNAPSHOT",
	"org.fusesource.scalate" % "scalate-core" % "1.5.3"
)
```
* Write templates in the ```app/views``` directory of your application (template filenames must end with `.jade`, `.mustache` or `.scaml`)  

* Use the following line to render template in your controllers :  

```
Ok(Template.render("sample.mustache",Map("varName"->"something to pass to the template")))
```

### Samples

A sample webapp can be found in the following path :  
```
play2-scalate\samples\play2-scalate-sample
```

Clone this repo, ```play run``` in this directory and look at the samples.

Samples provide views for mustache, scaml and jade templates.


### TODO
* Include Play objects (request, session, routes, …) in the scope of templates
