package org.portfolio.studycontrol.model.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.portfolio.studycontrol.enums.Division;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String text;
    @OneToMany(mappedBy = "topic")
    private List<Questions> questions = new ArrayList<>();
    private Division division;
}
