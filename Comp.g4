//define grammar
grammar Comp;

/**********************************************
**********************lexer********************
**********************************************/

/****skip****/
COMMENT : (('<?'|'<!--') .*? ('?>'|'-->')) -> skip ;
FSD_OPEN : ('<FSD' .*? '>')->skip;
FSD_CLOSE : ('</FSD' .*? '>')->skip;
SCENERY : ('<Scenery' .*? '</Scenery' .*? '>')->skip;
DELETE : ('<DeleteAirport' .*? '/>')->skip;
START : ('<Start' .*? '/>')->skip;
APRON : ('<Apron' .*? '</Apron' .*? '>')->skip;
BOUND_FENCE : ('<Bound' .*? '</Bound' .*? '>')->skip;
TAXYWAY_SIGN : ('<TaxiwaySign' .*? '/>')->skip;
MARKER : ('<Marker' .*? '/>')->skip;
WS: (' ' | '\t' | '\n' | '\r') -> skip ;

/****Airport****/
AIRPORT_OPEN :  '<Airport';
AIRPORT_CLOSE : '</Airport>';
REGION : 'region';
COUNTRY : 'country';
STATE : 'state';
CITY : 'city';
NAME : 'name';
MAGVAR : 'magvar';
TRAFFICSCALAR : 'trafficScalar';
AIRPORTTESTRADIUS : 'airportTestRadius';
IDENT : 'ident';

/****Tower****/
TOWER_OPEN : '<Tower';
TOWER_CLOSE : '</Tower>';

/****Services****/
SERVICES_OPEN : '<Services>';
SERVICES_CLOSE : '</Services>';

/****Fuel****/
FUEL_OPEN : '<Fuel';

/****Runway****/
RUNWAY_OPEN : '<Runway';
RUNWAY_CLOSE : '</Runway>';
SURFACE : 'surface';
HEADING : 'heading';
LENGTH : 'length';
WIDTH : 'width';
NUMBER : 'number';
DESIGNATOR : 'designator';
PATTERN_ALT : 'patternAltitude';
PRIMARY_TAKEOFF : 'primaryTakeoff';
PRIMARY_LANDING : 'primaryLanding';
PRIMARY_PATTERN : 'primaryPattern';
SECONDARY_TAKEOFF : 'secondaryTakeoff';
SECONDARY_LANDING : 'secondaryLanding';
SECONDARY_PATTERN : 'secondaryPattern';
MARKINGS_OPEN : '<Markings';
ALTERNATE_THRESHOLD : 'alternateThreshold';
ALTERNATE_TOUCHDOWN : 'alternateTouchdown';
ALTERNATE_FIXED_DISTANCE : 'alternateFixedDistance';
ALTERNATE_PRECISION : 'alternatePrecision';
LEADING_ZEROIDENT : 'leadingZeroIdent';
NO_THRESHOLD_END_ARROWS : 'noThresholdEndArrows';
EDGES : 'edges';
EDGE : 'edge';
THRESHOLD : 'threshold';
FIXED_DISTANCE : 'fixedDistance';
TOUCHDOWN : 'touchdown';
DASHES : 'dashes';
PRECISION : 'precision';
EDGE_PAVEMENT : 'edgePavement';
SINGLE_END : 'singleEnd';
PRIMARY_CLOSED : 'primaryClosed';
SECONDARY_CLOSED : 'secondaryClosed';
PRIMARY_STOL : 'primaryStol';
SECONDARY_STOL : 'secondaryStol';
LIGHTS_OPEN : '<Lights';
CENTER_RED : 'centerRed';

/****Helipad****/
HELIPAD_OPEN : '<Helipad';
CLOSED : 'closed';
TRANSPARENT : 'transparent';

/****Com****/
COM_OPEN : '<Com';
FREQUENCY : 'frequency';

/****TaxywayPoint****/
TAXIWAY_POINT_OPEN : '<TaxiwayPoint';

/****TaxywayParking****/
TAXIWAY_PARKING_OPEN : '<TaxiwayParking';
PUSHBACK : 'pushBack';
TAXI_NAME_OPEN : '<TaxiName' ;

