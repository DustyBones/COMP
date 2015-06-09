import java.io.FileWriter;
import java.io.IOException;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import javax.lang.model.element.Name;

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
        Element bases = new Element("bases", dcs);
        Element controllers = new Element("controllers", dcs);
        Element agentTypes = new Element("agentTypes", dcs);
        Element noFlyAreas = new Element("noFlyAreas", dcs);
        scenario.addContent(bases);
        scenario.addContent(controllers);
        scenario.addContent(agentTypes);
        scenario.addContent(noFlyAreas);
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
