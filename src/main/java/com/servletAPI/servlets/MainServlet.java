package com.servletAPI.servlets;

import com.servletAPI.listener.MyAppListener;
import com.servletAPI.services.MyService;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Singleton
public class MainServlet extends HttpServlet {

    @Inject
    private MyService myService;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(myService.sayHello());
        System.out.println("123");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("111");
        //req.setAttribute("myAttr", "Kristy");
        //req.getRequestDispatcher("jsp/mainpage.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        String text = req.getParameter("userinputtext");
        System.out.println(text);

        req.setAttribute("myattr2", text);
        req.getRequestDispatcher("jsp/mainpage.jsp").forward(req, resp);

    }
}
