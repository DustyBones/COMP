// Generated from C:/Users/Tiago/Documents/git/COMP\Comp.g4 by ANTLR 4.5

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CompParser}.
 */
public interface CompListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link CompParser#start}.
     *
     * @param ctx the parse tree
     */
    void enterStart(@NotNull CompParser.StartContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#start}.
     *
     * @param ctx the parse tree
     */
    void exitStart(@NotNull CompParser.StartContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#latitude}.
     *
     * @param ctx the parse tree
     */
    void enterLatitude(@NotNull CompParser.LatitudeContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#latitude}.
     *
     * @param ctx the parse tree
     */
    void exitLatitude(@NotNull CompParser.LatitudeContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#longitude}.
     *
     * @param ctx the parse tree
     */
    void enterLongitude(@NotNull CompParser.LongitudeContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#longitude}.
     *
     * @param ctx the parse tree
     */
    void exitLongitude(@NotNull CompParser.LongitudeContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#altitude}.
     *
     * @param ctx the parse tree
     */
    void enterAltitude(@NotNull CompParser.AltitudeContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#altitude}.
     *
     * @param ctx the parse tree
     */
    void exitAltitude(@NotNull CompParser.AltitudeContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#length}.
     *
     * @param ctx the parse tree
     */
    void enterLength(@NotNull CompParser.LengthContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#length}.
     *
     * @param ctx the parse tree
     */
    void exitLength(@NotNull CompParser.LengthContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#width}.
     *
     * @param ctx the parse tree
     */
    void enterWidth(@NotNull CompParser.WidthContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#width}.
     *
     * @param ctx the parse tree
     */
    void exitWidth(@NotNull CompParser.WidthContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#index}.
     *
     * @param ctx the parse tree
     */
    void enterIndex(@NotNull CompParser.IndexContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#index}.
     *
     * @param ctx the parse tree
     */
    void exitIndex(@NotNull CompParser.IndexContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#biasX}.
     *
     * @param ctx the parse tree
     */
    void enterBiasX(@NotNull CompParser.BiasXContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#biasX}.
     *
     * @param ctx the parse tree
     */
    void exitBiasX(@NotNull CompParser.BiasXContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#biasZ}.
     *
     * @param ctx the parse tree
     */
    void enterBiasZ(@NotNull CompParser.BiasZContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#biasZ}.
     *
     * @param ctx the parse tree
     */
    void exitBiasZ(@NotNull CompParser.BiasZContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#airport}.
     *
     * @param ctx the parse tree
     */
    void enterAirport(@NotNull CompParser.AirportContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#airport}.
     *
     * @param ctx the parse tree
     */
    void exitAirport(@NotNull CompParser.AirportContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#airportBegin}.
     *
     * @param ctx the parse tree
     */
    void enterAirportBegin(@NotNull CompParser.AirportBeginContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#airportBegin}.
     *
     * @param ctx the parse tree
     */
    void exitAirportBegin(@NotNull CompParser.AirportBeginContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#airportChildren}.
     *
     * @param ctx the parse tree
     */
    void enterAirportChildren(@NotNull CompParser.AirportChildrenContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#airportChildren}.
     *
     * @param ctx the parse tree
     */
    void exitAirportChildren(@NotNull CompParser.AirportChildrenContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#airportEnd}.
     *
     * @param ctx the parse tree
     */
    void enterAirportEnd(@NotNull CompParser.AirportEndContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#airportEnd}.
     *
     * @param ctx the parse tree
     */
    void exitAirportEnd(@NotNull CompParser.AirportEndContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#airportRegion}.
     *
     * @param ctx the parse tree
     */
    void enterAirportRegion(@NotNull CompParser.AirportRegionContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#airportRegion}.
     *
     * @param ctx the parse tree
     */
    void exitAirportRegion(@NotNull CompParser.AirportRegionContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#airportCountry}.
     *
     * @param ctx the parse tree
     */
    void enterAirportCountry(@NotNull CompParser.AirportCountryContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#airportCountry}.
     *
     * @param ctx the parse tree
     */
    void exitAirportCountry(@NotNull CompParser.AirportCountryContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#airportState}.
     *
     * @param ctx the parse tree
     */
    void enterAirportState(@NotNull CompParser.AirportStateContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#airportState}.
     *
     * @param ctx the parse tree
     */
    void exitAirportState(@NotNull CompParser.AirportStateContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#airportCity}.
     *
     * @param ctx the parse tree
     */
    void enterAirportCity(@NotNull CompParser.AirportCityContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#airportCity}.
     *
     * @param ctx the parse tree
     */
    void exitAirportCity(@NotNull CompParser.AirportCityContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#airportName}.
     *
     * @param ctx the parse tree
     */
    void enterAirportName(@NotNull CompParser.AirportNameContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#airportName}.
     *
     * @param ctx the parse tree
     */
    void exitAirportName(@NotNull CompParser.AirportNameContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#airportMagvar}.
     *
     * @param ctx the parse tree
     */
    void enterAirportMagvar(@NotNull CompParser.AirportMagvarContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#airportMagvar}.
     *
     * @param ctx the parse tree
     */
    void exitAirportMagvar(@NotNull CompParser.AirportMagvarContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#airportTrafficScalar}.
     *
     * @param ctx the parse tree
     */
    void enterAirportTrafficScalar(@NotNull CompParser.AirportTrafficScalarContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#airportTrafficScalar}.
     *
     * @param ctx the parse tree
     */
    void exitAirportTrafficScalar(@NotNull CompParser.AirportTrafficScalarContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#airportTestRadius}.
     *
     * @param ctx the parse tree
     */
    void enterAirportTestRadius(@NotNull CompParser.AirportTestRadiusContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#airportTestRadius}.
     *
     * @param ctx the parse tree
     */
    void exitAirportTestRadius(@NotNull CompParser.AirportTestRadiusContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#airportIdent}.
     *
     * @param ctx the parse tree
     */
    void enterAirportIdent(@NotNull CompParser.AirportIdentContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#airportIdent}.
     *
     * @param ctx the parse tree
     */
    void exitAirportIdent(@NotNull CompParser.AirportIdentContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#tower}.
     *
     * @param ctx the parse tree
     */
    void enterTower(@NotNull CompParser.TowerContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#tower}.
     *
     * @param ctx the parse tree
     */
    void exitTower(@NotNull CompParser.TowerContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#towerBegin}.
     *
     * @param ctx the parse tree
     */
    void enterTowerBegin(@NotNull CompParser.TowerBeginContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#towerBegin}.
     *
     * @param ctx the parse tree
     */
    void exitTowerBegin(@NotNull CompParser.TowerBeginContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#towerEnd}.
     *
     * @param ctx the parse tree
     */
    void enterTowerEnd(@NotNull CompParser.TowerEndContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#towerEnd}.
     *
     * @param ctx the parse tree
     */
    void exitTowerEnd(@NotNull CompParser.TowerEndContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#services}.
     *
     * @param ctx the parse tree
     */
    void enterServices(@NotNull CompParser.ServicesContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#services}.
     *
     * @param ctx the parse tree
     */
    void exitServices(@NotNull CompParser.ServicesContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#fuel}.
     *
     * @param ctx the parse tree
     */
    void enterFuel(@NotNull CompParser.FuelContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#fuel}.
     *
     * @param ctx the parse tree
     */
    void exitFuel(@NotNull CompParser.FuelContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#fuelType}.
     *
     * @param ctx the parse tree
     */
    void enterFuelType(@NotNull CompParser.FuelTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#fuelType}.
     *
     * @param ctx the parse tree
     */
    void exitFuelType(@NotNull CompParser.FuelTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#fuelAvailability}.
     *
     * @param ctx the parse tree
     */
    void enterFuelAvailability(@NotNull CompParser.FuelAvailabilityContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#fuelAvailability}.
     *
     * @param ctx the parse tree
     */
    void exitFuelAvailability(@NotNull CompParser.FuelAvailabilityContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#runway}.
     *
     * @param ctx the parse tree
     */
    void enterRunway(@NotNull CompParser.RunwayContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#runway}.
     *
     * @param ctx the parse tree
     */
    void exitRunway(@NotNull CompParser.RunwayContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#runwayBegin}.
     *
     * @param ctx the parse tree
     */
    void enterRunwayBegin(@NotNull CompParser.RunwayBeginContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#runwayBegin}.
     *
     * @param ctx the parse tree
     */
    void exitRunwayBegin(@NotNull CompParser.RunwayBeginContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#runwayChildren}.
     *
     * @param ctx the parse tree
     */
    void enterRunwayChildren(@NotNull CompParser.RunwayChildrenContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#runwayChildren}.
     *
     * @param ctx the parse tree
     */
    void exitRunwayChildren(@NotNull CompParser.RunwayChildrenContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#runwayEnd}.
     *
     * @param ctx the parse tree
     */
    void enterRunwayEnd(@NotNull CompParser.RunwayEndContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#runwayEnd}.
     *
     * @param ctx the parse tree
     */
    void exitRunwayEnd(@NotNull CompParser.RunwayEndContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#surface}.
     *
     * @param ctx the parse tree
     */
    void enterSurface(@NotNull CompParser.SurfaceContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#surface}.
     *
     * @param ctx the parse tree
     */
    void exitSurface(@NotNull CompParser.SurfaceContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#heading}.
     *
     * @param ctx the parse tree
     */
    void enterHeading(@NotNull CompParser.HeadingContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#heading}.
     *
     * @param ctx the parse tree
     */
    void exitHeading(@NotNull CompParser.HeadingContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#number}.
     *
     * @param ctx the parse tree
     */
    void enterNumber(@NotNull CompParser.NumberContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#number}.
     *
     * @param ctx the parse tree
     */
    void exitNumber(@NotNull CompParser.NumberContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#designator}.
     *
     * @param ctx the parse tree
     */
    void enterDesignator(@NotNull CompParser.DesignatorContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#designator}.
     *
     * @param ctx the parse tree
     */
    void exitDesignator(@NotNull CompParser.DesignatorContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#patternAlt}.
     *
     * @param ctx the parse tree
     */
    void enterPatternAlt(@NotNull CompParser.PatternAltContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#patternAlt}.
     *
     * @param ctx the parse tree
     */
    void exitPatternAlt(@NotNull CompParser.PatternAltContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#primaryTakeoff}.
     *
     * @param ctx the parse tree
     */
    void enterPrimaryTakeoff(@NotNull CompParser.PrimaryTakeoffContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#primaryTakeoff}.
     *
     * @param ctx the parse tree
     */
    void exitPrimaryTakeoff(@NotNull CompParser.PrimaryTakeoffContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#primaryLanding}.
     *
     * @param ctx the parse tree
     */
    void enterPrimaryLanding(@NotNull CompParser.PrimaryLandingContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#primaryLanding}.
     *
     * @param ctx the parse tree
     */
    void exitPrimaryLanding(@NotNull CompParser.PrimaryLandingContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#primaryPattern}.
     *
     * @param ctx the parse tree
     */
    void enterPrimaryPattern(@NotNull CompParser.PrimaryPatternContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#primaryPattern}.
     *
     * @param ctx the parse tree
     */
    void exitPrimaryPattern(@NotNull CompParser.PrimaryPatternContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#secondaryTakeoff}.
     *
     * @param ctx the parse tree
     */
    void enterSecondaryTakeoff(@NotNull CompParser.SecondaryTakeoffContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#secondaryTakeoff}.
     *
     * @param ctx the parse tree
     */
    void exitSecondaryTakeoff(@NotNull CompParser.SecondaryTakeoffContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#secondaryLanding}.
     *
     * @param ctx the parse tree
     */
    void enterSecondaryLanding(@NotNull CompParser.SecondaryLandingContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#secondaryLanding}.
     *
     * @param ctx the parse tree
     */
    void exitSecondaryLanding(@NotNull CompParser.SecondaryLandingContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#secondaryPattern}.
     *
     * @param ctx the parse tree
     */
    void enterSecondaryPattern(@NotNull CompParser.SecondaryPatternContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#secondaryPattern}.
     *
     * @param ctx the parse tree
     */
    void exitSecondaryPattern(@NotNull CompParser.SecondaryPatternContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#markings}.
     *
     * @param ctx the parse tree
     */
    void enterMarkings(@NotNull CompParser.MarkingsContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#markings}.
     *
     * @param ctx the parse tree
     */
    void exitMarkings(@NotNull CompParser.MarkingsContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#alternateThreshold}.
     *
     * @param ctx the parse tree
     */
    void enterAlternateThreshold(@NotNull CompParser.AlternateThresholdContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#alternateThreshold}.
     *
     * @param ctx the parse tree
     */
    void exitAlternateThreshold(@NotNull CompParser.AlternateThresholdContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#alternateTouchdown}.
     *
     * @param ctx the parse tree
     */
    void enterAlternateTouchdown(@NotNull CompParser.AlternateTouchdownContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#alternateTouchdown}.
     *
     * @param ctx the parse tree
     */
    void exitAlternateTouchdown(@NotNull CompParser.AlternateTouchdownContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#alternateFixedDistance}.
     *
     * @param ctx the parse tree
     */
    void enterAlternateFixedDistance(@NotNull CompParser.AlternateFixedDistanceContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#alternateFixedDistance}.
     *
     * @param ctx the parse tree
     */
    void exitAlternateFixedDistance(@NotNull CompParser.AlternateFixedDistanceContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#alternatePrecision}.
     *
     * @param ctx the parse tree
     */
    void enterAlternatePrecision(@NotNull CompParser.AlternatePrecisionContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#alternatePrecision}.
     *
     * @param ctx the parse tree
     */
    void exitAlternatePrecision(@NotNull CompParser.AlternatePrecisionContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#leadingZeroIdent}.
     *
     * @param ctx the parse tree
     */
    void enterLeadingZeroIdent(@NotNull CompParser.LeadingZeroIdentContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#leadingZeroIdent}.
     *
     * @param ctx the parse tree
     */
    void exitLeadingZeroIdent(@NotNull CompParser.LeadingZeroIdentContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#noThresholdEndArrows}.
     *
     * @param ctx the parse tree
     */
    void enterNoThresholdEndArrows(@NotNull CompParser.NoThresholdEndArrowsContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#noThresholdEndArrows}.
     *
     * @param ctx the parse tree
     */
    void exitNoThresholdEndArrows(@NotNull CompParser.NoThresholdEndArrowsContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#edges}.
     *
     * @param ctx the parse tree
     */
    void enterEdges(@NotNull CompParser.EdgesContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#edges}.
     *
     * @param ctx the parse tree
     */
    void exitEdges(@NotNull CompParser.EdgesContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#threshold}.
     *
     * @param ctx the parse tree
     */
    void enterThreshold(@NotNull CompParser.ThresholdContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#threshold}.
     *
     * @param ctx the parse tree
     */
    void exitThreshold(@NotNull CompParser.ThresholdContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#fixedDistance}.
     *
     * @param ctx the parse tree
     */
    void enterFixedDistance(@NotNull CompParser.FixedDistanceContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#fixedDistance}.
     *
     * @param ctx the parse tree
     */
    void exitFixedDistance(@NotNull CompParser.FixedDistanceContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#touchdown}.
     *
     * @param ctx the parse tree
     */
    void enterTouchdown(@NotNull CompParser.TouchdownContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#touchdown}.
     *
     * @param ctx the parse tree
     */
    void exitTouchdown(@NotNull CompParser.TouchdownContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#dashes}.
     *
     * @param ctx the parse tree
     */
    void enterDashes(@NotNull CompParser.DashesContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#dashes}.
     *
     * @param ctx the parse tree
     */
    void exitDashes(@NotNull CompParser.DashesContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#ident}.
     *
     * @param ctx the parse tree
     */
    void enterIdent(@NotNull CompParser.IdentContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#ident}.
     *
     * @param ctx the parse tree
     */
    void exitIdent(@NotNull CompParser.IdentContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#precision}.
     *
     * @param ctx the parse tree
     */
    void enterPrecision(@NotNull CompParser.PrecisionContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#precision}.
     *
     * @param ctx the parse tree
     */
    void exitPrecision(@NotNull CompParser.PrecisionContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#edgePavement}.
     *
     * @param ctx the parse tree
     */
    void enterEdgePavement(@NotNull CompParser.EdgePavementContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#edgePavement}.
     *
     * @param ctx the parse tree
     */
    void exitEdgePavement(@NotNull CompParser.EdgePavementContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#singleEnd}.
     *
     * @param ctx the parse tree
     */
    void enterSingleEnd(@NotNull CompParser.SingleEndContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#singleEnd}.
     *
     * @param ctx the parse tree
     */
    void exitSingleEnd(@NotNull CompParser.SingleEndContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#primaryClosed}.
     *
     * @param ctx the parse tree
     */
    void enterPrimaryClosed(@NotNull CompParser.PrimaryClosedContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#primaryClosed}.
     *
     * @param ctx the parse tree
     */
    void exitPrimaryClosed(@NotNull CompParser.PrimaryClosedContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#secondaryClosed}.
     *
     * @param ctx the parse tree
     */
    void enterSecondaryClosed(@NotNull CompParser.SecondaryClosedContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#secondaryClosed}.
     *
     * @param ctx the parse tree
     */
    void exitSecondaryClosed(@NotNull CompParser.SecondaryClosedContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#primaryStol}.
     *
     * @param ctx the parse tree
     */
    void enterPrimaryStol(@NotNull CompParser.PrimaryStolContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#primaryStol}.
     *
     * @param ctx the parse tree
     */
    void exitPrimaryStol(@NotNull CompParser.PrimaryStolContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#secondaryStol}.
     *
     * @param ctx the parse tree
     */
    void enterSecondaryStol(@NotNull CompParser.SecondaryStolContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#secondaryStol}.
     *
     * @param ctx the parse tree
     */
    void exitSecondaryStol(@NotNull CompParser.SecondaryStolContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#lights}.
     *
     * @param ctx the parse tree
     */
    void enterLights(@NotNull CompParser.LightsContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#lights}.
     *
     * @param ctx the parse tree
     */
    void exitLights(@NotNull CompParser.LightsContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#lightsCenter}.
     *
     * @param ctx the parse tree
     */
    void enterLightsCenter(@NotNull CompParser.LightsCenterContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#lightsCenter}.
     *
     * @param ctx the parse tree
     */
    void exitLightsCenter(@NotNull CompParser.LightsCenterContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#lightsEdge}.
     *
     * @param ctx the parse tree
     */
    void enterLightsEdge(@NotNull CompParser.LightsEdgeContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#lightsEdge}.
     *
     * @param ctx the parse tree
     */
    void exitLightsEdge(@NotNull CompParser.LightsEdgeContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#lightsRed}.
     *
     * @param ctx the parse tree
     */
    void enterLightsRed(@NotNull CompParser.LightsRedContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#lightsRed}.
     *
     * @param ctx the parse tree
     */
    void exitLightsRed(@NotNull CompParser.LightsRedContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#helipad}.
     *
     * @param ctx the parse tree
     */
    void enterHelipad(@NotNull CompParser.HelipadContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#helipad}.
     *
     * @param ctx the parse tree
     */
    void exitHelipad(@NotNull CompParser.HelipadContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#helipadType}.
     *
     * @param ctx the parse tree
     */
    void enterHelipadType(@NotNull CompParser.HelipadTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#helipadType}.
     *
     * @param ctx the parse tree
     */
    void exitHelipadType(@NotNull CompParser.HelipadTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#closed}.
     *
     * @param ctx the parse tree
     */
    void enterClosed(@NotNull CompParser.ClosedContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#closed}.
     *
     * @param ctx the parse tree
     */
    void exitClosed(@NotNull CompParser.ClosedContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#transparent}.
     *
     * @param ctx the parse tree
     */
    void enterTransparent(@NotNull CompParser.TransparentContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#transparent}.
     *
     * @param ctx the parse tree
     */
    void exitTransparent(@NotNull CompParser.TransparentContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#com}.
     *
     * @param ctx the parse tree
     */
    void enterCom(@NotNull CompParser.ComContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#com}.
     *
     * @param ctx the parse tree
     */
    void exitCom(@NotNull CompParser.ComContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#comFrequency}.
     *
     * @param ctx the parse tree
     */
    void enterComFrequency(@NotNull CompParser.ComFrequencyContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#comFrequency}.
     *
     * @param ctx the parse tree
     */
    void exitComFrequency(@NotNull CompParser.ComFrequencyContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#comType}.
     *
     * @param ctx the parse tree
     */
    void enterComType(@NotNull CompParser.ComTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#comType}.
     *
     * @param ctx the parse tree
     */
    void exitComType(@NotNull CompParser.ComTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#comName}.
     *
     * @param ctx the parse tree
     */
    void enterComName(@NotNull CompParser.ComNameContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#comName}.
     *
     * @param ctx the parse tree
     */
    void exitComName(@NotNull CompParser.ComNameContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#taxiwayPoint}.
     *
     * @param ctx the parse tree
     */
    void enterTaxiwayPoint(@NotNull CompParser.TaxiwayPointContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#taxiwayPoint}.
     *
     * @param ctx the parse tree
     */
    void exitTaxiwayPoint(@NotNull CompParser.TaxiwayPointContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#taxiwayPointerType}.
     *
     * @param ctx the parse tree
     */
    void enterTaxiwayPointerType(@NotNull CompParser.TaxiwayPointerTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#taxiwayPointerType}.
     *
     * @param ctx the parse tree
     */
    void exitTaxiwayPointerType(@NotNull CompParser.TaxiwayPointerTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#orientation}.
     *
     * @param ctx the parse tree
     */
    void enterOrientation(@NotNull CompParser.OrientationContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#orientation}.
     *
     * @param ctx the parse tree
     */
    void exitOrientation(@NotNull CompParser.OrientationContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#taxiwayParking}.
     *
     * @param ctx the parse tree
     */
    void enterTaxiwayParking(@NotNull CompParser.TaxiwayParkingContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#taxiwayParking}.
     *
     * @param ctx the parse tree
     */
    void exitTaxiwayParking(@NotNull CompParser.TaxiwayParkingContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#radius}.
     *
     * @param ctx the parse tree
     */
    void enterRadius(@NotNull CompParser.RadiusContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#radius}.
     *
     * @param ctx the parse tree
     */
    void exitRadius(@NotNull CompParser.RadiusContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#taxiwayParkingType}.
     *
     * @param ctx the parse tree
     */
    void enterTaxiwayParkingType(@NotNull CompParser.TaxiwayParkingTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#taxiwayParkingType}.
     *
     * @param ctx the parse tree
     */
    void exitTaxiwayParkingType(@NotNull CompParser.TaxiwayParkingTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#name}.
     *
     * @param ctx the parse tree
     */
    void enterName(@NotNull CompParser.NameContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#name}.
     *
     * @param ctx the parse tree
     */
    void exitName(@NotNull CompParser.NameContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#pushBack}.
     *
     * @param ctx the parse tree
     */
    void enterPushBack(@NotNull CompParser.PushBackContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#pushBack}.
     *
     * @param ctx the parse tree
     */
    void exitPushBack(@NotNull CompParser.PushBackContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#taxiName}.
     *
     * @param ctx the parse tree
     */
    void enterTaxiName(@NotNull CompParser.TaxiNameContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#taxiName}.
     *
     * @param ctx the parse tree
     */
    void exitTaxiName(@NotNull CompParser.TaxiNameContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#taxiNameName}.
     *
     * @param ctx the parse tree
     */
    void enterTaxiNameName(@NotNull CompParser.TaxiNameNameContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#taxiNameName}.
     *
     * @param ctx the parse tree
     */
    void exitTaxiNameName(@NotNull CompParser.TaxiNameNameContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#taxiPath}.
     *
     * @param ctx the parse tree
     */
    void enterTaxiPath(@NotNull CompParser.TaxiPathContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#taxiPath}.
     *
     * @param ctx the parse tree
     */
    void exitTaxiPath(@NotNull CompParser.TaxiPathContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#taxiPathType}.
     *
     * @param ctx the parse tree
     */
    void enterTaxiPathType(@NotNull CompParser.TaxiPathTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#taxiPathType}.
     *
     * @param ctx the parse tree
     */
    void exitTaxiPathType(@NotNull CompParser.TaxiPathTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#taxiPathStart}.
     *
     * @param ctx the parse tree
     */
    void enterTaxiPathStart(@NotNull CompParser.TaxiPathStartContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#taxiPathStart}.
     *
     * @param ctx the parse tree
     */
    void exitTaxiPathStart(@NotNull CompParser.TaxiPathStartContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#taxiPathEnd}.
     *
     * @param ctx the parse tree
     */
    void enterTaxiPathEnd(@NotNull CompParser.TaxiPathEndContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#taxiPathEnd}.
     *
     * @param ctx the parse tree
     */
    void exitTaxiPathEnd(@NotNull CompParser.TaxiPathEndContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#taxiPathWeightLimit}.
     *
     * @param ctx the parse tree
     */
    void enterTaxiPathWeightLimit(@NotNull CompParser.TaxiPathWeightLimitContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#taxiPathWeightLimit}.
     *
     * @param ctx the parse tree
     */
    void exitTaxiPathWeightLimit(@NotNull CompParser.TaxiPathWeightLimitContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#taxiPathDrawSurface}.
     *
     * @param ctx the parse tree
     */
    void enterTaxiPathDrawSurface(@NotNull CompParser.TaxiPathDrawSurfaceContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#taxiPathDrawSurface}.
     *
     * @param ctx the parse tree
     */
    void exitTaxiPathDrawSurface(@NotNull CompParser.TaxiPathDrawSurfaceContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#taxiPathDrawDetail}.
     *
     * @param ctx the parse tree
     */
    void enterTaxiPathDrawDetail(@NotNull CompParser.TaxiPathDrawDetailContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#taxiPathDrawDetail}.
     *
     * @param ctx the parse tree
     */
    void exitTaxiPathDrawDetail(@NotNull CompParser.TaxiPathDrawDetailContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#taxiPathCenterLine}.
     *
     * @param ctx the parse tree
     */
    void enterTaxiPathCenterLine(@NotNull CompParser.TaxiPathCenterLineContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#taxiPathCenterLine}.
     *
     * @param ctx the parse tree
     */
    void exitTaxiPathCenterLine(@NotNull CompParser.TaxiPathCenterLineContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#taxiPathCenterLineLighted}.
     *
     * @param ctx the parse tree
     */
    void enterTaxiPathCenterLineLighted(@NotNull CompParser.TaxiPathCenterLineLightedContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#taxiPathCenterLineLighted}.
     *
     * @param ctx the parse tree
     */
    void exitTaxiPathCenterLineLighted(@NotNull CompParser.TaxiPathCenterLineLightedContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#taxiPathLeftEdge}.
     *
     * @param ctx the parse tree
     */
    void enterTaxiPathLeftEdge(@NotNull CompParser.TaxiPathLeftEdgeContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#taxiPathLeftEdge}.
     *
     * @param ctx the parse tree
     */
    void exitTaxiPathLeftEdge(@NotNull CompParser.TaxiPathLeftEdgeContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#taxiPathLeftEdgeLigthed}.
     *
     * @param ctx the parse tree
     */
    void enterTaxiPathLeftEdgeLigthed(@NotNull CompParser.TaxiPathLeftEdgeLigthedContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#taxiPathLeftEdgeLigthed}.
     *
     * @param ctx the parse tree
     */
    void exitTaxiPathLeftEdgeLigthed(@NotNull CompParser.TaxiPathLeftEdgeLigthedContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#taxiPathRightEdge}.
     *
     * @param ctx the parse tree
     */
    void enterTaxiPathRightEdge(@NotNull CompParser.TaxiPathRightEdgeContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#taxiPathRightEdge}.
     *
     * @param ctx the parse tree
     */
    void exitTaxiPathRightEdge(@NotNull CompParser.TaxiPathRightEdgeContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#taxiPathRightEdgeLighted}.
     *
     * @param ctx the parse tree
     */
    void enterTaxiPathRightEdgeLighted(@NotNull CompParser.TaxiPathRightEdgeLightedContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#taxiPathRightEdgeLighted}.
     *
     * @param ctx the parse tree
     */
    void exitTaxiPathRightEdgeLighted(@NotNull CompParser.TaxiPathRightEdgeLightedContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#taxiPathNumber}.
     *
     * @param ctx the parse tree
     */
    void enterTaxiPathNumber(@NotNull CompParser.TaxiPathNumberContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#taxiPathNumber}.
     *
     * @param ctx the parse tree
     */
    void exitTaxiPathNumber(@NotNull CompParser.TaxiPathNumberContext ctx);

    /**
     * Enter a parse tree produced by {@link CompParser#taxiPathName}.
     *
     * @param ctx the parse tree
     */
    void enterTaxiPathName(@NotNull CompParser.TaxiPathNameContext ctx);

    /**
     * Exit a parse tree produced by {@link CompParser#taxiPathName}.
     *
     * @param ctx the parse tree
     */
    void exitTaxiPathName(@NotNull CompParser.TaxiPathNameContext ctx);
}