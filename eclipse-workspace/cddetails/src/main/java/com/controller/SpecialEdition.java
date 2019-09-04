package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.resource.beans.container.internal.CdiBasedBeanContainer;

import com.hibernate.inheritance.CD;
import com.hibernate.inheritance.InternationalCD;
import com.hibernate.inheritance.SpecialEditionCD;

/**
 * Servlet implementation class SpecialEdition
 */
public class SpecialEdition extends HttpServlet {
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String newfeature= request.getParameter("newfeature");
		
		
		HttpSession session1= request.getSession();
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(CdiBasedBeanContainer.class).addAnnotatedClass(InternationalCD.class).
				addAnnotatedClass(SpecialEditionCD.class).buildSessionFactory();
		Session session=factory.openSession();
		session.getTransaction().begin();
		
		CD cd= (CD) session1.getAttribute("se");
		
		SpecialEditionCD secd= new SpecialEditionCD( cd.getTitle(),cd.getArtist(),cd.getPurchasedate(),cd.getCost(),newfeature);
		session.persist(secd);
		session.getTransaction().commit();
		System.out.println("success");
	}
}
