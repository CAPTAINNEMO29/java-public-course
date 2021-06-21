
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Analisis2 {

    public static void main(String argv[]) {
        try {
            SAXParserFactory factory
                    = SAXParserFactory.newInstance();
            SAXParser saxParser
                    = factory.newSAXParser();

            DefaultHandler handler
                    = new DefaultHandler() {

                boolean bfname = false;
                boolean blname = false;

                public void startElement(String uri,
                        String localName,
                        String qName,
                        Attributes attributes)
                        throws SAXException {
                    if (qName.equalsIgnoreCase("firstname")) {
                        bfname = true;
                    }

                    if (qName.equalsIgnoreCase("lastname")) {
                        blname = true;
                    }
                }

                public void characters(char ch[],
                        int start,
                        int length)
                        throws SAXException {
                    if (bfname) {
                        System.out.println("First Name : "
                                + new String(ch,
                                        start,
                                        length));
                        bfname = false;
                    }

                    if (blname) {
                        System.out.println("Last Name : "
                                + new String(ch,
                                        start,
                                        length));
                        blname = false;
                    }
                }

            };

            saxParser.parse("C:\\Users\\usuario\\Documents\\curso de java online sepe\\unidad 2 procesamiento xml\\22.ejercicioSAX\\src\\prueba2.xml", handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
