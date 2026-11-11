package com.ecommerce;

import com.ecommerce.dao.CustomerDAO;
import com.ecommerce.model.Customer;

import javax.swing.*;

public class LoginForm {

    public static void showForm()
    {
        String email = JOptionPane.showInputDialog("Enter The Email");
        if(email == null)
            return;
        String password = JOptionPane.showInputDialog("Enter The Password");

        if(password == null)
            return;

        try
        {
            CustomerDAO customerDAO=new CustomerDAO();

            Customer customer=customerDAO.getCustomerByEmail(email);

            if(customer!=null && password.equals(customer.getPassword()))
            {
                HomeMenu.showMenu(customer.getName());
            }
            else
            {
                JOptionPane.showMessageDialog(
                        null,
                        "Invalid Email or Password",
                        "Login Failed",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(
                    null,"Login error : " + e.getMessage()
            );
        }
    }
}
