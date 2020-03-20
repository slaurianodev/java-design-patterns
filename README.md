# java-design-patterns
Some examples of Java design patterns  

__Null Object__ [example](/nullobject/src/pt/com/srg/nullobject/
) [<span style="color:green">definition</span>](https://www.tutorialspoint.com/design_pattern/null_object_pattern.htm)  
Avoid null pointer exception and make validations.  
JDK Example: Optional (JDK 8+)  

__Strategy__ [example](/strategy/src/pt/com/srg/strategy/
) [<span style="color:green">definition</span>](https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm)  
Defines multiple algorithms and let client application pass the algorithm to be used as a parameter.

__Builder__ [example](/builder/src/main/java/pt/com/srg/builder/
) [<span style="color:green">definition</span>](https://www.tutorialspoint.com/design_pattern/builder_pattern.htm)  
Used to build a complex object using simple objects and using a step by step approach.  
[Lombok](https://projectlombok.org/) library is a solution based on Builder pattern, then you can avoid creating complex objects.  

__Template Method__ [example](templatemethod/src/pt/com/srg/templatemethod) [<span style="color:green">definition</span>](https://www.tutorialspoint.com/design_pattern/template_pattern.htm)  
Provides steps to execute an algorithm.  
JDK examples:
* All non-abstract methods of java.io.InputStream,java.io.OutputStream, java.io.Reader and java.io.Writer.  
* All non-abstract methods of java.util.AbstractList, java.util.AbstractSet and java.util.AbstractMap.  
