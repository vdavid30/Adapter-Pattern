public class Product {
    private String name;
    private String description;
    private String price;
    private String units;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return  "Product Name: " + name + "\n" + "Description : " + description + "\n" + "Price : " + price + "\n" + "Units : " + units + "\n";
    }
}
