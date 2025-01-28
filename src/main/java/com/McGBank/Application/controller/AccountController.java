package com.McGBank.Application.controller;


import com.McGBank.Application.model.AccountDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class AccountController {
    @GetMapping("/account")
    public ResponseEntity<AccountDetails> getAccountDetails(Principal principal) {
        // Logic to fetch and return account details based on the logged-in user
        AccountDetails details = new AccountDetails("12345", "John Doe", 1000.00);
        return ResponseEntity.ok(details);
    }
}