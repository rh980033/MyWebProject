package com.liuliu.test;/*
 *
 *@Description //TODO
 *@Author 任磊
 *@Date 2019/12/28 - 11:14
 */

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo")
public class demo1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo1.service");
        test();
        //请求转发到index.jsp
        req.getRequestDispatcher("/WEB-INF/hello.jsp").forward(req,resp);
    }

    public static void test(){
        System.out.println("进入");
    }
}
