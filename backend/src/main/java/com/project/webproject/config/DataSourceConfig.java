package com.project.webproject.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Value("${domain.datasource.dburl}")
    private String dbUrl;
    @Value("${domain.datasource.dbname}")
    private String dbName;
    @Value("${domain.datasource.username}")
    private String dbUsername;
    @Value("${domain.datasource.password}")
    private String dbPassword;
    @Value("${domain.datasource.driver}")
    private String driver;

    @Bean
    public DataSource source() {
        DataSourceBuilder<?> dsb = DataSourceBuilder.create();
        dsb.driverClassName(driver);

        dsb.url(dbUrl + dbName);
        dsb.username(dbUsername);
        dsb.password(dbPassword);

        return dsb.build();
    }
}