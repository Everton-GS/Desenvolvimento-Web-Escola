package apiweb.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apiweb.demo.entity.Professor;
import apiweb.demo.repository.ProfessorRepository;

@Service
public class ProfessorService {

 @Autowired   
 ProfessorRepository professorRepository;

  
    public List<Professor> listar(){
      return professorRepository.findAll();
    }
    
    public Professor buscar(Long id){
      Optional<Professor> optional = professorRepository.findById(id);
        return optional.orElse(null);
    }

    public Professor adcionar(Professor professor){
        return professorRepository.save(professor);
    }

    public void deletar(Long id){
        professorRepository.deleteById(id);
    }

    public void alterarContato(Professor professor, Long id, String numero) {

      Optional<Professor> optionalProfessor = professorRepository.findById(id);
  
      if (optionalProfessor.isPresent()) {
          Professor professorEncontrado = optionalProfessor.get();
          professorEncontrado.setTelefone(numero);
          professorRepository.save(professorEncontrado);
      }
     }
  
        

  }

    



    

