import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLReader {
    private Product product;

    public Product getProduct(){
        readInformation();
        return product;
    }

    public void readInformation(){
        try{
            File file = new File("src/main/resources/businessInfo.xml");
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);
            document.getDocumentElement().normalize();
            product = generateProduct(document);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Product generateProduct(Document document){
        Product xmlProduct = new Product();
        xmlProduct.setName(document.getElementsByTagName("name").item(0).getTextContent());
        xmlProduct.setDescription(document.getElementsByTagName("description").item(0).getTextContent());
        xmlProduct.setPrice(document.getElementsByTagName("price").item(0).getTextContent());
        xmlProduct.setUnits(document.getElementsByTagName("units").item(0).getTextContent());
        return xmlProduct;
    }

    public void xmlQuery(){}
}
