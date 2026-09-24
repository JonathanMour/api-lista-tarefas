    package jonathan_spring_boot_lista_tarefas.lista_tarefas.service;

    import jonathan_spring_boot_lista_tarefas.lista_tarefas.model.Tarefa;
    import jonathan_spring_boot_lista_tarefas.lista_tarefas.repository.TarefaRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import java.util.List;
    import java.util.Optional;

    @Service
    public class TarefaService {
        @Autowired
        private TarefaRepository tarefaRepository;

        public Optional<Tarefa> buscarPorId(Integer id) {
            return tarefaRepository.findById(id);
        }

        public Tarefa salvar(Tarefa tarefa) {
            return tarefaRepository.save(tarefa);
        }
        public List<Tarefa> listarTodos() {
            return tarefaRepository.findAll();
        }
        public void excluir(Integer id) {
            tarefaRepository.deleteById(id);
        }

        public Tarefa alterar(Integer id, Tarefa tarefa) {
            Optional<Tarefa> tarefaEncontrada = buscarPorId(id);
            Tarefa tarefaExistente = tarefaEncontrada.orElseThrow();
            tarefaExistente.setCategoria(tarefa.getCategoria());
            tarefaExistente.setNome(tarefa.getNome());
            tarefaExistente.setStatus(tarefa.getStatus());
            tarefaExistente.setDescricao(tarefa.getDescricao());
            tarefaExistente.setPrioridade(tarefa.getPrioridade());

            return tarefaRepository.save(tarefaExistente);

        }


    }

