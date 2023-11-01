import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

class TestValidate {
    public static void main(String[] args) throws SAXException, IOException {

        File xsdFile = null;
        File xmlFile = null;
        SchemaFactory schemaFactory = null;
        Schema schema = null;
        Validator validator = null;

        xmlFile = new File("D:/workspace_luna/MiscWorks/src/processconfig_LOSVehicleLoan_CPUAcceptanceTeam.xml");
        if (xmlFile.exists()) {

            schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            xsdFile = new File("D:/workspace_luna/MiscWorks/src/webservice.xsd");
            schema = schemaFactory.newSchema(xsdFile);
            validator = schema.newValidator();
            validator.validate(new StreamSource(xmlFile));

        }


    }

    private class another {

    }


}
