package com.marzipanka.library.books;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BookConfig {

    @Bean
    CommandLineRunner commandLineRunner(BookRepository repository) {
        return args -> {
            Book codeComplete = new Book(
                    1,
                    "Code Complete",
                    1,
                    1993,
                    1,
                    1
            );

            Book cleanCode = new Book(
                    "Clean Code",
                    2,
                    2008,
                    1,
                    1
            );

            repository.saveAll(
                    List.of(codeComplete, cleanCode)
            );
        };
    }
}
