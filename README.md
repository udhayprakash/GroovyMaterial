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

### History: 
    Groovy was created by James Strachan in 2003. It was designed to be a companion language for Java, offering more flexibility and concise syntax.

### Use Cases:
    Scripting and automation.
    Rapid application development.
    Building DSLs (Domain-Specific Languages).
    Testing frameworks (e.g., Spock).
    Build tools (e.g., Gradle).

### Groovy vs Java

    Syntax: Groovy is more concise with optional semicolons, parentheses, and type declarations.
    Dynamic Typing: Groovy supports dynamic typing, whereas Java is statically typed.
    Default Imports: Groovy includes many default imports, reducing the need for explicit imports.
    Getters and Setters: Groovy automatically provides getters and setters for class properties.
    Closures: Groovy has first-class support for closures, which are similar to Java lambdas but more powerful.

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



##

                ------------------------
                 JENKINS COURSE CONTENT
                ------------------------

    Module 1: Jenkins Pipeline Deep Dive
        Jenkinsfile anatomy and execution lifecycle
        Declarative vs Scripted pipelines: key differences and trade-offs
        Structure: agent, stages, steps, environment, post
        Practical examples of each pipeline type

    🛠️ Module 2: Groovy in Scripted Pipelines
        Writing custom scripted pipelines using Groovy
        Groovy closures in build logic
        Using conditionals (if, switch) and loops (for, each)
        Safely chaining logic with null-safe and Elvis operators
        Accessing Jenkins environment variables and workspace

    📚 Module 3: Jenkins Shared Libraries with Groovy
        Introduction to shared libraries: vars/, src/, resources/
        Creating reusable pipeline steps using Groovy functions
        Managing common stages across multiple Jenkinsfiles
        Injecting shared utility scripts and custom classes

    🔐 Module 4: Secure Inputs and Credentials Management
        Using credentialsId in pipelines
        Injecting credentials into withCredentials blocks
        Writing secure Groovy code to avoid exposing secrets
        Handling input steps with timeout and validation

    🔗 Module 5: External Integrations via Groovy
        Making HTTP/REST API calls with Groovy (URL, HttpBuilder, or httpRequest step)
        Parsing JSON/XML for test reports, deployments, etc.
        Posting notifications (Slack, Teams, email) via Groovy scripts
        Using external tools (e.g., Git, Docker, Maven) within Groovy-powered sh or bat steps

    🔁 Module 6: Dynamic Pipeline Behaviors
        Conditional stage execution using when, environment checks, or Groovy logic
        Config-driven pipelines using external YAML/JSON files
        Matrix builds and parallelism with custom Groovy workflows
        Using closures and functions to reduce boilerplate in complex pipelines

    🧪 Module 7: Pipeline Testing & Simulation
        Unit testing shared libraries with Spock
        Pipeline Unit Testing framework for validating Jenkins logic
        Mocking and simulating Jenkins steps (e.g., sh, checkout) using Groovy
        Verifying behavior with test coverage and assertions

    🔍 Module 8: Debugging, Logging & Exception Handling
        Output strategies: echo, structured logging with Groovy
        Try-catch blocks in Jenkinsfiles
        Capturing build logs and artifacts
        Handling failures with catchError, retry, and unstable

    🚀 Module 9: End-to-End CI/CD Implementation
        End-to-end CI/CD pipeline using Jenkins + Groovy
        Compiling code, running tests, scanning for vulnerabilities
        Docker image creation, tagging, and publishing
        Staging and promoting deployments via pipeline stages

    🧠 Module 10: Capstone Projects & Best Practices
        Project: Build and deploy a microservice pipeline using shared libraries and external APIs
            Integrate security scans and auto-rollback logic
            Apply pipeline modularization and auditing
            Version control, documentation, and pipeline governance