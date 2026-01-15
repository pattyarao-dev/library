package com.pattyarao.library.config;

import com.pattyarao.library.domain.entities.AuthorEntity;
import com.pattyarao.library.repository.AuthorRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class AuthorDataInitializer {

    private final AuthorRepository authorRepository;

    public AuthorDataInitializer(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @PostConstruct
    public void init() {
        authorRepository.save(new AuthorEntity(1L, "George Orwell", 46));
        authorRepository.save(new AuthorEntity(2L, "Jane Austen", 41));
        authorRepository.save(new AuthorEntity(3L, "Fyodor Dostoevsky", 59));
    }
}
