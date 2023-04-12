package com.Association.Mapping.OneToMany;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author,Integer> {
}
