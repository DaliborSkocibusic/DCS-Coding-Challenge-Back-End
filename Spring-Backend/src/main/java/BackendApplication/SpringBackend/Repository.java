package BackendApplication.SpringBackend;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;



public interface Repository extends CrudRepository<DTO, Long> {
}


// Source: https://github.com/Azure-Samples/quickstart-spring-data-jdbc-sql-server/blob/master/src/main/java/com/example/demo/TodoRepository.java