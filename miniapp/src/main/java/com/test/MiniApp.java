package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by hackerdom on 2018.6.27.<br>
 */
@SpringBootApplication
@EnableTransactionManagement
public class MiniApp {
    public static void main(String[] args) {
        SpringApplication.run(MiniApp.class, args);
    }
}
