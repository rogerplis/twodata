package com.roger.twodata.config;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories( basePackages = "com.roger.twodata.repositories.access",
        entityManagerFactoryRef = "accessEntityManager")
public class AccesDbConfig {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "access.datasource")
    public DataSource accessDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean accessEntityManager(
            EntityManagerFactoryBuilder builder,
            @Qualifier("accessDataSource") DataSource dataSource) {
        return builder
                .dataSource(dataSource)
                .packages("com.roger.twodata.model.access")
                .build();
    }
}
