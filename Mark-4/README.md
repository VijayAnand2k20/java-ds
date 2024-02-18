## Day 6 - Switch and nested

### Switch
- Switch is a conditional statement that evaluates an expression and compares it against a list of possible matches and executes the corresponding block of code.

Syntax:
```java
switch(expression) {
   case value1 :
      //Statements
      break; //optional
   case value2 :
      //Statements
      break; //optional
   //You can have any number of case statements.
   default : //Optional
      //Statements
}
```

- Cases must be the same type as the expression, must be a constant or literal.
- Duplicate cases are not allowed.
- Break statement is used to terminate a case.
- `default` statement is optional and is executed if no case matches the expression.
- If no break appears, the flow of control will fall through to subsequent cases until a break is reached.

- Enhanced switch statement
```java
switch(expression) {
   case value1 -> {
        statement1
    }
   case value2 -> statement2
   case valueN -> statementN
   default -> statementDefault
}
```
- The arrow token `->` is called the lambda operator.
- The lambda operator separates the case value from the statement to be executed.
- The break statement is not needed in the enhanced switch statement.
- The enhanced switch statement is only available in Java 12 and later.

### Nested

- switch inside switch is called nested switch.
- Nested switch statements are allowed.
- A switch statement can be inside another switch statement.
- Example:
```java
switch (expression1) {
    case value1:
        switch (expression2) {
            case value1:
                //Statements
                break;
            case value2:
                //Statements
                break;
            case valueN:
                //Statements
                break;
            default:
                //Statements
        }
        break;
    case value2:
        //Statements
        break;
    case valueN:
        //Statements
        break;
    default:
        //Statements
}
```