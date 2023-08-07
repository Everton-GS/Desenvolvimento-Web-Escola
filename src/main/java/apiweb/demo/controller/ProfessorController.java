package apiweb.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apiweb.demo.entity.Professor;
import apiweb.demo.service.ProfessorService;


@RestController
@RequestMapping(value = "/")
public class ProfessorController {

  

    @Autowired
    ProfessorService Professorservice;
    
    @PostMapping("add")
    public ResponseEntity<Professor> add(@RequestBody Professor professor){
            Professorservice.adcionar(professor);
                  return ResponseEntity.ok(professor);
    }

    @PutMapping("/atualizar")
    public ResponseEntity<Professor>alterar(Professor professor, @PathVariable Long id,@PathVariable String telefone){
         Professorservice.alterarContato(professor, id, telefone);
             return ResponseEntity.ok().build();
    }
    
    @GetMapping("/todos")
    public List<Professor> listar(){
      return Professorservice.listar();
    }

}
