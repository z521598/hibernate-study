package com.baidu.langshiquan.hql.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by langshiquan on 17/10/15.
 */
@Entity
public class Orderitem {
    private int id;
    private Integer orderid;
    private Integer commodity;
    private Double discount;
    private Double actprice;
    private Double amount;

    @Id
    @Column(name = "Id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ORDERID")
    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    @Basic
    @Column(name = "COMMODITY")
    public Integer getCommodity() {
        return commodity;
    }

    public void setCommodity(Integer commodity) {
        this.commodity = commodity;
    }

    @Basic
    @Column(name = "DISCOUNT")
    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Basic
    @Column(name = "ACTPRICE")
    public Double getActprice() {
        return actprice;
    }

    public void setActprice(Double actprice) {
        this.actprice = actprice;
    }

    @Basic
    @Column(name = "AMOUNT")
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Orderitem orderitem = (Orderitem) o;

        if (id != orderitem.id) {
            return false;
        }
        if (orderid != null ? !orderid.equals(orderitem.orderid) : orderitem.orderid != null) {
            return false;
        }
        if (commodity != null ? !commodity.equals(orderitem.commodity) : orderitem.commodity != null) {
            return false;
        }
        if (discount != null ? !discount.equals(orderitem.discount) : orderitem.discount != null) {
            return false;
        }
        if (actprice != null ? !actprice.equals(orderitem.actprice) : orderitem.actprice != null) {
            return false;
        }
        if (amount != null ? !amount.equals(orderitem.amount) : orderitem.amount != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (orderid != null ? orderid.hashCode() : 0);
        result = 31 * result + (commodity != null ? commodity.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        result = 31 * result + (actprice != null ? actprice.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Orderitem{" +
                "id=" + id +
                ", orderid=" + orderid +
                ", commodity=" + commodity +
                ", discount=" + discount +
                ", actprice=" + actprice +
                ", amount=" + amount +
                '}';
    }
}

