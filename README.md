A code generation web-app for spring-boot.
# Freeboot.io
A code generation web-app for `spring-boot` projects.

Given just a package name and the name of business entity wish to model, Freeboot.io will generate an entire `spring-boot` project capable of all CRUD operations that includes:

* `@RestController` implementation
* `Interface`, `@Service` and `Repository` implementation
* `jQuery` Rest Client to consume RESTful web services
* embedded `h2` in-memory database
* embedded `tomcat` container to run the application

**Many more** features are planned. The ultimate goal would be full-stack microservice generation.

### About Freeboot.io

It is an open source project and contributions are *welcome*. The project was started as a rapid prototyping tool inspired by the likes of [LayoutIt](http://www.layoutit.com/), [Initializr](http://www.initializr.com/) and [Spring Initializr](http://start.spring.io/).

### Development Philosophy

Freeboot.io is born out of the [UNIX philosophy](https://en.wikipedia.org/wiki/Unix_philosophy)'s rules of **generation** and **optimization**.

> #### The rule of generation:
> Developers should avoid writing code by hand and instead write abstract high-level programs that generate code. This rule aims to reduce human errors and save time.

> #### The rule of optimization:
> Developers should prototype software before polishing it. This rule aims to prevent developers from spending too much time for marginal gains.

### How It Works

Freeboot.io's code generation capability is powered by [java emitter templates](https://eclipse.org/articles/Article-JET/jet_tutorial1.html). Java emitter templates (henceforth JETs) provide a simple JSP like syntax which you write very natural looking templates in. Sprinkled through the JETs are calls to a model in behind the template that carries the data we wish to use (e.g name of our package, class, case formatting logic etc.). The JETs are developed offline inside the Eclipse IDE and because the project includes the JET Nature, every time you hit Ctrl+s when editing a `.javajet` file the JET code generation framework outputs a bunch of `xyzTemplate.java` files which are the classes that perform our code generation when the live web-app is running. Essentially these `xyzTemplate.java` concatenate a bunch of strings together in the right order to produce the same output as we specified in our `.javajet` template. The `generate()` method of these templates is invoked when a call to the `/generate` REST endpoint is made, the user input package and class name is passed into the `generate()` method as a model and the resulting generated code is returned to the page as JSON where it is formatted and displayed to the user. 
