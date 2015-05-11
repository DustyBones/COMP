// Generated from C:/Users/Tiago/Documents/git/COMP\Comp.g4 by ANTLR 4.5

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CompParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface CompVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link CompParser#start}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStart(@NotNull CompParser.StartContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#latitude}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLatitude(@NotNull CompParser.LatitudeContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#longitude}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLongitude(@NotNull CompParser.LongitudeContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#altitude}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAltitude(@NotNull CompParser.AltitudeContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#length}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLength(@NotNull CompParser.LengthContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#width}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWidth(@NotNull CompParser.WidthContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#index}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIndex(@NotNull CompParser.IndexContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#biasX}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBiasX(@NotNull CompParser.BiasXContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#biasZ}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBiasZ(@NotNull CompParser.BiasZContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#airport}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAirport(@NotNull CompParser.AirportContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#airportBegin}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAirportBegin(@NotNull CompParser.AirportBeginContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#airportChildren}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAirportChildren(@NotNull CompParser.AirportChildrenContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#airportEnd}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAirportEnd(@NotNull CompParser.AirportEndContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#airportRegion}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAirportRegion(@NotNull CompParser.AirportRegionContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#airportCountry}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAirportCountry(@NotNull CompParser.AirportCountryContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#airportState}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAirportState(@NotNull CompParser.AirportStateContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#airportCity}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAirportCity(@NotNull CompParser.AirportCityContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#airportName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAirportName(@NotNull CompParser.AirportNameContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#airportMagvar}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAirportMagvar(@NotNull CompParser.AirportMagvarContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#airportTrafficScalar}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAirportTrafficScalar(@NotNull CompParser.AirportTrafficScalarContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#airportTestRadius}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAirportTestRadius(@NotNull CompParser.AirportTestRadiusContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#airportIdent}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAirportIdent(@NotNull CompParser.AirportIdentContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#tower}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTower(@NotNull CompParser.TowerContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#towerBegin}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTowerBegin(@NotNull CompParser.TowerBeginContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#towerEnd}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTowerEnd(@NotNull CompParser.TowerEndContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#services}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitServices(@NotNull CompParser.ServicesContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#fuel}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFuel(@NotNull CompParser.FuelContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#fuelType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFuelType(@NotNull CompParser.FuelTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#fuelAvailability}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFuelAvailability(@NotNull CompParser.FuelAvailabilityContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#runway}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRunway(@NotNull CompParser.RunwayContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#runwayBegin}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRunwayBegin(@NotNull CompParser.RunwayBeginContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#runwayChildren}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRunwayChildren(@NotNull CompParser.RunwayChildrenContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#runwayEnd}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRunwayEnd(@NotNull CompParser.RunwayEndContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#surface}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSurface(@NotNull CompParser.SurfaceContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#heading}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHeading(@NotNull CompParser.HeadingContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNumber(@NotNull CompParser.NumberContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#designator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDesignator(@NotNull CompParser.DesignatorContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#patternAlt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPatternAlt(@NotNull CompParser.PatternAltContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#primaryTakeoff}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrimaryTakeoff(@NotNull CompParser.PrimaryTakeoffContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#primaryLanding}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrimaryLanding(@NotNull CompParser.PrimaryLandingContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#primaryPattern}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrimaryPattern(@NotNull CompParser.PrimaryPatternContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#secondaryTakeoff}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSecondaryTakeoff(@NotNull CompParser.SecondaryTakeoffContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#secondaryLanding}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSecondaryLanding(@NotNull CompParser.SecondaryLandingContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#secondaryPattern}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSecondaryPattern(@NotNull CompParser.SecondaryPatternContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#markings}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMarkings(@NotNull CompParser.MarkingsContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#alternateThreshold}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlternateThreshold(@NotNull CompParser.AlternateThresholdContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#alternateTouchdown}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlternateTouchdown(@NotNull CompParser.AlternateTouchdownContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#alternateFixedDistance}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlternateFixedDistance(@NotNull CompParser.AlternateFixedDistanceContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#alternatePrecision}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlternatePrecision(@NotNull CompParser.AlternatePrecisionContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#leadingZeroIdent}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLeadingZeroIdent(@NotNull CompParser.LeadingZeroIdentContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#noThresholdEndArrows}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNoThresholdEndArrows(@NotNull CompParser.NoThresholdEndArrowsContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#edges}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEdges(@NotNull CompParser.EdgesContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#threshold}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitThreshold(@NotNull CompParser.ThresholdContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#fixedDistance}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFixedDistance(@NotNull CompParser.FixedDistanceContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#touchdown}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTouchdown(@NotNull CompParser.TouchdownContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#dashes}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDashes(@NotNull CompParser.DashesContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#ident}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdent(@NotNull CompParser.IdentContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#precision}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrecision(@NotNull CompParser.PrecisionContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#edgePavement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEdgePavement(@NotNull CompParser.EdgePavementContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#singleEnd}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSingleEnd(@NotNull CompParser.SingleEndContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#primaryClosed}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrimaryClosed(@NotNull CompParser.PrimaryClosedContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#secondaryClosed}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSecondaryClosed(@NotNull CompParser.SecondaryClosedContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#primaryStol}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrimaryStol(@NotNull CompParser.PrimaryStolContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#secondaryStol}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSecondaryStol(@NotNull CompParser.SecondaryStolContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#lights}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLights(@NotNull CompParser.LightsContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#lightsCenter}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLightsCenter(@NotNull CompParser.LightsCenterContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#lightsEdge}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLightsEdge(@NotNull CompParser.LightsEdgeContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#lightsRed}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLightsRed(@NotNull CompParser.LightsRedContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#helipad}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHelipad(@NotNull CompParser.HelipadContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#helipadType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHelipadType(@NotNull CompParser.HelipadTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#closed}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitClosed(@NotNull CompParser.ClosedContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#transparent}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTransparent(@NotNull CompParser.TransparentContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#com}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCom(@NotNull CompParser.ComContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#comFrequency}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitComFrequency(@NotNull CompParser.ComFrequencyContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#comType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitComType(@NotNull CompParser.ComTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#comName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitComName(@NotNull CompParser.ComNameContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#taxiwayPoint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTaxiwayPoint(@NotNull CompParser.TaxiwayPointContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#taxiwayPointerType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTaxiwayPointerType(@NotNull CompParser.TaxiwayPointerTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#orientation}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOrientation(@NotNull CompParser.OrientationContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#taxiwayParking}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTaxiwayParking(@NotNull CompParser.TaxiwayParkingContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#radius}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRadius(@NotNull CompParser.RadiusContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#taxiwayParkingType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTaxiwayParkingType(@NotNull CompParser.TaxiwayParkingTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#name}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitName(@NotNull CompParser.NameContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#pushBack}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPushBack(@NotNull CompParser.PushBackContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#taxiName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTaxiName(@NotNull CompParser.TaxiNameContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#taxiNameName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTaxiNameName(@NotNull CompParser.TaxiNameNameContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#taxiPath}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTaxiPath(@NotNull CompParser.TaxiPathContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#taxiPathType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTaxiPathType(@NotNull CompParser.TaxiPathTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#taxiPathStart}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTaxiPathStart(@NotNull CompParser.TaxiPathStartContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#taxiPathEnd}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTaxiPathEnd(@NotNull CompParser.TaxiPathEndContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#taxiPathWeightLimit}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTaxiPathWeightLimit(@NotNull CompParser.TaxiPathWeightLimitContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#taxiPathDrawSurface}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTaxiPathDrawSurface(@NotNull CompParser.TaxiPathDrawSurfaceContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#taxiPathDrawDetail}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTaxiPathDrawDetail(@NotNull CompParser.TaxiPathDrawDetailContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#taxiPathCenterLine}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTaxiPathCenterLine(@NotNull CompParser.TaxiPathCenterLineContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#taxiPathCenterLineLighted}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTaxiPathCenterLineLighted(@NotNull CompParser.TaxiPathCenterLineLightedContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#taxiPathLeftEdge}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTaxiPathLeftEdge(@NotNull CompParser.TaxiPathLeftEdgeContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#taxiPathLeftEdgeLigthed}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTaxiPathLeftEdgeLigthed(@NotNull CompParser.TaxiPathLeftEdgeLigthedContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#taxiPathRightEdge}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTaxiPathRightEdge(@NotNull CompParser.TaxiPathRightEdgeContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#taxiPathRightEdgeLighted}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTaxiPathRightEdgeLighted(@NotNull CompParser.TaxiPathRightEdgeLightedContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#taxiPathNumber}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTaxiPathNumber(@NotNull CompParser.TaxiPathNumberContext ctx);

    /**
     * Visit a parse tree produced by {@link CompParser#taxiPathName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTaxiPathName(@NotNull CompParser.TaxiPathNameContext ctx);
}