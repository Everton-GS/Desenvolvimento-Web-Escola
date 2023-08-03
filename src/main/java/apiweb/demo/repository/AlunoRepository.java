package apiweb.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import apiweb.demo.entity.Aluno;
public interface AlunoRepository extends JpaRepository<Aluno,Long> {
    
}
