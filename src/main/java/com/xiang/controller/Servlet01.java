package com.xiang.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet01 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String path = req.getServletPath();
        System.out.println(path);

        if ("/student/save.do".equals(path)){
            sava(req,resp);
        }else if ("/student/delete.do".equals(path)){
            delete(req,resp);
        }else if ("/student/update.do".equals(path)){
            update(req,resp);
        }else if ("/student/select.do".equals(path)){
            select(req,resp);
        }
    }

    private void select(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("查");
    }

    private void update(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("改");
    }

    private void delete(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("删");
    }

    private void sava(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("增");
    }
}
