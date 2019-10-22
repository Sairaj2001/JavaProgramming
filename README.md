# JavaProgramming
- A quick warm-up for Java syntax and data structures

## Basic Background
### Java Virtual Machine, JVM
- A theoretical computer whose machine language is the set of Java bytecodes
    - To execute a Java program, JVM will execute the Java bytecodes (Java runtimes)
    
### Java Runtime
- A program that exxecutes compiled bytecodes

### Why Java
1. Java is a simple, object-oriented, network-savvy, interpreted, robust, secure, architecture neutral, portable, high-performance, multithreaded, dynamic language
2. Java includes a large amount of prewritten software that programmers  can utilize to enhance their programs - libraries
3. Java is paltform independent; the same Java program can be executed on manay different OS
4. Java used extensively for both research and business applications

### The Java Programming Environment
1. Type in a progam as a Java class
2. Compile the program file
3. Run the compiled version of the program

  #### Things good to know
  - Basic unit of storage on most computers is a file
  - The Java program files has the extension .java
  - When compiling a Java program, the resulting JAva bytecodes are stored in a file with the same name and the extension .class

## Java
### 1. Class
- A unit of code that is the basic building block of Java programs

- example)
```
public class Hello{
  public static void main(String[] args){
    System.out.println("Hello, world!");
  }
}
```
Syntax template

```
public class <name>{
  <method>
  <method>
  ...
  <method>
}
```
- `public class <name>` is called "class header"
  - "public" indicates that this class is available to anyone to use

### 2. Method
- A program unit that represents a particular action or computation

- Syntax example)
```
public static void main (String[] args){
  <statement>;
  <statement>;
  ...
  <statement>;
}
```
### 3. Statement
- An executable snippet of code that represents a complete command
exapmle) `System.out.println("Hello World!")`

#### String Literals
- "This is a string with 'these' quotes inside."
- Common Escape Sequences
  - \t: tab character
  - \n: new line character
  - \": quotation mark
  - \\: backslash characters
- "System.out.print" prints inline
- "System.out.println" sends output to the current line and moves to the beginning of a new line

### 4. Identifier
- A name given to an entity in a program, such as a class or method

#### List of Java Keywords
abstact, assert, boolean, break, byte, case, catch, char, class, const, continue, default, do, double, else, enum, extends, final, finally, float, for, goto, if, implements, import, instanceof, int, interface, long, native, new, package, private, protected, public, return, short, static, strictfp, super, switch, synchronized, this, throw, throws, transient, try, void, volatile, while

#### Comment
- `/* Comment comes here*/`

#### Iterative Enhancement
- The process of producing a program in stages, adding new functionality at each stage. A key featue of each iterative step is that you can test it to make sure that piece works before moving on.

#### Static Method
- A block of Java statements that is given a name. They are units of procedural decomposition
- The keyword, "static" in `public static void drawBox(){...` indicates that this is a procedural-style, not object-oriented method.

#### Flow of Control
- The order in which the statements ofa Java program are executed
