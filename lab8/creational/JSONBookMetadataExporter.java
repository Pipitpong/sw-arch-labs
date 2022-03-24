package creational;

import java.io.PrintStream;

public class JSONBookMetadataExporter extends BookMetadataExporter {



//    @Override
//    public BookMetadataFormatter getFormatter() {
//        return new JSONBookMetadataFormatter();
//    }

    JSONBookMetadataExporter() {
        super(new JSONBookMetadataFormatter());
    }
}
