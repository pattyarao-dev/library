package com.pattyarao.library.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
//@Table(name = "authors")
public class AuthorEntity {
    private Long id;

    private String name;

    private Integer age;

}
