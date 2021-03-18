public class MonitoringApplication {

    private static Product product;

    public static void main(String[] args){
        DataConnector dataConnector = new JSONInformation();
        dataConnector.readInformation();
        product = dataConnector.getProduct();
        System.out.println(product.toString());

        DataConnector dataConnector2 = new XMLInformation();
        dataConnector2.readInformation();
        product = dataConnector2.getProduct();
        System.out.println(product.toString());
    }
}
