println 'Hello world!'

// a standalone single line comment
println "hello" // a comment till the end of the line


/* a standalone multiline comment
   spanning two lines */
println "hello" /* a multiline comment starting
                   at the end of a statement */
println 1 /* one */ + 2 /* two */


// Groovydoc comments
/*
Similarly to multiline comments, Groovydoc comments are multiline, but start with /** and end with */ 
/*Lines following the first Groovydoc comment line can optionally start with a star *. Those comments are associated with:
    type definitions (classes, interfaces, enums, annotations),
    fields and properties definitions
    methods definitions
*/



/**
 * A Class description
 */
class Person {
    /** the name of the person */
    String name

    /**
     * Creates a greeting method for a certain person.
     *
     * @param otherPerson the person to greet
     * @return a greeting message
     */
    String greet(String otherPerson) {
       "Hello ${otherPerson}"
    }
}


//Runtime Groovydoc is disabled by default. 
// It can be enabled by adding JVM option -Dgroovy.attach.runtime.groovydoc=true
// The Runtime Groovydoc starts with /**@ and ends with */, for example:

/**@
 * Some class groovydoc for Foo
 */
class Foo {
    /**@
     * Some method groovydoc for bar
     */
    void bar() {
    }
}

assert Foo.class.groovydoc.content.contains('Some class groovydoc for Foo') 
assert Foo.class.getMethod('bar', new Class[0]).groovydoc.content.contains('Some method groovydoc for bar') 