/****TaxiwayPath****/
TAXI_PATH_OPEN : '<TaxiwayPath' ;
TAXI_PATH_START : 'start' ;
TAXI_PATH_END : 'end' ;
TAXI_PATH_WEIGHT_LIMIT : 'weightLimit' ;
TAXI_PATH_SURFACE : 'surface' ;
TAXI_PATH_DRAW_SURFACE : 'drawSurface' ;
TAXI_PATH_DRAW_DETAIL : 'drawDetail' ;
TAXI_PATH_CENTER_LINE : 'centerLine' ;
TAXI_PATH_CENTER_LINE_LIGHTED : 'centerLineLighted' ;
TAXI_PATH_LEFT_EDGE : 'leftEdge' ;
TAXI_PATH_LEFT_EDGE_LIGHTED : 'leftEdgeLighted' ;
TAXI_PATH_RIGHT_EDGE : 'rightEdge' ;
TAXI_PATH_RIGHT_EDGE_LIGHTED : 'rightEdgeLighted' ;

/****Generic****/
OPENA : '<';
CLOSEA : '>';
CLOSEBARA : '/>';
QUOTE : '"' ;
EQUAL : '=' ;
PLUS : '+';
//MINUS : '-';
DOT : '.' ;
BOOLEAN : 'TRUE' | 'YES' | 'FALSE' |  'NO';
LATITUDE : 'lat';
LONGITUDE : 'lon';
ALTITUDE : 'alt';
TYPE : 'type';
AVAILABILITY : 'availability';
INDEX : 'index';
ORIENTATION : 'orientation';
CENTER : 'center';
RADIUS : 'radius';
BIASX : 'biasX';
BIASZ : 'biasZ';

INT  : ('0'..'9')+ ;
FLOAT : '-'?('0'..'9')+ '.' ('0'..'9')+;
DIST : (INT | FLOAT) ('M'|'F')?;
STRING : ('a'..'z'|'A'..'Z'|'0'..'9'|'-')(('a'..'z'|'A'..'Z'|'0'..'9'|' '|'_'|'-')*('a'..'z'|'A'
..'Z'|'0'..'9'))? ;


/**********************************************
*********************parser********************
**********************************************/

start
    : airport* EOF
    ;

/****Generic****/
latitude
    : LATITUDE  EQUAL QUOTE (FLOAT | STRING) QUOTE
    ;
longitude
    : LONGITUDE  EQUAL QUOTE (FLOAT | STRING) QUOTE
    ;
altitude
    : ALTITUDE  EQUAL QUOTE DIST QUOTE
    ;
length
    : LENGTH EQUAL QUOTE DIST QUOTE
    ;
width
    : WIDTH EQUAL QUOTE DIST QUOTE
    ;
index
    : INDEX EQUAL QUOTE INT QUOTE
    ;
biasX
    : BIASX EQUAL QUOTE DIST QUOTE
    ;
biasZ
    : BIASZ EQUAL QUOTE DIST QUOTE
    ;

/******Airport******/
airport
    : airportBegin airportChildren airportEnd
    ;
airportBegin
    : AIRPORT_OPEN airportRegion? airportCountry? airportState? airportCity? airportName? latitude longitude
      altitude airportMagvar? airportTrafficScalar? airportTestRadius? airportIdent CLOSEA
    ;
airportChildren
    : tower services runway+ helipad* com* taxiwayPoint* taxiwayParking* taxiName* taxiPath*
    ;
airportEnd
    : AIRPORT_CLOSE
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
airportMagvar
    : MAGVAR EQUAL QUOTE FLOAT QUOTE
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

/****tower****/
tower
    : towerBegin towerEnd
    ;
towerBegin
    : TOWER_OPEN latitude longitude altitude CLOSEA
    ;
towerEnd
    : TOWER_CLOSE
    ;

/****Services****/
services
    : SERVICES_OPEN fuel* SERVICES_CLOSE
    ;
fuel
    : FUEL_OPEN fuelType fuelAvailability CLOSEBARA
    ;
fuelType
    : TYPE EQUAL QUOTE (INT | STRING) QUOTE
    ;
fuelAvailability
    : AVAILABILITY EQUAL QUOTE ( BOOLEAN | STRING ) QUOTE
    ;

/****Runway****/
runway
    : runwayBegin runwayChildren runwayEnd
    ;
runwayBegin
    : RUNWAY_OPEN latitude longitude altitude surface heading length width number designator patternAlt?
      primaryTakeoff? primaryLanding? primaryPattern? secondaryTakeoff? secondaryLanding? secondaryPattern? CLOSEA
    ;
