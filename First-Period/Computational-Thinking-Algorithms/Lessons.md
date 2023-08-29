**Class 01 (July 28, 2023) - Subject Introduction**

- Variables can be defined as storage in memory (Microprocessor & RAM Memory).
- Microprocessor has the ability to process low-level functions.
- Assignment operator (=).
- The variables type not only assists in logic but also impacts the microprocessor's usage.
- Use of parentheses for precedence.

IN-CLASS EXERCISE: Create a flowchart to add two numbers and then multiply the result of this addition by the first number.

**Class 02 (July 31, 2023) - Structure a Flowchart**

- Decision structure of a flowchart.

**Class 03 (August 04, 2023) - Algorithmic Problem Solving and Flowchart Design**

- Exercises to practice flowcharts and pseudocode.
- "If you don't know what problem an algorithm will solve, some problem exists."
- Pay attention to input/output and proper use of variables.

IN-CLASS EXERCISE: Create a flowchart to solve a quadratic equation.
IN-CLASS EXERCISE: Design a flowchart for simulating the calculation of simple or compound interest per month.

**Class 04 (August 07, 2023) - Logic of Repetition Structures**

- Logic of repetition structures

IN-CLASS EXERCISE: Draw a flowchart to average five numbers

**Lesson 05 (August 11, 2023) -  List of exercises**

IN-CLASS EXERCISE: Exercises of list

- Pythagorean Theorem
  
![Pythagorean Theorem](https://github.com/edupferraz/Analysis-Systems-Development/assets/57379069/1c9f93dc-7dfb-4b09-9adc-9b0c40cce07c)

- Vowel or Consonant

![Vowel or Consonant](https://github.com/edupferraz/Analysis-Systems-Development/assets/57379069/2f38e01b-2055-4676-86ef-dc46de5dba36)

**Class 06 (August 14, 2023) - List of exercises**

IN-CLASS EXERCISE: Exercises of list

```bash
Exercise 3:

Consider that N is an integer and the set A is the set formed by divisors of N.

A = { x | x is an integer divisor of N}

Example: for N=7 we have A = {-7,-1,1,7}

Write an algorithm to input N and a given x. The algorithm must inform whether x belongs to the set A of divisors of N.

```algorithm
ALGORITHM verificar_divisor
  N: real
  x: real
 
BEGIN
  READ N
  READ x
  IF N % x = 0 THEN
    PRINT "It is a divisor"
  ELSE
    PRINT "It is not a divisor"
  END IF
END
```

```bash
Exercise 4:

Consider the two sets A and B defined as follows:
A = { x ∈ ℕ | N1 ≤ x <N2 } , where N1 and N2 are integers.
B = { x ∈ ℕ | N3 < x <N4 } , where N3 and N4 are integers.

Implement an algorithm to read N1, N2, N3, N4 and a value of x. The algorithm must say whether x belongs only to set A, only to set B, belongs to both, or does not belong to either.

ALGORITHM verifica_conjunto
   N1: real
   N2: real
   N3: real
   N4: real
   x: real
 
BEGIN
   READ N1
   READ N2
   READ N3
   READ N4
   READ x
 
   IF N1 < 0 OR N2 < 0 OR N3 < 0 OR N4 < 0 OR x < 0 THEN 
     PRINT "Insert only integer numbers"
   ELSE
     IF (x = N1 OR x = N2) AND (x = N3 OR x = N4) THEN
       PRINT "Belongs to both sets"
     ELSE IF (x = N1 OR x = N2) AND (x ≠ N3 AND x ≠ N4) THEN
       PRINT "Belongs only to set A"
     ELSE IF (x ≠ N1 AND x ≠ N2) AND (x = N3 OR x = N4) THEN
       PRINT "Belongs only to set B"
     ELSE
       PRINT "Does not belong to any set"
     END IF
   END IF
END
```
```bash
Exercise 5:

Implement an algorithm that simulates the output of a three-input AND logic gate. Consider the inputs to be 0 (0 volts) and 5 (5 volts). Reject any different input by asking the user to input again.

ALGORITHM porta_and
  PORT1: real
  PORT2: real
  PORT3: real
  
BEGIN 
  READ PORT1
  WHILE PORT1 ≠ 0 AND PORT1 ≠ 5 DO
    PRINT "Insert a valid value"
    READ PORT1
  END WHILE
  
  READ PORT2
  WHILE PORT2 ≠ 0 AND PORT2 ≠ 5 DO
    PRINT "Insert a valid value"
    READ PORT2
  END WHILE

  READ PORT3
  WHILE PORT3 ≠ 0 AND PORT3 ≠ 5 DO
    PRINT "Insert a valid value"
    READ PORT3
  END WHILE

  IF PORT1 = 5 AND PORT2 = 5 AND PORT3 = 5 THEN
    PRINT "OUTPUT WILL BE 1"
  ELSE
    PRINT "OUTPUT WILL BE 0"
  END IF
END
```

```bash
Exercise 6:

Design an algorithm to print the odd numbers in descending order between a given number N and 1. Use an approach that initially tests whether N is even and odd and then loops down the number so that it is odd in every iteration of the loop.

algorithm
Copy code
ALGORITHM contagem_impares
  N: real
BEGIN
  IF N % 2 = 0 THEN
    N ← N - 1
  END IF
  
  WHILE N >= 1 DO
    PRINT N
    N ← N - 2
  END WHILE
END
```

**Class 07 (August 18, 2023) - Subprogramas and Use of Return**

- Subprograms: Self-contained, reusable blocks of code within a larger program.
- Use of Return: is used within a subprogram to send a value back to the point in the program where the subprogram was called.

**Class 08 (August 21, 2023) - List of Exercises**

**Class 09 (August 25, 2023) - List of Exercises**
- To Complete

**Class 10 (August 28, 2023) - Iniciate Java**
- 
