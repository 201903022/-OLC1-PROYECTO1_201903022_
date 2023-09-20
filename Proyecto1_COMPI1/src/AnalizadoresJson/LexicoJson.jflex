

package AnalizadoresJson;
import java_cup.runtime.*;

%%

%{
public String errores=" ";
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

"&&"   {System.out.println("AND: "+yytext()); return new Symbol(sym.AND, yyline, yycolumn, yytext());}
"||"     {System.out.println("OR: "+yytext()); return new Symbol(sym.OR, yyline, yycolumn, yytext());}
 "/"    {System.out.println("DIVISION: "+yytext()); return new Symbol(sym.DIVISION, yyline, yycolumn, yytext());}
 "!="   {System.out.println("DISTINTO: "+yytext()); return new Symbol(sym.DISTINTO, yyline, yycolumn, yytext());}
 "^"      {System.out.println("POTENCIA: "+yytext()); return new Symbol(sym.POTENCIA, yyline, yycolumn, yytext());}
 "?"   {System.out.println("CBOOL: "+yytext()); return new Symbol(sym.CBOOL, yyline, yycolumn, yytext());}
 "%"  {System.out.println("PORCENTAJE: "+yytext()); return new Symbol(sym.PORCENTAJE, yyline, yycolumn, yytext());}
";"    {System.out.println("PCOMA: "+yytext()); return new Symbol(sym.PCOMA, yyline, yycolumn, yytext());}
 "!"   {System.out.println("NOT: "+yytext()); return new Symbol(sym.NOT, yyline, yycolumn, yytext());}
 "<"  {System.out.println("MENORK: "+yytext()); return new Symbol(sym.MENORK, yyline, yycolumn, yytext());}
 ">"  {System.out.println("MAYORK: "+yytext()); return new Symbol(sym.MAYORK, yyline, yycolumn, yytext());}
 "<="  {System.out.println("MENORIK: "+yytext()); return new Symbol(sym.MENORIK, yyline, yycolumn, yytext());}
 "="  {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "EQUALS", yytext().toString()); System.out.println("EQUALS: "+yytext()); return new Symbol(sym.EQUALS, yyline, yycolumn, yytext());}
 ">="  {System.out.println("MAYORIK: "+yytext()); return new Symbol(sym.MAYORIK, yyline, yycolumn, yytext());}
 "["  {System.out.println("CORCHETEA: "+yytext()); return new Symbol(sym.CORCHETEA, yyline, yycolumn, yytext());}
 "]"  {System.out.println("CORCHETEC: "+yytext()); return new Symbol(sym.CORCHETEC, yyline, yycolumn, yytext());}

 {ID} {Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "ID", yytext().toString()); System.out.println("ID: "+yytext()); return new Symbol(sym.ID, yyline, yycolumn, yytext()); }
 {CHAR} { Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "CHAR", yytext().toString()); System.out.println("CHAR: "+yytext()); return new Symbol(sym.CHAR, yyline, yycolumn, yytext()); }
 {STRING} { Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "STRING", yytext().toString()); System.out.println("STRING: "+yytext()); return new Symbol(sym.STRING, yyline, yycolumn, yytext()); }
 {NUM} { Tabla_Simbolos.DataSimbolos.addSimbolo(yyline ,yycolumn, "NUM", yytext().toString()); System.out.println("NUM: "+yytext()); return new Symbol(sym.NUM, yyline, yycolumn, yytext());  }
//------> Ingorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}
 {COMMENT_MULTILINE} { } 
 {COMMENT_SIMPLE} { }
 {ESP} { }
 . {errores += "<tr><td>Léxico</td><td> El caracter \""+yytext()+"\" no pertenece al lenguaje</td><td>"+yyline+"</td><td>"+yycolumn+"</td></tr>\n";
    Errores.DataErrores.addError(" Lexico " , yyline, yytcolumn, yytext().toString());
}

