import com.google.gson.Gson;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSONReader implements DataConnector {
    private Product product;

    public Product getProduct(){
        readInformation();
        return product;
    }

    public void readInformation(){
        product = new Gson().fromJson(readFileAsString(), Product.class);
    }

    public static String readFileAsString(){
        String fileValue = "";
        try {
            fileValue = new String(Files.readAllBytes(Paths.get("src/main/resources/businessInfo.json")));
        }catch (Exception e){
            e.printStackTrace();
        }
        return fileValue;
    }
}
