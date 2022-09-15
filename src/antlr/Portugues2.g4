grammar Portugues2;


@header{
    package antlr;
}

programa: declaracoes  codigo * #NPrograma;
declaracoes: dec  identificacao* #NDeclaracoes;
identificacao: tipo  ID pev #NIdentificacao;
codigo: cod  comando* #NCodigo;
comando:  ( (entradasaida|atribuicao) pev | (expressaocondicional|expressaorepeticao)) #NComando;
expressaoarit: ( (ID|NUM)  op_arit  (ID|NUM) ) #NExpressaoArit; // | (ap  (ID|NUM)  op_arit  (ID|NUM)  fp);
expressaobool: ( (ID|vouf) | (ID|expressaoarit|vouf|NUM)  op_rel  (ID|expressaoarit|vouf|NUM) ) #NExpressaoBool;// | ap ( vouf | (ID|expressaoarit| vouf ) op_rel (ID|expressaoarit | vouf) ) fp op_bol ap expressaobool fp;
atribuicao: (NUM|TEXTO|expressaoarit|expressaobool|v|f )  atr  ID #NAtribuicao;
entradasaida: (ler|escrever)  (ID|NUM|TEXTO|expressaoarit|expressaobool) #NEntradaSaida;
expressaocondicional: cond  ap  (expressaobool)  fp  ac  comando  fc #NExpressaoRepeticao1| condsenao  ac  comando  fc #NExpressaoCondicional2;
expressaorepeticao: rep  ap  (expressaobool)  fp  ac  comando  fc #NExpressaoRepeticao;
vouf: v #NF| f #NV;

cod: 'CODIGO'; // Usado
dec: 'DECLARACOES'; // Usado

tipo: 'int'|'flutuante'|'texto'|'vouf'; // Usado
v: 'v'; // Usado
f: 'f'; // Usado
TEXTO: '"'(DIGITO|LETRA)*'"'; // Usado
atr: '=D'; // Usado
ap: '('; // Usado
fp: ')'; // Usado
ac: '{';
fc: '}';
pev: ';';
op_arit: '+'|'-'|'*'|'/'|'//'|'%'; // Usado
op_rel: '=='|'<'|'>'|'<='|'>='|'!='; // Usado
op_bol: 'e'|'ou'|'xou'|'nao'; // Usado
cond:'se'|'senao se';
condsenao: 'senao';
rep:'para'|'enquanto';
ler:'RECEBA'; // Usado
escrever:'TOMI'; // Usado
COMENTARIO: '#' .*? [\n] -> skip;
ID: LETRA(DIGITO|LETRA)*; // Usado
NUM: DIGITO+('.'DIGITO+)?; // Usado
LETRA: [a-zA-Z];
DIGITO: [0-9];
WS: [ \r\t\n]+ -> skip ;

ErrorChar: . ;
