package Analizadores;
import java_cup.runtime.*;

%%

%{
public String errores="";
%}

%class Lexico
%public 
%line 
%column
%char 
%cup 
%unicode
%ignorecase

%{ 
%}       

ESPACIO= [ \t\r\n]+
COMMENT_MULTILINE="/*"([^*]|("*"[^/]))+"*/" 
COMMENT_SIMPLE="//".*
NUM = [0-9]+(\.[0-9]*)?
ESP = [ -/:@\[-`{-}]
ESCAPADOS = "\\\""|"\\\'"|"\\n"
NO_ESCAPADOS = [^\'\"]
ID = [a-zA-Z_][a-zA-Z0-9_]*
CHAR = \'  ([^\"]|"\\\"")+  \'
STRING = \"  ([^\"]|"\\\"")+  \"

%%
":"       { Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "NUM", yytext().toString()); System.out.println("DOS_PUNTOS: "+yytext()); return new Symbol(sym.DOS_PUNTOS, yyline, yycolumn, yytext()); }
","       {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "COMA", yytext().toString()); System.out.println("COMA: "+yytext()); return new Symbol(sym.COMA, yyline, yycolumn, yytext());  }
"{"       { Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "LLAVE_A", yytext().toString()); System.out.println("LLAVE_A: "+yytext()); return new Symbol(sym.LLAVE_A, yyline, yycolumn, yytext()); }
"}"       {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "LLAVE_C", yytext().toString());System.out.println("LLAVE_C: "+yytext()); return new Symbol(sym.LLAVE_C, yyline, yycolumn, yytext()); }    
"("       {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "PARA", yytext().toString());System.out.println("PARA: "+yytext()); return new Symbol(sym.PARA, yyline, yycolumn, yytext());  }
")"       {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "PARC", yytext().toString());System.out.println("PARC: "+yytext()); return new Symbol(sym.PARC, yyline, yycolumn, yytext());    }
"."       {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "PARC", yytext().toString()); System.out.println("DOT: "+yytext()); return new Symbol(sym.DOT, yyline, yycolumn, yytext());    }
"+"      { Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "PARC", yytext().toString()); System.out.println("MAS: "+yytext()); return new Symbol(sym.MAS, yyline, yycolumn, yytext());   }
"-"      {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "PARC", yytext().toString()); System.out.println("MENOS: "+yytext()); return new Symbol(sym.MENOS, yyline, yycolumn, yytext());   }
"*"      {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "PARC", yytext().toString()); System.out.println("MULTI: "+yytext()); return new Symbol(sym.MULTI, yyline, yycolumn, yytext());   }
"$"      {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "DOLAR", yytext().toString()); System.out.println("DOLAR: "+yytext()); return new Symbol(sym.DOLAR, yyline, yycolumn, yytext()); }

"&&"   { Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "AND", yytext().toString()); System.out.println("AND: "+yytext()); return new Symbol(sym.AND, yyline, yycolumn, yytext());}
"||"     { Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "OR", yytext().toString()); System.out.println("OR: "+yytext()); return new Symbol(sym.OR, yyline, yycolumn, yytext());}
 "/"    {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "DIVISION", yytext().toString()); System.out.println("DIVISION: "+yytext()); return new Symbol(sym.DIVISION, yyline, yycolumn, yytext());}
 "!="   {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "DISTINTO", yytext().toString()); System.out.println("DISTINTO: "+yytext()); return new Symbol(sym.DISTINTO, yyline, yycolumn, yytext());}
 "^"      {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "POTENCIA", yytext().toString()); System.out.println("POTENCIA: "+yytext()); return new Symbol(sym.POTENCIA, yyline, yycolumn, yytext());}
 "?"   {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "CBOOL", yytext().toString()); System.out.println("CBOOL: "+yytext()); return new Symbol(sym.CBOOL, yyline, yycolumn, yytext());}
 "%"  {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "PORCENTAJE", yytext().toString()); System.out.println("PORCENTAJE: "+yytext()); return new Symbol(sym.PORCENTAJE, yyline, yycolumn, yytext());}
";"    {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "PCOMA", yytext().toString()); System.out.println("PCOMA: "+yytext()); return new Symbol(sym.PCOMA, yyline, yycolumn, yytext());}
 "!"   {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "NOT", yytext().toString()); System.out.println("NOT: "+yytext()); return new Symbol(sym.NOT, yyline, yycolumn, yytext());}
 "<"  { Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "MENORK", yytext().toString()); System.out.println("MENORK: "+yytext()); return new Symbol(sym.MENORK, yyline, yycolumn, yytext());}
 ">"  { Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "MAYORK", yytext().toString()); System.out.println("MAYORK: "+yytext()); return new Symbol(sym.MAYORK, yyline, yycolumn, yytext());}
 "<="  {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "MENORIK", yytext().toString()); System.out.println("MENORIK: "+yytext()); return new Symbol(sym.MENORIK, yyline, yycolumn, yytext());}
 "="  {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "EQUALS", yytext().toString()); System.out.println("EQUALS: "+yytext()); return new Symbol(sym.EQUALS, yyline, yycolumn, yytext());}
 ">="  {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "MAYORIK", yytext().toString()); System.out.println("MAYORIK: "+yytext()); return new Symbol(sym.MAYORIK, yyline, yycolumn, yytext());}
 "["  {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "CORCHETEA", yytext().toString()); System.out.println("CORCHETEA: "+yytext()); return new Symbol(sym.CORCHETEA, yyline, yycolumn, yytext());}
 "]"  {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "CORCHETEC", yytext().toString());System.out.println("CORCHETEC: "+yytext()); return new Symbol(sym.CORCHETEC, yyline, yycolumn, yytext());}

"main"     {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_MAIN", yytext().toString()); System.out.println("MAIN: "+yytext()); return new Symbol(sym.MAIN, yyline, yycolumn, yytext());}
"char"     {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_CHAR", yytext().toString());System.out.println("CHAR_TYPE: "+yytext()); return new Symbol(sym.CHAR_TYPE, yyline, yycolumn, yytext());}
"int"         {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_INT", yytext().toString()); System.out.println("INT_TYPE: "+yytext()); return new Symbol(sym.INT_TYPE, yyline, yycolumn, yytext());}
"bool"       {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_BOOL", yytext().toString());System.out.println("BOOL_TYPE: "+yytext()); return new Symbol(sym.BOOL_TYPE, yyline, yycolumn, yytext());}
 "double"     {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_DOUBLE", yytext().toString());System.out.println("DOUBLE_TYPE: "+yytext()); return new Symbol(sym.DOUBLE_TYPE, yyline, yycolumn, yytext());}
"string"     {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_STRING", yytext().toString());System.out.println("STRING_TYPE: "+yytext()); return new Symbol(sym.STRING_TYPE, yyline, yycolumn, yytext());}
"void"       {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_VOID", yytext().toString());System.out.println("VOID: "+yytext()); return new Symbol(sym.VOID, yyline, yycolumn, yytext());}
"break"   {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_BREAK", yytext().toString());System.out.println("BREAK: "+yytext()); return new Symbol(sym.BREAK, yyline, yycolumn, yytext());}
"case"     {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_CASE", yytext().toString());System.out.println("CASE: "+yytext()); return new Symbol(sym.CASE, yyline, yycolumn, yytext());}
"catch"     {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_CATCH", yytext().toString());System.out.println("CATCH: "+yytext()); return new Symbol(sym.CATCH, yyline, yycolumn, yytext());}
"do"         {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_DO", yytext().toString());System.out.println("DO: "+yytext()); return new Symbol(sym.DO, yyline, yycolumn, yytext());}
 "else"     {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_ELSE", yytext().toString());System.out.println("ELSE: "+yytext()); return new Symbol(sym.ELSE, yyline, yycolumn, yytext());}
"for"  {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_FOR", yytext().toString());System.out.println("FOR: "+yytext()); return new Symbol(sym.FOR, yyline, yycolumn, yytext());}
"if"  {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_IF", yytext().toString());System.out.println("IF: "+yytext()); return new Symbol(sym.IF, yyline, yycolumn, yytext());}
"switch"  { Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_SWITCH", yytext().toString()); System.out.println("SWITCH: "+yytext()); return new Symbol(sym.SWITCH, yyline, yycolumn, yytext());}
"null"  {System.out.println("NULL: "+yytext()); return new Symbol(sym.NULL, yyline, yycolumn, yytext());}
"new" {System.out.println("NEW: "+yytext()); return new Symbol(sym.NEW, yyline, yycolumn, yytext());}
"public"  {System.out.println("PUBLIC: "+yytext()); return new Symbol(sym.PUBLIC, yyline, yycolumn, yytext());}
"return"   {System.out.println("RETURN: "+yytext()); return new Symbol(sym.RETURN, yyline, yycolumn, yytext());}
"while"   {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_WHILE", yytext().toString());System.out.println("WHILE: "+yytext()); return new Symbol(sym.WHILE, yyline, yycolumn, yytext());}
"private" {System.out.println("PRIVATE: "+yytext()); return new Symbol(sym.PRIVATE, yyline, yycolumn, yytext());}
"true"     {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_TRUE", yytext().toString());System.out.println("TRUE: "+yytext()); return new Symbol(sym.TRUE, yyline, yycolumn, yytext());}
"Console.Write"  {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_PRINT", yytext().toString());System.out.println("PRINT: "+yytext()); return new Symbol(sym.PRINT, yyline, yycolumn, yytext());}
"console"  {System.out.println("CONSOLE: "+yytext()); return new Symbol(sym.CONSOLE, yyline, yycolumn, yytext());}
"write"  {System.out.println("WRITE: "+yytext()); return new Symbol(sym.WRITE, yyline, yycolumn, yytext());}
"false"  {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_FALSE", yytext().toString());System.out.println("FALSE: "+yytext()); return new Symbol(sym.FALSE, yyline, yycolumn, yytext());}
"try"  { Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_TRY", yytext().toString()); System.out.println("TRY: "+yytext()); return new Symbol(sym.TRY, yyline, yycolumn, yytext());}
"default"  {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_DEFAULT", yytext().toString());System.out.println("DEFAULT: "+yytext()); return new Symbol(sym.DEFAULT, yyline, yycolumn, yytext());}
"continue" {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_CONTINUE", yytext().toString());System.out.println("CONTINUE: "+yytext()); return new Symbol(sym.CONTINUE, yyline, yycolumn, yytext());}

"GraFicaBarras" {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_GBARRAS", yytext().toString());System.out.println("GBARRAS: "+yytext()); return new Symbol(sym.GBARRAS, yyline, yycolumn, yytext());}
"GraFicaPie" { Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_GPIE", yytext().toString());System.out.println("GPIE: "+yytext()); return new Symbol(sym.GPIE, yyline, yycolumn, yytext());}
"DefinirGlobales" {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_DGLOBALES", yytext().toString());System.out.println("DGLOBALES: "+yytext()); return new Symbol(sym.DGLOBALES, yyline, yycolumn, yytext());}
"titulo" { Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_TITULO", yytext().toString()); System.out.println("R_TITULO: "+yytext()); return new Symbol(sym.R_TITULO, yyline, yycolumn, yytext());}
"Ejex" {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_EJEX", yytext().toString());System.out.println("EJEX: "+yytext()); return new Symbol(sym.EJEX, yyline, yycolumn, yytext());}
"TituloX" { Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_TITULOX", yytext().toString()); System.out.println("R_TITULOX: "+yytext()); return new Symbol(sym.R_TITULOX, yyline, yycolumn, yytext());}
"TituloY" {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_TITULOY", yytext().toString());System.out.println("R_TITULOY: "+yytext()); return new Symbol(sym.R_TITULOY, yyline, yycolumn, yytext());}
"valores" {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_VALORES", yytext().toString());System.out.println("VALORES: "+yytext()); return new Symbol(sym.VALORES, yyline, yycolumn, yytext());}
"NewValor" {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "R_NEWVALOR", yytext().toString());System.out.println("NEWVALOR: "+yytext()); return new Symbol(sym.NEWVALOR, yyline, yycolumn, yytext());}

 {ID} {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "ID", yytext().toString());System.out.println("ID: "+yytext()); return new Symbol(sym.ID, yyline, yycolumn, yytext());}
 {CHAR} {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "CHAR", yytext().toString());System.out.println("CHAR: "+yytext()); return new Symbol(sym.CHAR, yyline, yycolumn, yytext());}
 {STRING} {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "STRING", yytext().toString());System.out.println("STRING: "+yytext()); return new Symbol(sym.STRING, yyline, yycolumn, yytext());}
 {NUM} {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "NUM", yytext().toString());System.out.println("NUM: "+yytext()); return new Symbol(sym.NUM, yyline, yycolumn, yytext());}
//------> Ingorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}
 {COMMENT_MULTILINE} { } 
 {COMMENT_SIMPLE} { }
 . {errores += "<tr><td>Léxico</td><td> El caracter \""+yytext()+"\" no pertenece al lenguaje</td><td>"+yyline+"</td><td>"+yycolumn+"</td></tr>\n";}

