/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorsql;

/**
 *
 * @author Noe Gomez
 */
public class Lexer {
    {
/*package minisql;
import static minisql.Token.*;
%%
%class Lexer
%line
%column
%type Token
L = [a-zA-Z]
l = [a-zA-Z_]
D = [0-9]
O = ["+""-""*""/""%""<""<="">"">=""=""==""!=""&&""||""!"";"","".""[""]""("")""{""}""[]""()""{}""@""#""##"]
WHITE = [ \t\r\n]
%{
public String lexeme;
public int line;
public int column;
%}
%%
{WHITE} {/*Ignore*/}
// ("--")([^\n])* {/*Ignore*/}
// (("/*")([^*])+~("*/")) {/*Ignore*/}
//("/*")([^\n])* {line=yyline; column=yycolumn; lexeme=yytext(); return Error_Comentario;}
//(("'")([^\n'])*("'")) {line=yyline; column=yycolumn; lexeme=yytext(); return String;}
//(("'")([^\n'])*) {line=yyline; column=yycolumn; lexeme=yytext(); return Error_String;}
//((ABSOLUTE)|(ACTION)|(ADA)|(ADD)|(ALL)|(ALLOCATE)|(ALTER)|(AND)|(ANY)|(ARE)|(AS)|(ASC)|(ASSERTION)|(AT)|(AUTHORIZATION)|(AVG)|(BACKUP)|(BEGIN)|(BETWEEN)|(BIT)|(BIT_LENGTH)|(BOTH)|(BREAK)|(BROWSE)|(BULK)|(BY)|(CASCADE)|(CASCADED)|(CASE)|(CAST)|(CATALOG)|(CHAR)|(CHAR_LENGTH)|(CHARACTER)|(CHARACTER_LENGTH)|(CHECK)|(CHECKPOINT)|(CLOSE)|(CLUSTERED)|(COALESCE)|(COLLATE)|(COLLATION)|(COLUMN)|(COMMIT)|(COMPUTE)|(CONNECT)|(CONNECTION)|(CONSTRAINT)|(CONSTRAINTS)|(CONTAINS)|(CONTAINSTABLE)|(CONTINUE)|(CONVERT)|(CORRESPONDING)|(COUNT)|(CREATE)|(CROSS)|(CURRENT)|(CURRENT_DATE)|(CURRENT_TIME)|(CURRENT_TIMESTAMP)|(CURRENT_USER)|(CURSOR)|(DATABASE)|(DATE)|(DAY)|(DBCC)|(DEALLOCATE)|(DEC)|(DECIMAL)|(DECLARE)|(DEFAULT)|(DEFERRABLE)|(DEFERRED)|(DELETE)|(DENY)|(DESC)|(DESCRIBE)|(DESCRIPTOR)|(DIAGNOSTICS)|(DISCONNECT)|(DISK)|(DISTINCT)|(DISTRIBUTED)|(DOMAIN)|(DOUBLE)|(DROP)|(DUMP)|(ELSE)|(END)|(END-EXEC)|(ERRLVL)|(ESCAPE)|(EXCEPT)|(EXCEPTION)|(EXEC)|(EXECUTE)|(EXISTS)|(EXIT)|(EXTERNAL)|(EXTRACT)|(FALSE)|(FETCH)|(FILE)|(FILLFACTOR)|(FIRST)|(FLOAT)|(FOR)|(FOREIGN)|(FORTRAN)|(FOUND)|(FREETEXT)|(FREETEXTTABLE)|(FROM)|(FULL)|(FUNCTION)|(GET)|(GLOBAL)|(GO)|(GOTO)|(GRANT)|(GROUP)|(HAVING)|(HOLDLOCK)|(HOUR)|(IDENTITY)|(IDENTITY_INSERT)|(IDENTITYCOL)|(IF)|(IMMEDIATE)|(IN)|(INCLUDE)|(INDEX)|(INDICATOR)|(INITIALLY)|(INNER)|(INPUT)|(INSENSITIVE)|(INSERT)|(INT)|(INTEGER)|(INTERSECT)|(INTERVAL)|(INTO)|(IS)|(ISOLATION)|(JOIN)|(KEY)|(KILL)|(LANGUAGE)|(LAST)|(LEADING)|(LEFT)|(LEVEL)|(LIKE)|(LINENO)|(LOAD)|(LOCAL)|(LOWER)|(MATCH)|(MAX)|(MERGE)|(MIN)|(MINUTE)|(MODULE)|(MONTH)|(NAMES)|(NATIONAL)|(NATURAL)|(NCHAR)|(NEXT)|(NO)|(NOCHECK)|(NONCLUSTERED)|(NONE)|(NOT)|(NULL)|(NULLIF)|(NUMERIC)|(OCTET_LENGTH)|(OF)|(OFF)|(OFFSETS)|(ON)|(ONLY)|(OPEN)|(OPENDATASOURCE)|(OPENQUERY)|(OPENROWSET)|(OPENXML)|(OPTION)|(OR)|(ORDER)|(OUTER)|(OUTPUT)|(OVER)|(OVERLAPS)|(PAD)|(PARTIAL)|(PASCAL)|(PERCENT)|(PIVOT)|(PLAN)|(POSITION)|(PRECISION)|(PREPARE)|(PRESERVE)|(PRIMARY)|(PRINT)|(PRIOR)|(PRIVILEGES)|(PROC)|(PROCEDURE)|(PUBLIC)|(RAISERROR)|(READ)|(READTEXT)|(REAL)|(RECONFIGURE)|(REFERENCES)|(RELATIVE)|(REPLICATION)|(RESTORE)|(RESTRICT)|(RETURN)|(REVERT)|(REVOKE)|(RIGHT)|(ROLLBACK)|(ROWCOUNT)|(ROWGUIDCOL)|(ROWS)|(RULE)|(SAVE)|(SCHEMA)|(SCROLL)|(SECOND)|(SECTION)|(SECURITYAUDIT)|(SELECT)|(SEMANTICKEYPHRASETABLE)|(SEMANTICSIMILARITYDETAILSTABLE)|(SEMANTICSIMILARITYTABLE)|(SESSION)|(SESSION_USER)|(SET)|(SETUSER)|(SHUTDOWN)|(SIZE)|(SMALLINT)|(SOME)|(SPACE)|(SQL)|(SQLCA)|(SQLCODE)|(SQLERROR)|(SQLSTATE)|(SQLWARNING)|(STATISTICS)|(SUBSTRING)|(SUM)|(SYSTEM_USER)|(TABLE)|(TABLESAMPLE)|(TEMPORARY)|(TEXTSIZE)|(THEN)|(TIME)|(TIMESTAMP)|(TIMEZONE_HOUR)|(TIMEZONE_MINUTE)|(TO)|(TOP)|(TRAILING)|(TRAN)|(TRANSACTION)|(TRANSLATE)|(TRANSLATION)|(TRIGGER)|(TRIM)|(TRUE)|(TRUNCATE)|(TRY_CONVERT)|(TSEQUAL)|(UNION)|(UNIQUE)|(UNKNOWN)|(UNPIVOT)|(UPDATE)|(UPDATETEXT)|(UPPER)|(USAGE)|(USE)|(USER)|(USING)|(VALUE)|(VALUES)|(VARCHAR)|(VARYING)|(VIEW)|(WAITFOR)|(WHEN)|(WHENEVER)|(WHERE)|(WHILE)|(WITH)|(WITHIN GROUP)|(WORK)|(WRITE)|(WRITETEXT)|(YEAR)|(ZONE)) {line=yyline; column=yycolumn; lexeme=yytext(); return Palabra_Reservada;}
//(({L})({l}|{D})*) {line=yyline; column=yycolumn; lexeme=yytext(); return Identificador;}
//(0|1|NULL) {line=yyline; column=yycolumn; lexeme=yytext(); return Bit;}
//({D})+ {line=yyline; column=yycolumn; lexeme=yytext(); return Int;}
//({D})+(".")({D})* {line=yyline; column=yycolumn; lexeme=yytext(); return Float;}
//({D})+(".")({D})*("E"|"e")["+"]?({D})+ {line=yyline; column=yycolumn; lexeme=yytext(); return FloatExponencial;}
//({O}) {line=yyline; column=yycolumn; lexeme=yytext(); return Operador;}
//. {line=yyline; column=yycolumn; lexeme=yytext(); return ERROR;} 
    
    public static void prueba(){

    }
}