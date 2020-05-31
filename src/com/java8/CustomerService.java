package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class CustomerService {

    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<Customer>();

        customerList.add(new Customer(1,"Jaiprakash"));
        customerList.add(new Customer(2,"Prakash"));
        customerList.add(new Customer(3,"jai"));
        customerList.add(new Customer(4,"Ajai"));
        customerList.add(new Customer(5,"na"));

        System.out.println(customerList.size());

   
        List<Customer> list = customerList
                .stream()
                .filter(c -> c.getName().length()>5)
                .collect(Collectors.toList());


        System.out.println("Customer Name length > 5 :: "+list);

        List<Customer> sortedlist = customerList
                .stream()
                .sorted(Comparator.comparing(Customer :: getId).reversed())
                .collect(Collectors.toList());

        System.out.println("Sorted Customer List :: "+sortedlist);

    }

}


