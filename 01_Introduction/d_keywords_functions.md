## Reserved Keywords

abstract    assert          break   case        catch   class       const
continue    def             default do          else    enum        extends
final       finally         for     goto        if      implements  import
instanceof  interface       native  new         null    non-sealed  package
public      protected       private return      static  strictfp    super
switch      synchronized    this    threadsafe  throw   throws      transient
try         while

Of these, const, goto, strictfp, and threadsafe are not currently in use.
The reserved keywords can’t in general be used for variable, field and method names.

## Contextual Keywords

as      in      permits     record
sealed  trait   var         yields

These words are only keywords in certain contexts and can be more freely used in some places, in particular for variables, fields and method names.


        // contextual keywords can be used for field and variable names
        def as = true
        assert as

        // contextual keywords can be used for method names
        def in() { true }
        // when calling such methods, the name only needs to be qualified using "this." in scenarios which would be ambiguous
        this.in()

## Other reserved words

null    true    false   boolean
char    byte    short   int
long    float   double

While not recommended, the same trick as for reserved keywords can be used:

    def "null"() { true }  // not recommended; potentially confusing
    assert this.null()     // must be qualified