runwayChildren
    : markings lights
    ;
runwayEnd
    : RUNWAY_CLOSE
    ;
surface
    : SURFACE EQUAL QUOTE STRING QUOTE
    ;
heading
    : HEADING EQUAL QUOTE (INT | FLOAT) QUOTE
    ;
number
    : NUMBER EQUAL QUOTE ( INT | STRING ) QUOTE
    ;
designator
    : DESIGNATOR EQUAL QUOTE STRING QUOTE
    ;
patternAlt
    : PATTERN_ALT EQUAL QUOTE DIST QUOTE
    ;
primaryTakeoff
    : PRIMARY_TAKEOFF EQUAL QUOTE BOOLEAN QUOTE
    ;
primaryLanding
    : PRIMARY_LANDING EQUAL QUOTE BOOLEAN QUOTE
    ;
primaryPattern
    : PRIMARY_PATTERN EQUAL QUOTE STRING QUOTE
    ;
secondaryTakeoff
    : SECONDARY_TAKEOFF EQUAL QUOTE BOOLEAN QUOTE
    ;
secondaryLanding
    : SECONDARY_LANDING EQUAL QUOTE BOOLEAN QUOTE
    ;
secondaryPattern
    : SECONDARY_PATTERN EQUAL QUOTE STRING QUOTE
    ;
markings
    : MARKINGS_OPEN alternateThreshold alternateTouchdown alternateFixedDistance alternatePrecision
      leadingZeroIdent noThresholdEndArrows edges threshold fixedDistance touchdown dashes ident precision edgePavement
      singleEnd primaryClosed secondaryClosed primaryStol secondaryStol CLOSEBARA
    ;
alternateThreshold
    : ALTERNATE_THRESHOLD EQUAL QUOTE BOOLEAN QUOTE
    ;

alternateTouchdown
    : ALTERNATE_TOUCHDOWN EQUAL QUOTE BOOLEAN QUOTE
    ;

alternateFixedDistance
    : ALTERNATE_FIXED_DISTANCE EQUAL QUOTE BOOLEAN QUOTE
    ;

alternatePrecision
    : ALTERNATE_PRECISION EQUAL QUOTE BOOLEAN QUOTE
    ;

leadingZeroIdent
    : LEADING_ZEROIDENT EQUAL QUOTE BOOLEAN QUOTE
    ;

noThresholdEndArrows
    : NO_THRESHOLD_END_ARROWS EQUAL QUOTE BOOLEAN QUOTE
    ;

edges
    : EDGES EQUAL QUOTE BOOLEAN QUOTE
    ;

threshold
    : THRESHOLD EQUAL QUOTE BOOLEAN QUOTE
    ;

fixedDistance
    : FIXED_DISTANCE EQUAL QUOTE BOOLEAN QUOTE
    ;

touchdown
    : TOUCHDOWN EQUAL QUOTE BOOLEAN QUOTE
    ;

dashes
    : DASHES EQUAL QUOTE BOOLEAN QUOTE
    ;

ident
    : IDENT EQUAL QUOTE BOOLEAN QUOTE
    ;

precision
    : PRECISION EQUAL QUOTE BOOLEAN QUOTE
    ;

edgePavement
    : EDGE_PAVEMENT EQUAL QUOTE BOOLEAN QUOTE
    ;

singleEnd
    : SINGLE_END EQUAL QUOTE BOOLEAN QUOTE
    ;

primaryClosed
    : PRIMARY_CLOSED EQUAL QUOTE BOOLEAN QUOTE
    ;

secondaryClosed
    : SECONDARY_CLOSED EQUAL QUOTE BOOLEAN QUOTE
    ;

primaryStol
    : PRIMARY_STOL EQUAL QUOTE BOOLEAN QUOTE
    ;

secondaryStol
    : SECONDARY_STOL EQUAL QUOTE BOOLEAN QUOTE
    ;

lights
    : LIGHTS_OPEN  lightsCenter lightsEdge lightsRed CLOSEBARA
    ;

lightsCenter
    : CENTER EQUAL QUOTE STRING QUOTE
    ;

lightsEdge
    : EDGE EQUAL QUOTE STRING QUOTE
    ;
 lightsRed
    : CENTER_RED EQUAL QUOTE BOOLEAN QUOTE
    ;

/****helipad****/
helipad
    : HELIPAD_OPEN latitude longitude altitude surface heading length width helipadType closed? transparent? CLOSEBARA
    ;
