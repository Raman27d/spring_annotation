package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.stackroute.domain")
public class SpringConfiguration {

    @Bean
    public Actor actor() {
        return new Actor("Raman","Male",22);
    }

    @Bean
    public Actor getActorBean2() {
        return new Actor("Raj","Male",30);
    }

    @Bean
    public Actor getActorBean3() {
        return new Actor("Rajesh","Female",28);
    }



}