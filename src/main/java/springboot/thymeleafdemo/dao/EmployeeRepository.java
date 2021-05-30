package springboot.thymeleafdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.thymeleafdemo.entity.Employee;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByOrderByLastNameAsc();
}
