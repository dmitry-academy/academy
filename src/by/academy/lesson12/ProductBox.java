package by.academy.lesson12;

import by.academy.lesson8.deal.Product;

public class ProductBox {

    private Product product;

    public ProductBox(Product product) {
        this.product = product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
}
