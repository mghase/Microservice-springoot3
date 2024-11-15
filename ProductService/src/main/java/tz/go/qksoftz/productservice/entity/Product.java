package tz.go.qksoftz.productservice.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product_table")
public class Product {
    @Id

    @Column(name="product_id")
    Integer id;
    @Column(name="product_name")
    String name;
    public Product(){}
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + "]";
    }
    public Product(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
    }





}

