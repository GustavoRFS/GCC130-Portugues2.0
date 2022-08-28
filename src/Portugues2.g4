grammar Portugues2;

x: '&';

PROGRAMA: DECLARACOES WS CODIGO WS*;
DECLARACOES: DEC WS IDENTIFICACAO*;
IDENTIFICACAO: TIPO WS ID PEV WS;
CODIGO: COD WS COMANDO*;
COMANDO: WS? ( (ENTRADASAIDA|ATRIBUICAO) PEV | (COMENTARIO|EXPRESSAOCONDICIONAL|EXPRESSAOREPETICAO));
EXPRESSAOARIT: ( (ID|NUM) WS OP_ARIT WS (ID|NUM) ); // | (AP WS? (ID|NUM) WS? OP_ARIT WS (ID|NUM) WS? FP);
EXPRESSAOBOOL: ( (ID|VOUF) | (ID|EXPRESSAOARIT|VOUF|NUM) WS OP_REL WS (ID|EXPRESSAOARIT|VOUF|NUM) );// | AP ( VOUF | (ID|EXPRESSAOARIT| VOUF ) OP_REL (ID|EXPRESSAOARIT | VOUF) ) FP OP_BOL AP EXPRESSAOBOOL FP;
ATRIBUICAO: (NUM|TEXTO|EXPRESSAOARIT|EXPRESSAOBOOL ) WS ATR WS ID;
ENTRADASAIDA: (LER|ESCREVER) WS (ID|NUM|TEXTO|EXPRESSAOARIT|EXPRESSAOBOOL);
EXPRESSAOCONDICIONAL: COND WS? AP WS? (EXPRESSAOBOOL) WS? FP WS? AC WS? COMANDO WS? FC | CONDSENAO WS? AC WS? COMANDO WS? FC;
EXPRESSAOREPETICAO: REP WS? AP WS? (EXPRESSAOBOOL) WS? FP WS? AC WS? COMANDO WS? FC;
VOUF: V | F;

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
COND:'se'|'senao se';
CONDSENAO: 'senao';
REP:'para'|'enquanto';
LER:'RECEBA'; // Usado
ESCREVER:'TOMI'; // Usado
COMENTARIO: '#' .*? [\n] -> skip;
ID: LETRA(DIGITO|LETRA)*; // Usado
NUM: DIGITO+('.'DIGITO+)?; // Usado
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
WS: [ \r\t\n]+ -> skip ;

ErrorChar: . ;
