package jonathan_spring_boot_lista_tarefas.lista_tarefas.repository;

import jonathan_spring_boot_lista_tarefas.lista_tarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {
}
