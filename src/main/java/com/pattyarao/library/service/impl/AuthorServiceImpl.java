package com.pattyarao.library.service.impl;

import com.pattyarao.library.domain.entities.AuthorEntity;
import com.pattyarao.library.repository.AuthorRepository;
import com.pattyarao.library.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;
    private final AtomicLong counter = new AtomicLong(1);

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorEntity save(AuthorEntity authorEntity) {
        return authorRepository.save(authorEntity);
    }

    @Override
    public List<AuthorEntity> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Optional<AuthorEntity> getAuthorById(Long id) {
        return authorRepository.findById(id);
    }

    @Override
    public AuthorEntity createAuthor(AuthorEntity author) {
        // Auto-generate ID if not set
        if (author.getId() == null) {
            author.setId(counter.getAndIncrement());
        }
        return authorRepository.save(author);
    }
}
