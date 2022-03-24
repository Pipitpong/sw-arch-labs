package creational;

import java.io.IOException;

public class CSVBookMetadataExporter extends BookMetadataExporter {
    CSVBookMetadataExporter() throws IOException {
        super(new CSVBookMetadataFormatter());
    }
}
