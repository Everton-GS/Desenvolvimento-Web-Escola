package apiweb.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import apiweb.demo.entity.Turma;

public interface TurmaRepository extends JpaRepository<Turma,Long> {
    
}
