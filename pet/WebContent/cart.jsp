<%@ page import="com.petshop.beans.CartItem" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<jsp:include page="layouts/header.jsp" />

       <div class="center_content">
       	<div class="left_content">
            <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" /></span>My cart</div>
        
        	<div class="feat_prod_box_details">
                <jsp:useBean id="cart" scope="session" class="com.petshop.beans.Cart" />
                <table class="cart_table">
            	<tr class="cart_title">
                	<td>Item pic</td>
                	<td>Book name</td>
                    <td>Unit price</td>
                    <td>Qty</td>
                    <td>Total</td>               
                </tr>
                    <%
                        for (CartItem item :cart.getCartItems()) {
                            out.println("<tr>" +
                                    " <td><a href='details.jsp'><img src='images/cart_thumb.gif'  border='0' class='cart_thumb' /></a></td>" +
                                    " <td>"+item.getProductName()+"</td>" +
                                    " <td>"+item.getPrice()+"</td>" +
                                    " <td>"+item.getQuantity()+"</td>" +
                                    " <td>"+item.getTotal()+"</td>" +
                                    " </tr> ");
                        }
                    %>



                
                <tr>
                <td colspan="4" class="cart_total"><span class="red">TOTAL:</span></td>
                <td><%=cart.getTotal()%></td>
                </tr>                  
            
            </table>
            <a href="#" class="continue">&lt; continue</a>
            <a href="#" class="checkout">checkout &gt;</a>
            

             
            
            </div>	
            
              

            

            
        <div class="clear"></div>
        </div><!--end of left content-->

           <jsp:include page="layouts/footer.jsp" />
