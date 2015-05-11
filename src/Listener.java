public class Listener extends CompBaseListener {
    @Override
    public void enterLatitude(CompParser.LatitudeContext ctx) {
        String str = ctx.getText();
        Double val = Double.parseDouble(str.split("\"")[1]);
        if (val > 90 || val < -90)
            System.out.println("Latitude value out of bounds! Expected ]-90,90[ but got " + val);
    }

    @Override
    public void enterLongitude(CompParser.LongitudeContext ctx) {
        Double val = Double.parseDouble(ctx.getText().split("\"")[1]);
        if (val > 90 || val < -90)
            System.out.println("Longitude value out of bounds! Expected ]-180,180[ but got " + val);
    }

    @Override
    public void enterAirportIdent(CompParser.AirportIdentContext ctx) {
        String str = ctx.getText().split("\"")[1];
        if (str.length()>4)
            System.out.println("Identification token exceeds maximum size (4)!");
        else if (str.length()==0)
            System.out.println("Identification token is empty!");
    }
}
