package com.demo.Ashututorial.tutorial.configuration;

import com.demo.Ashututorial.tutorial.DB;
import com.demo.Ashututorial.tutorial.ProdDB;
import com.demo.Ashututorial.tutorial.devDB;
import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfi {
    @Bean
    @ConditionalOnProperty(name="project.mode",havingValue="development")
    public DB getDEVdbBean() {
      return new devDB();
    }
    @Bean
    @ConditionalOnProperty(name="project.mode",havingValue="production")
    public DB getProdDBBean() {
        return new ProdDB();
    }
    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
