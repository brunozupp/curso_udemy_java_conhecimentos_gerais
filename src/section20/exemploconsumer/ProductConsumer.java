package section20.exemploconsumer;

import java.util.function.Consumer;

public class ProductConsumer implements Consumer<Product> {

    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() + (product.getPrice() * 0.1));
    }
}
