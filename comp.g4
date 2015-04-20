grammar Comp;

INT  : ('0'..'9')+ ;
DEC : ('0'..'9')+ ('.' ('0'..'9')+)?;
STRING : ('a'..'z'|'A'..'Z')+ ;
METER : ('0'..'9')+ ('.' ('0'..'9')+)? 'M';
DATE : INT FSLASH INT FSLASH INT ;
SYMBOL : (EQUAL | QUOTE | QUEST | EXC | COLON | SCOLON | HYPHEN | UNDERS
    | FSLASH | ORBRACKET | CRBRACKET | OSBRACKET | CSBRACKET)+;
WEBADDRESS : ('http'('s')?'://')?((STRING|INT)+.)+STRING;

ENDL : ('\r')?'\n';
WS: (' ' | '\t' | '\n' | '\r')+ {skip();} ;



OPENA : '<' ;
CLOSEA : '>' ;
OPENBARA : '</' ;
CLOSEBARA : '/>' ;
OPENQUEST : '<?' ;
ClOSEQUEST : '?>' ;
EQUAL : '=' ;
QUOTE : '"' ;
DOT : '.' ;
QUEST : '?' ;
EXC : '!';
COLON : ':';
SCOLON : ';';
HYPHEN : '-' ;
UNDERS : '_';
FSLASH : '/';
ORBRACKET:'(';
CRBRACKET:')';
OSBRACKET:'[';
CSBRACKET:']';
XML : 'xml' ;
XMLNS : 'xmlns ';
XSI : 'xsi' ;
VERSION : 'version' ;
ENCODING : 'encoding' ;
INITCOMMENT : '<!--';
ENDCOMMENT : '-->';
FSD : 'FSData' ;
AIRPORT : 'airport' ;
REGION : 'region' ;
COUNTRY : 'country' ;
STATE : 'state' ;
CITY : 'city' ;
NAME : 'name' ;
LATITUDE : 'lat' ;
LONGITUDE : 'lon' ;
ALTITUDE : 'alt' ;
MAGVAR : 'magvar' ;
IDENT : 'ident' ;
TAXIWAYPOINT : 'taxiwaypoint' ;
TAXIWAYPARKING : 'taxiwayparking' ;
TAXINAME : 'taxiname' ;
TAXIWAYPATH : 'taxiwaypath' ;
TOWER : 'tower' ;
SERVICES : 'services' ;
COM : 'com' ;
RUNWAY : 'runway' ;
RUNWAYALIAS : 'runwayalias' ;
APRONS : 'aprons' ;
APRONEDGELIGHTS : 'apronedgelights' ;
TAXIWAYSIGN : 'taxiwaysign' ;
WAYPOINT : 'waypoint' ;
APPROACH : 'approach' ;
NDB : 'nbd' ;
HELIPAD : 'helipad' ;
START : 'start' ;
JETWAY : 'jetway' ;
BLASTFENCE : 'blastfence' ;
BOUNDARYFENCE : 'boundaryfence' ;
DELETEAIRPORT : 'deleteairport' ;


start : xml EOF;

xml :   ( comment | xmlInfo | node )+
    ;
xmlInfo :  version encoding  ENDL
    ;
version :  OPENQUEST 'xml version=' QUOTE DEC QUOTE
    ;
encoding : 'encoding=' QUOTE STRING ( HYPHEN (STRING | DEC )+ )+ '"?>'// QUOTE ClOSEQUEST
    ;
source : XMLNS COLON XSI EQUAL QUOTE WEBADDRESS QUOTE
    ;
namespace : XSI COLON STRING EQUAL QUOTE STRING (DOT STRING)* QUOTE
    ;
comment : INITCOMMENT (STRING|DEC|DATE|SYMBOL)* ENDCOMMENT ENDL
    ;
node : (fsd | airport ) ENDL
    ;
fsd : (OPENA | OPENBARA) FSD (version source namespace)?(CLOSEA|CLOSEBARA)? node*
    ;
airport : (OPENA | OPENBARA) AIRPORT (CLOSEA|CLOSEBARA)?
    ;
data : STRING EQUAL QUOTE STRING QUOTE ENDL
    ;






//PSY
airportbegin : OPENA AIRPORT charairport CLOSEA ;
airportclose : OPENBARA AIRPORT CLOSEA ;
charairport : charcountry charcity charcity charname charlat charlon charalt charmagvar charident ;
charcountry : COUNTRY EQUAL QUOTE STRING QUOTE ;
charcity : CITY EQUAL QUOTE STRING QUOTE ;
charname : NAME  EQUAL QUOTE STRING QUOTE ;
charlat : LATITUDE  EQUAL QUOTE DEC QUOTE ;
charlon : LONGITUDE  EQUAL QUOTE DEC QUOTE ;
charalt : ALTITUDE  EQUAL QUOTE METER QUOTE ;
charmagvar : MAGVAR EQUAL QUOTE INT QUOTE ;
charident : IDENT EQUAL QUOTE STRING QUOTE ;