helipadType
    : TYPE EQUAL QUOTE STRING QUOTE
    ;
closed
    : CLOSED EQUAL QUOTE BOOLEAN QUOTE
    ;
transparent
    : TRANSPARENT EQUAL QUOTE BOOLEAN QUOTE
    ;

/****com****/
com
    : COM_OPEN comFrequency comType comName CLOSEBARA
    ;
comFrequency
    : FREQUENCY EQUAL QUOTE FLOAT QUOTE
    ;
comType
    : TYPE EQUAL QUOTE STRING QUOTE
    ;
comName
    : NAME  EQUAL QUOTE STRING QUOTE
    ;

/****taxywayPoint****/
taxiwayPoint
    : TAXIWAY_POINT_OPEN index taxiwayPointerType orientation? ( latitude longitude | biasX  biasZ ) CLOSEBARA
    ;
taxiwayPointerType
    : TYPE EQUAL QUOTE STRING QUOTE
    ;
orientation
    : ORIENTATION EQUAL QUOTE STRING QUOTE
    ;

/****taxiwayParking****/
taxiwayParking
    : TAXIWAY_PARKING_OPEN index ( latitude longitude | biasX  biasZ ) heading radius taxiwayParkingType name
    number pushBack CLOSEBARA
    ;
radius
    : RADIUS EQUAL QUOTE DIST QUOTE
    ;
taxiwayParkingType
    : TYPE EQUAL QUOTE STRING QUOTE
    ;
name
    : NAME EQUAL QUOTE STRING QUOTE
    ;
pushBack
    : PUSHBACK EQUAL QUOTE STRING QUOTE
    ;

/**********TaxiName***********/

taxiName
    : TAXI_NAME_OPEN index taxiNameName CLOSEBARA
    ;
taxiNameName
    : NAME EQUAL QUOTE ( STRING | INT )? QUOTE
    ;

/**********TaxiPath***********/

taxiPath
    : TAXI_PATH_OPEN taxiPathType taxiPathStart taxiPathEnd width taxiPathWeightLimit taxiPathDrawSurface?
      taxiPathDrawDetail? surface taxiPathName taxiPathCenterLine? taxiPathCenterLineLighted? taxiPathLeftEdge?
      taxiPathLeftEdgeLigthed? taxiPathRightEdge? taxiPathRightEdgeLighted? taxiPathNumber? designator?
      CLOSEBARA
    ;
taxiPathType
	:  TYPE EQUAL QUOTE STRING QUOTE
	;
taxiPathStart
	: TAXI_PATH_START EQUAL QUOTE INT QUOTE
	;
taxiPathEnd
	: TAXI_PATH_END EQUAL QUOTE INT QUOTE
	;
taxiPathWeightLimit
	:  TAXI_PATH_WEIGHT_LIMIT EQUAL QUOTE ( INT | FLOAT ) QUOTE
	;
taxiPathDrawSurface
	: TAXI_PATH_DRAW_SURFACE EQUAL QUOTE BOOLEAN QUOTE
	;
taxiPathDrawDetail
	: TAXI_PATH_DRAW_DETAIL EQUAL QUOTE BOOLEAN QUOTE
	;
taxiPathCenterLine
	: TAXI_PATH_CENTER_LINE EQUAL QUOTE BOOLEAN QUOTE
	;
taxiPathCenterLineLighted
	: TAXI_PATH_CENTER_LINE_LIGHTED EQUAL QUOTE BOOLEAN QUOTE
	;
taxiPathLeftEdge
	: TAXI_PATH_LEFT_EDGE EQUAL QUOTE STRING QUOTE
	;
taxiPathLeftEdgeLigthed
	: TAXI_PATH_LEFT_EDGE_LIGHTED EQUAL QUOTE BOOLEAN QUOTE
	;
taxiPathRightEdge
	: TAXI_PATH_RIGHT_EDGE EQUAL QUOTE STRING QUOTE
	;
taxiPathRightEdgeLighted
	: TAXI_PATH_RIGHT_EDGE_LIGHTED EQUAL QUOTE BOOLEAN QUOTE
	;
taxiPathNumber
	: NUMBER EQUAL QUOTE ( INT | STRING ) QUOTE
	;
taxiPathName
    : NAME EQUAL QUOTE INT QUOTE
    ;