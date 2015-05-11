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
FUEL_TYPE : '73' | '87' | '100' | '130' | '145' | 'MOGAS' | 'JET' | 'JETA' | 'JETA1' | 'JETAP' | 'JETB' | 'JET4'
            | 'JET5' | 'UNKNOWN';

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
SURFACE_TYPE : 'ASPHALT' | 'BITUMINOUS' | 'BRICK' | 'CLAY' | 'CEMENT' | 'CONCRETE' | 'CORAL' | 'DIRT' | 'GRASS'
        | 'GRAVEL' | 'ICE' | 'MACADAM' | 'OIL_TREATED' | 'PLANKS' | 'SAND' | 'SHALE' | 'SNOW' | 'STEEL_MATS'
        | 'TARMAC' | 'UNKNOWN' | 'WATER';
//DESIGNATOR_VAL : 'C'  | 'L' | 'R' | 'W' | 'WATER' | 'A' | 'B'; //TODO semantic
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
HELIPAD_TYPE : 'CIRCLE' | 'H' | 'MEDICAL' | 'SQUARE';
CLOSED : 'closed';
TRANSPARENT : 'transparent';

/****Com****/
COM_OPEN : '<Com';
FREQUENCY : 'frequency';
COM_TYPE : 'APPROACH' | 'ASOS' | 'ATIS' | 'AWOS' | 'CENTER' | 'CLEARANCE' | 'CLEARANCE_PRE_TAXI' | 'CTAF' | 'DEPARTURE'
         | 'FSS' | 'GROUND' | 'MULTICOM' | 'REMOTE_CLEARANCE_DELIVERY' | 'TOWER' | 'UNICOM';

/****TaxywayPoint****/
TAXIWAY_POINT_OPEN : '<TaxiwayPoint';
TAXYWAY_POINTER_TYPE : 'NORMAL' | 'HOLD_SHORT' | 'ILS_HOLD_SHORT' | 'HOLD_SHORT_NO_DRAW' | 'ILS_HOLD_SHORT_NO_DRAW';

/****TaxywayParking****/
TAXIWAY_PARKING_OPEN : '<TaxiwayParking';
TAXYWAY_PARKING_TYPE : 'DOCK_GA' | 'FUEL' | 'GATE_HEAVY' | 'GATE_MEDIUM' | 'GATE_SMALL' | 'RAMP_CARGO' | 'RAMP_GA'
        | 'RAMP_GA_LARGE' | 'RAMP_GA_MEDIUM' | 'RAMP_GA_SMALL' | 'RAMP_MIL_CARGO' | 'RAMP_MIL_COMBAT' | 'VEHICLE';
TAXIWAY_PARKING_NAME : 'DOCK' | 'GATE' | 'GATE_'('A'..'Z') | 'N_PARKING' | 'NE_PARKING' | 'NW_PARKING'
        | 'SE_PARKING' | 'S_PARKING' | 'SW_PARKING' | 'W_PARKING' | 'E_PARKING';
PUSHBACK : 'pushBack';
PARKING : 'PARKING';
/****TaxiName****/
TAXI_NAME_OPEN : '<TaxiName' ;

/****TaxiwayPath****/
TAXI_PATH_OPEN : '<TaxiwayPath' ;
TAXI_PATH_TYPE :  'RUNWAY' | 'TAXI' | 'PATH' | 'CLOSED' | 'VEHICLE' ; //TODO implementar especificidade do numero se RUNWAY
TAXI_PATH_START : 'start' ;
TAXI_PATH_END : 'end' ;
TAXI_PATH_WEIGHT_LIMIT : 'weightLimit' ;
TAXI_PATH_SURFACE : 'surface' ;
TAXI_PATH_SURFACE_TYPE : 'ASPHALT' | 'BITUMINOUS' | 'BRICK' | 'CLAY' | 'CEMENT' | 'CONCRETE'
						| 'CORAL' | 'DIRT' | 'GRASS' | 'GRAVEL' | 'ICE' | 'MACADAM' | 'OIL_TREATED'
						| 'PLANKS' | 'SAND' | 'SHALE' | 'SNOW' | 'STEEL_MATS' | 'TARMAC' | 'UNKNOWN'
						| 'WATER' ;
