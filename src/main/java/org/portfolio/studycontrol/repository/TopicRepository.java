package org.portfolio.studycontrol.repository;

import org.portfolio.studycontrol.model.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<Topic,Integer> {
}
