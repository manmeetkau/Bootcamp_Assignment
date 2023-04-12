package com.Association.Mapping.OneToOne;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookOneRepo extends JpaRepository<BookOne, Integer> {
}
