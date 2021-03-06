package online_store_app.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ComponentScan("online_store_app.services")
@ComponentScan("online_store_app.dao")
@ComponentScan("online_store_app.repo")
public class AppConfiguration {
    @Bean
    public DataSource datasource() {
        return DataSourceBuilder.create()
                .driverClassName("org.postgresql.Driver")
                .url("jdbc:postgresql://localhost:5432/onlineStore")
                .username("postgres")
                .password("postgres1")
                .build();
    }

}
