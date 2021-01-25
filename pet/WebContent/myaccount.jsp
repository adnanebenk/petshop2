<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<jsp:include page="layouts/header.jsp" />

       <div class="center_content">
       	<div class="left_content">
            <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" /></span>My account</div>

        	<div class="feat_prod_box_details">
            <p class="details">
                <c:if test="${requestScope.message!=null}">
                <h3 style='color:green;'><%=request.getAttribute("message") %></h3>
                <form action='"+logoutPath+"' method='post'>
                    <input style='background-color: darkorange' type='submit' value='Logout'>
                </form>
                </c:if>


             Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud.
            </p>
            
              	<div class="contact_form">
                <div class="form_subtitle">login into your account</div>

                    <c:if test="${requestScope.error!=null}">
                        <h3 style='color:red;'><%=request.getAttribute("error") %></h3>
                    </c:if>



<c:if test="${requestScope.message==null}">
                 <form name="register" action="${pageContext.request.contextPath}/login" method="post" >
                    <div class="form_row">
                    <label class="contact"><strong>Username:</strong></label>
                    <input type="text" name="username" class="contact_input" />
                    </div>


                    <div class="form_row">
                    <label class="contact"><strong>Password:</strong></label>
                    <input type="text" name="password" class="contact_input" />
                    </div>

                    <div class="form_row">
                        <div class="terms">
                        <input type="checkbox" name="terms" />
                        Remember me
                        </div>
                        <input style="background-color: darkslategray;color: white;font-size: medium"
                               type="submit"  value="login" />

                    </div>

                  </form>
                  </c:if>

                </div>  
            
            </div>	
            
              

            

            
        <div class="clear"></div>
        </div><!--end of left content-->

           <jsp:include page="layouts/footer.jsp" />
