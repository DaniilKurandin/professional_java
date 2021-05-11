package professional_homework11.task3;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class AnimalXML {
    public static void main(String[] args) {
        XMLOutputFactory factory = XMLOutputFactory.newFactory();
        try {
            XMLStreamWriter writer = factory.createXMLStreamWriter(new FileOutputStream("D:\\java_professional\\src\\main\\java\\professional_homework11\\task3\\animal.xml"));
            writer.writeStartDocument();
            writer.writeStartElement("animal");
            writer.writeStartElement("cat");
            writer.writeStartElement("name");
            writer.writeCharacters("Marsel");
            writer.writeEndElement();
            writer.writeStartElement("age");
            writer.writeCharacters("7");
            writer.writeEndElement();
            writer.writeStartElement("breed");
            writer.writeCharacters("Sphynx");
            writer.writeEndElement();
            writer.writeStartElement("weight");
            writer.writeCharacters("6");
            writer.writeEndElement();
            writer.writeEndElement();

            writer.writeStartElement("cat");
            writer.writeStartElement("name");
            writer.writeCharacters("Myrzik");
            writer.writeEndElement();
            writer.writeStartElement("age");
            writer.writeCharacters("5");
            writer.writeEndElement();
            writer.writeStartElement("breed");
            writer.writeCharacters("Oriental");
            writer.writeEndElement();
            writer.writeStartElement("weight");
            writer.writeCharacters("4");
            writer.writeEndElement();
            writer.writeEndElement();
            writer.writeEndDocument();
        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
