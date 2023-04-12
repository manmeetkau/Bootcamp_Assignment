package com.Association.Mapping;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject,Integer> {
}
