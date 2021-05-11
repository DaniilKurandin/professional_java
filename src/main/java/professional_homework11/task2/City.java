package professional_homework11.task2;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class City {
    public static void main(String[] args) {
        XMLOutputFactory factory = XMLOutputFactory.newFactory();
        try {
            XMLStreamWriter writer = factory.createXMLStreamWriter(new FileOutputStream("D:\\java_professional\\src\\main\\java\\professional_homework11\\task2\\city.xml"));
            writer.writeStartDocument();
            writer.writeStartElement("city");
            writer.writeAttribute("city_size", "1000000");
            writer.writeCharacters("Perm");
            writer.writeStartElement("street");
            writer.writeStartElement("house");
            writer.writeEndElement();
            writer.writeEndDocument();
        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
