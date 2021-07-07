package com.meli.socialmeli.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPost;

    private LocalDate date;

    @ManyToOne
    @JoinColumn(name="productId")
    private Product detail;

    private Integer category;

    private Double price;

    private boolean hasPromo;

    private Double discount;

    @ManyToOne
    @JoinColumn(name="seller_id")
    private Seller seller;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Product getDetail() {
        return detail;
    }

    public void setDetail(Product detail) {
        this.detail = detail;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean isHasPromo() {
        return hasPromo;
    }

    public void setHasPromo(boolean hasPromo) {
        this.hasPromo = hasPromo;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public void setIdPost(Integer id) {
        this.idPost = id;
    }

    public Integer getIdPost() {
        return idPost;
    }
}