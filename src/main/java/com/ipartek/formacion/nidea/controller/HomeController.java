package com.ipartek.formacion.nidea.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeController
 */
@WebServlet( urlPatterns={"/","/noticias"} )
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {			
	
		//Cliente
		
		//Conseguir noticias
		
		ArrayList<String>noticias= new ArrayList<>();
		noticias.add("UA gana en Ruby");
		noticias.add("UA 500");
		noticias.add("UA gana en futbol");
		
		//Pasar como atributo en request
		request.setAttribute("noticias", noticias);
		request.getRequestDispatcher("noticias.jsp").forward(request, response);		
	}

}
