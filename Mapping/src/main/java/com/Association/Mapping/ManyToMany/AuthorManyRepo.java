package com.Association.Mapping.ManyToMany;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorManyRepo extends JpaRepository<AuthorMany,Integer> {
}
