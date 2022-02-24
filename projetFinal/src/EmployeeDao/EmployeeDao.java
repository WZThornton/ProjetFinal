package EmployeeDao;

import java.util.ArrayList;
import java.util.List;
import Model.Employee;
import DAOE.DAOE;

public class EmployeeDao implements DAOE { //implements veut dire que cette class suit ce que Dao dit de faire

    private List<Employee> listEmployee;

    public EmployeeDao() {
        listEmployee = new ArrayList<Employee>(); //va creer une List vide de Students
    }

    public void create(Employee student) {
        listEmployee.add(student);
    }

    public List<Employee> findAll() {
        return listEmployee;
    }

    public Employee findById(int i) {
        return listEmployee.get(i);
    }

    public void deleteById(int i) {
        listEmployee.remove(i);
    }
}
