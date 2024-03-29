package org.portfolio.studycontrol.repository;

import org.portfolio.studycontrol.model.entities.Alternative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlternativeRepository extends JpaRepository<Alternative, Integer> {
}
