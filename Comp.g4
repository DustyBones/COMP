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
TRAFFICSCALAR : 'trafficScalar';
AIRPORTTESTRADIUS : 'airportTestRadius';
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
CLOSEA : '>' {ignoreWord=true;} ;
QUOTE : '"' ;
EQUAL : '=' ;
PLUS : '+';
MINUS : '-';
DOT : '.' ;
LATITUDE : 'lat';
LONGITUDE : 'lon';
ALTITUDE : 'alt';
STRING : ('a'..'z'|'A'..'Z')(('a'..'z'|'A'..'Z'|' ')*('a'..'z'|'A'..'Z'))? ;

INT  : ('0'..'9')+ ;
FLOAT : ('+'|'-')? ('0'..'9')+ '.' ('0'..'9')+;
DIST : (INT | FLOAT) ('M'|'F')?;
LAT_VAL : FLOAT;
LON_VAL : FLOAT;
MAG_VAL : FLOAT;
/*LAT_VAL : (SIGNED FLOAT_RANGE_90)| (FLOAT_RANGE_90)
        ;
LON_VAL : (SIGNED FLOAT_RANGE_180)| (FLOAT_RANGE_180)
        ;
MAG_VAL : ('+'|'-')? ( '360'
                     | ('3'('0'..'5')('0'..'9'))
                     | (('1'..'2')?('0'..'9')('0'..'9'))
                     | (('1'..'9')?('0'..'9')))
        ;

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
    : (taxywayPoint
    | taxywayParking
    | taxiName
    | taxiPath
    | tower
    | services
    | com
    | runaway
    | waypoint
    | approach
    | helipad)*
    ;
airportEnd
    : AIRPORT_CLOSE
    ;
airportDetails
    : airportRegion? airportCountry? airportState? airportCity? airportName? airportLat airportLong airportAlt
    airportMagvar? airportTrafficScalar? airportTestRadius? airportIdent
    ;
airportRegion
    : REGION EQUAL QUOTE STRING QUOTE
    ;
airportCountry
    : COUNTRY EQUAL QUOTE STRING QUOTE
    ;
airportState
    : STATE EQUAL QUOTE STRING QUOTE
    ;
airportCity
    : CITY EQUAL QUOTE STRING QUOTE
    ;
airportName
    : NAME  EQUAL QUOTE STRING QUOTE
    ;
airportLat
    : LATITUDE  EQUAL QUOTE FLOAT QUOTE
    ;
airportLong
    : LONGITUDE  EQUAL QUOTE LON_VAL QUOTE
    ;
airportAlt
    : ALTITUDE  EQUAL QUOTE DIST QUOTE
    ;
airportMagvar
    : MAGVAR EQUAL QUOTE MAG_VAL QUOTE
    ;
airportTrafficScalar
    : TRAFFICSCALAR EQUAL QUOTE FLOAT QUOTE
    ;
airportTestRadius
    : AIRPORTTESTRADIUS EQUAL QUOTE DIST QUOTE
    ;
airportIdent
    : IDENT EQUAL QUOTE STRING QUOTE
    ;

taxywayPoint
    :
    ;

taxywayParking
    :
    ;

taxiName
    :
    ;

taxiPath
    :
    ;

tower
    :
    ;

services
    :
    ;

com
    :
    ;

runaway
    :
    ;

waypoint
    :
    ;

approach
    :
    ;

helipad
    :
    ;



//TODO lattitude/longitude/magvar