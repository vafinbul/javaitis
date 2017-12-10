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

public class ProductAddingProccesing  extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Product product = new Product();
            ProductsDao productsDao = new ProductsDaoImpl();
            product.setName(req.getParameter("name"));
            product.setFactory(req.getParameter("factory"));
            product.setCount(req.getIntHeader("count"));
            product.setPrice(req.getIntHeader("price"));
            productsDao.addProduct(product);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
