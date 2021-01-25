<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="cart" scope="session" class="com.petshop.beans.Cart" />

<div class="right_content">
    <div class="languages_box">
        <span class="red">Languages:</span>
        <a href="#" class="selected"><img src="images/gb.gif" alt="" title="" border="0" /></a>
        <a href="#"><img src="images/fr.gif" alt="" title="" border="0" /></a>
        <a href="#"><img src="images/de.gif" alt="" title="" border="0" /></a>
    </div>
    <div class="currency">
        <span class="red">Currency: </span>
        <a href="#">GBP</a>
        <a href="#">EUR</a>
        <a href="#" class="selected">USD</a>
    </div>


    <div class="cart">
        <div class="title"><span class="title_icon"><img src="images/cart.gif" alt="" title="" /></span>My cart</div>
        <div class="home_cart_content">
            <%=cart.getQuantity() %> x items | <span class="red">TOTAL: <%=cart.getTotal() %>$</span>
        </div>
        <a href="cart.jsp" class="view_cart">view my cart</a>

    </div>




    <div class="title"><span class="title_icon"><img src="images/bullet3.gif" alt="" title="" /></span>About Our Shop</div>
    <div class="about">
        <p>
            <img src="images/about.gif" alt="" title="" class="right" />
            Pet Shop offers you the products of the best brands and the complete selection of kibbles, treats, beds, cat trees, toys, accessories, grooming, decorations, ...
        </p>

    </div>

    <div class="right_box">

        <div class="title"><span class="title_icon"><img src="images/bullet4.gif" alt="" title="" /></span>Promotions</div>
        <div class="new_prod_box">
            <a href="details.html">product name</a>
            <div class="new_prod_bg">
                <span class="new_icon"><img src="images/promo_icon.gif" alt="" title="" /></span>
                <a href="details.html"><img src="images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>
            </div>
        </div>

        <div class="new_prod_box">
            <a href="details.html">product name</a>
            <div class="new_prod_bg">
                <span class="new_icon"><img src="images/promo_icon.gif" alt="" title="" /></span>
                <a href="details.html"><img src="images/thumb2.gif" alt="" title="" class="thumb" border="0" /></a>
            </div>
        </div>

        <div class="new_prod_box">
            <a href="details.html">product name</a>
            <div class="new_prod_bg">
                <span class="new_icon"><img src="images/promo_icon.gif" alt="" title="" /></span>
                <a href="details.html"><img src="images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
            </div>
        </div>

    </div>

    <div class="right_box">

        <div class="title"><span class="title_icon"><img src="images/bullet5.gif" alt="" title="" /></span>Categories</div>

        <ul class="list">
            <li><a href="#">accesories</a></li>
            <li><a href="#">pets gifts</a></li>
            <li><a href="#">specials</a></li>
            <li><a href="#">hollidays gifts</a></li>
            <li><a href="#">accesories</a></li>
            <li><a href="#">pets gifts</a></li>
            <li><a href="#">specials</a></li>
            <li><a href="#">hollidays gifts</a></li>
            <li><a href="#">accesories</a></li>
            <li><a href="#">pets gifts</a></li>
            <li><a href="#">specials</a></li>
        </ul>

        <div class="title"><span class="title_icon"><img src="images/bullet6.gif" alt="" title="" /></span>Partners</div>

        <ul class="list">
            <li><a href="#">accesories</a></li>
            <li><a href="#">pets gifts</a></li>
            <li><a href="#">specials</a></li>
            <li><a href="#">hollidays gifts</a></li>
            <li><a href="#">accesories</a></li>
            <li><a href="#">pets gifts</a></li>
            <li><a href="#">specials</a></li>
            <li><a href="#">hollidays gifts</a></li>
            <li><a href="#">accesories</a></li>
        </ul>

    </div>


</div><!--end of right content-->




<div class="clear"></div>
</div><!--end of center content-->


<div class="footer">
    <div class="left_footer"><img src="images/footer_logo.gif" alt="" title="" /><br /> <a href="http://csscreme.com/freecsstemplates/" title="free css templates"><img src="images/csscreme.gif" alt="free css templates" border="0" /></a></div>
    <div class="right_footer">
        <a href="#">home</a>
        <a href="#">about us</a>
        <a href="#">services</a>
        <a href="#">privacy policy</a>
        <a href="#">contact us</a>

    </div>


</div>


</div>

</body>
</html>