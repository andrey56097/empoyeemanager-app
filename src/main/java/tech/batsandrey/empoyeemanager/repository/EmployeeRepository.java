package tech.batsandrey.empoyeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.batsandrey.empoyeemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
