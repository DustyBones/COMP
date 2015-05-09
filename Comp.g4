//define grammar
grammar Comp;

//lexer
/****Airport****/
AIRPORT_OPEN :  '<Airport' {ignoreWord=false;} ;
AIRPORT_CLOSE : '</Airport>' {ignoreWord=true;} ;
REGION : 'region';
COUNTRY : 'country';
STATE : 'state';
CITY : 'city';
NAME : 'name';
MAGVAR : 'magvar';
IDENT : 'ident';
/***Taxi***/
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

/****Generic****/
OPENA : '<';
CLOSEA : '>' ;
QUOTE : '"' ;
EQUAL : '=' ;
PLUS : '+';
MINUS : '-';
DOT : '.' ;
LATITUDE : 'lat';
LONGITUDE : 'lon';
ALTITUDE : 'alt';
LAT_VAL : ('+'|'-')? (('1'..'8')?('0'..'9')('.' ('0'..'9')+)?
                      | ('1'..'8')?('0'..'9')'-'('1'..'5')?('0'..'9')'-'('1'..'5')?('0'..'9')('.' ('0'..'9')+)?
                      | '90'('-0-0')?)
        ;
LON_VAL : ('+'|'-')? ((('1' ('0'..'7'))|('1'..'9'))?('0'..'9')('.' ('0'..'9')+)?
                     | ('1' ('0'..'7')|('1'..'9'))?('0'..'9')'-'('1'..'5')?('0'..'9')'-'('1'..'5')?('0'..'9')('.'
                     ('0'..'9')+)?
                     | '180'('-0-0')?)
        ;
INT  : ('0'..'9')+ ;
DEC : ('0'..'9')+ '.' ('0'..'9')+;
DIST : ('0'..'9')+ ('.' ('0'..'9')+)? ('M'|'F')?;
STRING : ('a'..'z'|'A'..'Z')(('a'..'z'|'A'..'Z'|' ')*('a'..'z'|'A'..'Z'))? ;

/****skip****/
STUFF : (('<?'|'<!--'|'<FSD') .*? ('?>'|'-->'|'>')) -> skip ;
WS: (' ' | '\t' | '\n' | '\r') -> skip ;
//parser
start
    : airport+ EOF
    ;
/******Airport******/
airport
    : airportBegin airportStructures airportEnd
    ;
airportBegin
    : AIRPORT_OPEN airportDetails CLOSEA
    ;
airportStructures
    :
    ;
airportEnd
    : AIRPORT_CLOSE
    ;
airportDetails
    : airportRegion? airportCountry? airportState? airportCity? airportName? airportLat airportLong airportAlt
    airportMagvar? airportIdent
    ;
airportRegion
    : REGION EQUAL QUOTE STRING+ QUOTE
    ;
airportCountry
    : COUNTRY EQUAL QUOTE STRING+ QUOTE
    ;
airportState
    : STATE EQUAL QUOTE STRING+ QUOTE
    ;
airportCity
    : CITY EQUAL QUOTE STRING+ QUOTE
    ;
airportName
    : NAME  EQUAL QUOTE STRING+ QUOTE
    ;
airportLat
    : LATITUDE  EQUAL QUOTE LAT_VAL QUOTE
    ;
airportLong
    : LONGITUDE  EQUAL QUOTE LONG_VAL QUOTE
    ;
airportAlt
    : ALTITUDE  EQUAL QUOTE DIST QUOTE
    ;
airportMagvar
    : MAGVAR EQUAL QUOTE DEC QUOTE
    ;
airportIdent
    : IDENT EQUAL QUOTE STRING QUOTE
    ;