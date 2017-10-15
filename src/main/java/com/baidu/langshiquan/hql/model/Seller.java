package com.baidu.langshiquan.hql.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by langshiquan on 17/10/15.
 */
@Entity
public class Seller {
    private int id;
    private String name;
    private String tel;
    private String address;
    private String website;
    private Integer star;
    private String business;

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
    @Column(name = "tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "website")
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Basic
    @Column(name = "star")
    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    @Basic
    @Column(name = "business")
    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Seller seller = (Seller) o;

        if (id != seller.id) {
            return false;
        }
        if (name != null ? !name.equals(seller.name) : seller.name != null) {
            return false;
        }
        if (tel != null ? !tel.equals(seller.tel) : seller.tel != null) {
            return false;
        }
        if (address != null ? !address.equals(seller.address) : seller.address != null) {
            return false;
        }
        if (website != null ? !website.equals(seller.website) : seller.website != null) {
            return false;
        }
        if (star != null ? !star.equals(seller.star) : seller.star != null) {
            return false;
        }
        if (business != null ? !business.equals(seller.business) : seller.business != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (website != null ? website.hashCode() : 0);
        result = 31 * result + (star != null ? star.hashCode() : 0);
        result = 31 * result + (business != null ? business.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", website='" + website + '\'' +
                ", star=" + star +
                ", business='" + business + '\'' +
                '}';
    }
}
