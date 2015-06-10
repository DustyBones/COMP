import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.Map;

public class Listener extends CompBaseListener {

    private boolean valid;
    private int error;
    private int warning;

    private int airportCount;
    private int towerCount;
    private int fuelCount;
    private int runwayCount;
    private int helipadCount;
    private int taxiwayPointCount;
    private int taxiwayParkingCount;
    private int taxiwayPathCount;

    private Map<String, String> attribute;
    private Map<String, Map<String, String>> airport = new HashMap<>();
    private Map<String, Map<String, String>> tower = new HashMap<>();

    private Map<String, Map<String, String>> fuel = new HashMap<>();
    private Map<String, Map<String, String>> runway = new HashMap<>();
    private Map<String, Map<String, String>> helipad = new HashMap<>();
    private Map<String, Map<String, String>> taxiwayPoint = new HashMap<>();
    private Map<String, Map<String, String>> taxiwayParking = new HashMap<>();
    private Map<String, Map<String, String>> taxiwayPath = new HashMap<>();

    @Override
    public void enterStartParser(@NotNull CompParser.StartParserContext ctx) {
        super.enterStartParser(ctx);

        valid = true;
        error = 0;
        warning = 0;

        airportCount = -1;
        towerCount = -1;
        fuelCount = -1;
        runwayCount = -1;
        helipadCount = -1;
        taxiwayPointCount = -1;
        taxiwayParkingCount = -1;
        taxiwayPathCount = -1;
    }

    @Override
    public void exitStartParser(@NotNull CompParser.StartParserContext ctx) {
        super.exitStartParser(ctx);
        if (error == 0 && warning == 0) {
            System.out.println("No problems found. Generating files.");
        } else if (error > 0 && warning == 0) {
            System.out.println(error + " Error(s). Failed to generate files.");
        } else if (error > 0 && warning > 0) {
            System.out.println(error + " Error(s) and " + warning + " Warning(s). Failed to generate files.");
        } else if (error == 0 && warning > 0) {
            System.out.println(warning + " Warnings(s). Generating files.");
        }
    }

    @Override
    public void enterLatitude(@NotNull CompParser.LatitudeContext ctx) {
        super.enterLatitude(ctx);
    }

