package view;

import business.concretes.CustomerManager;
import dao.concretes.CustomerDao;
import entities.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new CustomerDao());

        /*Customer customer = new Customer();
        customer.setName("Ugur");
        customer.setMail("c.ugurongun@gmail.com");
        customer.setGender(Customer.Gender.MALE);
        customer.setCustomerOnDate(LocalDate.now());

        customerManager.save(customer);*/

        /*Customer c1 = customerManager.findById(1);
        System.out.println(c1);*/


    }

}
