package DAOE;

import Model.Employee;
import java.util.List;

public interface DAOE {

    public abstract void create(Employee employee);

    public Employee findById(int i);

    public List<Employee> findAll();

    public void deleteById(int i);
}
