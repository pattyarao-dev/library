package com.pattyarao.library.repository.memory;

import com.pattyarao.library.domain.entities.AuthorEntity;
import com.pattyarao.library.repository.AuthorRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class AuthorRepositoryInMemory implements AuthorRepository {

    private final Map<Long, AuthorEntity> authors = new HashMap<>();

    @Override
    public AuthorEntity save(AuthorEntity author) {
        authors.put(author.getId(), author);
        return author;
    }

    @Override
    public Optional<AuthorEntity> findById(Long id) {
        return Optional.ofNullable(authors.get(id));
    }

    @Override
    public List<AuthorEntity> findAll() {
        return new ArrayList<>(authors.values());
    }
}
