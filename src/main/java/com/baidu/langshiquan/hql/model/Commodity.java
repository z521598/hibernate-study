package com.baidu.langshiquan.hql.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by langshiquan on 17/10/15.
 */
@Entity
public class Commodity {
    private int id;
    private String name;
    private Double price;
    private String unit;
    private String category;
    private String description;
    private Integer seller;

    @Id
    @Column(name = "Id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "unit")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "seller")
    public Integer getSeller() {
        return seller;
    }

    public void setSeller(Integer seller) {
        this.seller = seller;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Commodity commodity = (Commodity) o;

        if (id != commodity.id) {
            return false;
        }
        if (name != null ? !name.equals(commodity.name) : commodity.name != null) {
            return false;
        }
        if (price != null ? !price.equals(commodity.price) : commodity.price != null) {
            return false;
        }
        if (unit != null ? !unit.equals(commodity.unit) : commodity.unit != null) {
            return false;
        }
        if (category != null ? !category.equals(commodity.category) : commodity.category != null) {
            return false;
        }
        if (description != null ? !description.equals(commodity.description) : commodity.description != null) {
            return false;
        }
        if (seller != null ? !seller.equals(commodity.seller) : commodity.seller != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (seller != null ? seller.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", seller=" + seller +
                '}';
    }
}
