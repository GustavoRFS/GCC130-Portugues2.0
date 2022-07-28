grammar MinhaGramatica;

dec: 'DECLARACOES';
ALG: 'ALGORITMO';
TIPO: 'int'|'flutuante'|'texto'|'vouf';
ATR: 'atribuir';
A: 'a';
AP: '(';
FP: ')';
ESC: 'ESCREVA';
ID: LETRA(DIGITO|LETRA)*;
NUM: DIGITO+('.'DIGITO+)?;
OP_ARIT: '+'|'-'|'*'|'/';
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
WS: [ \r\t\n]* ->skip;
ErrorChar: . ;
