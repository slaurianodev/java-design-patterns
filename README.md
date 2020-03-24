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

__Singleton__ [example](singleton/src/pt/com/srg/singleton) [<span style="color:green">definition</span>](https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm)  
Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine. Used for logging, driver objects, caching and thread pool.
JDK Examples: java.lang.Runtime, java.awt.Desktop.

__Facade__ [example](facade/src/pt/com/srg/facade) [<span style="color:green">definition</span>](https://www.tutorialspoint.com/design_pattern/facade_pattern.htm)  
Provides a unified interface to a set of interfaces in a subsystem.

__Factory__ [example](factory/src/pt/com/srg/factory) [<span style="color:green">definition</span>](https://www.tutorialspoint.com/design_pattern/factory_pattern.htm)  
Used when we have a super class with multiple subclasses and based on input, we need to return one of the sub-class.

__Decorator__ [example](decorator/src/pt/com/srg/decorator) [definition](https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm)  
Allows a user to add new functionality to an existing object without altering its structure.