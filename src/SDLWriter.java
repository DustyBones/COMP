import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import java.io.FileWriter;
import java.io.IOException;

public class SDLWriter {
    private Listener listener;
    private Document doc = null;
    private String filepath;
    private Namespace dcs = Namespace.getNamespace("dcs:scenario");

    public SDLWriter(String filepath, Listener listener) {
        this.filepath = filepath;
        this.listener = listener;
    }

    public void generate() {
        addScenario();
        writeSDL();
    }

    private void addScenario() {
        Element scenario = new Element("scenario", dcs);
        scenario.addNamespaceDeclaration(Namespace.getNamespace("dcs:scenario"));
        scenario.addNamespaceDeclaration(Namespace.getNamespace("xsd", "http://www.w3.org/2001/XMLSchema"));
        scenario.addNamespaceDeclaration(Namespace.getNamespace("xsi", "http://www.w3.org/2001/XMLSchema-instance"));
        doc = new Document(scenario);
        addScenarioChildren();
    }

    private void addScenarioChildren() {
        Element scenario = doc.getRootElement();
        Element bases = addBases();
        Element controllers = new Element("controllers", dcs);
        Element agentTypes = new Element("agentTypes", dcs);
        Element noFlyAreas = new Element("noFlyAreas", dcs);
        scenario.addContent(bases);
        scenario.addContent(controllers);
        scenario.addContent(agentTypes);
        scenario.addContent(noFlyAreas);
    }

    private Element addBases() {
        Element bases = new Element("bases", dcs);
        for (int i = 0; i < listener.getAirport().size(); i++) {
            Element baseOfOperations = new Element("baseOfOperations", dcs).setAttribute("id", "b" + (i + 1));
            baseOfOperations.addContent(new Element("name", dcs).addContent(listener.getAirport().get("airport_" +
                    i).get("name") + " base"));
            baseOfOperations.addContent(new Element("mobility", dcs).setAttribute("water", "true").setAttribute("underwater",
                    "false").setAttribute("land", "true").setAttribute("air", "true"));
            baseOfOperations.addContent(new Element("description", dcs).addContent("XXX Description XXX"));
            baseOfOperations.addContent(new Element("history", dcs).addContent("XXX history"));
            baseOfOperations.addContent(addContactPerson());
            baseOfOperations.addContent(addLocation(i));
            baseOfOperations.addContent(new Element("availability", dcs).setAttribute("available", "always"));
            baseOfOperations.addContent(addAirport(i));
            bases.addContent(baseOfOperations);
        }
        return bases;
    }

    private Element addContactPerson() {
        Element contactPerson = new Element("contactPerson", dcs);
        contactPerson.addContent(new Element("name", dcs).addContent("XXX Name XXX"));
        contactPerson.addContent(new Element("title", dcs).addContent("XXX Title XXX"));
        contactPerson.addContent(new Element("instituition", dcs).addContent("XxX Instituition XXX"));
        contactPerson.addContent(new Element("position", dcs).addContent("XXX Position XXX"));
        contactPerson.addContent(new Element("address", dcs).addContent("XXX Address XXX"));
        contactPerson.addContent(new Element("zipCode", dcs).addContent("XXX ZipCode XXX"));
        contactPerson.addContent(new Element("city", dcs).addContent("XXX City XXX"));
        contactPerson.addContent(new Element("stateDistrictRegion", dcs).addContent("XXX State XXX"));
        contactPerson.addContent(new Element("country", dcs).addContent("XXX Country XXX"));
        contactPerson.addContent(new Element("telephone", dcs).addContent("XXX Telephone XXX"));
        contactPerson.addContent(new Element("cellphone", dcs).addContent("XXX Cellphone XXX"));
        contactPerson.addContent(new Element("fax", dcs).addContent("XXX Fax XXX"));
        contactPerson.addContent(new Element("email", dcs).addContent("XXX email XXX"));

        return contactPerson;
    }

    private Element addLocation(int i) {
        Element location = new Element("location", dcs);
        location.addContent(new Element("address", dcs).addContent("xxxxxxxxxxxxx"));
        location.addContent(new Element("zipCode", dcs).addContent("xxxxxxxxxxxxx"));
        location.addContent(new Element("city", dcs).addContent(listener.getAirport().get("airport_" + i).get("city")));
        location.addContent(new Element("stateDistrictRegion", dcs).addContent(listener.getAirport().get
                ("airport_" + i).get("state")));
        location.addContent(new Element("country", dcs).addContent(listener.getAirport().get("airport_" + i).get("country")));
        location.addContent(addAirportCoordinates(i));
        return location;
    }

