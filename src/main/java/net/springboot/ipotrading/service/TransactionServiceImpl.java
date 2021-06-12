package net.springboot.ipotrading.service;

import net.springboot.ipotrading.model.Transaction;
import net.springboot.ipotrading.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransactionServiceImpl implements  TransactionService{

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public void save(Transaction transaction) {
        transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> findAll() {

        return transactionRepository.findAll();
    }

    @Override
    public List<Transaction> findByUserName(String userName) {

        return transactionRepository.findByUserName(userName);
    }

    @Override
    public Transaction findByUserNameAndProductName(String userName, String productName) {
        return transactionRepository.findByUserNameAndProductName(userName,productName);
    }

}
