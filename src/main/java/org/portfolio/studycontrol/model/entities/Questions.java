package org.portfolio.studycontrol.model.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.portfolio.studycontrol.model.entities.enums.DificultType;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @OneToMany(mappedBy = "question")
    private List<Alternative> alternatives = new ArrayList<>();
    private String text;
    private DificultType dificultType;
    @ManyToOne
    private Topics topic;
}
