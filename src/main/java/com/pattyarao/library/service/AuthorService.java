package com.pattyarao.library.service;

import com.pattyarao.library.domain.entities.AuthorEntity;
import com.pattyarao.library.repository.AuthorRepository;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    AuthorEntity save(AuthorEntity authorEntity);
    List<AuthorEntity> getAllAuthors();
    Optional<AuthorEntity> getAuthorById(Long id);
    AuthorEntity createAuthor(AuthorEntity author);
}