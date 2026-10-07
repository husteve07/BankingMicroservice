package com.example.accounts.service;

import com.example.accounts.dto.CustomerDto;

public interface IAccountsService {

    /***
     *
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);

}