    private Element addAirportCoordinates(int i) {
        Element coordinates = new Element("coordinates", dcs);
        coordinates.addContent(new Element("latitude", dcs).addContent(parseCoord(listener.getAirport().get("airport_" + i).get
                ("latitude"), "lat")));
        coordinates.addContent(new Element("longitude", dcs).addContent(parseCoord(listener.getAirport().get("airport_" + i)
                .get("longitude"), "lon")));
        coordinates.addContent(new Element("altitude", dcs).setAttribute("measured", "amsl").addContent(
                listener.getAirport().get("airport_" + i).get("altitude")));
        return coordinates;
    }

    private Element addAirport(int i) {
        Element airport = new Element("aeroporto", dcs);
        airport.addContent(new Element("name", dcs).addContent(listener.getAirport().get("airport_" +
                i).get("name")));
        airport.addContent(addAirportCoordinates(i));
        airport.addContent(addContactPerson());
        airport.addContent(addLocation(i));
        airport.addContent(new Element("icao", dcs).addContent(listener.getAirport().get("airport_" +
                i).get("ICAO")));
        airport.addContent(new Element("iata", dcs).addContent(listener.getAirport().get("airport_" +
                i).get("IATA")));
        airport.addContent(new Element("magVar", dcs).addContent(listener.getAirport().get("airport_" +
                i).get("magVar")));
        airport.addContent(addRunways());
        airport.addContent(addHelipad(i));
        airport.addContent(new Element("taxiways", dcs).addContent("XXX taxiways XXX"));
        airport.addContent(new Element("parkingSpaces", dcs).addContent("XXX parking XXX"));
        airport.addContent(addUtil(i));
        return airport;
    }

    private Element addHelipad(int i) {
        Element helipads = new Element("helipads", dcs);
        for (int j = 0; j < listener.getHelipad().size(); j++) {
            if (listener.getHelipad().get(i + "_helipad_" + j) != null) {
                Element helipad = new Element("helipad", dcs);
                helipad.setAttribute("id", "h" + ((j + 1) < 10 ? "0" : "") + (j + 1));
                helipad.addContent(new Element("designator", dcs).addContent("Helipad"));
                helipad.addContent(new Element("surface", dcs).addContent(listener.getHelipad().get(i + "_helipad_" + j)
                        .get("surface")));
                Element coords = new Element("coordinates", dcs);
                coords.addContent(new Element("latitude", dcs).addContent(parseCoord(
                        listener.getHelipad().get(i + "_helipad_" + j).get("latitude"), "lat")));
                coords.addContent(new Element("longitude", dcs).addContent(parseCoord(
                        listener.getHelipad().get(i + "_helipad_" + j).get("longitude"), "lon")));
                coords.addContent(new Element("altitude", dcs).setAttribute("measured", "amsl").addContent(
                        listener.getHelipad().get(i + "_helipad_" + j).get("altitude")));
                helipad.addContent(new Element("radius", dcs).setAttribute("lengthUnit", "Meter").addContent(
                        listener.getHelipad().get(i + "_helipad_" + j).get("radius")));
            }
        }
        return helipads;
    }

    private Element addRunways() {
        Element runways = new Element("runways", dcs);
        runways.addContent(addRunway());
        return runways;
    }

    private Element addRunway() {
        Element runway = new Element("runway", dcs).setAttribute("id","id do cenas");
        runway.addContent(addCoordinates());
        runway.addContent(new Element ("length", dcs).setAttribute("lengthUnit","meter").addContent("numero"));
        runway.addContent(new Element ("width", dcs).setAttribute("lengthUnit","meter").addContent("numero"));
        runway.addContent(new Element ("surface", dcs).addContent("Concrete"));
        runway.addContent(addBaseEnd());
        runway.addContent(addReciprocalEnd());
        return runway;
    }

    private Element addCoordinates() {
        Element coordinates = new Element("coordinates", dcs);
        coordinates.addContent(new Element("latitude", dcs).addContent("latitude"));   //TODO
        coordinates.addContent(new Element("longitude", dcs).addContent("longitude"));  //TODO
        coordinates.addContent(new Element("altitude", dcs).setAttribute("measured","amsl").addContent("altitude"));  //TODO
        return coordinates;
    }

    private Element addBaseEnd() {
        Element baseEnd = new Element("baseEnd", dcs);
        baseEnd.addContent(addStartPoint());
        baseEnd.addContent(new Element ("heading", dcs).setAttribute("headingType","true").addContent("numero"));
        baseEnd.addContent(addEndPoint());
        return baseEnd;
    }

    private Element addReciprocalEnd() {
        Element reciprocalEnd = new Element("reciprocalEnd", dcs);
        reciprocalEnd.addContent(new Element ("designation", dcs).addContent("number"));
        reciprocalEnd.addContent(addStartPoint());
        reciprocalEnd.addContent(new Element ("heading", dcs).setAttribute("headingType","true/false").addContent("numero"));
        reciprocalEnd.addContent(addEndPoint());
        return reciprocalEnd;
    }

