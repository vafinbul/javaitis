package ru.itis.dao;

import ru.itis.models.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductsDaoImpl implements ProductsDao {
    private Connection c;

    public ProductsDaoImpl() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        c = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/testdb",
                        "postgres", "postgres");
    }

    @Override
    public Product getProduct(int id) throws ClassNotFoundException, SQLException {
        Statement stmt = c.createStatement();
        String sql = "SELECT * FROM products WHERE id = " + id;
        ResultSet rs = stmt.executeQuery(sql);
        rs.next();
        String name = rs.getString("name");
        String factory = rs.getString("factory");
        int price = rs.getInt("price");
        int count = rs.getInt("count");
        Product product = new Product(id, name, factory, price, count);
        stmt.close();
        return product;
    }

    @Override
    public List<Product> getAllProducts() throws SQLException {
        String sql = "SELECT * FROM products;";
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        List<Product> list = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String factory = rs.getString("factory");
            int price = rs.getInt("price");
            int count = rs.getInt("count");
            Product product = new Product(id, name, factory, price, count);
            list.add(product);
        }
        return list;
    }

    @Override
    public List<Product> getProductByFactory(String factory) throws SQLException {
        String sql = "SELECT * FROM products WHERE factory = ?;";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, factory);
        ResultSet rs = stmt.executeQuery(sql);
        List<Product> list = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int price = rs.getInt("price");
            int count = rs.getInt("count");
            Product product = new Product(id, name, factory, price, count);
            list.add(product);
        }
        return list;
    }

    @Override
    public void addProduct(Product product) throws SQLException {
        String sql = "INSERT INTO products(name, factory, price, count) VALUES(?,?,?,?)";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1,product.getName());
        stmt.setString(2,product.getFactory());
        stmt.setInt(3,product.getPrice());
        stmt.setInt(4,product.getCount());
        stmt.executeUpdate();
        System.out.println("Product is added");

    }

    @Override
    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM products WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1,id);
        stmt.executeUpdate();
        System.out.println("Product with id"+ id +" is deleted");
    }

    @Override
    public void update(Product product) throws SQLException {
        String sql = "UPDATE products SET name = ?,factory = ?,price = ?, count = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1,product.getName());
        stmt.setString(2,product.getFactory());
        stmt.setInt(3,product.getPrice());
        stmt.setInt(4,product.getCount());
        stmt.executeUpdate();
        System.out.println("Product is updated");
    }
}
