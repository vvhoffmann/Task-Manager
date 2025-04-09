package pl.vvhoffmann.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.vvhoffmann.taskmanager.model.Task;
import pl.vvhoffmann.taskmanager.model.User;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByOwnerOrderByDateDesc(User user);
}