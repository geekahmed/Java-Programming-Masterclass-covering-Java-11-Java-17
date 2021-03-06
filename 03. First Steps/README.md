# Section 3: First Steps
- To write a java program, you should adhere to some rules using combination of reserved keywords.
	- These reserved kewords are case-sensitive.
	- Like: public and class.
- A java method is a collection of statements that perfroms an operation.
- Variables are used to store things in the RAM of the computer like text, numbers, etc.
- To define a variable, it should have a data type and a name.
- An idetifier is a name given to a java component like mathod, class, or variables.
- The rules of these identifiers are:
	- Begin with a letter (A to Z or a to z), currency character ($) or an underscore (_).
	- After the first character, identifiers can have any combination of characters.
	- A keyword cannot be used as an identifier.
	- Identifiers are case sensitive.
- There are two data types available in Java:
	- Primitive Data Types
		- Primitive datatypes are predefined by the language and named by a keyword
		- byte: 8-bit signed two's complement integer. From: -128, To: 127.
		- short: 16-bit signed two's complement integer. From: -32768. To: 32767.
		- int: 32-bit signed two's complement integer. From: -2147483648. To: 2147483647
		- long: is a 64-bit signed two's complement integer. From: $2^{-36}$ to $2^{36}$.
		- float: is a single-precision 32-bit IEEE 754 floating point.
		- double: is a double-precision 64-bit IEEE 754 floating point.
		- boolean: represents one bit of information (true, false).
		- char: is a single 16-bit Unicode character.
	- Reference/Object Data Types
		- Reference variables are created using defined constructors of the classes.
		- Default value of any reference variable is null.
		- -   Example: Car bmw = new Car("BMW");
- type casting is a process that converts a data type into another data type in both ways manually and automatically.
- There are two types of type casting:
	- Widening Type Casting
		- byte -> short -> char -> int -> long -> float -> double
	- Narrowing Type Casting
		- double -> float -> long -> int -> char -> short -> byte
- Java provides a rich set of operators to manipulate variables.
	- Arithmetic Operators
	- Relational Operators
	- Bitwise Operators
	- Logical Operators
	- Assignment Operators
- The Arithmetic Operators: are used in mathematical expressions in the same way that they are used in algebra. 
	- \+ (Addition)
	-  \- (Subtraction)
	- \* (Multiplication)
	- \/ (Division)
	- % (Modulus)
	- ++ (Increment)
	- \- - (Decrement)
- The Relational Operators: are used in comparing variables in java.
	- == (equal to)
	- != (not equal to)
	- \> (greater than)
	- < (less than)
	- \>= (greater than or equal to)
	- <= (less than or equal to)
- The Bitwise Operators: work on bits and performs bit-by-bit operation.
	- & (bitwise and)
	- | (bitwise or)
	- ^ (bitwise XOR)
	- ~ (bitwise compliment)
	- << (left shift)
	- \>> (right shift)
- The Logical Operators:
	- && (logical and)
	- || (logical or)
	- ! (logical not)
- The Assignment Operators:
	- =
	- +=
	- ...
- Conditional Operator ( ? : ): is also known as the ternary operator.
- instanceof Operator: The operator checks whether the object is of a particular type. is used only for object reference variables.
- An if statement consists of a boolean expression followed by one or more statements.
- An if statement can be followed by an optional else statement, which executes when the boolean expression is false.
- You can use one if or else if statement inside another if or else if statement(s).
- A switch statement allows a variable to be tested for equality against a list of values.
- Method definition consists of a method header and a method body.
- 

    modifier returnType nameOfMethod (Parameter List) {
    // method body
    }
- modifier : It defines the access type of the method and it is optional to use.
- returnType: Method may return a value.
- nameOfMethod: This is the method name. The method signature consists of the method name and the parameter list.
- Parameter List : The list of parameters, it is the type, order, and number of parameters of a method. These are optional, method may contain zero parameters.
- method body: The method body defines what the method does with the statements.