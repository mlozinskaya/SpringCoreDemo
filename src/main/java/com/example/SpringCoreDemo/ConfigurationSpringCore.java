package com.example.SpringCoreDemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.SpringCoreDemo")
@PropertySource("application.properties")
public class ConfigurationSpringCore {
}
