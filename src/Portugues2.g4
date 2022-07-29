grammar Portugues2;

x: '&';

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
