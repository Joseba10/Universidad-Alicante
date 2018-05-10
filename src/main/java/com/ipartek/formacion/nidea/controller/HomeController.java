package com.ipartek.formacion.nidea.controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import UASI.WS_GRAL_wsdl.ClaseDiasFestivos;
import UASI.WS_GRAL_wsdl.ClaseNoticias;
import UASI.WS_GRAL_wsdl.Pub_gralSoapProxy;

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
	
		//Url Cliente
		
		
	
		//Conseguir noticias
	
		Pub_gralSoapProxy client= new Pub_gralSoapProxy();
		
		
		ClaseNoticias[] wsnoticias =client.wsnoticias("C","2005-02-02");
		ClaseDiasFestivos[] festivos =client.wsdiasfestivos("C","2015-16");
		
		
		ArrayList<String>noticias= new ArrayList<>();
		noticias.add("UA gana en Ruby");
		noticias.add("UA 500");
		noticias.add("UA gana en futbol");
		
		//Pasar como atributo en request
		request.setAttribute("noticias", wsnoticias);
		request.setAttribute("festivos", festivos);
		
		request.getRequestDispatcher("noticias.jsp").forward(request, response);		
	}

}
