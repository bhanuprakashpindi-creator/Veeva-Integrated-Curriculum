package com.ecommerce;

import com.ecommerce.dao.CustomerDAO;
import com.ecommerce.model.Customer;

import javax.swing.*;
import java.awt.*;

public class RegistrationForm {

    public static void showForm() {

        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        JTextField phoneField = new JTextField();
        JTextField addressField = new JTextField();
        JTextField cityField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        JPanel panel = new JPanel(new GridLayout(6, 2, 8, 8));

        panel.add(new JLabel("Full Name:"));
        panel.add(nameField);

        panel.add(new JLabel("Email:"));
        panel.add(emailField);

        panel.add(new JLabel("Phone:"));
        panel.add(phoneField);

        panel.add(new JLabel("Address:"));
        panel.add(addressField);

        panel.add(new JLabel("City:"));
        panel.add(cityField);

        panel.add(new JLabel("Password:"));
        panel.add(passwordField);

        int result = JOptionPane.showConfirmDialog(
                null,
                panel,
                "Customer Registration",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );

        if (result == JOptionPane.OK_OPTION) {

            String name = nameField.getText().trim();
            String email = emailField.getText().trim();
            String phone = phoneField.getText().trim();
            String address = addressField.getText().trim();
            String city = cityField.getText().trim();
            String password = new String(passwordField.getPassword());

            if (name.isEmpty()
                    || email.isEmpty()
                    || phone.isEmpty()
                    || password.isEmpty()) {

                JOptionPane.showMessageDialog(
                        null,
                        "Name, email, phone, and password are required.",
                        "Validation Error",
                        JOptionPane.ERROR_MESSAGE
                );

                return;
            }

            try {
                Customer customer = new Customer(
                        name, email, phone, address, city
                );

                customer.setPassword(password);

                CustomerDAO customerDAO = new CustomerDAO();
                customerDAO.addCustomer(customer);

                JOptionPane.showMessageDialog(
                        null,
                        "Registration successful!"
                );

            } catch (Exception e) {

                JOptionPane.showMessageDialog(
                        null,
                        "Registration failed: " + e.getMessage()
                );
            }
        }
    }
}