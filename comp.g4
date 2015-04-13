grammar comp;

NUM : ('0'..'9')+ ('.' ('0'..'9')+)?;
DIGIT  : ('0'..'9')+;
STRING : ('a'..'z'|'A'..'Z')+ ;
METER : ('0'..'9')+ ('.' ('0'..'9')+)? 'M';

OPENA : '<' ;
CLOSEA : '>' ;
OPENBARA : '</' ;
CLOSEBARA : '/>' ;
EQUAL : '=' ;
QUOTE : '"' ;

WS: [ \t\n\r]+ -> skip ;


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


airportbegin : OPENA AIRPORT charairport CLOSEA ;
airportclose : OPENBARA AIRPORT CLOSEA ;

charairport : charcountry charcity charcity charname charlat charlon charalt charmagvar charident ;


charcountry : COUNTRY EQUAL QUOTE STRING QUOTE ;
charcity : CITY EQUAL QUOTE STRING QUOTE ;
charname : NAME  EQUAL QUOTE STRING QUOTE ;
charlat : LATITUDE  EQUAL QUOTE NUM QUOTE ;
charlon : LONGITUDE  EQUAL QUOTE NUM QUOTE ;
charalt : ALTITUDE  EQUAL QUOTE METER QUOTE ;
charmagvar : MAGVAR EQUAL QUOTE DIGIT QUOTE ;
charident : IDENT EQUAL QUOTE STRING QUOTE ;