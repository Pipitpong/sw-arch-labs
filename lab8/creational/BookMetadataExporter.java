package creational;

import java.io.PrintStream;

//public abstract class BookMetadataExporter extends BookCollection {
//
//    public void export(PrintStream stream) {
//        BookMetadataFormatter formatter = getFormatter();
//
//        for(Book book: books){
//            formatter.append(book);
//        }
//        stream.println(formatter.getMetadataString());
//    }
//
//    public abstract BookMetadataFormatter getFormatter();
//}

public abstract class BookMetadataExporter extends BookCollection {

    private BookMetadataFormatter formatter ;

    BookMetadataExporter(BookMetadataFormatter formatter){
        this.formatter = formatter;
    }

    public void export(PrintStream stream) {

        for(Book book: books){
            formatter.append(book);
        }
        stream.println(formatter.getMetadataString());
    }
}
