# Starting with Java Code for Manual Testers
36 hrs.

## 1. Java App structure (2hr)
- Class and its responsibility 
- Method and its intention 
- Package and its cohesion 
- JARs
- Simple App with packages and JAR demo 

## 2. Maven Overview (0.5)
- Build cycle
- Dependencies
- Über-jar pattern

## 3. IDEA Overview (0.5)
- Building
- Debugging

## 4. Java Syntax Basics for Procedure Style (3)
- Naming conventions
- Code style conventions 
- Static modifier
### Practice: ETL Application skeleton with main() and new controller methods 
1. Stubs for extract() & load()
2. Add logging for entering and exiting methods
3. PrinterApp -> EtlApp 
4. * main(): main algorithm
- Enums
- Static import
- Flow control structures: if, switch, for, do, while, foreach
### Practice: Application skeleton with type switching 
### and structure types loop
#### DoD:
- Enum Loop
- Refactor API: extract -> String[]
- Refactor transform(String) -> transform(String[])
- Switch(SYSTEM_TYPE)   
 
- Primitive types
- Casting
- Operators: arithmetic (int and float), logic, bitwise
- Method overloading
### Practice: Add overloaded transform() method with data aggregate logging
- Overloaded transform(..., int[])
- Average -> logger.info()

## 5. JUnit recap (1)
- Test structure
- Tests as specifications
### Practice: Fix current contract with _unit_ test

## 6. Primitive types VS Reference types (2)
- Heap and Stack
### Basic reference types
- Strings 
- Wrappers
- Parameter passing styles (and side effects recap)
- Arrays (and varargs)

## 7. Java Syntax Basics for OOP (3)
- Classes
- Visibility
- Constructor
### Practice: Introduce structure {avg, array} for return type of transform() and using strings and wrappers for parsing input data
=== Stop point ===
- Inheritance 
- Interfaces 
- Polymorphism 
### Practice: Introduce polymorphism for variation of EIS types and stable core algorithm
- Best practices for class design 
- Design quality criteria 

## 8. Exceptions (2)
- Exceptions in Java 
- Exception handling strategies
- Try-with-resources
- Exception types in Java
- Best practices for exception type system design 

## 9. System Library (1)
- j.l.System 
- j.l.Object
- Collections API Overview
- Java 8 Streams Overview

## 10. Threading Overview (1)
- Threads in Java 
- Thread API 
- Concurrency issues overview
- Best practices for multithreaded design 

## 11. Data interaction with flat txt files (2)
- j.i.File
- Java IO Streams Overview
- Apache Commons IO library

## 12. Data interaction with CSV txt files (1)
- Apache Commons CSV library

## 13. Data interaction with XLS files (1)
- Apache POI library

## 14. Data interaction with XML files (3)
- XML recap: namespaces, elements, attributes
- Well-formed vs Valid documents
- APIs overview: SAX vs DOM
- Java API for SAX
- Java API for DOM
- OXM with JAXB overview

## 15. Data integration with JSON files (1)
- JSON recap
- Jackson library

## 16. DB interaction with JDBC API (3)
- JDBC API Overview
- Derby Overview
- Connection, DriverManager and ConnectionPools
- DDL and DML recap
- Inserting and updating data with Statement and PreparedStatement
- Fetching data with ResultSet

## 17. Buffer (3hr)

## 18. DB interaction with Spring jdbcTemplate *
- Intro to Spring
- Spring configuration for dataSource
- JdbcTemplate and RowMapper
- DAO pattern

## 19. DB Interaction with JPA *
- ORM concept 
- Key annotations
- JPA API Overview

===

## Reading List
– Б. Эккель, "Философия Java", "Thinking in Java"
– HeadFirst Java.

## Git settings for push
```
$ git config --global user.name "John Doe"
$ git config --global user.email johndoe@example.com
```