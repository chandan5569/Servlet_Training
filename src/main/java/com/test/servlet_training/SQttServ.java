package com.test.servlet_training;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sq")
public class SQttServ extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int x = (int) req.getAttribute("k");
        int y=x*x;
        PrintWriter out = res.getWriter();
        out.println("Square After Addition of two number is: "+y);

    }
}
