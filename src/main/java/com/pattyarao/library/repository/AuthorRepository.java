package com.pattyarao.library.repository;


import com.pattyarao.library.domain.entities.AuthorEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuthorRepository {

    AuthorEntity save(AuthorEntity author);

    Optional<AuthorEntity> findById(Long id);

    List<AuthorEntity> findAll();
}
