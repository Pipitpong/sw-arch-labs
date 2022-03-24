package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class XMLBookMetadataExporter extends BookMetadataExporter {
    XMLBookMetadataExporter() throws IOException, ParserConfigurationException {
        super(new XMLBookMetadataFormatter());
    }
}
