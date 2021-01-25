package com.petshop.beans;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private double total;
    private double  quantity;
    private List<CartItem> cartItems=new ArrayList<>();

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void AddToCart(CartItem cartItem) {
        this.cartItems.add(cartItem);
        this.quantity=cartItems.size();
        this.total=this.total+cartItem.getTotal();
    }

    public Cart() { }

    public Cart(int total, double quantity) {
        this.total = total;
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }



    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
