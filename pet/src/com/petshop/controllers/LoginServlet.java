package com.petshop.controllers;

import com.petshop.beans.Customer;
import com.petshop.services.CustomerService;
import com.petshop.services.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	private final CustomerService customerService;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
		customerService=new CustomerServiceImpl();
		// TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	Customer user=	(Customer)request.getSession().getAttribute("user");
	
	if(user!=null)
	request.setAttribute("message","Bonjour "+user.getUsername());	
	//else
	//	request.setAttribute("message","");
		
	//request.setAttribute("error", "");

		RequestDispatcher rd = getServletContext().getRequestDispatcher("/myaccount.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String password=request.getParameter("password");

		RequestDispatcher rd ;
        boolean isUserValid=false;
    	if(customerService.checkCredentials(username, password)) {
			/**
			 * create session and store it
			 */
             Customer user =customerService.getCustomerByUsername(username);
					request.getSession().setAttribute("user",user);
					isUserValid=true;

		}
       
	    if(isUserValid)
	    response.sendRedirect(request.getContextPath()+"/index.jsp");

	    else {
			request.setAttribute("error", "username/mots de passe est incorrect ");
			rd = getServletContext().getRequestDispatcher("/myaccount.jsp");
			rd.forward(request, response);
		}


}
}