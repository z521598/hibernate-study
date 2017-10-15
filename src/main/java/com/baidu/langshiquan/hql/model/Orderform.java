package com.baidu.langshiquan.hql.model;

import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by langshiquan on 17/10/15.
 */
@Entity
public class Orderform {
    private int id;
    private Integer customer;
    private Date tradedate;
    private String status;
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
    @Column(name = "customer")
    public Integer getCustomer() {
        return customer;
    }

    public void setCustomer(Integer customer) {
        this.customer = customer;
    }

    @Basic
    @Column(name = "tradedate")
    public Date getTradedate() {
        return tradedate;
    }

    public void setTradedate(Date tradedate) {
        this.tradedate = tradedate;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "amount")
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

        Orderform orderform = (Orderform) o;

        if (id != orderform.id) {
            return false;
        }
        if (customer != null ? !customer.equals(orderform.customer) : orderform.customer != null) {
            return false;
        }
        if (tradedate != null ? !tradedate.equals(orderform.tradedate) : orderform.tradedate != null) {
            return false;
        }
        if (status != null ? !status.equals(orderform.status) : orderform.status != null) {
            return false;
        }
        if (amount != null ? !amount.equals(orderform.amount) : orderform.amount != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (tradedate != null ? tradedate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Orderform{" +
                "id=" + id +
                ", customer=" + customer +
                ", tradedate=" + tradedate +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                '}';
    }
}
