# Section 5: Control Flow Statements
## Switch Case Statement
- Use the switch statement to select one of many code blocks to be executed.
- 

    switch(expression) {
      case x:
        // code block
        break;
      case y:
        // code block
        break;
      default:
        // code block
    }
- The switch expression is evaluated once.
- The value of the expression is compared with the values of each case.
- If there is a match, the associated block of code is executed.
- The break and default keywords are optional.
- When Java reaches a break keyword, it breaks out of the switch block.
- The default keyword specifies some code to run if there is no case match.
## For Loop
- Loops can execute a block of code as long as a specified condition is reached.
- 

    for (statement 1; statement 2; statement 3) {
      // code block to be executed
    }
- Statement 1 is executed (one time) before the execution of the code block.
- Statement 2 defines the condition for executing the code block.
- Statement 3 is executed (every time) after the code block has been executed.
## While and Do While Loop
- The while loop loops through a block of code as long as a specified condition is true.
- 

    while (condition) {
      // code block to be executed
    }
- The do/while loop is a variant of the while loop.
	- This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.
- 

    do {
      // code block to be executed
    }
    while (condition);
- The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
## User Input
- The Scanner class is used to get user input, and it is found in the java.util package.
- To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation.
- `nextBoolean()`: Reads a  `boolean`  value from the user

- `nextByte()`: Reads a  `byte`  value from the user

- `nextDouble()`: Reads a  `double`  value from the user

- `nextFloat()`: Reads a  `float`  value from the user

- `nextInt()`: Reads a  `int`  value from the user

- `nextLine()`: Reads a  `String`  value from the user

- `nextLong()`: Reads a  `long`  value from the user

- `nextShort()`: Reads a  `short`  value from the use
