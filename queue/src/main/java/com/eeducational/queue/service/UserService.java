package com.eeducational.queue.service;

import com.eeducational.queue.entity.Account;
import com.eeducational.queue.entity.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by gary on 2017/7/30.
 */
@Service
@Transactional
public class UserService implements IUserService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void addUsers(Account account1, Account account2) {

        accountRepository.save(account1);

        //int i = 1 / 0;

        accountRepository.save(account2);

    }
}
