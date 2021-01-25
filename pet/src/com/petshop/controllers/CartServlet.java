package com.petshop.controllers;

import com.petshop.beans.Cart;
import com.petshop.beans.CartItem;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {


    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getSession().getAttribute("cart")==null)
        {
            Cart cart=new Cart();
            cart.AddToCart(new CartItem("product name",100,1));
            request.getSession().setAttribute("cart",cart);
        }
        else
        {
            Cart cart = (Cart)request.getSession().getAttribute("cart");
            cart.AddToCart(new CartItem("product name",100,1));
            request.getSession().setAttribute("cart",cart);
        }
        response.sendRedirect(request.getContextPath()+"/details.jsp");

    }

}
