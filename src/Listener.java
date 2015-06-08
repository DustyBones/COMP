import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;

public class Listener extends CompBaseListener {
    @Override
    public void enterAirport(@NotNull CompParser.AirportContext ctx) {
        super.enterAirport(ctx);
    }

    @Override
    public void enterAirportBegin(@NotNull CompParser.AirportBeginContext ctx) {
        super.enterAirportBegin(ctx);
    }

    @Override
    public void enterAirportChildren(@NotNull CompParser.AirportChildrenContext ctx) {
        super.enterAirportChildren(ctx);
    }

    @Override
    public void enterAirportCity(@NotNull CompParser.AirportCityContext ctx) {
        super.enterAirportCity(ctx);
    }

    @Override
    public void enterAirportCountry(@NotNull CompParser.AirportCountryContext ctx) {
        super.enterAirportCountry(ctx);
    }

    @Override
    public void enterAirportEnd(@NotNull CompParser.AirportEndContext ctx) {
        super.enterAirportEnd(ctx);
    }

    @Override
    public void enterAirportIdent(@NotNull CompParser.AirportIdentContext ctx) {
        super.enterAirportIdent(ctx);
    }

    @Override
    public void enterAirportMagvar(@NotNull CompParser.AirportMagvarContext ctx) {
        super.enterAirportMagvar(ctx);
    }

    @Override
    public void enterAirportName(@NotNull CompParser.AirportNameContext ctx) {
        super.enterAirportName(ctx);
    }

    @Override
    public void enterAirportRegion(@NotNull CompParser.AirportRegionContext ctx) {
        super.enterAirportRegion(ctx);
    }

    @Override
    public void enterAirportState(@NotNull CompParser.AirportStateContext ctx) {
        super.enterAirportState(ctx);
    }

    @Override
    public void enterAirportTestRadius(@NotNull CompParser.AirportTestRadiusContext ctx) {
        super.enterAirportTestRadius(ctx);
    }

    @Override
    public void enterAirportTrafficScalar(@NotNull CompParser.AirportTrafficScalarContext ctx) {
        super.enterAirportTrafficScalar(ctx);
    }

    @Override
    public void enterAlternateFixedDistance(@NotNull CompParser.AlternateFixedDistanceContext ctx) {
        super.enterAlternateFixedDistance(ctx);
    }

    @Override
    public void enterAlternatePrecision(@NotNull CompParser.AlternatePrecisionContext ctx) {
        super.enterAlternatePrecision(ctx);
    }

    @Override
    public void enterAlternateThreshold(@NotNull CompParser.AlternateThresholdContext ctx) {
        super.enterAlternateThreshold(ctx);
    }

    @Override
    public void enterAlternateTouchdown(@NotNull CompParser.AlternateTouchdownContext ctx) {
        super.enterAlternateTouchdown(ctx);
    }

    @Override
    public void enterAltitude(@NotNull CompParser.AltitudeContext ctx) {
        super.enterAltitude(ctx);
    }

    @Override
    public void enterBiasX(@NotNull CompParser.BiasXContext ctx) {
        super.enterBiasX(ctx);
    }

    @Override
    public void enterBiasZ(@NotNull CompParser.BiasZContext ctx) {
        super.enterBiasZ(ctx);
    }

    @Override
    public void enterClosed(@NotNull CompParser.ClosedContext ctx) {
        super.enterClosed(ctx);
    }

    @Override
    public void enterCom(@NotNull CompParser.ComContext ctx) {
        super.enterCom(ctx);
    }

    @Override
    public void enterComFrequency(@NotNull CompParser.ComFrequencyContext ctx) {
        super.enterComFrequency(ctx);
    }

    @Override
    public void enterComName(@NotNull CompParser.ComNameContext ctx) {
        super.enterComName(ctx);
    }

    @Override
    public void enterComType(@NotNull CompParser.ComTypeContext ctx) {
        super.enterComType(ctx);
    }

    @Override
    public void enterDashes(@NotNull CompParser.DashesContext ctx) {
        super.enterDashes(ctx);
    }

