package com.hendisantika.loggingfilter.service;

import com.hendisantika.loggingfilter.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-logging-filter
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/28/23
 * Time: 07:50
 * To change this template use File | Settings | File Templates.
 */
@Service
public class CustomerService {

    List<Customer> getAllCustomers() {
        return List.of(new Customer(1, "Naruto", "Naruto"),
                new Customer(2, "Sasuke", "Naruto"),
                new Customer(3, "Yuji", "Jujustu Kaisen"),
                new Customer(4, "Roronoa Zoro", "One Piece"),
                new Customer(5, "Tanjiro", "Kimetsu no Yaiba"));

    }
}
