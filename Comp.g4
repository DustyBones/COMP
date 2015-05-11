//define grammar
grammar Comp;

/**********************************************
**********************lexer********************
**********************************************/

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

/****Tower****/
TOWER_OPEN : '<Tower' {ignoreWord=false;} ;
TOWER_CLOSE : '</Tower>' {ignoreWord=true;} ;

/****Services****/
SERVICES_OPEN : '<Services>' {ignoreWord=false;} ;
SERVICES_CLOSE : '</Services>' {ignoreWord=true;} ;

/****Fuel****/
FUEL_OPEN : '<Fuel';
FUEL_TYPE : '73' | '87' | '100' | '130' | '145' | 'MOGAS' | 'JET' | 'JETA' | 'JETA1' | 'JETAP' | 'JETB' | 'JET4'
            | 'JET5' | 'UNKNOWN';

/****Runway****/
RUNWAY_OPEN : '<Runway' {ignoreWord=false;} ;
RUNWAY_CLOSE : '</Runway>' {ignoreWord=true;} ;
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
DESIGNATOR_VAL : 'C'  | 'L' | 'R' | 'W' | 'WATER' | 'A' | 'B';
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

/****Com****/
COM_OPEN : '<Com';
FREQUENCY : 'frequency';
COM_TYPE : 'APPROACH' | 'ASOS' | 'ATIS' | 'AWOS' | 'CENTER' | 'CLEARANCE' | 'CLEARANCE_PRE_TAXI' | 'CTAF' | 'DEPARTURE'
         | 'FSS' | 'GROUND' | 'MULTICOM' | 'REMOTE_CLEARANCE_DELIVERY' | 'TOWER' | 'UNICOM';



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
ORIENTATION:'NORTH' | 'NORTHEAST' | 'NORTHWEST' | 'SOUTH' | 'SOUTHEAST' | 'SOUTHWEST' | 'EAST' | 'WEST';
LEFT : 'LEFT';
RIGHT : 'RIGHT';
CENTER : 'CENTER'|'center';
NONE : 'NONE';
HIGH : 'HIGH';
MEDIUM : 'MEDIUM';
LOW : 'LOW';

SCALAR : '1.0' | '0.0'('1'..'9')|'0.'('1'..'9')('0'..'9')?;
ANGLE : '-'? ('3'('0'..'5')|('1'..'2')('0'..'9')|('1'..'9'))?('0'..'9')('.'('0'..'9')+)?;
TIME : '-'?('1'('0'..'7')|('1'..'9'))?('0'..'9')'-'('0'..'5')?('0'..'9')'-'('0'..'5')?('0'..'9')'.'('0'..'9')+;
INT  : '-'? ('0'..'9')+ ;
FLOAT : '-'? ('0'..'9')+ '.' ('0'..'9')+;
DIST : (INT | FLOAT) ('M'|'F')?;
STRING : ('a'..'z'|'A'..'Z'|'0'..'9')(('a'..'z'|'A'..'Z'|'0'..'9'|' ')*('a'..'z'|'A'..'Z'|'0'..'9'))? ;

/****skip****/
STUFF : (('<?'|'<!--'|'<FSD') .*? ('?>'|'-->'|'>')) -> skip ;
WS: (' ' | '\t' | '\n' | '\r') -> skip ;

/**********************************************
*********************parser********************
**********************************************/

start
    : airport+ EOF
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

/******Airport******/
airport
    : airportBegin airportChildren airportEnd
    ;
airportBegin
    : AIRPORT_OPEN airportRegion? airportCountry? airportState? airportCity? airportName? latitude longitude
      altitude airportMagvar? airportTrafficScalar? airportTestRadius? airportIdent CLOSEA
    ;
airportChildren
    : tower services runway com
    /*taxywayPoint
    | taxywayParking
    | taxiName
    | taxiPath
    | tower
    | services
    | com
    | runaway
    | waypoint
    | approach
    | helipad*/
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
    : HEADING EQUAL QUOTE ANGLE QUOTE
    ;
number
    : NUMBER EQUAL QUOTE ( INT | ORIENTATION ) QUOTE
    ;
designator
    : DESIGNATOR EQUAL QUOTE ( DESIGNATOR_VAL | LEFT | RIGHT | CENTER | NONE ) QUOTE
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

/****com****/
com
    : COM_OPEN comFrequency comType comName CLOSEBARA
    ;
comFrequency
    : FREQUENCY EQUAL QUOTE ANGLE QUOTE //TODO check this
    ;
comType
    : TYPE EQUAL QUOTE COM_TYPE QUOTE
    ;
comName
    : NAME  EQUAL QUOTE STRING QUOTE
    ;








/***********************************************************************************************/

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


waypoint
    :
    ;

approach
    :
    ;

helipad
    :
    ;



//TODO lattitude/longitude ANGLE RESTRICTION
//TODO check structures order