package com.ecommerce.dao;

import com.ecommerce.config.DBConnection;
import com.ecommerce.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    // Extract one Product object from the database result
    private Product extractProduct(ResultSet rs) throws SQLException {

        Product product = new Product();

        product.setProductId(rs.getInt("product_id"));
        product.setProductName(rs.getString("product_name"));
        product.setCompany(rs.getString("company"));
        product.setPrice(rs.getDouble("price"));
        product.setDescription(rs.getString("description"));
        product.setStockQuantity(rs.getInt("stock_quantity"));

        return product;
    }

    // 1. Search by Product ID
    public Product findByProductId(int productId) throws SQLException {

        String sql = """
                SELECT *
                FROM products
                WHERE product_id = ?
                LIMIT 1
                """;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, productId);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    return extractProduct(rs);
                }
            }
        }

        return null;
    }

    // 2. Search by Product Name
    public Product findByProductName(String productName)
            throws SQLException {

        String sql = """
                SELECT *
                FROM products
                WHERE product_name LIKE ?
                LIMIT 1
                """;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, "%" + productName + "%");

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    return extractProduct(rs);
                }
            }
        }

        return null;
    }

    // 3. Search by Product Name and Exact Price
    public Product findByNameAndPrice(
            String productName,
            double price) throws SQLException {

        String sql = """
                SELECT *
                FROM products
                WHERE product_name LIKE ?
                AND price = ?
                LIMIT 1
                """;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, "%" + productName + "%");
            ps.setDouble(2, price);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    return extractProduct(rs);
                }
            }
        }

        return null;
    }

    // 4. Search by Product Name and Price Range
    public Product findByNameAndPriceRange(
            String productName,
            double minPrice,
            double maxPrice) throws SQLException {

        String sql = """
                SELECT *
                FROM products
                WHERE product_name LIKE ?
                AND price BETWEEN ? AND ?
                LIMIT 1
                """;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, "%" + productName + "%");
            ps.setDouble(2, minPrice);
            ps.setDouble(3, maxPrice);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    return extractProduct(rs);
                }
            }
        }

        return null;
    }

    // 5. Search by Product Name and Company
    public Product findByNameAndCompany(
            String productName,
            String company) throws SQLException {

        String sql = """
                SELECT *
                FROM products
                WHERE product_name LIKE ?
                AND company LIKE ?
                LIMIT 1
                """;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, "%" + productName + "%");
            ps.setString(2, "%" + company + "%");

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    return extractProduct(rs);
                }
            }
        }

        return null;
    }

    // 6. Search by Product Name, Company and Exact Price
    public Product findByNameCompanyAndPrice(
            String productName,
            String company,
            double price) throws SQLException {

        String sql = """
                SELECT *
                FROM products
                WHERE product_name LIKE ?
                AND company LIKE ?
                AND price = ?
                LIMIT 1
                """;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, "%" + productName + "%");
            ps.setString(2, "%" + company + "%");
            ps.setDouble(3, price);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    return extractProduct(rs);
                }
            }
        }

        return null;
    }

    // 7. Retrieve all products
    public List<Product> getAllProducts() throws SQLException {

        List<Product> products = new ArrayList<>();

        String sql = "SELECT * FROM products ORDER BY product_id";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                products.add(extractProduct(rs));
            }
        }

        return products;
    }

    // 8. Add a product
    public boolean addProduct(Product product) throws SQLException {

        String sql = """
                INSERT INTO products
                (product_name, company, price, description, stock_quantity)
                VALUES (?, ?, ?, ?, ?)
                """;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, product.getProductName());
            ps.setString(2, product.getCompany());
            ps.setDouble(3, product.getPrice());
            ps.setString(4, product.getDescription());
            ps.setInt(5, product.getStockQuantity());

            return ps.executeUpdate() > 0;
        }
    }

    // 9. Update a product
    public boolean updateProduct(Product product) throws SQLException {

        String sql = """
                UPDATE products
                SET product_name = ?,
                    company = ?,
                    price = ?,
                    description = ?,
                    stock_quantity = ?
                WHERE product_id = ?
                """;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, product.getProductName());
            ps.setString(2, product.getCompany());
            ps.setDouble(3, product.getPrice());
            ps.setString(4, product.getDescription());
            ps.setInt(5, product.getStockQuantity());
            ps.setInt(6, product.getProductId());

            return ps.executeUpdate() > 0;
        }
    }

    // 10. Delete a product
    public boolean deleteProduct(int productId) throws SQLException {

        String sql = "DELETE FROM products WHERE product_id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, productId);

            return ps.executeUpdate() > 0;
        }
    }
}