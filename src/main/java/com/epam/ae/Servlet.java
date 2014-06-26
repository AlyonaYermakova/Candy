package com.epam.ae;

import com.epam.ae.entity.CandyBox;
import com.epam.ae.entity.CandyBoxFactory;

import java.io.IOException;

public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        CandyBox candyBox = new CandyBox();
        try {
            request.setAttribute("candyBox", CandyBoxFactory.createRandomCandyBox());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }
}