    @Override
    public void exitLatitude(@NotNull CompParser.LatitudeContext ctx) {
        super.exitLatitude(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            double dVal;
            if (val.split("-").length <= 2) {
                dVal = Double.parseDouble(val);
                if (dVal >= 90 || dVal <= -90) {
                    System.out.println("Error at " + ctx.getStart().getLine() + ": Expected " +
                            "value between -90 and 90, got " + dVal);
                    valid = false;
                    error++;
                }
            } else {
                String[] vals = val.split("-");
                int i;
                if (vals[0].length() == 0) {
                    dVal = 0 - Double.parseDouble(vals[1]);
                    if (dVal >= 90 || dVal <= -90) {
                        System.out.println("Error at " + ctx.getStart().getLine() + ": Expected angle " +
                                "value between -90 and 90, got " + dVal);
                        valid = false;
                        error++;
                    }
                    i = 2;
                } else {
                    dVal = Double.parseDouble(vals[0]);
                    if (dVal >= 90 || dVal <= -90) {
                        System.out.println("Error at " + ctx.getStart().getLine() + ": Expected angle " +
                                "value between -90 and 90, got " + dVal);
                        valid = false;
                        error++;
                    }
                    i = 1;
                }

                dVal = Double.parseDouble(val.split("-")[i++]);
                if (dVal >= 60 || dVal < 0) {
                    System.out.println("Error at " + ctx.getStart().getLine() + ": Expected minutes " +
                            "value between 0 and 60, got " + dVal);
                    valid = false;
                    error++;
                }
                dVal = Double.parseDouble(val.split("-")[i]);
                if (dVal >= 60 || dVal < 0) {
                    System.out.println("Error at " + ctx.getStart().getLine() + ": Expected seconds " +
                            "value between 0 and 60, got " + dVal);
                    valid = false;
                    error++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected numeric value");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterLongitude(@NotNull CompParser.LongitudeContext ctx) {
        super.enterLongitude(ctx);
    }

    @Override
    public void exitLongitude(@NotNull CompParser.LongitudeContext ctx) {
        super.exitLongitude(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            double dVal;
            if (val.split("-").length <= 2) {
                dVal = Double.parseDouble(val);
                if (dVal >= 180 || dVal <= -180) {
                    System.out.println("Error at " + ctx.getStart().getLine() + ": Expected " +
                            "value between -180 and 180, got " + dVal);
                    valid = false;
                    error++;
                }
            } else {
                String[] vals = val.split("-");
                int i;
                if (vals[0].length() == 0) {
                    dVal = 0 - Double.parseDouble(vals[1]);
                    if (dVal >= 180 || dVal <= -180) {
                        System.out.println("Error at " + ctx.getStart().getLine() + ": Expected angle " +
                                "value between -180 and 180, got " + dVal);
                        valid = false;
                        error++;
                    }
                    i = 2;
                } else {
                    dVal = Double.parseDouble(vals[0]);
                    if (dVal >= 180 || dVal <= -180) {
                        System.out.println("Error at " + ctx.getStart().getLine() + ": Expected angle " +
                                "value between -180 and 180, got " + dVal);
                        valid = false;
                        error++;
                    }
                    i = 1;
                }

                dVal = Double.parseDouble(val.split("-")[i++]);
                if (dVal >= 60 || dVal < 0) {
                    System.out.println("Error at " + ctx.getStart().getLine() + ": Expected minutes " +
                            "value between 0 and 60, got " + dVal);
                    valid = false;
                    error++;
                }
                dVal = Double.parseDouble(val.split("-")[i]);
                if (dVal >= 60 || dVal < 0) {
                    System.out.println("Error at " + ctx.getStart().getLine() + ": Expected seconds " +
                            "value between 0 and 60, got " + dVal);
                    valid = false;
                    error++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected numeric value");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterAltitude(@NotNull CompParser.AltitudeContext ctx) {
        super.enterAltitude(ctx);
    }

    @Override
    public void exitAltitude(@NotNull CompParser.AltitudeContext ctx) {
        super.exitAltitude(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            if (val.substring(val.length() - 1, val.length()).equals("M") ||
                    val.substring(val.length() - 1, val.length()).equals("F")) {
                Double.parseDouble(val.substring(0, val.length() - 1));
            } else {
                Double.parseDouble(val);
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected numeric value");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterLength(@NotNull CompParser.LengthContext ctx) {
        super.enterLength(ctx);
    }

    @Override
    public void exitLength(@NotNull CompParser.LengthContext ctx) {
        super.exitLength(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            if (val.substring(val.length() - 1, val.length()).equals("M") ||
                    val.substring(val.length() - 1, val.length()).equals("F")) {
                Double.parseDouble(val.substring(0, val.length() - 1));
            } else {
                Double.parseDouble(val);
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected numeric value");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterWidth(@NotNull CompParser.WidthContext ctx) {
        super.enterWidth(ctx);
    }

    @Override
    public void exitWidth(@NotNull CompParser.WidthContext ctx) {
        super.exitWidth(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            if (val.substring(val.length() - 1, val.length()).equals("M") ||
                    val.substring(val.length() - 1, val.length()).equals("F")) {
                Double.parseDouble(val.substring(0, val.length() - 1));
            } else {
                Double.parseDouble(val);
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected numeric value");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterIndex(@NotNull CompParser.IndexContext ctx) {
        super.enterIndex(ctx);
    }

    @Override
    public void exitIndex(@NotNull CompParser.IndexContext ctx) {
        super.exitIndex(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            int iVal = Integer.parseInt(val);
            if (iVal < 0 || iVal > 3999) {
                System.out.println("Error at " + ctx.getStart().getLine() + ": Expected " +
                        "value between 0 and 3999, got " + iVal);
                valid = false;
                error++;
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected numeric value");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterBiasX(@NotNull CompParser.BiasXContext ctx) {
        super.enterBiasX(ctx);
    }

    @Override
    public void exitBiasX(@NotNull CompParser.BiasXContext ctx) {
        super.exitBiasX(ctx);
    }

    @Override
    public void enterBiasZ(@NotNull CompParser.BiasZContext ctx) {
        super.enterBiasZ(ctx);
    }

    @Override
    public void exitBiasZ(@NotNull CompParser.BiasZContext ctx) {
        super.exitBiasZ(ctx);
    }

    @Override
    public void enterAirport(@NotNull CompParser.AirportContext ctx) {
        super.enterAirport(ctx);
        airportCount++;
    }

    @Override
    public void exitAirport(@NotNull CompParser.AirportContext ctx) {
        super.exitAirport(ctx);
        attribute = new HashMap<>();
        if (valid) {
            attribute.put("id", "airport_" + airportCount);
            attribute.put("IATA", ctx.airportBegin().airportIdent().STRING().getText().substring(1));
            attribute.put("ICAO", ctx.airportBegin().airportIdent().STRING().getText());
            if (ctx.airportBegin().airportName() != null) {
                attribute.put("name", ctx.airportBegin().airportName().STRING().getText());
            } else {
                attribute.put("name", "not set");
            }
            if (ctx.airportBegin().airportCountry() != null) {
                attribute.put("country", ctx.airportBegin().airportCountry().STRING().getText());
            } else {
                attribute.put("country", "not set");
            }
            if (ctx.airportBegin().airportRegion() != null) {
                attribute.put("region", ctx.airportBegin().airportRegion().STRING().getText());
            } else {
                attribute.put("region", "not set");
            }
            if (ctx.airportBegin().airportState() != null) {
                attribute.put("state", ctx.airportBegin().airportState().STRING().getText());
            } else {
                attribute.put("state", "not set");
            }
            if (ctx.airportBegin().airportCity() != null) {
                attribute.put("city", ctx.airportBegin().airportCity().STRING().getText());
            } else {
                attribute.put("city", "not set");
            }
            if (ctx.airportBegin().latitude().STRING() != null) {
                attribute.put("latitude", ctx.airportBegin().latitude().STRING().getText());
                attribute.put("longitude", ctx.airportBegin().longitude().STRING().getText());
            } else {
                attribute.put("latitude", ctx.airportBegin().latitude().FLOAT().getText());
                attribute.put("longitude", ctx.airportBegin().longitude().FLOAT().getText());
            }
            attribute.put("altitude", ctx.airportBegin().altitude().DIST().getText());
            if (ctx.airportBegin().airportMagvar() != null) {
                attribute.put("magVar", ctx.airportBegin().airportMagvar().FLOAT().getText());
            } else {
                attribute.put("magVar", "not set");
            }
            airport.put("airport_" + airportCount, attribute);
        }
    }

    @Override
    public void enterAirportBegin(@NotNull CompParser.AirportBeginContext ctx) {
        super.enterAirportBegin(ctx);
    }

    @Override
    public void exitAirportBegin(@NotNull CompParser.AirportBeginContext ctx) {
        super.exitAirportBegin(ctx);
        try {
            if ((ctx.latitude().STRING() == null && ctx.longitude().FLOAT() == null) ||
                    (ctx.latitude().FLOAT() == null && ctx.longitude().STRING() == null)) {
                System.out.println("Error at " + ctx.longitude().getStart().getLine() + ": Expected " +
                        " same format for both latitude and longitude");
                valid = false;
                error++;
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected same format");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterAirportChildren(@NotNull CompParser.AirportChildrenContext ctx) {
        super.enterAirportChildren(ctx);
    }

    @Override
    public void exitAirportChildren(@NotNull CompParser.AirportChildrenContext ctx) {
        super.exitAirportChildren(ctx);
    }

    @Override
    public void enterAirportEnd(@NotNull CompParser.AirportEndContext ctx) {
        super.enterAirportEnd(ctx);
    }

    @Override
    public void exitAirportEnd(@NotNull CompParser.AirportEndContext ctx) {
        super.exitAirportEnd(ctx);
    }

    @Override
    public void enterAirportRegion(@NotNull CompParser.AirportRegionContext ctx) {
        super.enterAirportRegion(ctx);
    }

    @Override
    public void exitAirportRegion(@NotNull CompParser.AirportRegionContext ctx) {
        super.exitAirportRegion(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            if (val.length() > 48) {
                System.out.println("Error at " + ctx.getStart().getLine() + ": Expected " +
                        " maximum token length 48, got " + val.length());
                valid = false;
                error++;
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected string");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterAirportCountry(@NotNull CompParser.AirportCountryContext ctx) {
        super.enterAirportCountry(ctx);
    }

    @Override
    public void exitAirportCountry(@NotNull CompParser.AirportCountryContext ctx) {
        super.exitAirportCountry(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            if (val.length() > 48) {
                System.out.println("Error at " + ctx.getStart().getLine() + ": Expected " +
                        " maximum token length 48, got " + val.length());
                valid = false;
                error++;
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected string");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterAirportState(@NotNull CompParser.AirportStateContext ctx) {
        super.enterAirportState(ctx);
    }

    @Override
    public void exitAirportState(@NotNull CompParser.AirportStateContext ctx) {
        super.exitAirportState(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            if (val.length() > 48) {
                System.out.println("Error at " + ctx.getStart().getLine() + ": Expected " +
                        " maximum token length 48, got " + val.length());
                valid = false;
                error++;
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected string");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterAirportCity(@NotNull CompParser.AirportCityContext ctx) {
        super.enterAirportCity(ctx);
    }

    @Override
    public void exitAirportCity(@NotNull CompParser.AirportCityContext ctx) {
        super.exitAirportCity(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            if (val.length() > 48) {
                System.out.println("Error at " + ctx.getStart().getLine() + ": Expected " +
                        " maximum token length 48, got " + val.length());
                valid = false;
                error++;
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected string");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterAirportName(@NotNull CompParser.AirportNameContext ctx) {
        super.enterAirportName(ctx);
    }

    @Override
    public void exitAirportName(@NotNull CompParser.AirportNameContext ctx) {
        super.exitAirportName(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            if (val.length() > 48) {
                System.out.println("Error at " + ctx.getStart().getLine() + ": Expected " +
                        " maximum token length 48, got " + val.length());
                valid = false;
                error++;
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected string");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterAirportMagvar(@NotNull CompParser.AirportMagvarContext ctx) {
        super.enterAirportMagvar(ctx);
    }

    @Override
    public void exitAirportMagvar(@NotNull CompParser.AirportMagvarContext ctx) {
        super.exitAirportMagvar(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            double dVal = Double.parseDouble(val);
            if (dVal <= -360 || dVal >= 360) {
                System.out.println("Error at " + ctx.getStart().getLine() + ": Expected " +
                        "value between -360 and 360, got " + dVal);
                valid = false;
                error++;
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected numeric value");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterAirportTrafficScalar(@NotNull CompParser.AirportTrafficScalarContext ctx) {
        super.enterAirportTrafficScalar(ctx);
    }

    @Override
    public void exitAirportTrafficScalar(@NotNull CompParser.AirportTrafficScalarContext ctx) {
        super.exitAirportTrafficScalar(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            double dVal = Double.parseDouble(val);
            if (dVal < 0.01 || dVal > 1.0) {
                System.out.println("Error at " + ctx.getStart().getLine() + ": Expected " +
                        "value between 0.01 and 1.0, got " + dVal);
                valid = false;
                error++;
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected numeric value");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterAirportTestRadius(@NotNull CompParser.AirportTestRadiusContext ctx) {
        super.enterAirportTestRadius(ctx);
    }

    @Override
    public void exitAirportTestRadius(@NotNull CompParser.AirportTestRadiusContext ctx) {
        super.exitAirportTestRadius(ctx);
        try {
            String val = ctx.DIST().getText();
            if (val.split("-").length == 2) {
                System.out.println("Warning at " + ctx.getStart().getLine() + ": Expected " +
                        "positive value, got " + val);
                warning++;
            }
        } catch (Exception e) {
            System.out.println("Warning at " + ctx.getStart().getLine() + ": Expected numeric value");
            warning++;
        }
    }

    @Override
    public void enterAirportIdent(@NotNull CompParser.AirportIdentContext ctx) {
        super.enterAirportIdent(ctx);
    }

    @Override
    public void exitAirportIdent(@NotNull CompParser.AirportIdentContext ctx) {
        super.exitAirportIdent(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            if (val.length() != 4) {
                System.out.println("Error at " + ctx.getStart().getLine() + ": Expected " +
                        "token length 4, got " + val.length());
                valid = false;
                error++;
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected string");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterTower(@NotNull CompParser.TowerContext ctx) {
        super.enterTower(ctx);
        towerCount++;
    }

    @Override
    public void exitTower(@NotNull CompParser.TowerContext ctx) {
        super.exitTower(ctx);
        attribute = new HashMap<>();
        if (valid) {
            attribute.put("id", "tower_" + towerCount);
            attribute.put("designation", "Tower");
            attribute.put("altitude", ctx.towerBegin().altitude().DIST().getText());
            if (ctx.towerBegin().latitude().STRING() != null) {
                attribute.put("latitude", ctx.towerBegin().latitude().STRING().getText());
                attribute.put("longitude", ctx.towerBegin().longitude().STRING().getText());
            } else {
                attribute.put("latitude", ctx.towerBegin().latitude().FLOAT().getText());
                attribute.put("longitude", ctx.towerBegin().longitude().FLOAT().getText());
            }
            attribute.put("radius", "not set");
            attribute.put("height", "not set");
            tower.put(airportCount + "_tower_" + towerCount, attribute);
        }
    }

    @Override
    public void enterTowerBegin(@NotNull CompParser.TowerBeginContext ctx) {
        super.enterTowerBegin(ctx);
    }

    @Override
    public void exitTowerBegin(@NotNull CompParser.TowerBeginContext ctx) {
        super.exitTowerBegin(ctx);
    }

    @Override
    public void enterTowerEnd(@NotNull CompParser.TowerEndContext ctx) {
        super.enterTowerEnd(ctx);
    }

    @Override
    public void exitTowerEnd(@NotNull CompParser.TowerEndContext ctx) {
        super.exitTowerEnd(ctx);
    }

    @Override
    public void enterServices(@NotNull CompParser.ServicesContext ctx) {
        super.enterServices(ctx);
    }

    @Override
    public void exitServices(@NotNull CompParser.ServicesContext ctx) {
        super.exitServices(ctx);
    }

    @Override
    public void enterFuel(@NotNull CompParser.FuelContext ctx) {
        super.enterFuel(ctx);
        fuelCount++;
    }

    @Override
    public void exitFuel(@NotNull CompParser.FuelContext ctx) {
        super.exitFuel(ctx);
        attribute = new HashMap<>();
        if (valid) {
            attribute.put("id", "fuel_" + fuelCount);
            attribute.put("designation", "Fuel");
            attribute.put("latitude", "not set");
            attribute.put("longitude", "not set");
            attribute.put("radius", "not set");
            if (ctx.fuelType().STRING() != null) {
                attribute.put("type", ctx.fuelType().STRING().getText());
            } else {
                attribute.put("type", ctx.fuelType().INT().getText());
            }
            if (ctx.fuelAvailability().STRING() != null) {
                attribute.put("availability", ctx.fuelAvailability().STRING().getText());
            } else {
                attribute.put("availability", ctx.fuelAvailability().BOOLEAN().getText());
            }
            fuel.put(airportCount + "_fuel_" + fuelCount, attribute);
        }

    }

    @Override
    public void enterFuelType(@NotNull CompParser.FuelTypeContext ctx) {
        super.enterFuelType(ctx);
    }

    @Override
    public void exitFuelType(@NotNull CompParser.FuelTypeContext ctx) {
        super.exitFuelType(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            if (!val.equals("73") && !val.equals("87") && !val.equals("100") && !val.equals("130")
                    && !val.equals("145") && !val.equals("MOGAS") && !val.equals("JET") && !val.equals("JETA")
                    && !val.equals("JETA1") && !val.equals("JETAP") && !val.equals("JETB") && !val.equals("JET4")
                    && !val.equals("JET5") && !val.equals("UNKNOWN")) {
                System.out.println("Error at " + ctx.getStart().getLine() + ": Expected " +
                        "valid fuel type, got " + val);
                valid = false;
                error++;
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected string");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterFuelAvailability(@NotNull CompParser.FuelAvailabilityContext ctx) {
        super.enterFuelAvailability(ctx);
    }

    @Override
    public void exitFuelAvailability(@NotNull CompParser.FuelAvailabilityContext ctx) {
        super.exitFuelAvailability(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            if (!val.equals("YES") && !val.equals("NO") && !val.equals("UNKOWN") && !val.equals("PRIOR_REQUEST")) {
                System.out.println("Error at " + ctx.getStart().getLine() + ": Expected " +
                        "availability, got " + val);
                valid = false;
                error++;
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected string");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterRunway(@NotNull CompParser.RunwayContext ctx) {
        super.enterRunway(ctx);
        runwayCount++;
    }

    @Override
    public void exitRunway(@NotNull CompParser.RunwayContext ctx) {
        super.exitRunway(ctx);
        attribute = new HashMap<>();
        if (valid) {
            attribute.put("id", "runway_" + runwayCount);
            attribute.put("altitude", ctx.runwayBegin().altitude().DIST().getText());
            attribute.put("length", ctx.runwayBegin().length().DIST().getText());
            attribute.put("width", ctx.runwayBegin().width().DIST().getText());
            if (ctx.runwayBegin().latitude().STRING() != null) {
                attribute.put("latitude", ctx.runwayBegin().latitude().STRING().getText());
                attribute.put("longitude", ctx.runwayBegin().longitude().STRING().getText());
            } else {
                attribute.put("latitude", ctx.runwayBegin().latitude().FLOAT().getText());
                attribute.put("longitude", ctx.runwayBegin().longitude().FLOAT().getText());
            }
            attribute.put("surface", ctx.runwayBegin().surface().STRING().getText());
            runway.put(airportCount + "_runway_" + runwayCount, attribute);
        }
    }

    @Override
    public void enterRunwayBegin(@NotNull CompParser.RunwayBeginContext ctx) {
        super.enterRunwayBegin(ctx);
    }

    @Override
    public void exitRunwayBegin(@NotNull CompParser.RunwayBeginContext ctx) {
        super.exitRunwayBegin(ctx);
    }

    @Override
    public void enterRunwayChildren(@NotNull CompParser.RunwayChildrenContext ctx) {
        super.enterRunwayChildren(ctx);
    }

    @Override
    public void exitRunwayChildren(@NotNull CompParser.RunwayChildrenContext ctx) {
        super.exitRunwayChildren(ctx);
    }

    @Override
    public void enterRunwayEnd(@NotNull CompParser.RunwayEndContext ctx) {
        super.enterRunwayEnd(ctx);
    }

    @Override
    public void exitRunwayEnd(@NotNull CompParser.RunwayEndContext ctx) {
        super.exitRunwayEnd(ctx);
    }

    @Override
    public void enterSurface(@NotNull CompParser.SurfaceContext ctx) {
        super.enterSurface(ctx);
    }

    @Override
    public void exitSurface(@NotNull CompParser.SurfaceContext ctx) {
        super.exitSurface(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            if (!val.equals("ASPHALT") && !val.equals("BITUMINOUS") && !val.equals("BRICK") && !val.equals("CLAY") &&
                    !val.equals("CEMENT") && !val.equals("CONCRETE") && !val.equals("CORAL") && !val.equals("DIRT") &&
                    !val.equals("GRASS") && !val.equals("GRAVEL") && !val.equals("ICE") && !val.equals("MACADAM") &&
                    !val.equals("OIL_TREATED") && !val.equals("PLANKS") && !val.equals("SAND") && !val.equals("SHALE") &&
                    !val.equals("SNOW") && !val.equals("STEEL_MATS") && !val.equals("TARMAC") && !val.equals("UNKNOWN") &&
                    !val.equals("WATER")) {
                System.out.println("Error at " + ctx.getStart().getLine() + ": Expected " +
                        "valid surface, got " + val);
                valid = false;
                error++;
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected string");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterHeading(@NotNull CompParser.HeadingContext ctx) {
        super.enterHeading(ctx);
    }

    @Override
    public void exitHeading(@NotNull CompParser.HeadingContext ctx) {
        super.exitHeading(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            double dVal = Double.parseDouble(val);
            if (dVal < 0 || dVal >= 360) {
                System.out.println("Error at " + ctx.getStart().getLine() + ": Expected " +
                        "value between 0 and 360, got " + dVal);
                valid = false;
                error++;
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected numeric value");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterNumber(@NotNull CompParser.NumberContext ctx) {
        super.enterNumber(ctx);
    }

    @Override
    public void exitNumber(@NotNull CompParser.NumberContext ctx) {
        super.exitNumber(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            if (val.length() > 2) {
                if (!val.equals("EAST") && !val.equals("NORTH") && !val.equals("NORTHEAST") &&
                        !val.equals("NORTHWEST") && !val.equals("SOUTH") && !val.equals("SOUTHEAST") &&
                        !val.equals("SOUTHWEST") && !val.equals("WEST") && !val.equals("EAST")) {
                    System.out.println("Error at " + ctx.getStart().getLine() + ": Expected " +
                            "valid number, got " + val);
                    valid = false;
                    error++;
                }
            } else {
                int iVal = Integer.parseInt(val);
                if (iVal < 0 || iVal > 36) {
                    System.out.println("Error at " + ctx.getStart().getLine() + ": Expected " +
                            "value between 0 and 36, got " + iVal);
                    valid = false;
                    error++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected int or string");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterDesignator(@NotNull CompParser.DesignatorContext ctx) {
        super.enterDesignator(ctx);
    }

    @Override
    public void exitDesignator(@NotNull CompParser.DesignatorContext ctx) {
        super.exitDesignator(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            if (!val.equals("NONE") && !val.equals("C") && !val.equals("CENTER") && !val.equals("L") &&
                    !val.equals("LEFT") && !val.equals("R") && !val.equals("RIGHT") && !val.equals("W") &&
                    !val.equals("WATER") && !val.equals("A") && !val.equals("B")) {
                System.out.println("Error at " + ctx.getStart().getLine() + ": Expected " +
                        "valid value, got " + val);
                valid = false;
                error++;
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected string");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterPatternAlt(@NotNull CompParser.PatternAltContext ctx) {
        super.enterPatternAlt(ctx);
    }

    @Override
    public void exitPatternAlt(@NotNull CompParser.PatternAltContext ctx) {
        super.exitPatternAlt(ctx);
    }

    @Override
    public void enterPrimaryTakeoff(@NotNull CompParser.PrimaryTakeoffContext ctx) {
        super.enterPrimaryTakeoff(ctx);
    }

    @Override
    public void exitPrimaryTakeoff(@NotNull CompParser.PrimaryTakeoffContext ctx) {
        super.exitPrimaryTakeoff(ctx);
    }

    @Override
    public void enterPrimaryLanding(@NotNull CompParser.PrimaryLandingContext ctx) {
        super.enterPrimaryLanding(ctx);
    }

    @Override
    public void exitPrimaryLanding(@NotNull CompParser.PrimaryLandingContext ctx) {
        super.exitPrimaryLanding(ctx);
    }

    @Override
    public void enterPrimaryPattern(@NotNull CompParser.PrimaryPatternContext ctx) {
        super.enterPrimaryPattern(ctx);
    }

    @Override
    public void exitPrimaryPattern(@NotNull CompParser.PrimaryPatternContext ctx) {
        super.exitPrimaryPattern(ctx);
    }

    @Override
    public void enterSecondaryTakeoff(@NotNull CompParser.SecondaryTakeoffContext ctx) {
        super.enterSecondaryTakeoff(ctx);
    }

    @Override
    public void exitSecondaryTakeoff(@NotNull CompParser.SecondaryTakeoffContext ctx) {
        super.exitSecondaryTakeoff(ctx);
    }

    @Override
    public void enterSecondaryLanding(@NotNull CompParser.SecondaryLandingContext ctx) {
        super.enterSecondaryLanding(ctx);
    }

    @Override
    public void exitSecondaryLanding(@NotNull CompParser.SecondaryLandingContext ctx) {
        super.exitSecondaryLanding(ctx);
    }

    @Override
    public void enterSecondaryPattern(@NotNull CompParser.SecondaryPatternContext ctx) {
        super.enterSecondaryPattern(ctx);
    }

    @Override
    public void exitSecondaryPattern(@NotNull CompParser.SecondaryPatternContext ctx) {
        super.exitSecondaryPattern(ctx);
    }

    @Override
    public void enterMarkings(@NotNull CompParser.MarkingsContext ctx) {
        super.enterMarkings(ctx);
    }

    @Override
    public void exitMarkings(@NotNull CompParser.MarkingsContext ctx) {
        super.exitMarkings(ctx);
    }

    @Override
    public void enterAlternateThreshold(@NotNull CompParser.AlternateThresholdContext ctx) {
        super.enterAlternateThreshold(ctx);
    }

    @Override
    public void exitAlternateThreshold(@NotNull CompParser.AlternateThresholdContext ctx) {
        super.exitAlternateThreshold(ctx);
    }

    @Override
    public void enterAlternateTouchdown(@NotNull CompParser.AlternateTouchdownContext ctx) {
        super.enterAlternateTouchdown(ctx);
    }

    @Override
    public void exitAlternateTouchdown(@NotNull CompParser.AlternateTouchdownContext ctx) {
        super.exitAlternateTouchdown(ctx);
    }

    @Override
    public void enterAlternateFixedDistance(@NotNull CompParser.AlternateFixedDistanceContext ctx) {
        super.enterAlternateFixedDistance(ctx);
    }

    @Override
    public void exitAlternateFixedDistance(@NotNull CompParser.AlternateFixedDistanceContext ctx) {
        super.exitAlternateFixedDistance(ctx);
    }

    @Override
    public void enterAlternatePrecision(@NotNull CompParser.AlternatePrecisionContext ctx) {
        super.enterAlternatePrecision(ctx);
    }

    @Override
    public void exitAlternatePrecision(@NotNull CompParser.AlternatePrecisionContext ctx) {
        super.exitAlternatePrecision(ctx);
    }

    @Override
    public void enterLeadingZeroIdent(@NotNull CompParser.LeadingZeroIdentContext ctx) {
        super.enterLeadingZeroIdent(ctx);
    }

    @Override
    public void exitLeadingZeroIdent(@NotNull CompParser.LeadingZeroIdentContext ctx) {
        super.exitLeadingZeroIdent(ctx);
    }

    @Override
    public void enterNoThresholdEndArrows(@NotNull CompParser.NoThresholdEndArrowsContext ctx) {
        super.enterNoThresholdEndArrows(ctx);
    }

    @Override
    public void exitNoThresholdEndArrows(@NotNull CompParser.NoThresholdEndArrowsContext ctx) {
        super.exitNoThresholdEndArrows(ctx);
    }

    @Override
    public void enterEdges(@NotNull CompParser.EdgesContext ctx) {
        super.enterEdges(ctx);
    }

    @Override
    public void exitEdges(@NotNull CompParser.EdgesContext ctx) {
        super.exitEdges(ctx);
    }

    @Override
    public void enterThreshold(@NotNull CompParser.ThresholdContext ctx) {
        super.enterThreshold(ctx);
    }

    @Override
    public void exitThreshold(@NotNull CompParser.ThresholdContext ctx) {
        super.exitThreshold(ctx);
    }

    @Override
    public void enterFixedDistance(@NotNull CompParser.FixedDistanceContext ctx) {
        super.enterFixedDistance(ctx);
    }

    @Override
    public void exitFixedDistance(@NotNull CompParser.FixedDistanceContext ctx) {
        super.exitFixedDistance(ctx);
    }

    @Override
    public void enterTouchdown(@NotNull CompParser.TouchdownContext ctx) {
        super.enterTouchdown(ctx);
    }

    @Override
    public void exitTouchdown(@NotNull CompParser.TouchdownContext ctx) {
        super.exitTouchdown(ctx);
    }

    @Override
    public void enterDashes(@NotNull CompParser.DashesContext ctx) {
        super.enterDashes(ctx);
    }

    @Override
    public void exitDashes(@NotNull CompParser.DashesContext ctx) {
        super.exitDashes(ctx);
    }

    @Override
    public void enterIdent(@NotNull CompParser.IdentContext ctx) {
        super.enterIdent(ctx);
    }

    @Override
    public void exitIdent(@NotNull CompParser.IdentContext ctx) {
        super.exitIdent(ctx);
    }

    @Override
    public void enterPrecision(@NotNull CompParser.PrecisionContext ctx) {
        super.enterPrecision(ctx);
    }

    @Override
    public void exitPrecision(@NotNull CompParser.PrecisionContext ctx) {
        super.exitPrecision(ctx);
    }

    @Override
    public void enterEdgePavement(@NotNull CompParser.EdgePavementContext ctx) {
        super.enterEdgePavement(ctx);
    }

    @Override
    public void exitEdgePavement(@NotNull CompParser.EdgePavementContext ctx) {
        super.exitEdgePavement(ctx);
    }

    @Override
    public void enterSingleEnd(@NotNull CompParser.SingleEndContext ctx) {
        super.enterSingleEnd(ctx);
    }

    @Override
    public void exitSingleEnd(@NotNull CompParser.SingleEndContext ctx) {
        super.exitSingleEnd(ctx);
    }

    @Override
    public void enterPrimaryClosed(@NotNull CompParser.PrimaryClosedContext ctx) {
        super.enterPrimaryClosed(ctx);
    }

    @Override
    public void exitPrimaryClosed(@NotNull CompParser.PrimaryClosedContext ctx) {
        super.exitPrimaryClosed(ctx);
    }

    @Override
    public void enterSecondaryClosed(@NotNull CompParser.SecondaryClosedContext ctx) {
        super.enterSecondaryClosed(ctx);
    }

    @Override
    public void exitSecondaryClosed(@NotNull CompParser.SecondaryClosedContext ctx) {
        super.exitSecondaryClosed(ctx);
    }

    @Override
    public void enterPrimaryStol(@NotNull CompParser.PrimaryStolContext ctx) {
        super.enterPrimaryStol(ctx);
    }

    @Override
    public void exitPrimaryStol(@NotNull CompParser.PrimaryStolContext ctx) {
        super.exitPrimaryStol(ctx);
    }

    @Override
    public void enterSecondaryStol(@NotNull CompParser.SecondaryStolContext ctx) {
        super.enterSecondaryStol(ctx);
    }

    @Override
    public void exitSecondaryStol(@NotNull CompParser.SecondaryStolContext ctx) {
        super.exitSecondaryStol(ctx);
    }

    @Override
    public void enterLights(@NotNull CompParser.LightsContext ctx) {
        super.enterLights(ctx);
    }

    @Override
    public void exitLights(@NotNull CompParser.LightsContext ctx) {
        super.exitLights(ctx);
    }

    @Override
    public void enterLightsCenter(@NotNull CompParser.LightsCenterContext ctx) {
        super.enterLightsCenter(ctx);
    }

    @Override
    public void exitLightsCenter(@NotNull CompParser.LightsCenterContext ctx) {
        super.exitLightsCenter(ctx);
    }

    @Override
    public void enterLightsEdge(@NotNull CompParser.LightsEdgeContext ctx) {
        super.enterLightsEdge(ctx);
    }

    @Override
    public void exitLightsEdge(@NotNull CompParser.LightsEdgeContext ctx) {
        super.exitLightsEdge(ctx);
    }

    @Override
    public void enterLightsRed(@NotNull CompParser.LightsRedContext ctx) {
        super.enterLightsRed(ctx);
    }

    @Override
    public void exitLightsRed(@NotNull CompParser.LightsRedContext ctx) {
        super.exitLightsRed(ctx);
    }

    @Override
    public void enterHelipad(@NotNull CompParser.HelipadContext ctx) {
        super.enterHelipad(ctx);
        helipadCount++;
    }

    @Override
    public void exitHelipad(@NotNull CompParser.HelipadContext ctx) {
        super.exitHelipad(ctx);
        attribute = new HashMap<>();
        if (valid) {
            attribute.put("id", "helipad_" + helipadCount);
            attribute.put("altitude", ctx.altitude().DIST().getText());
            attribute.put("radius", "not set");
            if (ctx.latitude().STRING() != null) {
                attribute.put("latitude", ctx.latitude().STRING().getText());
                attribute.put("longitude", ctx.longitude().STRING().getText());
            } else {
                attribute.put("latitude", ctx.latitude().FLOAT().getText());
                attribute.put("longitude", ctx.longitude().FLOAT().getText());
            }
            attribute.put("surface", ctx.surface().STRING().getText());
            helipad.put(airportCount + "_helipad_" + helipadCount, attribute);
        }
    }

    @Override
    public void enterHelipadType(@NotNull CompParser.HelipadTypeContext ctx) {
        super.enterHelipadType(ctx);
    }

    @Override
    public void exitHelipadType(@NotNull CompParser.HelipadTypeContext ctx) {
        super.exitHelipadType(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            if (!val.equals("NONE") && !val.equals("CIRCLE") && !val.equals("H") && !val.equals("MEDICAL") &&
                    !val.equals("SQUARE")) {
                System.out.println("Error at " + ctx.getStart().getLine() + ": Expected " +
                        "valid type, got " + val);
                valid = false;
                error++;
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected string");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterClosed(@NotNull CompParser.ClosedContext ctx) {
        super.enterClosed(ctx);
    }

    @Override
    public void exitClosed(@NotNull CompParser.ClosedContext ctx) {
        super.exitClosed(ctx);
    }

    @Override
    public void enterTransparent(@NotNull CompParser.TransparentContext ctx) {
        super.enterTransparent(ctx);
    }

    @Override
    public void exitTransparent(@NotNull CompParser.TransparentContext ctx) {
        super.exitTransparent(ctx);
    }

    @Override
    public void enterCom(@NotNull CompParser.ComContext ctx) {
        super.enterCom(ctx);
    }

    @Override
    public void exitCom(@NotNull CompParser.ComContext ctx) {
        super.exitCom(ctx);
    }

    @Override
    public void enterComFrequency(@NotNull CompParser.ComFrequencyContext ctx) {
        super.enterComFrequency(ctx);
    }

    @Override
    public void exitComFrequency(@NotNull CompParser.ComFrequencyContext ctx) {
        super.exitComFrequency(ctx);
    }

    @Override
    public void enterComType(@NotNull CompParser.ComTypeContext ctx) {
        super.enterComType(ctx);
    }

    @Override
    public void exitComType(@NotNull CompParser.ComTypeContext ctx) {
        super.exitComType(ctx);
    }

    @Override
    public void enterComName(@NotNull CompParser.ComNameContext ctx) {
        super.enterComName(ctx);
    }

    @Override
    public void exitComName(@NotNull CompParser.ComNameContext ctx) {
        super.exitComName(ctx);
    }

    @Override
    public void enterTaxiwayPoint(@NotNull CompParser.TaxiwayPointContext ctx) {
        super.enterTaxiwayPoint(ctx);
        taxiwayPointCount++;
    }

    @Override
    public void exitTaxiwayPoint(@NotNull CompParser.TaxiwayPointContext ctx) {
        super.exitTaxiwayPoint(ctx);
        attribute = new HashMap<>();
        if (valid) {
            attribute.put("id", "taxiwayPoint_" + taxiwayPointCount);
            attribute.put("index", ctx.index().INT().getText());
            attribute.put("altitude", "not set");
            if (ctx.latitude().STRING() != null) {
                attribute.put("latitude", ctx.latitude().STRING().getText());
                attribute.put("longitude", ctx.longitude().STRING().getText());
            } else if (ctx.latitude().FLOAT() != null) {
                attribute.put("latitude", ctx.latitude().FLOAT().getText());
                attribute.put("longitude", ctx.longitude().FLOAT().getText());
            } else {
                attribute.put("latitude", ctx.biasX().DIST().getText());
                attribute.put("longitude", ctx.biasZ().DIST().getText());
            }
            taxiwayPoint.put(airportCount + "_taxiwayPoint_" + taxiwayPointCount, attribute);
        }
    }

    @Override
    public void enterTaxiwayPointerType(@NotNull CompParser.TaxiwayPointerTypeContext ctx) {
        super.enterTaxiwayPointerType(ctx);
    }

    @Override
    public void exitTaxiwayPointerType(@NotNull CompParser.TaxiwayPointerTypeContext ctx) {
        super.exitTaxiwayPointerType(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            if (!val.equals("NORMAL") && !val.equals("HOLD_SHORT") && !val.equals("ILS_HOLD_SHORT") &&
                    !val.equals("HOLD_SHORT_NO_DRAW") && !val.equals("ILS_HOLD_SHORT_NO_DRAW")) {
                System.out.println("Error at " + ctx.getStart().getLine() + ": Expected " +
                        "valid type, got " + val);
                valid = false;
                error++;
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected string");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterOrientation(@NotNull CompParser.OrientationContext ctx) {
        super.enterOrientation(ctx);
    }

    @Override
    public void exitOrientation(@NotNull CompParser.OrientationContext ctx) {
        super.exitOrientation(ctx);
    }

    @Override
    public void enterTaxiwayParking(@NotNull CompParser.TaxiwayParkingContext ctx) {
        super.enterTaxiwayParking(ctx);
        taxiwayParkingCount++;
    }

    @Override
    public void exitTaxiwayParking(@NotNull CompParser.TaxiwayParkingContext ctx) {
        super.exitTaxiwayParking(ctx);
        attribute = new HashMap<>();
        if (valid) {
            attribute.put("id", "taxiwayParking_" + taxiwayParkingCount);
            attribute.put("index", ctx.index().INT().getText());
            attribute.put("altitude", "not set");
            if (ctx.latitude().STRING() != null) {
                attribute.put("latitude", ctx.latitude().STRING().getText());
                attribute.put("longitude", ctx.longitude().STRING().getText());
            } else if (ctx.latitude().FLOAT() != null) {
                attribute.put("latitude", ctx.latitude().FLOAT().getText());
                attribute.put("longitude", ctx.longitude().FLOAT().getText());
            } else {
                attribute.put("latitude", ctx.biasX().DIST().getText());
                attribute.put("longitude", ctx.biasZ().DIST().getText());
            }
            attribute.put("type", ctx.taxiwayParkingType().STRING().getText());
            attribute.put("name", ctx.name().STRING().getText());
            if (ctx.number().INT() != null) {
                attribute.put("number", ctx.number().INT().getText());
            } else {
                attribute.put("number", ctx.number().STRING().getText());
            }
            if (ctx.airline() != null) {
                attribute.put("airline", ctx.airline().STRING().getText());
            }
            taxiwayParking.put(airportCount + "_taxiwayParking_" + taxiwayParkingCount, attribute);
        }
    }

    @Override
    public void enterRadius(@NotNull CompParser.RadiusContext ctx) {
        super.enterRadius(ctx);
    }

    @Override
    public void exitRadius(@NotNull CompParser.RadiusContext ctx) {
        super.exitRadius(ctx);
    }

    @Override
    public void enterTaxiwayParkingType(@NotNull CompParser.TaxiwayParkingTypeContext ctx) {
        super.enterTaxiwayParkingType(ctx);
    }

    @Override
    public void exitTaxiwayParkingType(@NotNull CompParser.TaxiwayParkingTypeContext ctx) {
        super.exitTaxiwayParkingType(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            if (!val.equals("NONE") && !val.equals("DOCK_GA") && !val.equals("FUEL") && !val.equals("GATE_HEAVY") &&
                    !val.equals("GATE_MEDIUM") && !val.equals("GATE_SMALL") && !val.equals("RAMP_CARGO") &&
                    !val.equals("RAMP_GA") && !val.equals("RAMP_GA_LARGE") && !val.equals("RAMP_GA_MEDIUM") &&
                    !val.equals("RAMP_GA_SMALL") && !val.equals("RAMP_MIL_CARGO") && !val.equals("RAMP_MIL_COMBAT") &&
                    !val.equals("VEHICLE")) {
                System.out.println("Error at " + ctx.getStart().getLine() + ": Expected " +
                        "valid type, got " + val);
                valid = false;
                error++;
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected string");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterName(@NotNull CompParser.NameContext ctx) {
        super.enterName(ctx);
    }

    @Override
    public void exitName(@NotNull CompParser.NameContext ctx) {
        super.exitName(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            if (val.startsWith("GATE_") && val.length() == 6) {
                if (val.charAt(5) < 65 || val.charAt(5) > 90) {
                    System.out.println("Error at " + ctx.getStart().getLine() + ": Expected " +
                            "valid type, got " + val);
                    valid = false;
                    error++;
                }
            } else if (!val.equals("PARKING") && !val.equals("DOCK") && !val.equals("GATE") &&
                    !val.equals("NONE") && !val.equals("N_PARKING") && !val.equals("NE_PARKING") &&
                    !val.equals("NW_PARKING") && !val.equals("SE_PARKING") && !val.equals("S_PARKING") &&
                    !val.equals("SW_PARKING") && !val.equals("W_PARKING") && !val.equals("E_PARKING")) {
                System.out.println("Error at " + ctx.getStart().getLine() + ": Expected " +
                        "valid type, got " + val);
                valid = false;
                error++;
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected string");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterPushBack(@NotNull CompParser.PushBackContext ctx) {
        super.enterPushBack(ctx);
    }

    @Override
    public void exitPushBack(@NotNull CompParser.PushBackContext ctx) {
        super.exitPushBack(ctx);
    }

    @Override
    public void enterTaxiName(@NotNull CompParser.TaxiNameContext ctx) {
        super.enterTaxiName(ctx);
    }

    @Override
    public void exitTaxiName(@NotNull CompParser.TaxiNameContext ctx) {
        super.exitTaxiName(ctx);
    }

    @Override
    public void enterTaxiNameName(@NotNull CompParser.TaxiNameNameContext ctx) {
        super.enterTaxiNameName(ctx);
    }

    @Override
    public void exitTaxiNameName(@NotNull CompParser.TaxiNameNameContext ctx) {
        super.exitTaxiNameName(ctx);
    }

    @Override
    public void exitAirline(@NotNull CompParser.AirlineContext ctx) {
        super.exitAirline(ctx);
    }

    @Override
    public void enterAirline(@NotNull CompParser.AirlineContext ctx) {
        super.enterAirline(ctx);
    }

    @Override
    public void enterTaxiPath(@NotNull CompParser.TaxiPathContext ctx) {
        super.enterTaxiPath(ctx);
        taxiwayPathCount++;
    }

    @Override
    public void exitTaxiPath(@NotNull CompParser.TaxiPathContext ctx) {
        super.exitTaxiPath(ctx);
        attribute = new HashMap<>();
        if (valid) {
            attribute.put("id", "taxiwayPath_" + taxiwayPathCount);
            attribute.put("start", ctx.taxiPathStart().INT().getText());
            attribute.put("end", ctx.taxiPathEnd().INT().getText());
            attribute.put("width", ctx.width().DIST().getText());
            attribute.put("surface", ctx.surface().STRING().getText());
            taxiwayPath.put(airportCount + "_taxiwayParking_" + taxiwayPathCount, attribute);
        }
    }

    @Override
    public void enterTaxiPathType(@NotNull CompParser.TaxiPathTypeContext ctx) {
        super.enterTaxiPathType(ctx);
    }

    @Override
    public void exitTaxiPathType(@NotNull CompParser.TaxiPathTypeContext ctx) {
        super.exitTaxiPathType(ctx);
        try {
            String val = ctx.getText().split("\"")[1];
            if (!val.equals("RUNWAY") && !val.equals("PARKING") && !val.equals("TAXI") && !val.equals("PATH") &&
                    !val.equals("CLOSED") && !val.equals("VEHICLE")) {
                System.out.println("Error at " + ctx.getStart().getLine() + ": Expected " +
                        "valid type, got " + val);
                valid = false;
                error++;
            }
        } catch (Exception e) {
            System.out.println("Error at " + ctx.getStart().getLine() + ": Expected string");
            valid = false;
            error++;
        }
    }

    @Override
    public void enterTaxiPathStart(@NotNull CompParser.TaxiPathStartContext ctx) {
        super.enterTaxiPathStart(ctx);
    }

    @Override
    public void exitTaxiPathStart(@NotNull CompParser.TaxiPathStartContext ctx) {
        super.exitTaxiPathStart(ctx);
    }

    @Override
    public void enterTaxiPathEnd(@NotNull CompParser.TaxiPathEndContext ctx) {
        super.enterTaxiPathEnd(ctx);
    }

    @Override
    public void exitTaxiPathEnd(@NotNull CompParser.TaxiPathEndContext ctx) {
        super.exitTaxiPathEnd(ctx);
    }

    @Override
    public void enterTaxiPathWeightLimit(@NotNull CompParser.TaxiPathWeightLimitContext ctx) {
        super.enterTaxiPathWeightLimit(ctx);
    }

    @Override
    public void exitTaxiPathWeightLimit(@NotNull CompParser.TaxiPathWeightLimitContext ctx) {
        super.exitTaxiPathWeightLimit(ctx);
    }

    @Override
    public void enterTaxiPathDrawSurface(@NotNull CompParser.TaxiPathDrawSurfaceContext ctx) {
        super.enterTaxiPathDrawSurface(ctx);
    }

    @Override
    public void exitTaxiPathDrawSurface(@NotNull CompParser.TaxiPathDrawSurfaceContext ctx) {
        super.exitTaxiPathDrawSurface(ctx);
    }

    @Override
    public void enterTaxiPathDrawDetail(@NotNull CompParser.TaxiPathDrawDetailContext ctx) {
        super.enterTaxiPathDrawDetail(ctx);
    }

    @Override
    public void exitTaxiPathDrawDetail(@NotNull CompParser.TaxiPathDrawDetailContext ctx) {
        super.exitTaxiPathDrawDetail(ctx);
    }

    @Override
    public void enterTaxiPathCenterLine(@NotNull CompParser.TaxiPathCenterLineContext ctx) {
        super.enterTaxiPathCenterLine(ctx);
    }

    @Override
    public void exitTaxiPathCenterLine(@NotNull CompParser.TaxiPathCenterLineContext ctx) {
        super.exitTaxiPathCenterLine(ctx);
    }

    @Override
    public void enterTaxiPathCenterLineLighted(@NotNull CompParser.TaxiPathCenterLineLightedContext ctx) {
        super.enterTaxiPathCenterLineLighted(ctx);
    }

    @Override
    public void exitTaxiPathCenterLineLighted(@NotNull CompParser.TaxiPathCenterLineLightedContext ctx) {
        super.exitTaxiPathCenterLineLighted(ctx);
    }

    @Override
    public void enterTaxiPathLeftEdge(@NotNull CompParser.TaxiPathLeftEdgeContext ctx) {
        super.enterTaxiPathLeftEdge(ctx);
    }

    @Override
    public void exitTaxiPathLeftEdge(@NotNull CompParser.TaxiPathLeftEdgeContext ctx) {
        super.exitTaxiPathLeftEdge(ctx);
    }

    @Override
    public void enterTaxiPathLeftEdgeLigthed(@NotNull CompParser.TaxiPathLeftEdgeLigthedContext ctx) {
        super.enterTaxiPathLeftEdgeLigthed(ctx);
    }

    @Override
    public void exitTaxiPathLeftEdgeLigthed(@NotNull CompParser.TaxiPathLeftEdgeLigthedContext ctx) {
        super.exitTaxiPathLeftEdgeLigthed(ctx);
    }

    @Override
    public void enterTaxiPathRightEdge(@NotNull CompParser.TaxiPathRightEdgeContext ctx) {
        super.enterTaxiPathRightEdge(ctx);
    }

    @Override
    public void exitTaxiPathRightEdge(@NotNull CompParser.TaxiPathRightEdgeContext ctx) {
        super.exitTaxiPathRightEdge(ctx);
    }

    @Override
    public void enterTaxiPathRightEdgeLighted(@NotNull CompParser.TaxiPathRightEdgeLightedContext ctx) {
        super.enterTaxiPathRightEdgeLighted(ctx);
    }

    @Override
    public void exitTaxiPathRightEdgeLighted(@NotNull CompParser.TaxiPathRightEdgeLightedContext ctx) {
        super.exitTaxiPathRightEdgeLighted(ctx);
    }

    @Override
    public void enterTaxiPathNumber(@NotNull CompParser.TaxiPathNumberContext ctx) {
        super.enterTaxiPathNumber(ctx);
    }

    @Override
    public void exitTaxiPathNumber(@NotNull CompParser.TaxiPathNumberContext ctx) {
        super.exitTaxiPathNumber(ctx);
    }

    @Override
    public void enterTaxiPathName(@NotNull CompParser.TaxiPathNameContext ctx) {
        super.enterTaxiPathName(ctx);
    }

    @Override
    public void exitTaxiPathName(@NotNull CompParser.TaxiPathNameContext ctx) {
        super.exitTaxiPathName(ctx);
    }

    public boolean isValid() {
        return valid;
    }

    public Map<String, Map<String, String>> getAirport() {
        return airport;
    }

    public Map<String, Map<String, String>> getTower() {
        return tower;
    }

    public Map<String, Map<String, String>> getFuel() {
        return fuel;
    }

    public Map<String, Map<String, String>> getRunway() {
        return runway;
    }

    public Map<String, Map<String, String>> getHelipad() {
        return helipad;
    }

    public Map<String, Map<String, String>> gettaxiwayPoint() {
        return taxiwayPoint;
    }

    public Map<String, Map<String, String>> gettaxiwayParking() {
        return taxiwayParking;
    }

    public Map<String, Map<String, String>> getTaxiwayPath() {
        return taxiwayPath;
    }
}
