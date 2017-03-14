package com.github.alrafeea.och.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring configuration for unit testing.
 * 
 * @author Fayez Alrafeea
 *
 */
@Configuration
@ComponentScan(basePackages = {"com.github.alrafeea.och.service"})
public class AppConfig {

}
