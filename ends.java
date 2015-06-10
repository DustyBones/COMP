private static Element addbaseend() {
	Element baseEnd = new Element("baseEnd",dcs);
	baseEnd.addContent(new Element ("designation",dcs).addContent("13"));
	Element startpoint = new Element("startpoint",dcs);
	baseEnd.addContent(startpoint);
	Element coordinates = new Element ("coordinates",dcs);
	startpoint.addContent(coordinates);
	Element latitude = new Element("latitude",dcs).addContent("48º 21' 41.12'' N");
	Element longitude = new Element("longitude",dcs).addContent("122º 39' 44.24'' W");
	Element altitude = new Element("altitude",dcs).setAttribute("measured","amsl").addContent("48");
	coordinates.addContent(latitude);
	coordinates.addContent(longitude);
	coordinates.addContent(altitude);
	Element connectsTo = new Element("connectsTo",dcs);
	startpoint.addContent(connectsTo);
	Element xway = new Element("xway",dcs).setAttribute("idr","x02");
	connectsTo.addContent(xway);
	baseEnd.addContent(new Element ("heading",dcs).setAttribute("headingType","True").addContent("154.68"));

	Element endpoint = new Element("endpoint",dcs);
	baseEnd.addContent(endpoint);
	Element coordinates1 = new Element ("coordinates",dcs);
	endpoint.addContent(coordinates1);
	Element latitude1 = new Element("latitude",dcs).addContent("48º 20' 31.68'' N");
	Element longitude1 = new Element("longitude",dcs).addContent("122º 38' 54.89'' W");
	Element altitude1 = new Element("altitude",dcs).setAttribute("measured","amsl").addContent("48");
	coordinates1.addContent(latitude1);
	coordinates1.addContent(longitude1);
	coordinates1.addContent(altitude1);
	Element connectsTo1 = new Element("connectsTo",dcs);
	endpoint.addContent(connectsTo1);
	Element xway1 = new Element("xway",dcs).setAttribute("idr","x02");
	connectsTo1.addContent(xway1);
	return baseEnd;
}

private static Element addreciprocalend() {
	Element reciprocalEnd = new Element("reciprocalEnd",dcs);
	reciprocalEnd.addContent(new Element ("designation",dcs).addContent("31"));
	Element startpoint = new Element("startpoint",dcs);
	reciprocalEnd.addContent(startpoint);
	Element coordinates = new Element ("coordinates",dcs);
	startpoint.addContent(coordinates);
	Element latitude = new Element("latitude",dcs).addContent("48º 20' 31.68'' N");
	Element longitude = new Element("longitude",dcs).addContent("122º 38' 54.89'' W");
	Element altitude = new Element("altitude",dcs).setAttribute("measured","amsl").addContent("48");
	coordinates.addContent(latitude);
	coordinates.addContent(longitude);
	coordinates.addContent(altitude);
	Element connectsTo = new Element("connectsTo",dcs);
	startpoint.addContent(connectsTo);
	Element xway = new Element("xway",dcs).setAttribute("idr","x04");
	connectsTo.addContent(xway);
	reciprocalEnd.addContent(new Element ("heading",dcs).setAttribute("headingType","True").addContent("334.68"));

	Element endpoint = new Element("endpoint",dcs);
	reciprocalEnd.addContent(endpoint);
	Element coordinates1 = new Element ("coordinates",dcs);
	endpoint.addContent(coordinates1);
	Element latitude1 = new Element("latitude",dcs).addContent("48º 21' 41.12'' N");
	Element longitude1 = new Element("longitude",dcs).addContent("122º 39' 44.24'' W");
	Element altitude1 = new Element("altitude",dcs).setAttribute("measured","amsl").addContent("48");
	coordinates1.addContent(latitude1);
	coordinates1.addContent(longitude1);
	coordinates1.addContent(altitude1);
	Element connectsTo1 = new Element("connectsTo",dcs);
	endpoint.addContent(connectsTo1);
	Element xway1 = new Element("xway",dcs).setAttribute("idr","x02");
	connectsTo1.addContent(xway1);
	return reciprocalEnd;	
}
