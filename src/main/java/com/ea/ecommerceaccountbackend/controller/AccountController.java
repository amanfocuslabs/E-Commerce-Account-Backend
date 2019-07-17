package com.ea.ecommerceaccountbackend.controller;

import com.ea.ecommerceaccountbackend.model.Account;
import com.ea.ecommerceaccountbackend.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rest/account/")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/{id}")
    public Account getAccount(@PathVariable Long id) {
        return accountService.getAccount(id);
    }
    @GetMapping("/getAll")
    public List<Account> getAll(){
        return accountService.getAll();
    }
    @PostMapping("/add")
    public Account addAccount(@RequestBody Account account) {
        return accountService.addAccount(account);
    }

    @GetMapping("/test/{userName}")
    public Account getAccountByUserName(@PathVariable String userName){
        return accountService.getAccountByUserName(userName);
    }
}