    @Override
    public void enterDesignator(@NotNull CompParser.DesignatorContext ctx) {
        super.enterDesignator(ctx);
    }

    @Override
    public void enterEdgePavement(@NotNull CompParser.EdgePavementContext ctx) {
        super.enterEdgePavement(ctx);
    }

    @Override
    public void enterEdges(@NotNull CompParser.EdgesContext ctx) {
        super.enterEdges(ctx);
    }

    @Override
    public void enterEveryRule(@NotNull ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void enterFixedDistance(@NotNull CompParser.FixedDistanceContext ctx) {
        super.enterFixedDistance(ctx);
    }

    @Override
    public void enterFuel(@NotNull CompParser.FuelContext ctx) {
        super.enterFuel(ctx);
    }

    @Override
    public void enterFuelAvailability(@NotNull CompParser.FuelAvailabilityContext ctx) {
        super.enterFuelAvailability(ctx);
    }

    @Override
    public void enterFuelType(@NotNull CompParser.FuelTypeContext ctx) {
        super.enterFuelType(ctx);
    }

    @Override
    public void enterHeading(@NotNull CompParser.HeadingContext ctx) {
        super.enterHeading(ctx);
    }

    @Override
    public void enterHelipad(@NotNull CompParser.HelipadContext ctx) {
        super.enterHelipad(ctx);
    }

    @Override
    public void enterHelipadType(@NotNull CompParser.HelipadTypeContext ctx) {
        super.enterHelipadType(ctx);
    }

    @Override
    public void enterIdent(@NotNull CompParser.IdentContext ctx) {
        super.enterIdent(ctx);
    }

    @Override
    public void enterIndex(@NotNull CompParser.IndexContext ctx) {
        super.enterIndex(ctx);
    }

    @Override
    public void enterLatitude(@NotNull CompParser.LatitudeContext ctx) {
        super.enterLatitude(ctx);
        Double val = Double.parseDouble(ctx.getText().split("\"")[1]);
        if (val >= 90 || val <= -90)
            System.out.println("Error: Latitude value out of bounds! Expected value between -90 " +
                    "and 90 but got " + val);
    }

    @Override
    public void enterLeadingZeroIdent(@NotNull CompParser.LeadingZeroIdentContext ctx) {
        super.enterLeadingZeroIdent(ctx);
    }

    @Override
    public void enterLength(@NotNull CompParser.LengthContext ctx) {
        super.enterLength(ctx);
    }

    @Override
    public void enterLights(@NotNull CompParser.LightsContext ctx) {
        super.enterLights(ctx);
    }

    @Override
    public void enterLightsCenter(@NotNull CompParser.LightsCenterContext ctx) {
        super.enterLightsCenter(ctx);
    }

    @Override
    public void enterLightsEdge(@NotNull CompParser.LightsEdgeContext ctx) {
        super.enterLightsEdge(ctx);
    }

    @Override
    public void enterLightsRed(@NotNull CompParser.LightsRedContext ctx) {
        super.enterLightsRed(ctx);
    }

    @Override
    public void enterLongitude(@NotNull CompParser.LongitudeContext ctx) {
        super.enterLongitude(ctx);
    }

    @Override
    public void enterMarkings(@NotNull CompParser.MarkingsContext ctx) {
        super.enterMarkings(ctx);
    }

    @Override
    public void enterName(@NotNull CompParser.NameContext ctx) {
        super.enterName(ctx);
    }

    @Override
    public void enterNoThresholdEndArrows(@NotNull CompParser.NoThresholdEndArrowsContext ctx) {
        super.enterNoThresholdEndArrows(ctx);
    }

    @Override
    public void enterNumber(@NotNull CompParser.NumberContext ctx) {
        super.enterNumber(ctx);
    }

    @Override
    public void enterOrientation(@NotNull CompParser.OrientationContext ctx) {
        super.enterOrientation(ctx);
    }

    @Override
    public void enterPatternAlt(@NotNull CompParser.PatternAltContext ctx) {
        super.enterPatternAlt(ctx);
    }

    @Override
    public void enterPrecision(@NotNull CompParser.PrecisionContext ctx) {
        super.enterPrecision(ctx);
    }

    @Override
    public void enterPrimaryClosed(@NotNull CompParser.PrimaryClosedContext ctx) {
        super.enterPrimaryClosed(ctx);
    }

    @Override
    public void enterPrimaryLanding(@NotNull CompParser.PrimaryLandingContext ctx) {
        super.enterPrimaryLanding(ctx);
    }

    @Override
    public void enterPrimaryPattern(@NotNull CompParser.PrimaryPatternContext ctx) {
        super.enterPrimaryPattern(ctx);
    }

    @Override
    public void enterPrimaryStol(@NotNull CompParser.PrimaryStolContext ctx) {
        super.enterPrimaryStol(ctx);
    }

    @Override
    public void enterPrimaryTakeoff(@NotNull CompParser.PrimaryTakeoffContext ctx) {
        super.enterPrimaryTakeoff(ctx);
    }

    @Override
    public void enterPushBack(@NotNull CompParser.PushBackContext ctx) {
        super.enterPushBack(ctx);
    }

    @Override
    public void enterRadius(@NotNull CompParser.RadiusContext ctx) {
        super.enterRadius(ctx);
    }

    @Override
    public void enterRunway(@NotNull CompParser.RunwayContext ctx) {
        super.enterRunway(ctx);
    }

    @Override
    public void enterRunwayBegin(@NotNull CompParser.RunwayBeginContext ctx) {
        super.enterRunwayBegin(ctx);
    }

    @Override
    public void enterRunwayChildren(@NotNull CompParser.RunwayChildrenContext ctx) {
        super.enterRunwayChildren(ctx);
    }

    @Override
    public void enterRunwayEnd(@NotNull CompParser.RunwayEndContext ctx) {
        super.enterRunwayEnd(ctx);
    }

    @Override
    public void enterSecondaryClosed(@NotNull CompParser.SecondaryClosedContext ctx) {
        super.enterSecondaryClosed(ctx);
    }

    @Override
    public void enterSecondaryLanding(@NotNull CompParser.SecondaryLandingContext ctx) {
        super.enterSecondaryLanding(ctx);
    }

    @Override
    public void enterSecondaryPattern(@NotNull CompParser.SecondaryPatternContext ctx) {
        super.enterSecondaryPattern(ctx);
    }

    @Override
    public void enterSecondaryStol(@NotNull CompParser.SecondaryStolContext ctx) {
        super.enterSecondaryStol(ctx);
    }

    @Override
    public void enterSecondaryTakeoff(@NotNull CompParser.SecondaryTakeoffContext ctx) {
        super.enterSecondaryTakeoff(ctx);
    }

    @Override
    public void enterServices(@NotNull CompParser.ServicesContext ctx) {
        super.enterServices(ctx);
    }

    @Override
    public void enterSingleEnd(@NotNull CompParser.SingleEndContext ctx) {
        super.enterSingleEnd(ctx);
    }

    @Override
    public void enterStart(@NotNull CompParser.StartContext ctx) {
        super.enterStart(ctx);
    }

    @Override
    public void enterSurface(@NotNull CompParser.SurfaceContext ctx) {
        super.enterSurface(ctx);
    }

    @Override
    public void enterTaxiName(@NotNull CompParser.TaxiNameContext ctx) {
        super.enterTaxiName(ctx);
    }

    @Override
    public void enterTaxiNameName(@NotNull CompParser.TaxiNameNameContext ctx) {
        super.enterTaxiNameName(ctx);
    }

    @Override
    public void enterTaxiPath(@NotNull CompParser.TaxiPathContext ctx) {
        super.enterTaxiPath(ctx);
    }

    @Override
    public void enterTaxiPathCenterLine(@NotNull CompParser.TaxiPathCenterLineContext ctx) {
        super.enterTaxiPathCenterLine(ctx);
    }

    @Override
    public void enterTaxiPathCenterLineLighted(@NotNull CompParser.TaxiPathCenterLineLightedContext ctx) {
        super.enterTaxiPathCenterLineLighted(ctx);
    }

    @Override
    public void enterTaxiPathDrawDetail(@NotNull CompParser.TaxiPathDrawDetailContext ctx) {
        super.enterTaxiPathDrawDetail(ctx);
    }

    @Override
    public void enterTaxiPathDrawSurface(@NotNull CompParser.TaxiPathDrawSurfaceContext ctx) {
        super.enterTaxiPathDrawSurface(ctx);
    }

    @Override
    public void enterTaxiPathEnd(@NotNull CompParser.TaxiPathEndContext ctx) {
        super.enterTaxiPathEnd(ctx);
    }

    @Override
    public void enterTaxiPathLeftEdge(@NotNull CompParser.TaxiPathLeftEdgeContext ctx) {
        super.enterTaxiPathLeftEdge(ctx);
    }

    @Override
    public void enterTaxiPathLeftEdgeLigthed(@NotNull CompParser.TaxiPathLeftEdgeLigthedContext ctx) {
        super.enterTaxiPathLeftEdgeLigthed(ctx);
    }

    @Override
    public void enterTaxiPathName(@NotNull CompParser.TaxiPathNameContext ctx) {
        super.enterTaxiPathName(ctx);
    }

    @Override
    public void enterTaxiPathNumber(@NotNull CompParser.TaxiPathNumberContext ctx) {
        super.enterTaxiPathNumber(ctx);
    }

    @Override
    public void enterTaxiPathRightEdge(@NotNull CompParser.TaxiPathRightEdgeContext ctx) {
        super.enterTaxiPathRightEdge(ctx);
    }

    @Override
    public void enterTaxiPathRightEdgeLighted(@NotNull CompParser.TaxiPathRightEdgeLightedContext ctx) {
        super.enterTaxiPathRightEdgeLighted(ctx);
    }

    @Override
    public void enterTaxiPathStart(@NotNull CompParser.TaxiPathStartContext ctx) {
        super.enterTaxiPathStart(ctx);
    }

    @Override
    public void enterTaxiPathType(@NotNull CompParser.TaxiPathTypeContext ctx) {
        super.enterTaxiPathType(ctx);
    }

    @Override
    public void enterTaxiPathWeightLimit(@NotNull CompParser.TaxiPathWeightLimitContext ctx) {
        super.enterTaxiPathWeightLimit(ctx);
    }

    @Override
    public void enterTaxiwayParking(@NotNull CompParser.TaxiwayParkingContext ctx) {
        super.enterTaxiwayParking(ctx);
    }

    @Override
    public void enterTaxiwayParkingType(@NotNull CompParser.TaxiwayParkingTypeContext ctx) {
        super.enterTaxiwayParkingType(ctx);
    }

    @Override
    public void enterTaxiwayPoint(@NotNull CompParser.TaxiwayPointContext ctx) {
        super.enterTaxiwayPoint(ctx);
    }

    @Override
    public void enterTaxiwayPointerType(@NotNull CompParser.TaxiwayPointerTypeContext ctx) {
        super.enterTaxiwayPointerType(ctx);
    }

    @Override
    public void enterThreshold(@NotNull CompParser.ThresholdContext ctx) {
        super.enterThreshold(ctx);
    }

    @Override
    public void enterTouchdown(@NotNull CompParser.TouchdownContext ctx) {
        super.enterTouchdown(ctx);
    }

    @Override
    public void enterTower(@NotNull CompParser.TowerContext ctx) {
        super.enterTower(ctx);
    }

    @Override
    public void enterTowerBegin(@NotNull CompParser.TowerBeginContext ctx) {
        super.enterTowerBegin(ctx);
    }

    @Override
    public void enterTowerEnd(@NotNull CompParser.TowerEndContext ctx) {
        super.enterTowerEnd(ctx);
    }

    @Override
    public void enterTransparent(@NotNull CompParser.TransparentContext ctx) {
        super.enterTransparent(ctx);
    }

    @Override
    public void enterWidth(@NotNull CompParser.WidthContext ctx) {
        super.enterWidth(ctx);
    }
}
