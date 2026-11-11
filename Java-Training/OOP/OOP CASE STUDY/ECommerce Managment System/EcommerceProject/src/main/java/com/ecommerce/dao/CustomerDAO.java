package com.ecommerce.dao;

import com.ecommerce.config.DBConnection;
import com.ecommerce.model.Customer;
import com.mysql.cj.x.protobuf.MysqlxPrepare;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
    public boolean addCustomer(Customer customer)
    {
        String sql = "Insert into customers (name , email , phone , address , city , password) values (?,?,?,?,?,?)";
        try(Connection connection= DBConnection.getConnection();
            PreparedStatement statement=connection.prepareStatement(sql))
            {
               statement.setString(1,customer.getName());
                statement.setString(2, customer.getEmail());
                statement.setString(3, customer.getPhone());
                statement.setString(4, customer.getAddress());
                statement.setString(5, customer.getCity());
                statement.setString(6,customer.getPassword());

                int rowsInserted = statement.executeUpdate();
                return rowsInserted >0;
            }
         catch (SQLException e) {
            System.out.println("Error adding customer: " + e.getMessage());
            return false;
        }
    }
    public List<Customer> getAllCustomers()
    {
        List<Customer> customerList=new ArrayList<>();
        String sql="Select * from customers";

        try(Connection connection = DBConnection.getConnection();
        PreparedStatement statement=connection.prepareStatement(sql);
            ResultSet resultSet=statement.executeQuery())
        {
            while(resultSet.next())
            {
                Customer customer=new Customer(resultSet.getInt("customer_id"),resultSet.getString("name"),resultSet.getString("email"),resultSet.getString("phone"),resultSet.getString("address"),resultSet.getString("city"));
                customer.setPassword(resultSet.getString("password"));
                customerList.add(customer);
            }
        }
        catch (SQLException e)
        {
            System.out.println("Error Retriving Customer Details :"+e.getMessage());
        }
        return customerList;

    }
    public Customer getCustomerById(int customerId) {
        String sql = "SELECT * FROM customers WHERE customer_id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, customerId);

            try (ResultSet resultSet = statement.executeQuery()) {

                if (resultSet.next()) {

                    return new Customer(
                            resultSet.getInt("customer_id"),
                            resultSet.getString("name"),
                            resultSet.getString("email"),
                            resultSet.getString("phone"),
                            resultSet.getString("address"),
                            resultSet.getString("city")
                    );

                }
            }

        } catch (SQLException e) {
            System.out.println("Error searching customer: " + e.getMessage());
        }

        return null;
    }

    public List<Customer> getCustomersByName(String name)
    {
        String sql="Select * from customers where name = "+name;
        List<Customer> customerList=new ArrayList<>();
        try(Connection connection=DBConnection.getConnection();
        PreparedStatement statement=connection.prepareStatement(sql);
        ResultSet resultSet=statement.executeQuery())
        {
            while(resultSet.next())
            {
                Customer customer=new Customer(resultSet.getInt("customer_id"),resultSet.getString("name"),resultSet.getString("email"),resultSet.getString("phone"),resultSet.getString("address"),resultSet.getString("city"));
                customer.setPassword(resultSet.getString("password"));
                customerList.add(customer);
            }
        }
        catch (SQLException e)
        {
            System.out.println("Error Searching customer :"+e.getMessage());
        }
        return customerList;
    }
    public List<Customer> getCustomersByCity(String city) {

        List<Customer> customerList = new ArrayList<>();

        String sql = "SELECT * FROM customers WHERE city = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, city);

            try (ResultSet resultSet = statement.executeQuery()) {

                while (resultSet.next()) {

                    Customer customer = new Customer(
                            resultSet.getInt("customer_id"),
                            resultSet.getString("name"),
                            resultSet.getString("email"),
                            resultSet.getString("phone"),
                            resultSet.getString("address"),
                            resultSet.getString("city")
                    );

                    customerList.add(customer);
                }
            }

        } catch (SQLException e) {
            System.out.println("Error searching customers by city: "
                    + e.getMessage());
        }

        return customerList;


    }
    public Customer getCustomerByPhone(String phone) {

   String sql = "SELECT * FROM customers WHERE phone = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, phone);

            try (ResultSet resultSet = statement.executeQuery()) {

                if (resultSet.next()) {

                    return new Customer(
                            resultSet.getInt("customer_id"),
                            resultSet.getString("name"),
                            resultSet.getString("email"),
                            resultSet.getString("phone"),
                            resultSet.getString("address"),
                            resultSet.getString("city")
                    );
                }
            }

        } catch (SQLException e) {
            System.out.println("Error searching customer by phone: "
                    + e.getMessage());
        }

        return null;

    }
    public Customer getCustomerByEmail(String email) {


        String sql = "SELECT * FROM customers WHERE email = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, email);

            try (ResultSet resultSet = statement.executeQuery()) {

                if (resultSet.next()) {

                    Customer customer=new  Customer(
                            resultSet.getInt("customer_id"),
                            resultSet.getString("name"),
                            resultSet.getString("email"),
                            resultSet.getString("phone"),
                            resultSet.getString("address"),
                            resultSet.getString("city")
                    );
                    customer.setPassword(resultSet.getString("password"));
                    return customer;
                }
            }

        } catch (SQLException e) {
            System.out.println("Error searching customer by email: "
                    + e.getMessage());
        }

        return null;

    }
    public boolean deleteCustomer(int customerId) {


        String sql = "DELETE FROM customers WHERE customer_id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, customerId);

            int rowsDeleted = statement.executeUpdate();

            return rowsDeleted > 0;

        } catch (SQLException e) {
            System.out.println("Error deleting customer: " + e.getMessage());
            return false;
        }
    }
        public boolean updateCustomer(Customer customer) {

            String sql = "UPDATE customers SET name = ?, email = ?, phone = ?, "
                    + "address = ?, city = ? WHERE customer_id = ?";

            try (Connection connection = DBConnection.getConnection();
                 PreparedStatement statement = connection.prepareStatement(sql)) {

                statement.setString(1, customer.getName());
                statement.setString(2, customer.getEmail());
                statement.setString(3, customer.getPhone());
                statement.setString(4, customer.getAddress());
                statement.setString(5, customer.getCity());
                statement.setInt(6, customer.getCustomer_id());

                int rowsUpdated = statement.executeUpdate();

                return rowsUpdated > 0;

            } catch (SQLException e) {
                System.out.println("Error updating customer: " + e.getMessage());
                return false;
            }

        }
    }
