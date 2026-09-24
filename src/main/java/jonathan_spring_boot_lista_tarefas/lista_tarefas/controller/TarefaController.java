package jonathan_spring_boot_lista_tarefas.lista_tarefas.controller;


import jonathan_spring_boot_lista_tarefas.lista_tarefas.model.Tarefa;
import jonathan_spring_boot_lista_tarefas.lista_tarefas.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RequestMapping("/tarefas")
@RestController
public class TarefaController {
    @Autowired
    private TarefaService tarefaService;
    @GetMapping
    public List<Tarefa> listarTodos() {
        return tarefaService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Tarefa> buscarPorId(@PathVariable Integer id) {
        return tarefaService.buscarPorId(id);
    }
    @PutMapping("/{id}")
    public Tarefa alterarTarefa(
            @PathVariable Integer id,
            @RequestBody Tarefa tarefa) {

        return tarefaService.alterar(id, tarefa);
    }
    @PostMapping
    public Tarefa criarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaService.salvar(tarefa);
    }
    @DeleteMapping("/{id}")
    public void  excluirTarefa(@PathVariable Integer id) {
            tarefaService.excluir(id);
    }

}
