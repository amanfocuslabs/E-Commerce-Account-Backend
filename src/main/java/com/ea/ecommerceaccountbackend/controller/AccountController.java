package com.ea.ecommerceaccountbackend.controller;

import com.ea.ecommerceaccountbackend.model.Account;
import com.ea.ecommerceaccountbackend.model.Order;
import com.ea.ecommerceaccountbackend.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/rest/account/")
public class AccountController {

    @Autowired
    private AccountService accountService;
    @Autowired
    private RestTemplate restTemplate;

    String orderUrl="http://order-service:8090/rest/order/";


    @GetMapping("{id}")
    public Account getAccount(@PathVariable Long id) {
        return accountService.getAccount(id);
    }
    @GetMapping("getAll")
    public List<Account> getAll(){
        return accountService.getAll();
    }
    @PostMapping("add")
    public Account addAccount(@RequestBody Account account) {
        return accountService.addAccount(account);
    }

    @GetMapping("getByUserName/{userName}")
    public Account getByUserName(@PathVariable String userName) {
     return accountService.getByUserName(userName);
    }
    @PostMapping("update")
    public void updateAccount(@RequestBody Account account) {
        accountService.updateAccount(account);
    }
    @PostMapping("delete/{id}")
    public void deleteAccount(@PathVariable Long id) {
        accountService.deleteAccount(id);
    }
    @GetMapping("getOrders/{id}")
    public List<Order> getAccountOrders(@PathVariable Long id){
        ResponseEntity<List<Order>> response = restTemplate.exchange(orderUrl+"getOrders/"+id,
                HttpMethod.GET,null,new ParameterizedTypeReference<List<Order>>(){});
        List<Order> orders= response.getBody();
        return orders;
    }
}
