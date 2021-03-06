
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class Analisis {

    public static void main(String[] args) {
        try {
            File inputFile = new File("C:\\Users\\usuario\\Documents\\curso de java online sepe\\unidad 2 procesamiento xml\\21.ejercicioJDOM\\src\\prueba1.xml");
            SAXBuilder saxBuilder = new SAXBuilder();
            Document document = saxBuilder.build(inputFile);
            System.out.println("Root element :" + document.getRootElement().getName());
            Element classElement = document.getRootElement();

            List<Element> studentList = classElement.getChildren();
            System.out.println("----------------------------");

            for (int temp = 0; temp < studentList.size(); temp++) {
                Element student = studentList.get(temp);
                System.out.println("\nCurrent Element :"
                        + student.getName());
                Attribute attribute = student.getAttribute("rollno");
                System.out.println("Student roll no : "
                        + attribute.getValue());
                System.out.println("First Name : "
                        + student.getChild("firstname").getText());
                System.out.println("Last Name : "
                        + student.getChild("lastname").getText());
                System.out.println("Nick Name : "
                        + student.getChild("nickname").getText());
                System.out.println("Marks : "
                        + student.getChild("marks").getText());
            }
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
