//Guilherme Liudi Ioshii
//Heron Ricardo Rodrigues da Cruz
//Marcel Ottoni de Oliveira
grammar Expr;

//Sintatico

//linha que vai rodar o programa geral
prog: linha* EOF;

//definindo cada linha
linha: expressao;

//definindo as possibilidades das expressões
expressao:  
    numero
    |expressao expressao operador
    |NUMERO_INTEIRO COMANDO_RES
    |LPARENTESES numeros_inteiros numeros_inteiros divisoes_inteiros RPARENTESES
    |numeros_inteiros numeros_inteiros divisoes_inteiros
    |LPARENTESES expressao* RPARENTESES
    |LPARENTESES expressao operador RPARENTESES
    |expressao operador
    |LPARENTESES expressao divisoes_inteiros RPARENTESES
    |expressao divisoes_inteiros
    |expressao expressao operador
    |COMANDO_MEM
    |expressao COMANDO_MEM
    |COMANDO_MEM expressao operador
    |expressao numeros_inteiros potencia
    |numeros_floats numeros_floats operador
    |LPARENTESES COMANDO_RES expressao operador RPARENTESES
    |LPARENTESES expressao COMANDO_RES operador RPARENTESES
    |LPARENTESES COMANDO_MEM COMANDO_RES RPARENTESES;

//definindo os possiveis operadores que podem ser digitados
operador: ADICAO | SUBTRACAO | MULTI | DIVI_REAL;

divisoes_inteiros
    : DIVI | REST_DIVI;

potencia
    : POW;

//definindo os tipos de numeros possiveis que podem ser digitados
numero
    :  NUMERO_INTEIRO 
    | NUMERO_INTEIRO_NEGATIVO 
    | NUMERO_FLOAT 
    | NUMERO_FLOAT_NEGATIVO 
    | NUMERO_ZERO 
    | NUMERO_FLOAT_ZERO 
    | NUMERO_FLOAT_ZERO_NEGATIVO;

numeros_inteiros
    : NUMERO_INTEIRO | NUMERO_INTEIRO_NEGATIVO;

numeros_floats
    : NUMERO_FLOAT | NUMERO_FLOAT_NEGATIVO | NUMERO_FLOAT_ZERO | NUMERO_FLOAT_ZERO_NEGATIVO;

//Lexico
//definindo nome dos tokens para os operadores
ADICAO: '+';
SUBTRACAO: '-';
MULTI: '*';
DIVI: '/';
POW: '^';
REST_DIVI: '%';
DIVI_REAL: '|';


//definindo nome dos tokens para os parenteses
LPARENTESES: '(';
RPARENTESES: ')';

//definindo nome dos tokens para os comandos do RPN
COMANDO_MEM: 'MEM';
COMANDO_RES: 'RES';
    

//código para pular linha e desconsiderar espaços
WS
    : [ \r\n\t]+ -> skip
    ;

    //definindo valores dos tokens para os numeros
    NUMERO_ZERO: [0]+;
    NUMERO_INTEIRO: [1-9] [0-9]*;
    NUMERO_INTEIRO_NEGATIVO: '-' [1-9] [0-9]*;
    NUMERO_FLOAT: [0-9]+ ('.' [1-9]+);
    NUMERO_FLOAT_NEGATIVO: '-' [0-9]+ ('.' [1-9]+);
    NUMERO_FLOAT_ZERO: [0-9]+ ('.' [0-9]+);
    NUMERO_FLOAT_ZERO_NEGATIVO: '-' [0-9]+ ('.' [0-9]+);
