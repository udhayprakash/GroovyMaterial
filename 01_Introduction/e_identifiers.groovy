/*
Identifiers start with 
    a letter, 
    a dollar or 
    an underscore. 

They cannot start with a number.
A letter can be in the following ranges:
        'a' to 'z' (lowercase ascii letter)
        'A' to 'Z' (uppercase ascii letter)
        '\u00C0' to '\u00D6'
        '\u00D8' to '\u00F6'
        '\u00F8' to '\u00FF'
        '\u0100' to '\uFFFE'



valid
------
def name
def item3
def with_underscore
def $dollarStart


invalid
--------
def 3tier
def a+b
def a#b


All keywords are also valid identifiers when following a dot:
foo.as
foo.assert
foo.break
foo.case
foo.catch

*/