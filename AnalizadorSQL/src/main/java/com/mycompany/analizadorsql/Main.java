/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorsql;

/**
 *
 * @author Noe Gomez
 * 
 */

import java.util.*;


/*Clase donde se introducen las palabras reservadas, los simbolos en SQL guardandolo en arrays funcionando como matrices, 
    ya que posteriormente se procederán a llamar en las clases segun la necesidad*/
public class Main {
    public static List<String> lineas_riel = new ArrayList<>();
    public static String[] arraydePalabrasReservadas = {"ACCESS","ACCOUNT","ACTIVATE",
            "ADD","ADMIN","ADVISE","AFTER","ALL","ALLOCATE","ALTER","ANALYZE","AND",
            "ANY","ARCHIVE","ARCHIVELOG","ARRAY","AS","ASC","AT","AUDIT","AUTHENTICATED",
            "AUTHORIZATION","AUTOEXTEND","AUTOMATIC","BACKUP","BECOME","BEFORE","BEGIN",
            "BETWEEN","BFILE","BITMAP","BLOB","BLOCK","BODY","BY","CACHE","CANCEL","CASCADE",
            "CAST","CFILE","CHAINED","CHANGE","CHAR","CHAR_CS","CHARACTER","CHECK","CHECKPOINT",
            "CHOOSE","CHUNK","CLEAR","CLOB","CLONE","CLOSE","CLOSE_CACHED_OPEN_CURSORS","CLUSTER",
            "COALESCE","COLUMN","COLUMNS","COMMENT","COMMIT","COMMITTED","COMPATIBILITY","COMPILE",
            "COMPLETE","COMPOSITE_LIMIT","COMPRESS","COMPUTE","CONNECT","CONNECT_TIME","CONSTRAINT",
            "CONSTRAINTS","CONTENTS","CONTINUE","CONTROLFILE","CONVERT","COST","CPU_PER_CALL","CPU_PER_SESSION",
            "CREATE","CURRENT","CURRENT_SCHEMA","CURSOR","CYCLE","DANGLING","DATABASE","DATAFILE","DATAFILES",
            "DATAOBJNO","DATE","DEALLOCATE","DEBUG","DEC","DECIMAL","DECLARE","DEFAULT","DEFERRABLE",
            "DEFERRED","DEGREE","DELETE","DEREF","DESC","DIRECTORY","DISABLE","DISCONNECT","DISMOUNT",
            "DISTINCT","DISTRIBUTED","DML","DOUBLE","DROP","DUMP","EACH","ELSE","ENABLE","END","ENFORCE",
            "ENTRY","ESCAPE","EXCEPT","EXCEPTIONS","EXCHANGE","EXCLUDING","EXCLUSIVE","EXECUTE","EXISTING",
            "EXISTS","EXPIRE","EXPLAIN","EXTEND","EXTENT","EXTENTS","EXTERNALLY","FAILED_LOGIN_ATTEMPTS",
            "FALSE","FAST","FILE","FIRST_ROWS","FLAGGER","FLOAT","FLOB","FLUSH","FOR","FORCE","FOREIGN",
            "FREELIST","FREELISTS","FROM","FULL","FUNCTION","GLOBAL","GLOBALLY","GLOBAL_NAME","GRANT",
            "GROUP","GROUPS","HASH","HASHKEYS","HAVING","HEADER","HEAP","IDENTIFIED","IDLE_TIME","IF",
            "IMMEDIATE","IN","INCLUDING","INCREMENT","INDEX","INDEXED","INDEXES","INDICATOR","INNER",
            "INITIAL","INITIALLY","INITRANS","INSERT","INSTANCE","INSTANCES","INSTEAD","INT","INTEGER",
            "INTERMEDIATE","INTERSECT","INTO","IS","ISOLATION","ITERATE","JOB","JOIN","KEY","LANGUAGE",
            "LARGE","LAST","LEADING","LENGTH","LESS","LEVEL","LIBRARY","LIKE","LIMITED","LINK",
            "LIST","LOB","LOCAL","LOCK","LOCKED","LOG","LOGFILE","LOGGING","LOGICAL","LOGICAL_READS_PER_CALL",
            "LOGICAL_READS_PER_SESSION","LONG","MANAGE","MASTER","MAX","MAXARCHLOGS","MAXDATAFILES","MAXEXTENTS",
            "MAXINSTANCES","MAXLOGFILES","MAXLOGHISTORY","MAXLOGMEMBERS","MAXSIZE","MAXTRANS","MAXVALUE","MIN","MEMBER",
            "MINIMUM","MINEXTENTS","MINUS","MINVALUE","MLSLABEL","MODE","MODIFY","MOUNT","MOVE","MULTISET",
            "NATIONAL","NCHAR","NCHAR_CS","NCLOB","NEEDED","NESTED","NETWORK","NEW","NEXT","NOARCHIVELOG","NOAUDIT","NOCACHE","NOCOMPRESS",
            "NOCYCLE","NOFORCE","NOLOGGING","NOMAXVALUE","NOMINVALUE","NONE","NOORDER","NOOVERRIDE","NOPARALLEL","NOPARALLEL",
            "NOREVERSE","NORMAL","NOSORT","NOT","NOTHING","NOWAIT","NULL","NUMBER","NUMERIC","NVARCHAR2","OBJECT","OBJNO","OF",
            "OFF","OFFLINE","OID","OIDINDEX","OLD","ON","ONLINE","ONLY","OPCODE","OPEN","OPTIMAL","OPTIMIZER_GOAL","OPTION",
            "OR","ORDER","ORGANIZATION","OVERFLOW","PACKAGE","PARALLEL","PARTITION","PASSWORD","PASSWORD_GRACE_TIME",
            "PASSWORD_LIFE_TIME","PASSWORD_LOCK_TIME","PASSWORD_REUSE_MAX","PASSWORD_REUSE_TIME","PASSWORD_VERIFY_FUNCTION",
            "PCTFREE","PCTINCREASE","PCTTHRESHOLD","PCTUSED","PCTVERSION","PERCENT","PERMANENT","PLAN","PLSQL_DEBUG",
            "POST_TRANSACTION","PRECISION","PRESERVE","PRIMARY","PRIOR","PRIVATE","PRIVATE_SGA","PRIVILEGE","PRIVILEGES",
            "PROCEDURE","PROFILE","PUBLIC","PURGE","QUEUE","QUOTA","RANGE","RAW","RBA","READ","READS","REAL","REBUILD",
            "RECOVER","RECOVERABLE","RECOVERY","REF","REFERENCES","REFERENCING","REFRESH","RENAME","REPLACE","RESET",
            "RESETLOGS","RESIZE","RESOURCE","RESTRICTED","RETURN","RETURNING","REUSE","REVERSE","REVOKE","ROLE","ROLES",
            "ROLLBACK","ROW","ROWID","ROWNUM","ROWS","RULE","SAMPLE","SAVEPOINT","SB4","SCAN_INSTANCES","SCHEMA",
            "SCN","SCOPE","SECOND","SEGMENT","SEG_FILE","SELECT","SEQUENCE","SERIALIZABLE","SESSION","SESSION_CACHED_CURSORS",
            "SESSIONS_PER_USER","SET","SHARE","SHARED","SHARED_POOL","SHRINK","SIZE","SKIP","SKIP_UNUSABLE_INDEXES",
            "SMALLINT","SNAPSHOT","SOME","SORT","SPECIFICATION","SPLIT","SQL_TRACE","STANDBY","START","STATEMENT_ID",
            "STATISTICS","STOP","STORAGE","STORE","STRUCTURE","SUCCESSFUL","SWITCH","SYS_OP_ENFORCE_NOT_NULL$",
            "SYS_OP_NTCIMG$","SYNONYM","SYSDATE","SYSDBA","SYSOPER","SYSTEM","TABLE","TABLES","TABLESPACE","TEMPORARY",
            "THAN","THE","THEN","THREAD","TIMESTAMP","TIME","TO","TOPLEVEL","TRACE","TRACING","TRAILING","TRANSACTION",
            "TRIGGER","TRUE","TRUNCATE","TX","TYPE","UB2","UBA","UID","UNARCHIVED","UNDO","UNION","UNIQUE","UNLIMITED",
            "UNLOCK","UNRECOVERABLE","UNTIL","UNUSABLE","UNUSED","UPDATABLE","UPDATE","USAGE","USE","USER","USING","VALIDATE",
            "VALIDATION","VALUE","VARCHAR","VARCHAR2","VARYING","VIEW","WHEN","WHENEVER","WHERE","WITH","WITHOUT","WORK",
            "WRITE","XID","YEAR","ZONE"};

