package apiweb.demo.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "db_professor")
public class Professor {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    @Column(name = "login_professor")
    private String login;

    @Column(name = "senha_professor")
    private String senha;

    @Column(name = "registro_professor")
    private String cfep;

    @Column(name = "nome_professor")
    private String nome;

    @Column(name = "genero_professor")
    private char genero;

    @Column(name = "nascimento_professor")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    @Column(name = "email_professor")
    private String email;
    
    @Column(name = "telefone_professor")
    private String telefone;

}
