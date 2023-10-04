package org.example.model;

import java.time.LocalDate;

public class Product {
    private Long productId;
    private String name;
    private LocalDate date;
    private Integer quantity;
    private Double price;

    public Product(Long productId, String name, LocalDate date, Integer quantity, Double price){
        this.productId = productId;
        this.name = name;
        this.date = date;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(String name, LocalDate date, Integer quantity, Double price){
        this(null, name, date, quantity, price);
    }
    public Product(){
        this(null, null, null, null);
    }

    public Long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("productId=").append(productId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", date=").append(date);
        sb.append(", quantity=").append(quantity);
        sb.append(", price").append(price);
        sb.append("}");
        return sb.toString();
    }
    public String toJSONString(){
        return String.format("{ \"productId\":%d, \"name\":%s, \"date\":%s, \"quantity\":%d, \"price\":%,.2f }", productId, name, date, quantity, price);
    }
}
