package com.roger.twodata.config;


import com.roger.twodata.repositories.parking.EmpresaRepositories;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories( basePackageClasses = EmpresaRepositories.class,
        entityManagerFactoryRef = "parkingEntityManager")
public class ParkingDbConfig {

    @Bean
    @ConfigurationProperties(prefix = "parking.datasource")
    public DataSource parkingDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean parkingEntityManager(
            EntityManagerFactoryBuilder builder,
            @Qualifier("parkingDataSource") DataSource dataSource){
        return builder
                .dataSource(dataSource)
                .packages("com.roger.twodata.model.parking")
                .build();
    }
}
