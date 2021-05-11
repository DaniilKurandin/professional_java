package professional_homework11.task3;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class AnimalParser {
    public static void main(String[] args) {
        String fileName = "D:\\java_professional\\src\\main\\java\\professional_homework11\\task3\\animal.xml";

        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();

            DefaultHandler handler = new DefaultHandler() {
                boolean name = false;
                boolean breed = false;

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) {
                    if (qName.equalsIgnoreCase("name")) {
                        name = true;
                    }

                    if (qName.equalsIgnoreCase("breed")) {
                        breed = true;
                    }
                }

                @Override
                public void characters(char[] ch, int start, int length) {
                    if (name) {
                        System.out.println("Name: " + new String(ch, start, length));
                        name = false;
                    }

                    if (breed) {
                        System.out.println("Breed: " + new String(ch, start, length));
                        breed = false;
                    }
                }
            };

            parser.parse(fileName, handler);

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
