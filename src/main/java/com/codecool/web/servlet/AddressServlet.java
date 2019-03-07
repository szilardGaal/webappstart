package com.codecool.web.servlet;

import com.codecool.web.model.Address;
import com.codecool.web.service.AddressService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/address")
public class AddressServlet extends HttpServlet {

    private final AddressService service = new AddressService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        service.addAddress(new Address(req.getParameter("e_mail")));
        req.setAttribute("service", service.getAddresses());
        req.getRequestDispatcher("address.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
