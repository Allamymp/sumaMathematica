package org.portfolio.studycontrol.model.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Topics {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    @ManyToOne
    private Subjects subject;
    @OneToMany(mappedBy = "topic")
    private List<Questions>questions;
    @OneToMany
    private List<Anotations> anotations;
}
