package com.ecommerce;

import com.ecommerce.dao.CustomerDAO;
import com.ecommerce.model.Customer;

import javax.swing.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String options[]={"Register" , "Login" , "Exit"};
        int choice = JOptionPane.showOptionDialog(
                null,
                "Welcome ! Please Select an Option",
                "Welecom To Shopping",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]
        );

        switch (choice)
        {
            case 0 :
                RegistrationForm.showForm();
                break;
            case 1:
                LoginForm.showForm();
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Thank You For Visiting");
                break;
            default:
                JOptionPane.showMessageDialog(null,"No Option Selected");
                break;
        }

    }
}
