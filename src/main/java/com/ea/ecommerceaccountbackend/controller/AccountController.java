package com.ea.ecommerceaccountbackend.controller;

import com.ea.ecommerceaccountbackend.model.Account;
import com.ea.ecommerceaccountbackend.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/getAccount/{id}")
    public Account getAccount(@PathVariable Long id) {
        return accountService.getAccount(id);
    }
    @GetMapping("/getAllAccounts")
    public List<Account> getAll(){
        return accountService.getAll();
    }
    @PostMapping("/addAccount")
    public Account addAccount(@RequestBody Account account) {
        return accountService.addAccount(account);
    }
}
