package model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class OrderItem {

    private Product product;
    private Integer quantity;
    private Double price;

    public OrderItem() {

    }

    public OrderItem(Product product, Integer quantity, Double price) {
        setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product=product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static List<OrderItem> converteJsonEmArray(BufferedReader buffereReader) throws IOException {
        Gson gson = new Gson();

        TypeToken tt = new TypeToken<List<OrderItem>>() {};
        List<OrderItem> fromJson = gson.fromJson(buffereReader, tt.getType());

        return fromJson;
    }
    
    public static String converteOrderItemEmJson(OrderItem obj){
        Gson gson = new Gson();
        String json = gson.toJson(obj);
        return json;
    }
}
