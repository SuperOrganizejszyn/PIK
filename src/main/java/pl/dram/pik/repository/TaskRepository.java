package pl.dram.pik.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import pl.dram.pik.entity.Task;

//@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface TaskRepository extends CrudRepository<Task, String> {


}