TAXI_PATH_DRAW_SURFACE : 'drawSurface' ;
TAXI_PATH_DRAW_DETAIL : 'drawDetail' ;
TAXI_PATH_CENTER_LINE : 'centerLine' ;
TAXI_PATH_CENTER_LINE_LIGHTED : 'centerLineLighted' ;
TAXI_PATH_EDGE_TYPE : 'SOLID' | 'DASHED' | 'SOLID_DASHED' ;
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
MINUS : '-';
DOT : '.' ;
BOOLEAN1 : 'TRUE' | 'FALSE';
BOOLEAN2 : 'YES' | 'NO';
UNKNOWN : 'UNKNOWN';
PRIOR_REQUEST : 'PRIOR_REQUEST';
LATITUDE : 'lat';
LONGITUDE : 'lon';
ALTITUDE : 'alt';
TYPE : 'type';
AVAILABILITY : 'availability';
INDEX : 'index';
ORIENTATION : 'orientation';
GEO_ORIENTATION:'NORTH' | 'NORTHEAST' | 'NORTHWEST' | 'SOUTH' | 'SOUTHEAST' | 'SOUTHWEST' | 'EAST' | 'WEST';
LEFT : 'LEFT';
RIGHT : 'RIGHT';
CENTER : 'CENTER'|'center';
FORWARD : 'FORWARD';
REVERSE : 'REVERSE';
NONE : 'NONE';
BOTH : 'BOTH';
HIGH : 'HIGH';
MEDIUM : 'MEDIUM';
LOW : 'LOW';
RADIUS : 'radius';
BIASX : 'biasX';
BIASZ : 'biasZ';

INT  : ('0'..'9')+ ;
SCALAR : '1.0' | '0.0'('1'..'9')|'0.'('1'..'9')('0'..'9')?;
ANGLE : '-'? ('3'('0'..'5')|('1'..'2')('0'..'9')|('1'..'9'))?('0'..'9')('.'('0'..'9')+)?;
TIME : '-'?('1'('0'..'7')|('1'..'9'))?('0'..'9')'-'('0'..'5')?('0'..'9')'-'('0'..'5')?('0'..'9')'.'('0'..'9')+;
FLOAT : '-'? ('0'..'9')+ '.' ('0'..'9')+;
DIST : (INT | FLOAT) ('M'|'F')?;
STRING : ('a'..'z'|'A'..'Z'|'0'..'9')(('a'..'z'|'A'..'Z'|'0'..'9'|' '|'_')*('a'..'z'|'A'
..'Z'|'0'..'9'))? ;


/**********************************************
*********************parser********************
**********************************************/

start
    : airport* EOF
    ;

/****Generic****/
latitude
    : LATITUDE  EQUAL QUOTE (ANGLE | TIME) QUOTE
    ;
longitude
    : LONGITUDE  EQUAL QUOTE (ANGLE | TIME) QUOTE
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
    : BIASX EQUAL QUOTE FLOAT QUOTE
    ;
biasZ
    : BIASZ EQUAL QUOTE FLOAT QUOTE
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
    : MAGVAR EQUAL QUOTE ANGLE QUOTE
    ;
airportTrafficScalar
    : TRAFFICSCALAR EQUAL QUOTE SCALAR QUOTE
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
    : TYPE EQUAL QUOTE FUEL_TYPE QUOTE
    ;
fuelAvailability
    : AVAILABILITY EQUAL QUOTE ( BOOLEAN2 | UNKNOWN | PRIOR_REQUEST ) QUOTE
    ;

/****Runway****/
runway
    : runwayBegin runwayChildren runwayEnd
    ;
runwayBegin
    : RUNWAY_OPEN latitude longitude altitude surface heading length width number designator patternAlt
      primaryTakeoff primaryLanding primaryPattern secondaryTakeoff secondaryLanding secondaryPattern CLOSEA
    ;
runwayChildren
    : markings lights
    ;
runwayEnd
    : RUNWAY_CLOSE
    ;
surface
    : SURFACE EQUAL QUOTE SURFACE_TYPE QUOTE
    ;
heading
    : HEADING EQUAL QUOTE ( ANGLE | INT ) QUOTE
    ;
