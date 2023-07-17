package com.cart.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExternamConfig {


    @Bean
    ModelMapper modelMapper(){
        return  new ModelMapper();
    }
}
