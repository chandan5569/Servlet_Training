package com.test.servlet_training;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addt") //addt is the url coming from the form action.

public class AddtServ extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));
        int k=i+j;

        //Session Management.
        //Passing the data from one servlet to another.
        req.setAttribute("k",k);

        //Request Dispatcher.

        //request dispatcher is used for send the request from one to others.
        RequestDispatcher rd = req.getRequestDispatcher("sq");   //Here sq is the url for the SQttServ Servlet.
        rd.forward(req,res);

    }
}