number
    : NUMBER EQUAL QUOTE ( INT | GEO_ORIENTATION ) QUOTE
    ;
designator
    : DESIGNATOR EQUAL QUOTE ( /*DESIGNATOR_VAL*/ STRING | LEFT | RIGHT | CENTER | NONE ) QUOTE
    ;
patternAlt
    : PATTERN_ALT EQUAL QUOTE DIST QUOTE
    ;
primaryTakeoff
    : PRIMARY_TAKEOFF EQUAL QUOTE ( BOOLEAN1 | BOOLEAN2 ) QUOTE
    ;
primaryLanding
    : PRIMARY_LANDING EQUAL QUOTE ( BOOLEAN1 | BOOLEAN2 ) QUOTE
    ;
primaryPattern
    : PRIMARY_PATTERN EQUAL QUOTE ( LEFT | RIGHT ) QUOTE
    ;
secondaryTakeoff
    : SECONDARY_TAKEOFF EQUAL QUOTE ( BOOLEAN1 | BOOLEAN2 ) QUOTE
    ;
secondaryLanding
    : SECONDARY_LANDING EQUAL QUOTE ( BOOLEAN1 | BOOLEAN2 ) QUOTE
    ;
secondaryPattern
    : SECONDARY_PATTERN EQUAL QUOTE ( LEFT | RIGHT ) QUOTE
    ;
markings
    : MARKINGS_OPEN alternateThreshold alternateTouchdown alternateFixedDistance alternatePrecision
      leadingZeroIdent noThresholdEndArrows edges threshold fixedDistance touchdown dashes ident precision edgePavement
      singleEnd primaryClosed secondaryClosed primaryStol secondaryStol CLOSEBARA
    ;
alternateThreshold
    : ALTERNATE_THRESHOLD EQUAL QUOTE BOOLEAN1 QUOTE
    ;

alternateTouchdown
    : ALTERNATE_TOUCHDOWN EQUAL QUOTE BOOLEAN1 QUOTE
    ;

alternateFixedDistance
    : ALTERNATE_FIXED_DISTANCE EQUAL QUOTE BOOLEAN1 QUOTE
    ;

alternatePrecision
    : ALTERNATE_PRECISION EQUAL QUOTE BOOLEAN1 QUOTE
    ;

leadingZeroIdent
    : LEADING_ZEROIDENT EQUAL QUOTE BOOLEAN1 QUOTE
    ;

noThresholdEndArrows
    : NO_THRESHOLD_END_ARROWS EQUAL QUOTE BOOLEAN1 QUOTE
    ;

edges
    : EDGES EQUAL QUOTE BOOLEAN1 QUOTE
    ;

threshold
    : THRESHOLD EQUAL QUOTE BOOLEAN1 QUOTE
    ;

fixedDistance
    : FIXED_DISTANCE EQUAL QUOTE BOOLEAN1 QUOTE
    ;

touchdown
    : TOUCHDOWN EQUAL QUOTE BOOLEAN1 QUOTE
    ;

dashes
    : DASHES EQUAL QUOTE BOOLEAN1 QUOTE
    ;

ident
    : IDENT EQUAL QUOTE BOOLEAN1 QUOTE
    ;

precision
    : PRECISION EQUAL QUOTE BOOLEAN1 QUOTE
    ;

edgePavement
    : EDGE_PAVEMENT EQUAL QUOTE BOOLEAN1 QUOTE
    ;

singleEnd
    : SINGLE_END EQUAL QUOTE BOOLEAN1 QUOTE
    ;

primaryClosed
    : PRIMARY_CLOSED EQUAL QUOTE BOOLEAN1 QUOTE
    ;

secondaryClosed
    : SECONDARY_CLOSED EQUAL QUOTE BOOLEAN1 QUOTE
    ;

primaryStol
    : PRIMARY_STOL EQUAL QUOTE BOOLEAN1 QUOTE
    ;

secondaryStol
    : SECONDARY_STOL EQUAL QUOTE BOOLEAN1 QUOTE
    ;

lights
    : LIGHTS_OPEN  lightsCenter lightsEdge lightsRed CLOSEBARA
    ;