    private Element addStartPoint() {
        Element startpoint = new Element("startpoint", dcs);
        startpoint.addContent(addCoordinates());
        startpoint.addContent(addConnectsTo());
        return startpoint;
    }

    private Element addEndPoint() {
        Element endpoint = new Element("endpoint", dcs);
        endpoint.addContent(addCoordinates());
        endpoint.addContent(addConnectsTo());
        return endpoint;
    }

    private Element addConnectsTo() {
        Element connectsTo = new Element("connectsTo", dcs);
        connectsTo.addContent(new Element("xway", dcs).setAttribute("idr","numero"));

        return connectsTo;
    }




    private Element addUtil(int i) {
        Element utilities = new Element("utilities", dcs);
        for (int j = 0; j < listener.getTower().size(); j++) {
            if (listener.getTower().get(i + "_tower_" + j) != null) {
                utilities.addContent(addTower(i, j));
            }
        }
        for (int j = 0; j < listener.getTower().size(); j++) {
            if (listener.getFuel().get(i + "_fuel_" + j) != null) {
                utilities.addContent(addFuel(i, j));
            }
        }
        return utilities;
    }

    private Element addTower(int i, int j) {
        Element tower = new Element("tower", dcs).setAttribute("id", "t" + ((j + 1) < 10 ? "0" : "") + (j + 1));
        tower.addContent(new Element("designation", dcs).addContent("Tower"));
        Element coord = new Element("coordinates", dcs);
        tower.addContent(coord);
        coord.addContent(new Element("latitude", dcs).addContent(parseCoord(listener.getTower
                ().get(i + "_tower_" + j).get("latitude"), "lat")));
        coord.addContent(new Element("longitude", dcs).addContent(parseCoord(listener.getTower
                ().get(i + "_tower_" + j).get("longitude"), "lon")));
        coord.addContent(new Element("altitude", dcs).setAttribute("measured", "amsl").addContent(
                listener.getTower().get(i + "_tower_" + j).get("altitude")));
        tower.addContent(new Element("radius", dcs).setAttribute("lengthUnit", "Meter").addContent(
                listener.getTower().get(i + "_tower_" + j).get("radius")));
        tower.addContent(new Element("height", dcs).setAttribute("lengthUnit", "Meter").addContent(
                listener.getTower().get(i + "_tower_" + j).get("height")));
        return tower;
    }

    private Element addFuel(int i, int j) {
        Element fuel = new Element("fuel", dcs).setAttribute("id", "f" + ((j + 1) < 10 ? "0" : "") + (j + 1));
        fuel.addContent(new Element("designation", dcs).addContent("Fuel"));
        Element coord = new Element("coordinates", dcs);
        fuel.addContent(coord);
        coord.addContent(new Element("latitude", dcs).addContent(parseCoord(listener.getTower
                ().get(i + "_tower_" + j).get("latitude"), "lat")));
        coord.addContent(new Element("longitude", dcs).addContent(parseCoord(listener.getTower
                ().get(i + "_tower_" + j).get("longitude"), "lon")));
        coord.addContent(new Element("altitude", dcs).setAttribute("measured", "amsl").addContent(
                listener.getTower().get(i + "_tower_" + j).get("altitude")));
        fuel.addContent(new Element("radius", dcs).setAttribute("lengthUnit", "Meter").addContent(
                listener.getFuel().get(i + "_fuel_" + j).get("radius")));
        fuel.addContent(new Element("type", dcs).addContent(
                listener.getFuel().get(i + "_fuel_" + j).get("type")));
        fuel.addContent(new Element("available", dcs).addContent(
                listener.getFuel().get(i + "_fuel_" + j).get("availability")));
        return fuel;
    }

    private String parseCoord(String s, String c) {
        String parse;
        String[] tokens;
        try {
            Double.parseDouble(s);
            return s;
        } catch (Exception ignore) {
        }
        tokens = s.split("-");
        if (tokens[0].length() == 0) {
            parse = tokens[1] + "º " + tokens[2] + "' " + tokens[3] + "'' " + (c.equals("lat") ? "S" : "W");
        } else {
            parse = tokens[0] + "º " + tokens[1] + "' " + tokens[2] + "'' " + (c.equals("lat") ? "N" : "E");

        }
        return parse;
    }

    private void writeSDL() {
        try {
            XMLOutputter xmlOutput = new XMLOutputter();
            xmlOutput.setFormat(Format.getPrettyFormat());
            xmlOutput.setFormat(xmlOutput.getFormat().setExpandEmptyElements(true));
            xmlOutput.output(doc, new FileWriter(filepath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
