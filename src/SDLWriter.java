import java.io.FileWriter;
import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 * Created by Bernardo on 09-06-2015.
 */
public class SDLWriter {

    private Document doc = null;
    private String filepath;
    private Namespace dcs = Namespace.getNamespace("dcs:scenario");


    public SDLWriter(String filepath) {
        this.filepath = filepath;
        addScenario();
        writeSDL();


    }


    private void addScenario(){
        Element scenario = new Element("scenario", dcs);
        scenario.addNamespaceDeclaration(Namespace.getNamespace("xsi", "http://www.w3.org/2001/XMLSchema-instance"));
        scenario.addNamespaceDeclaration(Namespace.getNamespace("xsd", "http://www.w3.org/2001/XMLSchema"));
        doc = new Document(scenario);
        addScenarioChildren();

    }

    private void addScenarioChildren(){
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

    private Element addBases(){
        Element bases = new Element("bases", dcs);


        Element baseOfOperations = new Element("baseOfOperations").setAttribute("id","bX");  //TODO: X com o ciclo que ve quantas bases criar

        baseOfOperations.addContent(new Element ("nome").addContent("inserir nome do aeroporto"));  //TODO
        baseOfOperations.addContent(new Element ("mobility").setAttribute("water","true").setAttribute("underwater","false").setAttribute("land","true").setAttribute("air","true"));
        baseOfOperations.addContent(new Element ("description").addContent("XXX Description XXX"));
        baseOfOperations.addContent(new Element ("history").addContent("XXX history"));
        baseOfOperations.addContent(addContactPerson());
        baseOfOperations.addContent(addLocation());
        baseOfOperations.addContent(new Element ("availability").setAttribute("available","always"));
        baseOfOperations.addContent(addAirport());

        bases.addContent(baseOfOperations);
        return bases;
    }



    private Element addContactPerson() {
        Element contactPerson = new Element("contactPerson");
        contactPerson.addContent(new Element("name").addContent("XXX Name XXX"));
        contactPerson.addContent(new Element("title").addContent("XXX Title XXX"));
        contactPerson.addContent(new Element("instituition").addContent("XxX Instituition XXX"));
        contactPerson.addContent(new Element("position").addContent("XXX Position XXX"));
        contactPerson.addContent(new Element("address").addContent("XXX Address XXX"));
        contactPerson.addContent(new Element("zipCode").addContent("XXX ZipCode XXX"));
        contactPerson.addContent(new Element("city").addContent("XXX City XXX"));
        contactPerson.addContent(new Element("stateDistrictRegion").addContent("XXX State XXX"));
        contactPerson.addContent(new Element("country").addContent("XXX Country XXX"));
        contactPerson.addContent(new Element("telephone").addContent("XXX Telephone XXX"));
        contactPerson.addContent(new Element("cellphone").addContent("XXX Cellphone XXX"));
        contactPerson.addContent(new Element("fax").addContent("XXX Fax XXX"));
        contactPerson.addContent(new Element("email").addContent("XXX email XXX"));

        return contactPerson;
    }

    private Element addLocation() {
        Element location = new Element("location");
        location.addContent(new Element("address").addContent("xxxxxxxxxxxxx"));
        location.addContent(new Element("zipCode").addContent("xxxxxxxxxxxxx"));
        location.addContent(new Element("city").addContent("nome da cidade"));  //TODO
        location.addContent(new Element("stateDistrictRegion").addContent("nome estdo"));  //TODO
        location.addContent(new Element("country").addContent("nome do pais"));  //TODO
        location.addContent(addCoordinates());
        return location;
    }

    private Element addCoordinates() {
        Element coordinates = new Element("coordinates");
        coordinates.addContent(new Element("latitude").addContent("latitude"));   //TODO
        coordinates.addContent(new Element("longitude").addContent("longitude"));  //TODO
        coordinates.addContent(new Element("altitude").addContent("altitude"));  //TODO
        return coordinates;
    }

    private Element addAirport() {

        Element airport = new Element("aeroporto");
        airport.addContent(new Element ("name").addContent("inserir nome do aeroporto"));  //TODO
        airport.addContent(new Element("altitude").addContent("XXX Description XXX"));
        airport.addContent(addContactPerson());
        airport.addContent(addLocation());
        airport.addContent(new Element("icao").addContent("icao"));  //TODO ?
        airport.addContent(new Element("iata").addContent("iata"));  //TODO ?
        airport.addContent(new Element("runways").addContent("XXX runways XXX"));
        airport.addContent(new Element("taxiways").addContent("XXX taxiways XXX"));
        airport.addContent(new Element("parking").addContent("XXX parking XXX"));
        return airport;
    }




    private void writeSDL(){

        try {
            XMLOutputter xmlOutput = new XMLOutputter();


            xmlOutput.setFormat(Format.getPrettyFormat());
            //xmlOutput.setFormat(xmlOutput.getFormat().setExpandEmptyElements(true));
            xmlOutput.output(doc, new FileWriter(filepath));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}
