package apiweb.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "db_turma")
public class Turma {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "turma")
    private String turma;

    @ManyToOne
    @JoinColumn(name = "professor")
    private Professor professor;

    @Column(name = "materia")
    private String materia;
    
    @ManyToOne
    @JoinColumn(name = "aluno")
    private Aluno aluno;

    @Column(name = "notas")
    private double [] nota = new double[4];
   
    
}
