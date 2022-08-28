grammar Portugues2;

x: '&';

PROGRAMA: DECLARACOES CODIGO;
DECLARACOES: DEC (TIPO ID PEV DECLARACOES)*;
CODIGO: COD (STMT)*;
EXPRESSAOARIT: ( (ID|NUM)  OP_ARIT  (ID|NUM)  ) | AP (ID|NUM)  OP_ARIT  (ID|NUM) OP_ARIT EXPRESSAOARIT FP ;
EXPRESSAOBOOL:  ( ID | (ID|EXPRESSAOARIT) OP_REL  (ID|EXPRESSAOARIT) ) |  AP ( ID | (ID|EXPRESSAOARIT)  OP_REL  (ID|EXPRESSAOARIT) ) FP OP_BOL AP EXPRESSAOBOOL FP;
ATRIBUICAO: (NUM|TEXTO|EXPRESSAOARIT|EXPRESSAOBOOL ) ATR ID;
INOUT: (LER|ESCREVER) (ID|NUM|TEXTO|EXPRESSAOARIT|EXPRESSAOBOOL);


STMT: PEV;




WS: [ \r\t\n]* ->skip;
COD: 'CODIGO';
DEC: 'DECLARACOES';

TIPO: 'int'|'flutuante'|'texto'|'vouf';
V: 'v';
F: 'f';
TEXTO: '"'(DIGITO|LETRA)*'"';
ATR: '=D';
AP: '(';
FP: ')';
AC: '{';
FC: '}';
PEV: ';';
OP_ARIT: '+'|'-'|'*'|'/'|'//'|'%';
OP_REL: '=='|'<'|'>'|'<='|'>='|'!=';
OP_BOL: 'e'|'ou'|'xou'|'nao';
COND:'se'|'senao'|'senao se';
REP:'para'|'enquanto';
LER:'RECEBA';
ESCREVER:'TOMI';
LINECOMMENT: '#' ~[\r\n]* -> skip;
ID: LETRA(DIGITO|LETRA)*;
NUM: DIGITO+('.'DIGITO+)?;
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

ErrorChar: . ;
