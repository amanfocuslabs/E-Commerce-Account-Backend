package com.ea.ecommerceaccountbackend.service;

import com.ea.ecommerceaccountbackend.model.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAll();
    Account getAccount(Long id);
    Account addAccount(Account account);
    void updateAccount(Account account);
    void deleteAccount(Long id);

}
