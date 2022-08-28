grammar Portugues2;

x: '&';



PROGRAMA: DECLARACOES CODIGO;
DECLARACOES: DEC IDENTIFICACAO*;
IDENTIFICACAO: TIPO ID PEV;
CODIGO: COD COMANDO*;
COMANDO: (ENTRADASAIDA|ATRIBUICAO) PEV | ;
EXPRESSAOARIT: ( (ID|NUM)  OP_ARIT  (ID|NUM)  ) | AP (ID|NUM)  OP_ARIT  (ID|NUM) OP_ARIT EXPRESSAOARIT FP ;
EXPRESSAOBOOL:  (  VOUF | (ID|EXPRESSAOARIT| VOUF) OP_REL  (ID | EXPRESSAOARIT | VOUF) ) |  AP (   VOUF | (ID|EXPRESSAOARIT| VOUF )  OP_REL  (ID|EXPRESSAOARIT| VOUF) ) FP OP_BOL AP EXPRESSAOBOOL FP;
ATRIBUICAO: (NUM|TEXTO|EXPRESSAOARIT|EXPRESSAOBOOL ) ATR ID;
ENTRADASAIDA: (LER|ESCREVER) (ID|NUM|TEXTO|EXPRESSAOARIT|EXPRESSAOBOOL);
VOUF: V | F;




WS: [ \r\t\n]* ->skip;

COD: 'CODIGO'; // Usado
DEC: 'DECLARACOES'; // Usado

TIPO: 'int'|'flutuante'|'texto'|'vouf'; // Usado
V: 'v'; // Usado
F: 'f'; // Usado
TEXTO: '"'(DIGITO|LETRA)*'"'; // Usado
ATR: '=D'; // Usado
AP: '('; // Usado
FP: ')'; // Usado
AC: '{';
FC: '}';
PEV: ';';
OP_ARIT: '+'|'-'|'*'|'/'|'//'|'%'; // Usado
OP_REL: '=='|'<'|'>'|'<='|'>='|'!='; // Usado
OP_BOL: 'e'|'ou'|'xou'|'nao'; // Usado
COND:'se'|'senao'|'senao se';
REP:'para'|'enquanto';
LER:'RECEBA'; // Usado
ESCREVER:'TOMI'; // Usado
LINECOMMENT: '#' ~[\r\n]* -> skip;
ID: LETRA(DIGITO|LETRA)*; // Usado
NUM: DIGITO+('.'DIGITO+)?; // Usado
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

ErrorChar: . ;
