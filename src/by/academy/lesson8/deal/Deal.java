package by.academy.lesson8.deal;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Deal {

    User seller;
    User buyer;
    Product[] products;
    LocalDate dealDate;

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public LocalDate getDealDate() {
        return dealDate;
    }

    public void setDealDate(LocalDate dealDate) {
        this.dealDate = dealDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Deal deal = (Deal) o;

        if (!Objects.equals(seller, deal.seller)) return false;
        if (!Objects.equals(buyer, deal.buyer)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(products, deal.products)) return false;
        return Objects.equals(dealDate, deal.dealDate);
    }

    @Override
    public int hashCode() {
        int result = seller != null ? seller.hashCode() : 0;
        result = 31 * result + (buyer != null ? buyer.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(products);
        result = 31 * result + (dealDate != null ? dealDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Deal{" +
                "seller=" + seller +
                ", buyer=" + buyer +
                ", products=" + Arrays.toString(products) +
                ", dealDate=" + dealDate +
                '}';
    }
}
