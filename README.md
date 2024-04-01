# antlr4

Construction of Interpreters university project at PUCPR

Project made by :
Guilherme Liudi Ioshii,
Heron Ricardo,
Marcel Ottoni.
------

# Introduction

The following project is developed for the Interpreter Construction discipline of the 5th period of the Bachelor's degree in Information Systems at the Pontifical Catholic University of Paraná (PUCPR).

It is expected that our group creates a Lexer analyzers and Synthetic analyzers, building grammars and roads based on RPN (Reverse Polish Notation).

We built the synthatic tree based on our previous project (TDE) from the Interpreter Construction discipline, a Calculator which utilizes the RPN (Reverse Polish Notation) made in python Language.

------

## Project

The Project was developed in antlr4 and compiled in Java.

![image](https://github.com/guiioshii/antlr4/assets/105391453/e2e8e3c8-d928-4670-8a13-2116073e46de)

- prog = Line that will run the code

- linha = Defining each line


![image](https://github.com/guiioshii/antlr4/assets/105391453/47f9c9d3-c8e7-4a39-9428-4cc56337d06a)

- expressao = Defining each possible expression, if the user utilizes an expression that is not listed above, it will result in a error.

![image](https://github.com/guiioshii/antlr4/assets/105391453/8e900878-de5f-43f4-96e5-93b3ce6747f5)

- operador = Defining each possible operator

- divisoes_inteiros = Define division rules for integers

- potencia =  Define the power rules, requiring the exponent to be an integer

- numero = Definitions of numbers that are accepted in expressions

- numeros_inteiros = Definitions of integers that are accepted in expression, accepting positive or negative, it does not accept '0'

- numeros_floats = definitions of float numbers that are accepted in expressions, accepting positive or negative, accepting number '0'


![image](https://github.com/guiioshii/antlr4/assets/105391453/f0739c6b-7415-4945-94e7-be42143eb23d)

- The image above we creates the types of the operators that are used by our program 

![image](https://github.com/guiioshii/antlr4/assets/105391453/2ac17862-0c5f-4c03-aa20-b2c168792ebe)

WS = 'Whitespace' 

- Types of numbers that are used by our program.

## Results

![image](https://github.com/guiioshii/antlr4/assets/105391453/f6789ec0-d88e-4d48-8b79-711020d4144e)


This is the steps necessary to run our program, utilizing the student Heron computer.


![image](https://github.com/guiioshii/antlr4/assets/105391453/143da75a-be05-4c43-adaf-4a6d280fc33e)

Input example : ((2 3 +) 4 *)

each 'linha' is separated by the WS, and creates a different synthetic tree for each line.


## ERROR

![image](https://github.com/guiioshii/antlr4/assets/105391453/4ee6cb0a-273a-4092-9eb3-a60d445d15a4)

![image](https://github.com/guiioshii/antlr4/assets/105391453/3004e500-d536-4df2-a637-52097d700157)

If an error occurs, it will write in the Log as seen in the 1st picture, the code will still run, but the result will not show the error.


## CONCLUSION

The following project using lexical and syntactic was to develop our skills and understand how these concepts learned in class work
