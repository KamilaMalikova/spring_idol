package com.example.spring_try.config;

import com.example.spring_try.models.Performer;
import com.example.spring_try.models.extra.Instrument;
import com.example.spring_try.models.extra.Poem;
import com.example.spring_try.models.extra.impl.Sonnet29;
import com.example.spring_try.models.impl.Instrumentalist;
import com.example.spring_try.models.impl.Juggler;
import com.example.spring_try.models.impl.PoeticJuggler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringIdolConfig {
    @Bean
    public Performer duke() {
        return new Juggler();
    }
    @Bean
    public Performer duke15() {
        return new Juggler(15);
    }
    @Bean
    public Performer kenny() {
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("Jingle Bells");
        return kenny;
    }
    @Bean
    public Poem sonnet29() {
        return new Sonnet29();
    }
    @Bean
    public Performer poeticDuke() {
        return new PoeticJuggler(sonnet29());
    }
}
