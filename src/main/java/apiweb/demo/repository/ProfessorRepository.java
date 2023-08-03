package apiweb.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import apiweb.demo.entity.Professor;

public interface ProfessorRepository extends JpaRepository<Professor,Long> {
    
}
