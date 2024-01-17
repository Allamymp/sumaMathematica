package org.portfolio.studycontrol.model.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.portfolio.studycontrol.enums.DifficultType;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String text;
    private String response;
    @OneToMany(mappedBy = "question")
    private List<Alternative>alternatives = new ArrayList<>();
    @ManyToOne
    Topic topic;
    DifficultType difficult;
}
