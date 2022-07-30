package com.application.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.application.implementation", "com.application.services", "com.application.aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig {

}
