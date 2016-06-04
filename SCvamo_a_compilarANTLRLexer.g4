grammar SCvamo_a_compilarANTLRLexer;

control
    : decls delta                       #ctrl
    ;

decls
    :                                   #declsEmpty
    | decllet decls                     #letList
	| decldisp decls                    #dispList
     ;

decldisp
    : 'disp' ID t STRING '=' exp        #disp
    ;

decllet
    : 'let' ID '=' delta                #let
    ;

delta
    :delta1 delta0pp                    #delt
    ;

delta0p
    : '>>=' delta1 delta0pp             #delt0p
    ;

delta0pp
    :                                   #delt0ppEmpty
    | delta0p                           #delt0pp
    ;

delta1
    : delta2 delta1pp                   #delt1
    ;

delta1p
    : '>>' delta2 delta1pp              #delt1p
    ;

delta1pp
    :                                   #delt1ppEmpty
    | delta1p                           #delt1pp
    ;

delta2
    : delta3 delta2pp                   #delt2
    ;

delta2p
    : '|' delta3 delta2pp               #delt2p
    ;

delta2pp
    :                                   #delt2ppEmpty
    | delta2p                           #delt2pp
    ;

delta3
    : ID                                #delt3ID
    | '{' delta '}'                     #delt3Curl
    | '[' exp ']'                       #delt3Brack
    | '(' delta (',' delta)+ ')'        #delt3Paren
    ;

exp
    : '+' exp exp0p                     #add
    | '-' exp exp0p                     #sub
    | exp1                              #expr1
    ;

exp1
    : '*' exp exp0p                     #times
    | '/' exp exp0p                     #divide
    | exp2                              #expr2
    ;

exp2
    : eta NUMERO exp0p                  #num
    | exp3                              #expr3
    ;

exp3
    :'@' exp exp0p                      #at
    | '_' exp0p                         #underLine
    | 'input' exp0p                     #input
    | '(' exp ')' exp0p                 #listParen
    | '<' exp (',' exp)+ '>' exp0p      #listAng
    ;

exp0p
    :                                   #exp0pEmpty
    | exp                               #expr
    ;

eta
    :                                   #positive
    | '-'                               #negative
    ;

t
    :t1 t0p                             #tao1
    ;

t0p
    :                                   #t0pEmpty
    |':' t                              #dots
    ;

t1
    : 'Int'                             #t1Int
    | VOID                              #t1Void
    | '(' t(',' t)+ ')'                 #t1Paren
    ;

VOID
    : '()'
    ;

STRING
    : '"' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '_' | '/' | ' ') * '"'
    ;

NUMERO
    : '0'
    | ('1'..'9')('0'..'9')*
    ;

ID  :
    ([a-zA-Z][a-zA-Z0-9_]*)
    ;

WS  :   ( ' '
    | '\t'
    | '\r'
    | '\n'
	| '\f'
	) -> skip
    ;


ERROR: . ;