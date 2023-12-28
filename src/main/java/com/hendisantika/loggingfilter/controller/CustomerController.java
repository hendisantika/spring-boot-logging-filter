package com.hendisantika.loggingfilter.controller;

import com.hendisantika.loggingfilter.model.Customer;
import com.hendisantika.loggingfilter.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-logging-filter
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/28/23
 * Time: 07:54
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getAllCustomers();
    }

}
