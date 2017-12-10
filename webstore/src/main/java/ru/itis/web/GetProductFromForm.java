package ru.itis.web;

import ru.itis.dao.ProductsDao;
import ru.itis.dao.ProductsDaoImpl;
import ru.itis.models.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class GetProductFromForm extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String str = "<html>\n" +
            "<head>\n" +
            "    <title>First page</title>\n" +
            "\n" +
            "</head>\n" +
            "<body>\n" +
            "<form action=\"/process\" method=\"POST\">\n" +
            "    <label>\n" +
            "        name<input type=\"text\" name=\"name\">\n" +
            "    </label>\n" +
            "    <br><br>\n" +
            "    <label>\n" +
            "        factory<input type=\"text\" name=\"factory\">\n" +
            "    </label>\n" +
            "    <br><br>\n" +
            "    <label>\n" +
            "        price<input type=\"text\" name=\"price\">\n" +
            "    </label>\n" +
            "    <br><br>\n" +
            "    <label>\n" +
            "        count<input type=\"text\" name=\"count\">\n" +
            "    </label>\n" +
            "    <br><br>\n" +
            "    <input type=\"submit\">\n" +
            "</form>\n" +
            "</body>\n" +
            "</html>\n";
    resp.getWriter().write(str);
    }
}
