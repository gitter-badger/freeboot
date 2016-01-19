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


