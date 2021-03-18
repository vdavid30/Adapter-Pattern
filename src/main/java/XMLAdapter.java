public class XMLAdapter implements DataConnector {
    private XMLReader xmlReader;

    public XMLAdapter(XMLReader xmlReader){
        this.xmlReader = xmlReader;
    }

    @Override
    public Product getProduct() {
        try{
            return xmlReader.getProduct();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
