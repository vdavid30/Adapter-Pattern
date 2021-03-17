public class MonitoringApplication {

    private static Product product;

    public static void main(String[] args){
        DataConnector dataConnector = new JSONInformation();
        dataConnector.readInformation();
        product = dataConnector.getProduct();


        DataConnector dataConnector2 = new XMLInformation();
        dataConnector2.readInformation();
        product = dataConnector.getProduct();
    }
}
