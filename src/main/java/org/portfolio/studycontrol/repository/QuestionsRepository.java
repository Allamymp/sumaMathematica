package org.portfolio.studycontrol.repository;

import org.portfolio.studycontrol.model.entities.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions, Integer> {
}
