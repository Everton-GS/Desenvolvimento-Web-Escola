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
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "db_aluno")

public class Aluno {
    
    @GeneratedValue(strategy = GenerationType.AUTO) 
    @Id
    private long id;

    @Column(name = "login_aluno")
    private String login;
    
    @Column(name = "senha_aluno")
    private String senha;
    
    @Column(name = "nome_aluno")
    private String nome;

    @Column(name = "genero_aluno")
    private char genero;

    @Column(name = "nascimento_aluno")
    @Temporal(TemporalType.DATE)
    private Date data;

    @Column(name = "email_aluno")
    private String email;

    @Column(name="telefone_aluno")
    private String telefone;

    @Column(name = "telefone_Emergencia")
    private String contatoEmerfencial;
}
