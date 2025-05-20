package com.xworkz.mobile.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/complaint" , loadOnStartup = 1)
public class Complaint extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running Complaint servlet");
        String name=servletRequest.getParameter("personName");
        String age=servletRequest.getParameter("age");
        String address=servletRequest.getParameter("address");
        String gender=servletRequest.getParameter("gender");
        String complaint=servletRequest.getParameter("complaint");
        String suspect=servletRequest.getParameter("whom");
        System.out.println("Name :"+name+" Age :"+age+" Address :"+address+" gender"+gender+" complaint :"+complaint+" Suspect"+suspect);

    }
}
