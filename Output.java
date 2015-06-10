package sdl;

import java.io.FileWriter;
import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class sdl {

public static void main(String[] args) { 
	
	  Element baseOfOperations = new Element("baseOfOperations").setAttribute("id","bX");  //TODO X com o ciclo que ve quantas bases criar
	  
	  baseOfOperations.addContent(new Element ("nome").addContent("inserir nome do aeroporto"));  //TODO
	  baseOfOperations.addContent(new Element ("mobility").setAttribute("water","true").setAttribute("underwater","false").setAttribute("land","true").setAttribute("air","true"));
	  baseOfOperations.addContent(new Element ("description").addContent("XXX Description XXX"));
	  baseOfOperations.addContent(new Element ("history").addContent("XXX history"));
	  baseOfOperations.addContent(addpersoncontact());
	  baseOfOperations.addContent(addlocation());
	  baseOfOperations.addContent(new Element ("availability").setAttribute("avaible","always"));
	  baseOfOperations.addContent(addairport());
	  baseOfOperations.addContent(new Element ("vazio"));
	  
	  Format form = Format.getPrettyFormat();	
	 // form.setExpandEmptyElements(true);
	  XMLOutputter out = new XMLOutputter(form);

		Document doc = new Document(baseOfOperations); 
		FileWriter writer;
		try {	
			writer = new FileWriter("c:\\Eclipse\\file.xml");
			out.output(doc, writer);
			writer.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	  
}

private static Element addpersoncontact() {
	  Element personcontact = new Element("contactPerson");
	  personcontact.addContent(new Element("name").addContent("XXX Name XXX"));
	  personcontact.addContent(new Element("title").addContent("XXX Title XXX"));
	  personcontact.addContent(new Element("instituition").addContent("XxX Instituition XXX"));
	  personcontact.addContent(new Element("position").addContent("XXX Position XXX"));
	  personcontact.addContent(new Element("address").addContent("XXX Address XXX"));
	  personcontact.addContent(new Element("zipCode").addContent("XXX ZipCode XXX"));
	  personcontact.addContent(new Element("city").addContent("XXX City XXX"));
	  personcontact.addContent(new Element("stateDistrictRegion").addContent("XXX State XXX"));
	  personcontact.addContent(new Element("country").addContent("XXX Country XXX"));
	  personcontact.addContent(new Element("telephone").addContent("XXX Telephone XXX"));
	  personcontact.addContent(new Element("cellphone").addContent("XXX Cellphone XXX"));
	  personcontact.addContent(new Element("fax").addContent("XXX Fax XXX"));
	  personcontact.addContent(new Element("email").addContent("XXX email XXX"));
	  
	  return personcontact;
}

private static Element addlocation() {
	  Element location = new Element("location");
	  location.addContent(new Element("address").addContent("xxxxxxxxxxxxx"));
	  location.addContent(new Element("zipCode").addContent("xxxxxxxxxxxxx"));
	  location.addContent(new Element("city").addContent("nome da cidade"));  //TODO
	  location.addContent(new Element("stateDistrictRegion").addContent("nome estdo"));  //TODO
	  location.addContent(new Element("country").addContent("nome do pais"));  //TODO
	  location.addContent(addcoordinates());
	  return location;
}  

private static Element addcoordinates() {
	  Element coordinates = new Element("coordinates");
	  coordinates.addContent(new Element("latitude").addContent("latitude"));   //TODO
	  coordinates.addContent(new Element("longitude").addContent("longitude"));  //TODO
	  coordinates.addContent(new Element("altitude").setAttribute("measured","amsl").addContent("altitude"));  //TODO
	  return coordinates;
}

private static Element addairport() {

	  Element airport = new Element("aeroporto");
	  airport.addContent(new Element ("name").addContent("inserir nome do aeroporto"));  //TODO
	  airport.addContent(new Element("altitude").addContent("XXX Description XXX"));
	  airport.addContent(addpersoncontact());
	  airport.addContent(addlocation());
	  airport.addContent(new Element("icao").addContent("icao"));  //TODO ?
	  airport.addContent(new Element("iata").addContent("iata"));  //TODO ?
	  airport.addContent(addrunways());
	  airport.addContent(addtaxiways());
	  airport.addContent(new Element("parking").addContent("XXX parking XXX"));
	  return airport;
}

private static Element addrunways() {
	Element runways = new Element("runways");
	runways.addContent(addrunway());
	return runways;
}

private static Element addtaxiways() {
	Element taxiways = new Element("taxiways");
	taxiways.addContent(addtaxiway());
	return taxiways;
}


private static Element addrunway() {
	Element runway = new Element("runway").setAttribute("id","id do cenas");
	runway.addContent(addcoordinates());
	runway.addContent(new Element ("length").setAttribute("lengthUnit","meter").addContent("numero"));
	runway.addContent(new Element ("width").setAttribute("lengthUnit","meter").addContent("numero"));
	runway.addContent(new Element ("surface").addContent("Concrete"));
	runway.addContent(addbaseend());
	runway.addContent(addreciprocalend());
	return runway;
}

private static Element addbaseend() {
	Element baseEnd = new Element("baseEnd");
	baseEnd.addContent(addstartpoint());
	baseEnd.addContent(new Element ("heading").setAttribute("headingType","true/false").addContent("numero"));
	baseEnd.addContent(addendpoint());
	return baseEnd;
}

private static Element addreciprocalend() {
	Element reciprocalEnd = new Element("reciprocalEnd");
	reciprocalEnd.addContent(new Element ("designation").addContent("number"));
	reciprocalEnd.addContent(addstartpoint());
	reciprocalEnd.addContent(new Element ("heading").setAttribute("headingType","true/false").addContent("numero"));
	reciprocalEnd.addContent(addendpoint());
	return reciprocalEnd;	
}

private static Element addstartpoint() {
	Element startpoint = new Element("startpoint");
	startpoint.addContent(addcoordinates());
	startpoint.addContent(addconnectsto());
	return startpoint;
}

private static Element addmidpoint() {
	Element midpoint = new Element("midpoint");
	midpoint.addContent(addcoordinates());
	midpoint.addContent(addconnectsto());
	return midpoint;
}

private static Element addendpoint() {
	Element endpoint = new Element("endpoint");
	endpoint.addContent(addcoordinates());
	endpoint.addContent(addconnectsto());
	return endpoint;
}

private static Element addconnectsto() {
	Element connectsTo = new Element("connectsTo");
	connectsTo.addContent(new Element("xway").setAttribute("idr","numero"));
	
	return connectsTo;
}

private static Element addtaxiway() {
	Element taxiway = new Element("taxiway").setAttribute("id","id do cenas");
	taxiway.addContent(new Element("designation").addContent("taxiway X"));
	taxiway.addContent(new Element("surface").addContent("superficie"));
	taxiway.addContent(new Element ("width").setAttribute("lengthUnit","meter").addContent("numero"));
	taxiway.addContent(addpath());
	return taxiway;
}

private static Element addpath() {
	Element path = new Element("path");
	path.addContent(addstartpoint());
	path.addContent(addmidpoint());
	path.addContent(addendpoint());
	
	return path;
}



}