    public static String[] arraydeSimbolos = {"(", ")", "*", "+", ",", "-", ".", 
                            "/", ":", ";", "<", "=", ">", "?", "@", "[", "]",
                            "^", "{", "}", "|", "~", "!", "$", "%", "&", "'", "\"", "\\"};
    
    public static List<PalabraRes> pReservadas = new ArrayList<>();
    public static List<Simbolo> simbolos = new ArrayList<>();
    
    public static void main(String[] args) {
        int idReservadasCont = 100;
        int idSimbolosCont = 1;
        int x;

        for(x = 0; x < arraydePalabrasReservadas.length; x++){
            pReservadas.add(new PalabraRes(idReservadasCont, arraydePalabrasReservadas[x]));
            idReservadasCont++;
        }
        for(x = 0; x < arraydeSimbolos.length; x++){
            simbolos.add(new Simbolo(idSimbolosCont, arraydeSimbolos[x]));
            idSimbolosCont++;
        }

        AllFuntions funciones = new AllFuntions();
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese la direccion fisica del archivo que desea leer, Por Ejemplo. C:\\usuario\\scripSQL.txt: \n");
        System.out.println("*******************IMPORTANTE COLOQUE EL NOMBRE CORRECTO DE SU ARCHIVO**************************\n");
        String direccionArchivo = in.nextLine();

        funciones.leerArchivo(direccionArchivo);

        for(x = 0; x < lineas_riel.size(); x++){
            funciones.separacion_Lexemas(lineas_riel.get(x));

        }

        funciones.TokensIdentificar();

        for (x = 0; x < funciones.tokens.size(); x++){
            if(funciones.tokens.get(x).getId_token() != 0){
                System.out.println(funciones.tokens.get(x).getLexema() + "\t\t\t\t\t" + funciones.tokens.get(x).getTipoToken()
                        + "\t\t\t\t\tcodigo="+ funciones.tokens.get(x).getId_token());
            }else{
                System.out.println(funciones.tokens.get(x).getLexema() + "\t\t\t\t\t" + funciones.tokens.get(x).getTipoToken());
            }
        }

        System.out.println("                                             ---------------------------------                                               ");
        System.out.println("                                                     ----------------                                                        ");
        System.out.println("===============*************** R E S U M E N   D E  C A R A C T E R E S  R E C O N O C I D O S ===============***************");
        System.out.println("                                             ---------------------------------                                               ");
        System.out.println("                                                          -***-                                                            \n");

        funciones.resumenReconocido();

        for (x = 0; x < funciones.resumen.size(); x++){
            System.out.println(funciones.resumen.get(x).getLexemaToken() + "\t\t\t\t\t\tCANTIDAD=" + funciones.resumen.get(x).getCantidad());
        }
    }
        
}
