package XMLPackage;
 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
  
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
  
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
  
public class DomParserExample {
  
     public static void main(String[] args) {
  
          try {
		  DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		  DocumentBuilder builder = factory.newDocumentBuilder();

		  File cfg_file = null;

		  try {
			  cfg_file = new File(args[0]);
		  } catch (Exception notFound) {
			  System.err.println("\nThe provided file was not found.\nPlease use a file path relative to the top directory.\n");
			  System.exit(-1);
		  }

		  if (cfg_file == null || !cfg_file.exists()) {
			  System.err.println("\nThe provided file was not found.\nPlease use a file path relative to the top directory.\n");
			  System.exit(-1);
		  }

		  Document document = builder.parse(cfg_file); // use first arg as file name

		  List<Parameter> parameters = new ArrayList<Parameter>();
		  NodeList nodeList = document.getDocumentElement().getChildNodes();
		  for (int i = 0; i < nodeList.getLength(); i++) {
		       Node node = nodeList.item(i);

		       if (node.getNodeType() == Node.ELEMENT_NODE) {
			    Element elem = (Element) node;


			    // get the values
			    String name = elem.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue();
			    String value = elem.getElementsByTagName("value").item(0).getChildNodes().item(0).getNodeValue();
			    String access = elem.getElementsByTagName("access").item(0).getChildNodes().item(0).getNodeValue();


			    /* // FUTURE USE not probably needed for demonstrations
			    String accessNRCS = elem.getElementsByTagName("accessNRCS").item(0).getChildNodes().item(0).getNodeValue();
			    String accessNRCSdev = elem.getElementsByTagName("accessNRCSdev").item(0).getChildNodes().item(0).getNodeValue();
			    */

			    parameters.add(new Parameter(name, value, access));
			    // other if needed
			    // parameters.add(new Parameter(name, value, access, accessNRCS, accessNRCSdev)); 
		       }
		  }

		  for (Parameter param: parameters)
		       System.out.println(param.toString());
	} catch (Exception allOthers) {
		allOthers.printStackTrace();
	}
     }

}
