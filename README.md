# GroovyMaterial

### Importance
    inspired by python , ruby  smalltalk 
    consice and flat language
    easy to write in groovy, compared to java, but creates jar binaries
    Integrates with existing java code

    meta programming
    static compilation
    DSL - domain specific languages
    scripting and testing glues

### Versions

sudo apt-get update && sudo apt-get install -y groovy
vs code groovy extension 
    https://marketplace.visualstudio.com/items?itemName=NicolasVuillamy.vscode-groovy-lint


                ------------------------------------
                 Groovy scripting COURSE CONTENT
                ------------------------------------

    00. Environment Setup

        Installing SDKMAN or Groovy standalone
        Groovy Console & Groovy Shell (groovysh)
        Groovy with IntelliJ IDEA or VS Code
        Setting up Gradle for Groovy builds

    01. Introduction to Groovy
        What is Groovy? History and use cases
        Groovy vs Java comparison
        Dynamic typing & scripting power
        Groovy in Jenkins, Gradle, and REST automation

    02. Basic Syntax and Features
        Defining variables and data types
        Operators: Arithmetic, Relational, Logical, Bitwise
        Script vs class-based programs
        Input/output basics
        Optional semicolons and relaxed syntax

    03. Control Structures
        Conditional statements: if, else, switch
        Looping: for, while, each
        Advanced operators: safe navigation (?.), Elvis (?:), pattern match (==~), identity (===)
        Truthy and falsy values in Groovy

    04. Collections & Ranges
        Lists and Maps (Groovy-style)
        Ranges (1..10, 'a'..'z')
        Set operations
        Working with closures and collections: each, collect, findAll, inject, groupBy
        Performing functional-style transformations on collections

    05. Strings and Regular Expressions
        GStrings and interpolation
        Multiline strings and triple quotes
        Groovy string methods
        Regex with =~ and ==~
        Regex pattern matching with closures

    06. Closures
        Syntax and use cases
        Passing closures as arguments
        Implicit it and named parameters
        Closure delegation strategies: delegate, owner, this
        Currying and memoization

    07. Functions and Methods
        Defining and calling methods
        Optional, default, and named parameters
        Method overloading
        Varargs and closures as arguments
        Static vs instance methods

    08. Object-Oriented Groovy
        Classes and objects
        Class fields, constructors, and property access
        Encapsulation and access/visibility modifiers
        Inheritance, method overriding and polymorphism
        Interfaces and traits
        MetaClass and dynamic method injection

    09. Advanced Features
        MetaProgramming and ExpandoMetaClass
        Category classes
        Operator overloading
        Builders (MarkupBuilder, JsonBuilder, XmlSlurper)
        AST Transformations (e.g., @ToString, @Immutable, @Delegate)

    10. Working with Files
        Reading/writing text and binary files
        Processing large files efficiently with eachLine and file streams
        Traversing directories and recursive file access
        Using File and Path with Groovy shortcuts

    11. Error Handling
        Exception handling: try-catch-finally
        Custom exceptions
        Multi-catch blocks and conditional rethrowing
        Structured logging of exceptions and stack traces

    12. Unit Testing in Groovy
        JUnit and Spock frameworks
        Writing BDD-style tests
        Data-driven testing
        Mocking and stubbing
        CI integration (Jenkins)

    13. Interoperability with Java
        Calling Java from Groovy and vice versa
        Using Java libraries in Groovy scripts
        Compiling Groovy to Java JVM bytecode
        Using annotations and JavaBeans compatibility

    14. Gradle Build Scripts
        Groovy DSL vs Kotlin DSL
        Writing custom Gradle tasks
        Plugins and configurations
        Multi-project builds
        Dependency resolution

    15. Scripting for Automation
        Shell scripting with Groovy
        HTTP requests with HttpBuilder or URL
        JSON/XML parsing and manipulation
        Running external processes
        Scheduled tasks with Timer and cron

    16. Working with Databases
        Groovy SQL: groovy.sql.Sql
        Connecting to MySQL/Postgres
        Executing queries and transactions
        ORM with GORM (optional)

    17. Jenkins Pipeline Scripting with Groovy (Expanded)
        Understanding Jenkins Pipeline architecture
        Declarative vs Scripted Pipelines: when and why
        Writing Jenkinsfiles using Groovy DSL
        Creating Shared Libraries for pipeline reuse and modularity
        Using input, parallel, when, agent, and post blocks
        Jenkins plugins and integrations for automation workflows
        Managing secrets and credentials in pipelines
        Error handling, retry logic, and catchError strategies
        Using sh, bat, readJSON, writeFile, and other steps
        Best practices for secure, scalable, and maintainable pipelines
