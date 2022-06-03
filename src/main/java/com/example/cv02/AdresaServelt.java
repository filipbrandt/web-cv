package com.example.cv02;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "AdresaServelt", value = "/AdresaServelt")
public class AdresaServelt extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String meno = request.getParameter("meno");
        String priezvisko = request.getParameter("priezvisko");


        Adresa user = new Adresa(meno,priezvisko);

        response.getWriter().write(user.toString());
    }
}
