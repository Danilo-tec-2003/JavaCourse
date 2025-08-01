package intermediate_level.Records;

public record ProductRecord(String name, double price, String category) {

    public ProductRecord {
        if (price < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo.");
        }
    }

    public String formattedDescription() {
        return String.format("Produto: %s | Categoria: %s | Preço: R$ %.2f", name, category, price);
    }
}
