package intermediate_level.Records;

public class Main {
    public static void main(String[] args) {
        ProductRecord product = new ProductRecord("Mesa de jantar", 600.99, "Móveis");

        System.out.println(product.formattedDescription());
    }
}
