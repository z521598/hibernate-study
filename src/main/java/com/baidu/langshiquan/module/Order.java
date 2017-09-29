package com.baidu.langshiquan.module;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by langshiquan on 17/9/29.
 */
//@Entity
public class Order {
//    @Id
    private Long id;
    private Integer weight;

    public Order() {
    }

    public Order(Integer weight) {
        this.weight = weight;
    }

    public Order(Long id, Integer weight) {
        this.id = id;
        this.weight = weight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", weight=" + weight +
                '}';
    }
}
