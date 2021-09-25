package com.test.servlet_training;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/square")
public class SquareServ extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));
        int k=i+j;
        int x = k*k;
        PrintWriter out = res.getWriter();
        out.println("Square of two numbers is: "+x);
    }
}

