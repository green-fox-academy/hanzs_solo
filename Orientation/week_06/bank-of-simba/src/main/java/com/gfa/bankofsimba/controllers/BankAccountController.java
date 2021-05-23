package com.gfa.bankofsimba.controllers;

import com.gfa.bankofsimba.modules.BankAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BankAccountController {
    List<BankAccount> accounts = new ArrayList<>();

    long balance;
    int hackedAccounts;
    private BankAccount bankAccount = new BankAccount("0", 0, "0");

    public BankAccountController() {
        balance = 0;
        hackedAccounts = 0;
        accounts.add(new BankAccount("Simba", 2000, "lion"));
        accounts.add(new BankAccount("Pumba", 150, "boar"));
        accounts.add(new BankAccount("Timon", 20, "something"));
        printAccounts();
    }

    private void printAccounts() {
        for (BankAccount account : accounts) {
            System.out.println(account);
        }
    }

    @GetMapping("/")
    public String home(Model model) {
        return "show";
    }

    @GetMapping("/show")
    public String show(Model model) {
        model.addAttribute("accounts", accounts);
        model.addAttribute("balance", balance);
        return "show";
    }

    @PostMapping("/add")
    public String add(BankAccount newBankAccount) {
        accounts.add(newBankAccount);
        printAccounts();
        return "redirect:/show";
    }

    //                <form action="/delete"><button type="submit" value="delete"/></form>
    @GetMapping("/delete/{index}")
    public String delete(@PathVariable long index) {
        System.out.println(index);
        balance += accounts.stream()
                .filter(x -> x.getIndex() == index)
                .mapToLong(BankAccount::getBalance)
                .sum();

        accounts = accounts.stream()
                .filter(x -> x.getIndex() != index)
                .collect(Collectors.toList());

        return "redirect:/show";
    }
}
