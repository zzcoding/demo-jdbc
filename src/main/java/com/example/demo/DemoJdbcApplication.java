package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@SpringBootApplication
public class DemoJdbcApplication {
    @Bean
    public PlatformTransactionManager devTransactionManager(DataSource sitDataSource) {
        return new DataSourceTransactionManager(sitDataSource);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoJdbcApplication.class, args);
    }
}
