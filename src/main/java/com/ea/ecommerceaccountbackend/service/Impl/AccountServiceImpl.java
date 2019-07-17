package com.ea.ecommerceaccountbackend.service.Impl;

import com.ea.ecommerceaccountbackend.model.Account;
import com.ea.ecommerceaccountbackend.repository.AccountRepository;
import com.ea.ecommerceaccountbackend.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;
    @Override
    public List<Account> getAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account getAccount(Long id) {
        return accountRepository.findById(id).get();
    }

    @Override
    public Account addAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountRepository.save(account);

    }

    @Override
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }

    @Override
    public Account getAccountByUserName(String userName) {
        return accountRepository.findByUserName(userName);
    }

    @Override
    public Account getByUserName(String userName) {
        return accountRepository.findByUserName(userName);
    }
}
