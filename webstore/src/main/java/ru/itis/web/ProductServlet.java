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

public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        int productId = Integer.parseInt(id);
        try {
            ProductsDao dao = new ProductsDaoImpl();
            Product product = dao.getProduct(productId);
            resp.getWriter().write(product.toString());
            String str = "<html>\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>First page</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<h1>Продукты</h1>";
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
