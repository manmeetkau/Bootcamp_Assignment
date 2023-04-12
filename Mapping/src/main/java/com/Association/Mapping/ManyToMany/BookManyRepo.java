package com.Association.Mapping.ManyToMany;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookManyRepo extends JpaRepository<BookMany, Integer> {
}