lightsCenter
    : CENTER EQUAL QUOTE ( NONE | HIGH | MEDIUM | LOW ) QUOTE
    ;

lightsEdge
    : EDGE EQUAL QUOTE ( NONE | HIGH | MEDIUM | LOW ) QUOTE
    ;
 lightsRed
    : CENTER_RED EQUAL QUOTE BOOLEAN1 QUOTE
    ;

/****helipad****/
helipad
    : HELIPAD_OPEN latitude longitude altitude surface heading length width helipadType closed? transparent? CLOSEBARA
    ;
helipadType
    : TYPE EQUAL QUOTE HELIPAD_TYPE QUOTE
    ;
closed
    : CLOSED EQUAL QUOTE BOOLEAN1 QUOTE
    ;
transparent
    : TRANSPARENT EQUAL QUOTE BOOLEAN1 QUOTE
    ;

/****com****/
com
    : COM_OPEN comFrequency comType comName CLOSEBARA
    ;
comFrequency
    : FREQUENCY EQUAL QUOTE ANGLE QUOTE //TODO check this (angle)
    ;
comType
    : TYPE EQUAL QUOTE COM_TYPE QUOTE
    ;
comName
    : NAME  EQUAL QUOTE STRING QUOTE
    ;

/****taxywayPoint****/
taxiwayPoint
    : TAXIWAY_POINT_OPEN index taxiwayPointerType orientation ( latitude | biasX ) ( longitude | biasZ ) CLOSEBARA
    ;
taxiwayPointerType
    : TYPE EQUAL QUOTE TAXYWAY_POINTER_TYPE QUOTE
    ;
orientation
    : ORIENTATION EQUAL QUOTE ( FORWARD | REVERSE ) QUOTE
    ;

/****taxiwayParking****/
taxiwayParking
    :TAXIWAY_PARKING_OPEN index ( latitude | biasX ) ( longitude | biasZ ) heading radius taxiwayParkingType name
    number pushBack CLOSEBARA
    ;
radius
    : RADIUS EQUAL QUOTE DIST QUOTE
    ;
taxiwayParkingType
    : TYPE EQUAL QUOTE ( TAXYWAY_PARKING_TYPE | NONE ) QUOTE
    ;
name
    : NAME EQUAL QUOTE ( TAXIWAY_PARKING_NAME | PARKING | NONE ) QUOTE
    ;
pushBack
    : PUSHBACK EQUAL QUOTE ( NONE | BOTH | LEFT | RIGHT ) QUOTE
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
	:  TYPE EQUAL QUOTE ( TAXI_PATH_TYPE | PARKING ) QUOTE
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
	: TAXI_PATH_DRAW_SURFACE EQUAL QUOTE BOOLEAN1 QUOTE
	;
taxiPathDrawDetail
	: TAXI_PATH_DRAW_DETAIL EQUAL QUOTE BOOLEAN1 QUOTE
	;
taxiPathCenterLine
	: TAXI_PATH_CENTER_LINE EQUAL QUOTE BOOLEAN1 QUOTE
	;
taxiPathCenterLineLighted
	: TAXI_PATH_CENTER_LINE_LIGHTED EQUAL QUOTE BOOLEAN1 QUOTE
	;
taxiPathLeftEdge
	: TAXI_PATH_LEFT_EDGE EQUAL QUOTE ( TAXI_PATH_EDGE_TYPE | NONE ) QUOTE
	;
taxiPathLeftEdgeLigthed
	: TAXI_PATH_LEFT_EDGE_LIGHTED EQUAL QUOTE BOOLEAN1 QUOTE
	;
taxiPathRightEdge
	: TAXI_PATH_RIGHT_EDGE EQUAL QUOTE ( TAXI_PATH_EDGE_TYPE | NONE ) QUOTE
	;
taxiPathRightEdgeLighted
	: TAXI_PATH_RIGHT_EDGE_LIGHTED EQUAL QUOTE BOOLEAN1 QUOTE
	;
taxiPathNumber
	: NUMBER EQUAL QUOTE ( INT | GEO_ORIENTATION ) QUOTE
	;
taxiPathName
    : NAME EQUAL QUOTE INT QUOTE
    ;