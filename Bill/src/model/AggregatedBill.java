/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public class AggregatedBill {

    private String dishName;
    private int type;
    private int quantity;
    private float cost;
    private int billingId;
    private int dishId;

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

    public AggregatedBill(String dishName, int type, int quantity, float cost, int billingId, int dishId) {
        this.dishName = dishName;
        this.type = type;
        this.quantity = quantity;
        this.cost = cost;
        this.billingId = billingId;
        this.dishId = dishId;
    }

    private AggregatedBill() {
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
    public static Map<Integer, AggregatedBill> findByBilllingId(int billingId) {
        Map<Integer, AggregatedBill> allAggregatedBills = new HashMap<Integer, AggregatedBill>();
        List<UserOrder> userOrders = UserOrder.findByBilllingId(billingId);
        Dish dish;
        for(UserOrder userOrder : userOrders) {
            AggregatedBill aggregatedBill = allAggregatedBills.get(userOrder.getDishId());
            dish = Dish.findById(userOrder.getDishId());
            if (aggregatedBill != null) {
                aggregatedBill.setQuantity(aggregatedBill.getQuantity()+1);
            } else {
                aggregatedBill = new AggregatedBill();
                aggregatedBill.setDishName(dish.getName());
                aggregatedBill.setType(dish.getType());
                aggregatedBill.setQuantity(1);
                aggregatedBill.setBillingId(billingId);
                aggregatedBill.setDishId(dish.getId());
            }
            aggregatedBill.setCost(aggregatedBill.getQuantity() * dish.getPrice());
            
            allAggregatedBills.put(userOrder.getDishId(), aggregatedBill);
        }
        return allAggregatedBills;
    }
}
