public class DataPreviewer {

    public static void main(String args[]){

        XMLReader xmlReader = new XMLReader();
        DataConnector dataConnector = new XMLAdapter(xmlReader);
        ProductApp productApp = new ProductApp(dataConnector);
        productApp.getProduct();


        DataConnector dataConnector2 = new JSONReader();
        ProductApp productApp2 = new ProductApp(dataConnector2);
        productApp2.getProduct();

    }
}
