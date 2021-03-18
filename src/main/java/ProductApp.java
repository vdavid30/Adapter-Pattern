public class ProductApp {

    private DataConnector dataConnector;

    public ProductApp(DataConnector dataConnector){
        this.dataConnector = dataConnector;
    }

    public Product getProduct(){
        Product product = this.dataConnector.getProduct();
        System.out.println(product.toString());
        return product;
    }
}
