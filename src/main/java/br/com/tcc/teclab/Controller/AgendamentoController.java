package br.com.tcc.teclab.Controller;

import br.com.tcc.teclab.model.Agendamento;
import br.com.tcc.teclab.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/agendamento")
@RestController
public class AgendamentoController {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    @GetMapping("/todos")
    public List<Agendamento> listarTodosAgendamentos() {
        return agendamentoRepository.findAll();
    }

}