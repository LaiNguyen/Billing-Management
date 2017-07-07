/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import util.HibernateUtil;

/**
 *
 * @author admin
 */
public class UserOrder implements java.io.Serializable, Persistence {

    private int id;
    private int billingId;
    private int dishId;
    private Date createdAt;
    private Date updatedAt;
    private String createdBy;
    private String updatedBy;
    
    // query static property
    private static String QUERY_BASED_ON_BILLING_ID = "from UserOrder a where a.billingId=";
    private static String QUERY_BASED_ON_BILLING_DISH_ID = "from UserOrder a where a.billingId=%d and a.dishId=%d";

    public UserOrder() {
        this.createdAt = new Date();
        this.updatedAt = new Date();
        this.createdBy = "Lai";
        this.updatedBy = "Lai";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBillingId() {
        return billingId;
    }

    public void setBillingId(int billingId) {
        this.billingId = billingId;
    }

    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
    
    public boolean insert() {
        try {
            HibernateUtil.executeInsertHQLQuery(this);
        } catch (HibernateException he) {
            System.out.println("error while run func HibernateUtil.executeInsertHQLQuery to insert UserOrder record: " + he.getMessage());
            return false;
        }
        return true;
    }
    
    public boolean delete() {
        String query = String.format("delete UserOrder where id=%d", this.id);
        try {
            HibernateUtil.executeUpdateHQLQuery(query);
        } catch (HibernateException he) {
            System.out.println("error while run func HibernateUtil.executeUpdateHQLQuery to delete UserOrder record: " + he.getMessage());
            return false;
        }
        return true;
    }
    
    public static UserOrder findByBillingIdAndDishId(int billingId, int dishId) {
        String query = String.format(QUERY_BASED_ON_BILLING_DISH_ID, billingId, dishId);
        List<UserOrder> result = new ArrayList<UserOrder>();
        result = HibernateUtil.executeSelectHQLQuery(query);
        if (result.size() > 0) {
            return result.get(0);
        }
        return null;
    }
    
    static List<UserOrder> findByBilllingId(int billingId) {
        String query = QUERY_BASED_ON_BILLING_ID + billingId;
        List<UserOrder> result = new ArrayList<UserOrder>();
        result = HibernateUtil.executeSelectHQLQuery(query);
        return result;
    }
    
}
