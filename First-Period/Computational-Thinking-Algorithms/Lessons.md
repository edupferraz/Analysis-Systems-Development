Lesson 01 (July 28, 2023)

- Variables can be defined as storage in memory (Microprocessor & RAM Memory).
- Microprocessor has the ability to process low-level functions.
 -Assignment operator (=).
- The variables type not only assists in logic but also impacts the microprocessors usage.
- Use of parentheses for precedence.

IN-CLASS EXERCISE: Create a flowchart to add two numbers and then multiply the result of this addition by the first number.

Lesson 02 (July 31, 2023)

- Decision structure of a flowchart.

Lesson 03 (August 04, 2023)

- Exercises to practice flowcharts and pseudocode.
- "If you don't know what problem an algorithm will solve, some problem exists."
- Pay attention to input/output and proper use of variables.

IN-CLASS EXERCISE: Create a flowchart to solve a quadratic equation.
IN-CLASS EXERCISE: Design a flowchart for simulating the calculation of simple or compound interest per month.

Lesson 04 (August 07, 2023)

- Logic of repetition structures

IN-CLASS EXERCISE: Draw a flowchart to average five numbers

Lesson 05 (August 11, 2023)

IN-CLASS EXERCISE: Exercises of list

- Pythagorean Theorem
  
![image](https://github.com/edupferraz/Analysis-Systems-Development/assets/57379069/1c9f93dc-7dfb-4b09-9adc-9b0c40cce07c)

  
- Vowel or Consonant

![image](https://github.com/edupferraz/Analysis-Systems-Development/assets/57379069/2f38e01b-2055-4676-86ef-dc46de5dba36)

Lesson 06 (August 14, 2023)

IN-CLASS EXERCISE: Exercises of list


Exercise 3: 

Consider that N is an integer and the set A is the set formed by divisors of N.
<code>
 <br> A = { x | x is an integer divisor of N}<br> 
</code>
 Example: for N=7 we have A = {-7,-1,1,7}

Write an algorithm to input N and a given x. The algorithm must inform whether x belongs to the set A of divisors of N.
  
 ALGORITMO verificar_divisor
  N: real
  x: real
 
 INICIO
  LER N
  LER x
  SE N % x = 0 ENTAO
   IMPRIMIR "É um divisor"
  SENAO
   IMPRIMIR "Não é um divisor"
 FIM


Exercise 4:

Consider the two sets A and B defined as follows:
 A = { x ∈ ℕ | N1 ≤ x <N2 } , where N1 and N2 are integers.
 B = { x ∈ ℕ | N3 < x <N4 } , where N3 and N4 are integers.

Implement an algorithm to read N1, N2, N3, N4 and a value of x. The algorithm must say whether x belongs only to set A, only to set B, belongs to both or does not belong to either. Identify input and output data.

 ALGORITMO verifica_conjunto
   N1: real
   N2: real
   N3: real
   N4: real
   x: real
 
 INICIO
  LER N1
  LER N2
  LER N3
  LER N4
  LER x
 
  SE N1 < 0 || N2 < 0 || N3 < 0 || N4 < 0 || x < 0 ENTAO 
   IMPRIMIR "Insira apenas números inteiros"
   RETORNAR
  SENAO
   SE x == N1 || x == N2 && x == N3 || x == N4 ENTAO
    IMPRIMIR "Pertence a ambos os conjuntos"
   SENAO SE x == N1 || x == N2 && x != N3 && x != N4 ENTAO
    IMPRIMIR "Pertence apenas ao conjunto A"
   SENAO SE x != N1 && x != N2 && x == N3 || x == N4 Entao
    IMPRIMIR "Pertence apenas ao conjunto B"
   SENAO
    IMPRIMIR "Não pertence a nenhum conjunto"
 
 FIM
  
Exercise 5: Implement an algorithm that simulates the output of a three-input AND logic gate. Consider the inputs to be 0 (0 volts) and 5 (5 volts). Reject any different input by asking the user to sign in again.

 ALGORITMO porta_and
  PORT1: real
  PORT2: real
  PORT3: real
  
 INICIO 
 
  LER PORT1
  ENQUANTO PORT1 != 0 || PORT1 != 5 FAÇA
   IMPRIMIR "Insira um valor correto"
   LER PORT1
  FIM_ENQUANTO
  
  LER PORT2
  ENQUANTO PORT2 != 0 || PORT2 != 5 FAÇA
   IMPRIMIR "Insira um valor correto"
   LER PORT2
  FIM_ENQUANTO

  LER PORT3
  ENQUANTO PORT3 != 0 || PORT3 != 5 FAÇA
   IMPRIMIR "Insira um valor correto"
   LER PORT3
  FIM_ENQUANTO

  SE PORT1 == 5 && PORT2 == 5 && PORT3 == 5 ENTAO
   IMPRIMIR "SAÍDA SERÁ IGUAL A 1"
  SENÃO
   IMPRIMIR "SAÍDA SERÁ IGUAL A 0"

 FIM 
<code>

Exercise 6: 

Design an algorithm to print the odd numbers in descending order between a given number N and 1. Use an approach that initially tests whether N is even and odd and then loops down the number so that it is odd in every iteration of the loop.

ALGORITMO contagem_impares
 N: real
INICIO
 SE N % 2 = 0 ENTAO


Lesson 06 (08/18/2023)
- Subprograms
- Use of Return
