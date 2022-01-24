import java.util.ArrayList;

public class PlanetExpress implements IShipper {

    String name = new String("Planet Express");
    ArrayList<Product> products = new ArrayList<>();

    public String companyName() {
        return name;
    }

    public void addProducts(Shipment shipment) {
        for (Product product: shipment.getProducts()) {
            products.add(product);
        }
    }

    public String outputProducts() {
        String productString = "";
        for (Product product: products) {
            productString += String.format("ID: %s; Item: %s [Quantity: %s] [%s oz] \n", product.getId(), product.getDescription(), product.getQty(), product.getWeightOunces());
        }

        return productString;
    }
}
