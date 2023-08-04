package apiweb.demo.entity;
import java.util.Date;

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
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "db_aluno")
public class Aluno {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Id
    private long id;

    @Column(name = "Login")
    private String login;
    
    @Column(name = "Senha")
    private String senha;
    
    @Column(name = "Nome")
    private String nome;
   
    @Column(name = "Genero")
    private char genero;

    @Temporal(TemporalType.DATE)
    @Column(name = "Nascimento")
    private Date data;

    @Column(name = "email")
    private String email;

    @Column(name = "Telefone")
    private String telefone;

    @Column(name = "TelefoneEmergencia")
    private String contatoEmerfencial;

    
}
