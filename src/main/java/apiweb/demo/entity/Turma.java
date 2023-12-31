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
    @JoinColumn(name = "professor_turma")
    private Professor professor;

    @Column(name = "materia_turma")
    private String materia;
    
    @ManyToOne
    @JoinColumn(name = "aluno_turma")
    private Aluno aluno;

    @Column(name = "notas_turma")
    private double [] nota = new double[4];
   
    
}
